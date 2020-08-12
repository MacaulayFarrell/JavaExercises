package com.qa.day4;

import java.util.Scanner;

public class Factorials {
    public static void reverse() {
        //given a number this will get the reverse of Factorial
        Scanner userInput = new Scanner(System.in); //scanners are used to get user input in console
        System.out.println("PLease enter a number: ");
        int storeInput = userInput.nextInt(); //stores the scanner input from user, .nextInt(); means input must be an Int.
        int result = storeInput;
        for(int i = 2; result != i; i++) {
            result = result / i;
        }
        if(result == 0) { //ensures that if there is no factorial then it will print NONE
            System.out.println("NONE");
        }
        else { // otherwise print the reverse of factorial
            System.out.println("The reverse of the factorial of " + storeInput + " is " + result);
        }
    }

    public static void main(String[] args) {
        reverse();



    }
}
