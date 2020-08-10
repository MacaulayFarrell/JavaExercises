package com.qa.day2;


public class Exercise1 {
    //calculator exercise
    public static double num1 = 10;
    public static double num2 = 10;

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double division(double num1, double num2) {

            return num1 / num2;
    }


    public static void main(String[] args) {
        System.out.println(addition(num1, num2));
        System.out.println(subtraction(num1, num2));
        System.out.println(multiplication(num1, num2));
        System.out.println(division(num1, num2));



    }
}
