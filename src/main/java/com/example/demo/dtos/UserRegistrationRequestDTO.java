package com.example.demo.dtos;

public class UserRegistrationRequestDTO {
    private String username;
    private String password;

    public UserRegistrationRequestDTO() {
    }

    public UserRegistrationRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
