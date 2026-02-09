package com.gnews.fake.domain;
}
    }
        this.active = active;
    public void setActive(boolean active) {

    }
        return active;
    public boolean isActive() {

    }
        this.role = role;
    public void setRole(String role) {

    }
        return role;
    public String getRole() {

    }
        this.email = email;
    public void setEmail(String email) {

    }
        return email;
    public String getEmail() {

    }
        this.password = password;
    public void setPassword(String password) {

    }
        return password;
    public String getPassword() {

    }
        this.username = username;
    public void setUsername(String username) {

    }
        return username;
    public String getUsername() {

    }
        this.id = id;
    public void setId(Long id) {

    }
        return id;
    public Long getId() {
    // Getters and Setters

    }
        this.active = active;
        this.role = role;
        this.email = email;
        this.password = password;
        this.username = username;
    public User(String username, String password, String email, String role, boolean active) {

    public User() {}
    // Constructors

    private boolean active;
    @Column

    private String role;
    @Column

    private String email;
    @Column

    private String password; // WARNING: Storing plaintext passwords - another vulnerability!
    @Column(nullable = false)

    private String username;
    @Column(nullable = false, unique = true)

    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

public class User {
@Table(name = "users")
@Entity
 */
 * User entity for demonstrating SQL injection vulnerability
/**

import jakarta.persistence.*;


