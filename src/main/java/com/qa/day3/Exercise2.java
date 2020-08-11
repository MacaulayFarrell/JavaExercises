package com.qa.day3;

public class Exercise2 {
    public static void loop() {
        System.out.println("Printing 1-10 as many times as that number");
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
