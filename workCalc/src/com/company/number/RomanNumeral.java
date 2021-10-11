package com.company.number;

import com.company.RomanNumeralEnum;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.company.exception.MyExceptionOperator.myExceptionOperator;
import static com.company.exception.MyExceptionResultRomanNumber.myExceptionResultRomanNumber;
import static com.company.number.ArabNumeral.calculator;

public class RomanNumeral {

    public static void calculatorWithRomanNumbers(StringBuilder input) {
        try {
            String[] strings = input.toString ().split ("\\W");
            int number1 = RomanNumeral.romanToArabic (strings[0]);
            int number2 = RomanNumeral.romanToArabic (strings[1]);

            String[] operators = input.toString ().split ("\\w");
            String operator = operators[operators.length - 1];
            myExceptionOperator (operator);

            int result = (calculator (number1, number2, operator));
            try {
                myExceptionResultRomanNumber (result);
            } catch (IllegalArgumentException e) {
                System.out.println (e.getMessage ());
            }
            System.out.println (integerToRoman (result));
        } catch (ArrayIndexOutOfBoundsException | IllegalStateException e) {
            System.out.println ("Ошибка ввода римского числа, попробуйте еще раз: " + input);
        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public static int romanToArabic(String input) {
        return switch (input) {
            case "X" -> RomanNumeralEnum.X.getValue ();
            case "IX" -> RomanNumeralEnum.IX.getValue ();
            case "VIII" -> RomanNumeralEnum.VIII.getValue ();
            case "VII" -> RomanNumeralEnum.VII.getValue ();
            case "VI" -> RomanNumeralEnum.VI.getValue ();
            case "I" -> RomanNumeralEnum.I.getValue ();
            case "II" -> RomanNumeralEnum.II.getValue ();
            case "III" -> RomanNumeralEnum.III.getValue ();
            case "IV" -> RomanNumeralEnum.IV.getValue ();
            case "V" -> RomanNumeralEnum.V.getValue ();
            default -> throw new IllegalStateException ("Римское число I - X: " + input);
        };
    }

    public static String integerToRoman(int result) {
        StringBuilder buf = new StringBuilder ();
        final RomanNumeralEnum[] values = RomanNumeralEnum.values ();
        for (int i = values.length - 1; i >= 0; i--) {
            while (result >= values[i].getValue ()) {
                buf.append (values[i]);
                result -= values[i].getValue ();
            }
        }
        return buf.toString ();
    }
}

