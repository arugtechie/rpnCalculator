package com.realpage.projects.calculator;

import com.realpage.projects.calculator.operator.ArithmeticOperator;
import com.realpage.projects.calculator.operator.ArithmeticOperators;
import com.realpage.projects.calculator.operator.SimpleArithmeticOperator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Stack;

public class SimpleCalculator implements Calculator{

    private final SimpleArithmeticOperator simpleArithmeticOperator;

    @Autowired
    public SimpleCalculator(SimpleArithmeticOperator simpleArithmeticOperator)
    {
        this.simpleArithmeticOperator = simpleArithmeticOperator;
    }
    @Override
    public double calculate(Stack<String> inputs) throws Exception {
        double x, y, output;
        String operator = "";
        String element = inputs.pop();
        try
        {
            output = Double.parseDouble(element);
        }catch (Exception e)
        {
            y = calculate(inputs); //-, 1, 9, 5 //1, 9, 5 //1
            x = calculate(inputs); //9
            simpleArithmeticOperator.setOperator(element);
            output = simpleArithmeticOperator.execute(x, y);

        }
        return output;

}
}

