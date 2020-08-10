package com.qa.day2;

public class Results {
    public static int physics = 75;
    public static int chemistry = 130;
    public static int biology = 140;
    public static int total;
    public static int percentage;

    public static void results() {
        System.out.println("EXAM RESULTS");
        System.out.println("For physics you received: " + physics + "/150");
        System.out.println("For chemistry you received: " + chemistry + "/150");
        System.out.println("For biology you received: " + biology + "/150");
        //total calculation
        total = physics + chemistry + biology;
        System.out.println("Overall, you achieved: " + total + " out of 450");
    }
    public static void percentage() {
        percentage = total * 100 / 450;
        System.out.println("Your total percentage is: " + percentage);
        if(percentage >= 60 && biology * 100 / 150 >= 60 && chemistry * 100 / 150 >= 60 && physics * 100 / 150 >= 60) {
            System.out.println("You have passed the course ");
        }
        else {
            System.out.println("You have failed the course, please see below to see which courses you failed. You require 60% in each module.");
        }
        if(biology * 100 / 150 < 60 ) {
            System.out.println("You have failed biology");
        }
        if(physics * 100 / 150 < 60) {
            System.out.println("You have failed physics");
        }
        if(chemistry * 100 / 150 < 60) {
            System.out.println("You have failed chemistry");

        }
    }

    public static void main(String[] args) {
        results();
        percentage();

    }
}
