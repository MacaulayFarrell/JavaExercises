package com.qa.day4;

import java.util.Scanner;

public class DoggoCompetition {
    /* PROGRAM AIM
    1. get user input
    2. remove the input from the dog places
    3. add the ending to  numbers, e.g. 1st, 2nd, etc.
     */

    public static String getNumberEnding(int i) {
        //declare array storing the options for number endings
        String[] ending = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        //switch statement
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + ending[i % 10];

        }
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your dogs place: ");
        int userInput = input.nextInt();
        for(int i = 1; i <= 100; i++) {

            if(userInput != i) {
                System.out.println(getNumberEnding(i));

            }
        }
    }

    public static void main(String[] args) {
        calculate();
    }
}
