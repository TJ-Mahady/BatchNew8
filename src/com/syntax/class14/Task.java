package com.syntax.class14;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        String username;
        String password;
        String confirmPassword;


        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter username");
        username=input.nextLine();
        System.out.println("Please Enter password");
        password=input.nextLine();
        System.out.println("Please Confirm password");
        confirmPassword=input.nextLine();


        if(username.isEmpty() || password.isEmpty()){

            System.out.println("username and password can not be empty");
        }else{
            if(password.length()<8) {
                System.out.println("Password is too short");
            }else{
                if(password.contains(username)){
                    System.out.println("Password cannot contain username");
                }else{
                    if(!password.equals(confirmPassword)){
                        System.out.println("Passwords do not match");
                    }else{
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }

    }
}
