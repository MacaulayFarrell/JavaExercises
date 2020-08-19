package com.qa.day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void streamsExercise1() {
        //return every string in list except James and add Hello to beginning of each list member
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        List<String> result = names.stream().filter(x -> !x.equals("James")).map(x -> x = "Hello" + x).collect(Collectors.toList());
        System.out.println("Exercise 1: " + result);
    }
    public static void streamsExercise2() {
        //return the product of the list by multiplying all members together
        List<Integer> numbers = Arrays.asList(3,4,7,8,12);
        int result1 = numbers.stream().reduce((a,b) -> a * b).get();
        System.out.println("Exercise 2: " + result1);
    }
    public static void streamsExercise3() {
        System.out.println("EXERCISE 3 ");
        //create list
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
        //get max value in list
        int max = numbersList.stream().max(Integer::compare).get();
        System.out.println("Max value: " + max);
        //get min value in list
        int min = numbersList.stream().min(Integer::compare).get();
        System.out.println("Min value: " + min);
        //return only odd numbers in list
        List<Integer> oddNumbers = numbersList.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: ");
        System.out.println(oddNumbers);
        //return only even numbers in list
        List<Integer> evenNumbers = numbersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: ");
        System.out.println(evenNumbers);
        //return sum of all numbers in list added together
        int sum = numbersList.stream().reduce(Integer::sum).get();
        System.out.println("Sum of list: " + sum);

        //square every number, then remove even numbers using filter
        List<Integer> numberCheck= numbersList.stream().map(x -> x*x).filter(x -> x % 2 != 0).collect(Collectors.toList());
        //print result
        System.out.println("Result");
        System.out.println(numberCheck);
        System.out.println("The minimum number in list is: " + min);

    }
    public static void main(String[] args) {
        streamsExercise1();
        streamsExercise2();
        streamsExercise3();




    }
}
