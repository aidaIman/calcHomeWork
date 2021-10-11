package com.company.number;

import com.company.calculator.Calculator;

import java.io.FileNotFoundException;

import static com.company.exception.MyExceptionNumber.myExceptionNumber;
import static com.company.exception.MyExceptionOperator.myExceptionOperator;

public class ArabNumeral {
    public static void calculatorWithNumbers(StringBuilder input) {
        try {
            String[] strings = input.toString ().split ("\\W");
            int number1 = Integer.parseInt (strings[0]);
            int number2 = Integer.parseInt (strings[1]);
            myExceptionNumber (number1);
            myExceptionNumber (number2);

            String[] operators = input.toString ().split ("\\w");
            String operator = operators[operators.length - 1];
            myExceptionOperator (operator);

            System.out.println ((calculator (number1, number2, operator)));

        } catch (NumberFormatException e) {
            System.out.println ("Ошибка ввода, попробуйте еще раз: ");
        } catch (IllegalArgumentException | FileNotFoundException e) {
            System.out.println (e.getMessage ());
        } catch (Exception e) {
            System.out.println ("Ошибка ввода, попробуйте еще раз: ");
        }
    }

    public static int calculator(int num1, int num2, String operator) {
        Calculator calculator = new Calculator (num1, num2, operator);
        return switch (operator) {
            case "*" -> calculator.multiply (num1, num2);
            case "+" -> calculator.plus (num1, num2);
            case "-" -> calculator.minus (num1, num2);
            case "/" -> calculator.division (num1, num2);
            default -> 0;
        };
    }
}
