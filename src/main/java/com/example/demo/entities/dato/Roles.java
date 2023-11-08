package com.example.demo.entities.dato;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "usersid", "rol" }) })
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rol;
    @ManyToOne
    @JoinColumn(name="usersid", nullable=false)
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
