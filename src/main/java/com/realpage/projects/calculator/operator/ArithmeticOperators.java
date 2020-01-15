package com.realpage.projects.calculator.operator;

public enum ArithmeticOperators {

    ADDITION("+"),
    SUBSTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISON("/");

    private String operator;
    ArithmeticOperators(String operator )
    {
        this.operator = operator;
    }
    public String Operator()
    {
        return  operator;
    }
}
