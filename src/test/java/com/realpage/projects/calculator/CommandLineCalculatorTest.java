package com.realpage.projects.calculator;

import com.realpage.projects.calculator.operator.SimpleArithmeticOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;


class CommandLineCalculatorTest {

    Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new SimpleCalculator(new SimpleArithmeticOperator(""));
    }


    @Test
    public void test_calculator_without_operator() throws Exception {
/*        Stack<String> input = new Stack<String>();
        input.add("5");
        input.add("8");

        Assertions.assertThrows(Exception.class, () -> {
            calculator.calculate(input);
        });*/
    }

    @Test
    public void test_calculator_addition() throws Exception {
        Stack<String> input = new Stack<String>();
        input.add("5");
        input.add("8");
        input.add("+");
        assertEquals(13, calculator.calculate(input));
    }

    @Test
    public void test_calculator_multiple_operations_1() throws Exception
    {
        Stack<String> input = new Stack<String>();
        input.add("5");
        input.add("9");
        input.add("1");
        input.add("-");
        input.add("/");
        assertEquals(0.625, calculator.calculate(input));
    }
    @Test
    public void test_calculator_multiple_operations_2() throws Exception
    {
        Stack<String> input = new Stack<String>();
        input.add("-3");
        input.add("-2");
        input.add("*");
        input.add("5");
        input.add("+");
        assertEquals(11.0, calculator.calculate(input));
    }
}