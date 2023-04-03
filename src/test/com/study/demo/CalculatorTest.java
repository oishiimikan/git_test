package com.study.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        Assertions.assertEquals(8, calculator.add(2, 6));
        Assertions.assertEquals(8, calculator.add(1, 7));
        Assertions.assertEquals(8, calculator.add(1, 7));
    }

    @Test
    public void testSub(){
        Assertions.assertEquals(1, calculator.sub(6,5));
        Assertions.assertEquals(1, calculator.sub(4,3));
        Assertions.assertEquals(1, calculator.sub(3,2));
    }

    @Test
    public void testMulti(){
        Assertions.assertEquals(10, calculator.multi(2, 5));
        Assertions.assertEquals(10, calculator.multi(3, 5));
        Assertions.assertEquals(15, calculator.multi(3, 5));
    }

    @Test
    public void testDiv(){
        Assertions.assertEquals(15.0, calculator.div(30, 2));
        Assertions.assertEquals(25.0, calculator.div(100, 4));
    }

}
