package com.realpage.rpncalulator;

import com.realpage.projects.calculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

@Component

public class CommandLineCalculator implements CommandLineRunner {

    @Autowired
    Calculator simpleCalculator;

    private static final Logger logger = LoggerFactory.getLogger(CommandLineCalculator.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("Please enter input numbers and arithmetic operation you would like to perform.");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            String s = in.readLine();
            if (s==null || s.equals("q")) break;
            Stack<String> tokens = new Stack<String>();
            tokens.addAll(Arrays.asList(s.trim().split("[ \t]+")));
            if (tokens.peek().equals("")) continue;

            try {
                double r = simpleCalculator.calculate(tokens);
                if (!tokens.empty()) throw new Exception();
                System.out.println(r);
            }
            catch (Exception e) {System.out.println("Input Error, Please enter again.");}
        }
    }
}
