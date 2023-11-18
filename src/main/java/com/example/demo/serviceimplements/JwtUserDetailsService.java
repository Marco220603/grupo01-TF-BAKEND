package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Roles;
import com.example.demo.entities.dato.User;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;
    @Autowired
    private IRoleRepository repoo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }
        List<GrantedAuthority> roles = new ArrayList<>();

        user.getRoles().forEach(rol ->{
            roles.add(new SimpleGrantedAuthority(rol.getRol()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getEnabled(), true, true, true, roles);

        return ud;
    }

    public User registroUser(String username,String password){
        User newser = new User();
        newser.setUsername(username);
        newser.setPassword(password);
        newser.setEnabled(true);

        Roles userRole = repoo.findByrol("USER");
        if(userRole == null){
            userRole = new Roles();
            userRole.setRol("USER");
            repoo.save(userRole);
        }
        newser.setRoles(Collections.singletonList(userRole));
        return repo.save(newser);
    }
}
