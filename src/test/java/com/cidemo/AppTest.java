package com.cidemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cidemo.service.Calculator;
import org.junit.Test;


public class AppTest 
{
    private Calculator calculator = new Calculator();

    @Test
    public void Test1()
    {
        int response = calculator.calcularMayor(1,2,3);
        assertEquals(3, response);
    }
    @Test
    public void Test2()
    {
        int response = calculator.calcularMayor(1,2,-3);
        assertEquals(2, response);
    }

    @Test
    public void Test3()
    {
        int response = calculator.calcularMayor(1,-2,-3);
        assertEquals(1, response);
    }
}
