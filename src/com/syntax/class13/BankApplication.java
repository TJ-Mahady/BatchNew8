package com.syntax.class13;

public class BankApplication {
    public static void main(String[] args) {
        Account burjusAccount=new Account();
        burjusAccount.accountId="123";
        burjusAccount.userName="Burju";
        burjusAccount.password="pass123";
        burjusAccount.balance=1000000;
        burjusAccount.typeOfAccount="checking";
        burjusAccount.limit=125;
        boolean isLoggedIn=burjusAccount.login("abc123", "abfjad");
        System.out.println(isLoggedIn);

        Account eliasAccount= new Account();
        eliasAccount.accountId="125";
        eliasAccount.userName="Elias";
        eliasAccount.password="pass123";
        eliasAccount.balance=15000;
        eliasAccount.typeOfAccount="saving";
        eliasAccount.limit=100;



    }

}
