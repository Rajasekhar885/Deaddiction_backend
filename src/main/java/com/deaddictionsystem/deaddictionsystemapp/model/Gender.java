package com.deaddictionsystem.deaddictionsystemapp.model;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other"),
    GENDERNOTDISCLOSED("Gender not disclosed");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
