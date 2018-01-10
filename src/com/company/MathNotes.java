package com.company;

public class MathNotes {

    public static void main(String[] args) {
        System.out.println("Hello");

        int addNumber = 100;
        addNumber = addNumber + 100;
        addNumber += 100;
        // Line 9 and Line 10 do the same function

        int minusNumber = 500;
        minusNumber = minusNumber - 100;
        minusNumber -= 100;

        int multiNumber = 100;
        multiNumber = multiNumber * 100;
        multiNumber *= 100;

        int divNumber = 10000;
        divNumber = divNumber / 100;
        divNumber /= 100;

        System.out.println("Add: " + addNumber);
        System.out.println("Sub: " + minusNumber);
        System.out.println("Multiply: " + multiNumber);
        System.out.println("Division: " + divNumber);

        int iteration = 1;
        iteration++; //takes the iteration and adds 1 to it
        System.out.println("Iteration + 1: " + iteration);
        iteration--; //takes the iteration and substracts 1 form it
        System.out.println("Iteration - 1: " + iteration);

        int mod = 10;
        mod = mod % 3;
        System.out.println("Mod: " + mod);

    }
}
