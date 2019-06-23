package com.example.registration.model;

import lombok.Data;

@Data
public class Country {

    private String countryCode;
    private String countryName;

    public Country() {

    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }
}