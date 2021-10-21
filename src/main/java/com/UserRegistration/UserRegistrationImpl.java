package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {

    public boolean validateName(String Name) {
        String regexName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexName);

        if (Name.isEmpty()) {
            return false;
        }
        Matcher matcher = pattern.matcher(Name);
        return matcher.matches();
    }

    public boolean validateMail(String eMail) {
        String regex = "^([a-zA-z0-9-_+\\.]+)@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(eMail);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        String regex = "^(91)[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        String regex = ("^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public void validateUserDetails() {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        UserRegistrationImpl userRegistration = new UserRegistrationImpl();

        System.out.println("Enter your first name: ");
        userRegistrationDetails.setFirstName(scanner.next());

        boolean flagFName = userRegistration.validateName(userRegistrationDetails.getFirstName());
        if (flagFName) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Enter your last name: ");
        userRegistrationDetails.setLastName(scanner.next());

        boolean flagLName = userRegistration.validateName(userRegistrationDetails.getLastName());
        if (flagLName) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Enter your Email-ID: ");
        userRegistrationDetails.seteMail(scanner.next());

        boolean flagMail = userRegistration.validateMail(userRegistrationDetails.geteMail());
        if (flagMail) {
            System.out.println("Valid E-mail input");
        } else {
            System.out.println("Invalid E-mail input");
        }

        System.out.println("Enter your mobile number: ");
        userRegistrationDetails.setMobileNumber(scanner.next());

        boolean flagMobileNumber = userRegistration.validateMobileNumber(userRegistrationDetails.getMobileNumber());
        if (flagMobileNumber) {
            System.out.println("Valid mobile number input");
        } else {
            System.out.println("Invalid mobile number input");
        }

        System.out.println("Enter your password: ");
        userRegistrationDetails.setPassword(scanner.next());

        boolean flagPassword = userRegistration.validatePassword(userRegistrationDetails.getPassword());
        if (flagPassword) {
            System.out.println("Password meets condition");
        } else {
            System.out.println("Password don't meet condition");
        }
    }
}
