
import com.goodline.homework.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    //больших чисел нет в тестах, потому что в функционал не заложены ограничения на вводимые числа и проверки на переполнения

    @Test
    public void sumTest_10_15_expected25() {
        assertEquals(25, Calculator.sum(10, 15));
    }

    @Test
    public void sumTest_0_10_expected10() {
        assertEquals(10, Calculator.sum(0, 10));
    }
    @Test
    public void sumTest_1_minus1_expected0() {
        assertEquals(0, Calculator.sum(1, -1));
    }
    @Test
    public void sumTest_minus10_minus15_expectedMinus25() {
        assertEquals(-25, Calculator.sum(-10, -15));
    }


    @Test
    public void subTest_13_12_expected1() {
        assertEquals(1, Calculator.sub(13, 12));
    }
    @Test
    public void subTest_12_13_expectedMinus1() {
        assertEquals(-1, Calculator.sub(12, 13));
    }
    @Test
    public void subTest_Minus10_Minus10_expected0() {
        assertEquals(0, Calculator.sub(-10, -10));
    }
    @Test
    public void subTest_0_10_expectedMinus10() {
        assertEquals(-10, Calculator.sub(0, 10));
    }
    @Test
    public void subTest_10_Minus10_expected0() {
        assertEquals(20, Calculator.sub(10, -10));
    }

    @Test
    public void multTest_10_10_expected100() {
        assertEquals(100, Calculator.mult(10, 10));
    }
    @Test
    public void multTest_10_0_expected0() {
        assertEquals(0, Calculator.mult(10, 0));
    }
    @Test
    public void multTest_10_1_expected10() {
        assertEquals(10, Calculator.mult(10, 1));
    }
    @Test
    public void multTest_5_minus5_expectedMinus25() {
        assertEquals(-25, Calculator.mult(5, -5));
    }
    @Test
    public void multTest_minus5_minus5_expected25() {
        assertEquals(25, Calculator.mult(5, 5));
    }

    @Test
    public void divTest_10_3_expected3dot33(){
        try {
            assertEquals(3.33, Calculator.div(10, 3));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_9_2_expected4dot5(){
        try {
            assertEquals(4.5, Calculator.div(9, 2));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_9_3_expected3(){
        try {
            assertEquals(3, Calculator.div(9, 3));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_6_minus3_expectedMinus2(){
        try {
            assertEquals(-2, Calculator.div(6, -3));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_minus6_minus3_expected2(){
        try {
            assertEquals(2, Calculator.div(-6, -3));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_5_minus1_expectedMinus5(){
        try {
            assertEquals(-5, Calculator.div(5, -1));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void divTest_5_0_expectedException(){
        try {
            Calculator.div(5,0);
            fail("Exception expected");
        } catch (Exception e) {
            assertSame("Division by zero!", e.getMessage());
        }
    }

    @Test
    public void powTest_10_0_expected1(){
        try {
            assertEquals(1.0, Calculator.pow(10,0));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_10_1_expected10(){
        try {
            assertEquals(10.0, Calculator.pow(10,1));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_10_minus2_expected0dot01(){
        try {
            assertEquals(0.01, Calculator.pow(10,-2));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_10_3_expected1000(){
        try {
            assertEquals(1000.0, Calculator.pow(10,3));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_2_10_expected1024(){
        try {
            assertEquals(1024.0, Calculator.pow(2,10));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_0_0_expected1(){
        try {
            assertEquals(1.0, Calculator.pow(0,0));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_0_1_expected0(){
        try {
            assertEquals(0.0, Calculator.pow(0,1));
        } catch (Exception e) {
            fail("DivisionByZeroException for no reason");
        }
    }
    @Test
    public void powTest_0_minus1_expectedException(){
        try {
            Calculator.pow(0, -1);
            fail("Exception expected");
        } catch (Exception e) {
            assertSame("Division by zero!", e.getMessage());
        }
    }

}