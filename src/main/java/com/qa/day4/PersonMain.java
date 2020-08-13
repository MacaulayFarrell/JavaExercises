package com.qa.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonMain {
    public static List<Person> list = new ArrayList<>();
    public static void menu() {
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner personName = new Scanner(System.in);
        Scanner jobTitle = new Scanner(System.in);

        System.out.println("MENU OPTIONS");
        System.out.println("-------------------------");
        System.out.println("Enter 1 for Create Person");
        System.out.println("Enter 2 for Output All People To Console");
        System.out.println("Enter 3 for Search For A Specific Person");
        System.out.println("-------------------------");
        System.out.println("Option chosen? ");
        int userInput = input.nextInt();

        if(userInput == 1) {

            System.out.println("Please enter Person name: ");
            String nameInput = name.nextLine();

            System.out.println("Please enter Person age: ");
            int ageInput = age.nextInt();

            System.out.println("Please enter Person JobTitle: ");
            String jobTitleInput = jobTitle.nextLine();

            Person b = new Person(nameInput, ageInput, jobTitleInput);
            list.add(b);

            System.out.println("New Person added, their details are: ");
            System.out.println(b.toString());
        }
        else if(userInput == 2) {
            System.out.println("PRINT ALL PERSONS");
            for(Person p : list) {
                System.out.println(p);
            }
        }
        else if(userInput == 3) {
            System.out.println("SEARCH FOR A PERSON");
            System.out.println("Please enter a Person's name to search for them: ");
            String personNameInput = personName.nextLine();

                for(Person i : list) {
                    if(i.getName().equals(personNameInput)) {
                        System.out.println("Person found: ");
                        System.out.println(i.toString());
                        break;
                    }

                }

            }
        }


    public static void main(String[] args) {

        Person macaulay = new Person("Macaulay Farrell", 22, "Computer Scientist");
        Person libby = new Person("Libby Farrell", 19, "Customer Service");
        list.add(macaulay);
        list.add(libby);
        //System.out.println(libby.toString());


        menu();



    }
}
