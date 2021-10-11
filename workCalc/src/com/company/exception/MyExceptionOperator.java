package com.company.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MyExceptionOperator {
    public static void myExceptionOperator(String operator) throws IOException {
        List<String> listOperators = Arrays.asList ("+", "-", "*", "/");
        if (!listOperators.contains (operator)) {
            throw new FileNotFoundException ("Ошибка ввода оператора попробуйте еще раз: "
                    + operator);
        }
    }
}
