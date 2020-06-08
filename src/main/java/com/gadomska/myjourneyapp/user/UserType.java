package com.gadomska.myjourneyapp.user;

public enum UserType {

    USER, ADMIN;

    public static UserType getValue(String name) {
        return valueOf(name);
    }
}
