# rpnCalculator
 rpnCalculator
A starter spring boot application with CommandLineRunner is used, when application is started it accepts the inputs from user on the console.

A Unix like or CommandLineCalculator class injects a SimpleCalculator. This SimpleCalculator class is decoupled from its implementation of operators.
 
BaseArithmeticOperator abstract class declares four operators and SimpleArithmeticOperator extends to provide implementation. This allows for future operators.

