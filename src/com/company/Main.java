package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//  Day Two
//        int bankBalance = 1234;
//            System.out.println("Your current bank balance is " + bankBalance);
//        bankBalance = 1267;
//            System.out.println("Your current bank balance is now " + bankBalance);
//        bankBalance = bankBalance + 123;
//            System.out.println("Thank you for your deposit!");
//            System.out.println("Your current bank balance is now " + bankBalance);
//        bankBalance = bankBalance - 456;
//            System.out.println("Enjoy your withdrawal! Your current balance is " + bankBalance);
//            System.out.println("Thanks for your business!");

//        String hotdog = "hello world";
//        if (hotdog.equals("hello world"));
//            System.out.println(hotdog);

//        System.out.println("Hello! Please enter your name:");
//        Scanner robotCharlie = new Scanner(System.in);
//        String userName = robotCharlie.nextLine();
//        System.out.println("Input received!");
//        System.out.println("Hello " + userName + ". How are you?");

//        String password = "BuffaloWings";

//        System.out.println("Hello! Please enter your password:");
//        Scanner custInput = new Scanner(System.in);
//        String custPassword = custInput.nextLine();
//        System.out.println("Thank you!");
//
//        if(custPassword.equals(password)) {
//            System.out.println("Correct password! You have gained access.");
//
//        } else {
//            System.out.println("Sorry, that is incorrect. Access denied!");
//        }

//  Day Three
        System.out.println("Welcome, enter a number:");

        Scanner sc = new Scanner(System.in);
        String inputFromUser;
        inputFromUser = sc.nextLine();

        int convertedNumber = Integer.parseInt(inputFromUser);

        System.out.println("Thank you for entering " + convertedNumber);
        convertedNumber = convertedNumber + 5;
        System.out.println("line 20: " + convertedNumber);

        System.out.println("Here is what you entered: " + inputFromUser);
    }
}
