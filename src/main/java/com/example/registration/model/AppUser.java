package com.example.registration.model;

import lombok.Data;

@Data
public class AppUser {

    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private String gender;
    private String email;
    private String encryptedPassword;
    private String countryCode;

    public AppUser(){}

    public AppUser(Long userId, String userName, String firstName, String lastName,
                   boolean enabled, String gender,
                   String email, String countryCode, String encryptedPassword) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.gender = gender;
        this.email = email;
        this.countryCode = countryCode;
        this.encryptedPassword = encryptedPassword;
    }
}