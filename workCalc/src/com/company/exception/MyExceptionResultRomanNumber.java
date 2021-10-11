package com.company.exception;

public class MyExceptionResultRomanNumber {
    public static void myExceptionResultRomanNumber(int result) throws RuntimeException {
        if (result <= 0) {
            throw new IllegalArgumentException (
                    "Ноль и отрицательных чисел в римских цифрах нет: " + result);
        }
    }
}
