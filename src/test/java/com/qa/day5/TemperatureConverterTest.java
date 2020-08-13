package com.qa.day5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TemperatureConverterTest {

    @Test
    public void test() {
        TemperatureConverter test = new TemperatureConverter();
        assertEquals(test.convertKelvinToCelsius(500), 227, 0);
        assertEquals(test.convertCelsiusToKelvin(500), 773, 0);


    }

}
