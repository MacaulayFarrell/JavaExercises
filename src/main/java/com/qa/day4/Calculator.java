package com.qa.day4;

import java.util.Scanner;

public class Calculator {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static void userChoice() {
        Scanner input = new Scanner(System.in);
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        System.out.println("Welcome to the calculator program!");
        System.out.println("Which method would you like to use?");
        System.out.println("MENU");
        System.out.println("-----------------------------");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("-----------------------------");
        System.out.print("Enter your choice here: ");
        int choice = input.nextInt();
        System.out.print("Please give your first number: ");
        int n1 = number1.nextInt();
        System.out.print("Please give your second number: ");
        int n2 = number2.nextInt();
        if(choice == 1) {
            System.out.println("The result of that operation is " + addition(n1, n2));

        }
        else if(choice == 2) {
            System.out.println("The result of that operation is " + subtraction(n1, n2));
        }
        else if(choice == 3) {
            System.out.println("The result of that operation is " + multiplication(n1, n2));
        }
        else if(choice == 4) {
            System.out.println("The result of that operation is " + division(n1, n2));
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}
