package com.qa.day2;

public class Exercise2 {
    //conditionals exercise 1
    public static int num1 = 5;
    public static int num2 = 5;
    public static boolean state = true;
    public static void flow(int num1, int num2, boolean state) {
        if(state) {
            System.out.println(num1 + num2);
        }
        else {
            System.out.println(num1 * num2);
        }
    }

    public static void main(String[] args) {
        flow(num1, num2, state);
    }
}
