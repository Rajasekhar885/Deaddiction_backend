package com.deaddictionsystem.deaddictionsystemapp.model;

public enum Role {

    DOCTOR("Doctor"),
    ADMIN("Admin"),
    REGISTRATIONMEMBER("Registration member"),
    FOLLOWUPMEMBER("Follow up member");

    public final String role;

    Role(String role) {
        this.role = role;
    }

}
