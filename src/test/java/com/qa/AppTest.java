package com.qa;

import static org.junit.Assert.assertEquals;
import com.qa.day2.*;
import com.qa.day3.Exercise5;
import com.qa.day4.Calculator;
import com.qa.day4.DoggoCompetition;
import com.qa.day4.Person;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testHello() {
        App.printMessage();
        assertEquals(App.sayHello(), "Hello there!" );
    }
    @Test
    public void testPerson() {
        Person test = new Person("Jed", 18, "Joiner");
        assertEquals(test.getName(),"Jed");
        assertEquals(test.getJobTitle(), "Joiner");
        assertEquals(test.getAge(), 18);
        assertEquals(test.toString(), "Name: Jed Age: 18 JobTitle: Joiner");
        test.setName("Hello");
        test.setAge(18);
        test.setJobTitle("Joey");

    }
    @Test
    public void testCalculator() {
        assertEquals(Calculator.addition(5,5), 10);
        assertEquals(Calculator.subtraction(10,5), 5);
        assertEquals(Calculator.division(10,2), 5);
        assertEquals(Calculator.multiplication(5,5), 25);

    }
    @Test
    public void testDoggoCompetition() {
        assertEquals(DoggoCompetition.getNumberEnding(2), "2nd");

    }
    @Test
    public void testResults() {
        Results.percentage();
        Results.results();

    }
    @Test
    public void testPerson1() {
        com.qa.day2.Person h = new com.qa.day2.Person();
        h.setFirstName("Macaulay");
        h.setLastName("Farrell");
        assertEquals(h.getFirstName(), "Macaulay");
        assertEquals(h.getLastName(), "Farrell");
    }
    @Test
    public void testBlackjack() {
        Exercise3Blackjack.play(18, 20);
    }

    @Test
    public void testTaxCalculator() {
        assertEquals(Exercise4.sum(15000), 10);

    }
    @Test
    public void calc() {
        assertEquals(20, Exercise1.addition(10, 10), 0.0);
        assertEquals(5, Exercise1.subtraction(10, 5), 0.0);
        assertEquals(30, Exercise1.multiplication(10, 3), 0.0);
        assertEquals(5, Exercise1.division(10, 2), 0.0);

    }
    @Test
    public void testExercise2Day2() {
        Exercise2.flow(10, 10, true);
        Exercise2.flow(5, 5, false);

    }
    @Test
    public void testDay3() {
        com.qa.day3.Exercise1.loop1();
        com.qa.day3.Exercise2.loop();
        Exercise5.list();

    }





}
