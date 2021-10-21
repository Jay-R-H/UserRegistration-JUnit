package com.UserRegistration;

import com.UserRegistration.UserRegistrationImpl;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistrationImpl userRegistration = new UserRegistrationImpl();
        userRegistration.validateUserDetails();
    }
}
