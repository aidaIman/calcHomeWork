package com.company.calculator;

public class Calculator implements Operation {
    private int number1;
    private int number2;
    private String operator;

    public Calculator(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public int minus(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int division(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", operator='" + operator + '\'' +
                '}';
    }
}
