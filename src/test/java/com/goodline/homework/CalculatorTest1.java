package com.goodline.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    @Test
    void sum() {
        assertEquals(10, Calculator.sum(5, 5));
    }

    @Test
    void sub() {
        assertEquals(1, Calculator.sub(10,9));
    }

    @Test
    void mult() {
        assertEquals(42, Calculator.mult(6,7));
    }

    /*@Test
    void div() {
        assertEquals(4, Calculator.div(12, 3));
    }
    @Test
    void div1() {
        assertEquals(4.5, Calculator.div(9, 2));
    }
    @Test
    void div2() {
        assertEquals(3.33, Calculator.div(10, 3));
    }*/


}