package com.syntax.class13;

public class Account {
    String accountId;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;


    boolean login(String enteredUserName,String enteredPassword) {

        if(userName.equals(enteredUserName) && password.equals(enteredPassword)) {
            return true;

        }else {
            return false;
        }
    }


}
