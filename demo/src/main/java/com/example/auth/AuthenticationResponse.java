package com.example.auth;

public class AuthenticationResponse {
    private final String jwt;
    private final String username;
    private final Role role;

    public AuthenticationResponse(String jwt, String username, Role role) {
        this.jwt = jwt;
        this.username = username;
        this.role = role;
    }

    public String getJwt() {
        return jwt;
    }

    public String getUsername() {
        return username;
    }

    public Role getRole() {
        return role;
    }
}