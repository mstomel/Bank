package com.company;

public class BankAccount {

        public double balance;
        public String na;

        public BankAccount(double b, String n){

            balance = b;
            String na =n;

        }
        public void deposit(double d) {

            balance +=d;

        }
        public void withdraw(double w) {

            balance -=w;

        }

}
