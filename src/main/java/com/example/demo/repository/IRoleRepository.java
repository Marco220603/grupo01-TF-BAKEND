package com.example.demo.repository;

import com.example.demo.entities.dato.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Roles,Long> {
    Roles findByrol(String role);
}
