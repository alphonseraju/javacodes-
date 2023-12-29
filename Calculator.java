package com.controlstatements;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = nn.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = nn.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = nn.next().charAt(0);

        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);

        nn.close();
    }
}