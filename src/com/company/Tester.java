package com.company;

import java.util.Scanner;

public class Tester {

    public void Main() {

        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        String n = in.next();
        BankAccount myAccount = new BankAccount(b, n);
        myAccount.deposit(in.nextDouble());
        System.out.println(myAccount.balance);
        myAccount.withdraw(in.nextDouble());
        System.out.println("The "+myAccount.na+" has a balance of "+myAccount.balance);

    }

}
