package com.company.exception;

public class MyExceptionNumber {
    public static void myExceptionNumber(int number) throws RuntimeException {
        if (number > 10 || number < 1) {
            throw new IllegalArgumentException ("Ошибка ввода, попробуйте еще раз цифры 1-10: " + number);
        }
    }
}
