package com.example.calculatorapp;


import java.util.Stack;

public class SequenceSolver {
    public static double solveEquation(String equation) {
        StringBuilder operandBuilder = new StringBuilder();
        char lastOperator = '+';
        double result = 0.0;

        for (int i = 0; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);

            if (Character.isDigit(currentChar) || currentChar == '.') {
                operandBuilder.append(currentChar);
            } else {
                double operand = Double.parseDouble(operandBuilder.toString());
                operandBuilder = new StringBuilder();

                switch (lastOperator) {
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    case '*':
                        result *= operand;
                        break;
                    case '/':
                        if (operand == 0) {
                            throw new IllegalArgumentException("Division by zero");
                        }
                        result /= operand;
                        break;
                }

                lastOperator = currentChar;
            }
        }

        // Process the last operand
        double lastOperand = Double.parseDouble(operandBuilder.toString());
        switch (lastOperator) {
            case '+':
                result += lastOperand;
                break;
            case '-':
                result -= lastOperand;
                break;
            case '*':
                result *= lastOperand;
                break;
            case '/':
                if (lastOperand == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                result /= lastOperand;
                break;
        }

        return result;
    }
}

