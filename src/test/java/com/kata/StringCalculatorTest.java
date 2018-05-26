package com.kata;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void when_calculate_empty_string(){
        StringCalculator calculator =  new StringCalculator();
        Assert.assertTrue("The result must be 0, when calculating a empty string.", calculator.calcular("") ==  0);
    }


    @Test
    public void when_calculate_string_numbers(){
        StringCalculator calculator =  new StringCalculator();
        Assert.assertTrue("The result must be a sum of all string numbers.", calculator.calcular("1,2,3,4,5") ==  15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_calculate_letter(){
    	StringCalculator calculator =  new StringCalculator();
    	calculator.calcular("1,A");
    }


    @Test(expected = IllegalArgumentException.class)
    public void when_calculate_null(){
        StringCalculator calculadora =  new StringCalculator();
        calculadora.calcular(null);
    }

}
