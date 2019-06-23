package com.example.registration.formbean;

import lombok.Data;

@Data
public class AppUserForm {

    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private String gender;
    private String email;
    private String password;
    private String confirmPassword;
    private String countryCode;

    public AppUserForm() {}

    public AppUserForm(Long userId, String userName,
                       String firstName, String lastName, boolean enabled,
                       String gender, String email, String countryCode,
                       String password, String confirmPassword) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.gender = gender;
        this.email = email;
        this.countryCode = countryCode;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean isEnabled() {
        return enabled;
    }
}