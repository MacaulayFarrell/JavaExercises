package com.qa.day5;

import java.util.Scanner;

public class Cipher {
    public static void result() {
        //creates variable to store alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //creates new Scanner to store user input
        Scanner string = new Scanner(System.in);
        //asks for user input
        System.out.println("Enter a string: ");
        String input = string.nextLine(); //stores user input in this variable

        input = input.replaceAll(" ", ""); //replaces all spaces with no space
        input = input.toUpperCase(); //changes user input to uppercase

        int len = input.length();
        int len1 = alphabet.length();

        String cipher = ""; //variable to store result
        for(int i = 0; i < len; i++) {
            char b = input.charAt(i); //at each iteration stores the letter at the index
            for(int j = 0; j < len; j++) {
                char c = alphabet.charAt(j);
                if(c == b) { //when the letter in the alphabet matches the letter stored in char b from user input
                    int index = alphabet.indexOf(c); //stores the index of the letter
                    int position = (len1 - 1) - index; //(alphabet length - 1)  - the index of the letter
                    cipher += alphabet.charAt(position); // adds each letter from reverse to alphabet result cipher
                    break;
                }
            }
        }
        System.out.println(cipher); //prints result
    }

    public static void main(String[] args) {
        result(); //cals method
    }
    }

