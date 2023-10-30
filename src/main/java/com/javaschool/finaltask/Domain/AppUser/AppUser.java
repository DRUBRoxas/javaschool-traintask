package com.javaschool.finaltask.Domain.AppUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "AppUser")
@Table(name = "app_user", schema = "finaltask")
public class AppUser {
    private String email;

    private String password;

    private String role;

    public AppUser(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public AppUser() {

    }

    @Id
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    @Column(name = "role", nullable = false, length = 70)
    public String getRole() {
        return role;
    }

    public String toString(){

        return this.email;
    }
}