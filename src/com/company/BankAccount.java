package com.company;

/**
 * Created by ms787 on 10/4/17.
 */
public class BankAccount {

        double balance;
        String na;

        public BankAccount(double bal, String name){

            balance = bal;
            String na =name;

        }
        public void deposit(double d) {

            balance +=d;

        }
        public void withdraw(double w) {

            balance -=w;

        }

}
