package com.qa.day2;

public class Exercise3Blackjack {
    public static int num1 = 20;
    public static int num2 = 21;
    public static void play(int num1, int num2) {
        if(num1 > num2 && num1 <= 21) {
            System.out.println(num1);
        }
        else if(num2 > num1 && num2 <= 21) {
            System.out.println(num2);
        }
        else if(num1 > 21 && num2 > 21) {
            System.out.println(0);
        }

    }
    public static void main(String[] args) {
        play(num1, num2);

    }
}
