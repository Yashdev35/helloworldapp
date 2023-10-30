package com.example.javapractice;

public class MyClassPracticeJava {
        public static void main(String[] args) {
            String command = "Withdraw";
            int balance = 1000;
            int amount = 100;
            switch (command) {
                case "Withdraw":
                    balance -= amount;
                    break;
                case "Deposit":
                    balance += amount;
                    break;
                default:
                    System.out.println("Please choose a command");
            }

            System.out.println("Your balance used to be 1000 and now is " + balance);
        }
    }

