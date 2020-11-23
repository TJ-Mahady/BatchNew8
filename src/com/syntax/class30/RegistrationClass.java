package com.syntax.class30;

public class RegistrationClass {
    /*Create RegistrationClass in which you would have variables as email,userName and password
    that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods
    and in each method separately pass values to set users email, username and password.
    Requirements:
    A.Valid email consider to be only yahoo
    B.Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.*/
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if(email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Invalid eMail");
            System.out.println("Valid email consider to be only yahoo");
        }
    }
    public void setUserName(String userName) {
        if (!userName.isEmpty()) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("User name should be of length larger than 6 characters");
            }
        } else {
            System.out.println("User Name cannot be empty");
        }
    }
    public void setPassword(String password) {
        if (!password.isEmpty()) {
            if (password.length() > 6) {
                if(!password.contains(userName)) {
                    this.password = password;
                } else {
                    System.out.println("Password cannot contain User Name");
                }
            } else {
                System.out.println("Password should be of length larger than 6 characters");
            }
        } else {
            System.out.println("Password cannot be empty");
        }
    }
}
class RegistrationClassTester {
    public static void main(String[] args) {
        RegistrationClass person = new RegistrationClass();
        person.setUserName("Anastasiia");
        person.setEmail("anastasiia@yahoo.com");
        person.setPassword("Anastas123");
    }
}
