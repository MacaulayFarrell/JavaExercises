package com.qa.day3;

public class Exercise4 {
    public static int[] numbers = new int[10];
    public static void array() {
        for(int i = 0; i <= numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }

    }



    public static void main(String[] args) {
        array();
        System.out.println(numbers[2]);

    }
}
