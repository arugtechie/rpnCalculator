package com.realpage.projects.calculator.operator;

public class SimpleArithmeticOperator extends BaseArithmeticOperator implements ArithmeticOperator {

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String operator;

    public SimpleArithmeticOperator(String operator)
    {
        this.operator = operator;
    }
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double subtract(double x, double y) {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double divide(double x, double y) {
        return x / y;
    }

    @Override
    public double execute(double x, double y) throws Exception {

        if (operator.equals(ArithmeticOperators.ADDITION.Operator()))
            return add(x, y);
        else if (operator.equals(ArithmeticOperators.SUBSTRACTION.Operator()))
            return subtract(x, y);
        else if (operator.equals(ArithmeticOperators.MULTIPLICATION.Operator()))
            return multiply(x, y);
        else if (operator.equals(ArithmeticOperators.DIVISON.Operator()))
            return divide(x, y);
        else throw new Exception();


    }
}
