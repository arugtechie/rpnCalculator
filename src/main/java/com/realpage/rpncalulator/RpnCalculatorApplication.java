package com.realpage.rpncalulator;

import com.realpage.projects.calculator.Calculator;
import com.realpage.projects.calculator.SimpleCalculator;
import com.realpage.projects.calculator.operator.SimpleArithmeticOperator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RpnCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpnCalculatorApplication.class, args);
	}

	@Bean
	Calculator simpleCalculator()
	{
		return new SimpleCalculator(new SimpleArithmeticOperator(""));
	}
}
