package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {

    MyMathCalc calc;

    @BeforeEach
    void initTest(){
        calc = new MyMathCalc();
    }

    @Test
    void add() {
        int expected = 5;
        assertEquals(expected, calc.add(2,3));
        assertNotEquals(expected, calc.add(3, 3));
    }

    @Test
    void multiply() {
        int expected = 6;
        assertEquals(expected, calc.multiply(2,3));
        assertNotEquals(expected, calc.multiply(3, 3));
    }

    @Test
    void divide() {
        int expected = 2;
        assertEquals(expected, calc.divide(4, 2));
        assertNotEquals(expected, calc.divide(4, 3));
        assertEquals(Double.POSITIVE_INFINITY, calc.divide(4, 0));
        //assertThrows(ArithmeticException.class, () -> calc.divide(4, 0));   //double och float kastar inte arithmetic exception när man delar med 0
    }
}