package com.qa.day2;

public class Exercise4 {
    //Taxes exercise on conditionals, works out total tax
    public static double salary = 45000;
    public static int tax;

    public static int sum(double salary) {

        if(salary >= 0 && salary <= 14999) {
            tax = 0;
        }
        else if(salary >= 15000 && salary <= 19999) {
            tax = 10;
        }
        else if(salary >= 20000 && salary <= 29999) {
            tax = 15;
        }
        else if(salary >= 30000 && salary <= 44999) {
            tax = 20;
        }
        else if(salary >= 45000) {
            tax = 25;
        }
        return tax;

    }
    public static double tax(double salary) {
        return (salary*sum(salary)/100);
    }

    public static void main(String[] args) {
        System.out.println("The total tax you'd pay is: " + tax(salary));
    }
}
