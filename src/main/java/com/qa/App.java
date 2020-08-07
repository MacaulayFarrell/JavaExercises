package com.qa;

public class App 
{
    public static String printMessage()
    {
        String message = "Using method";
        return message;
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
        //changing value of a variable declared
        hello = printMessage();
        System.out.println(hello);

    }

}
