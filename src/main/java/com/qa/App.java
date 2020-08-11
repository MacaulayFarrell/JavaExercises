package com.qa;

import com.qa.day2.Person;

public class App
{
    public static void printMessage()
    {
        String message = "Hello World!";
        System.out.println(message);
    }
    public static String sayHello()
    {
        return "Hello there!";
    }

    public static void main( String[] args )
    {
        //declare variable and print it out
        String hello = "Hello World";
        System.out.println(hello);
        //print something to console
        System.out.println( "Hello Everyone" );
        //get result of method
        printMessage();
        System.out.println(sayHello());
        Person Macaulay = new Person();
        Macaulay.setFirstName("Macaulay");
        Macaulay.setLastName("Farrell");
        System.out.println(Macaulay.getFirstName() + Macaulay.getLastName());

    }

}
