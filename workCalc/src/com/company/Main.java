package com.company;

import com.company.number.ArabNumeral;
import com.company.number.RomanNumeral;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println (
                "Калькулятор:\n введите цифры 1–10 или римские цифры I – X.\n " +
                        "Операции: +, -, /, * \n " +
                        "Введите 'end' для выхода");

        Scanner scanner = new Scanner (System.in);
        do {
            StringBuilder input = new StringBuilder ();
            input.append (scanner.next ());
            if (input.toString ().equals ("end")) {
                break;
            }
            Character firstSymbolInput = input.charAt (0);
            if (Character.isLetter (firstSymbolInput)) {
                RomanNumeral.calculatorWithRomanNumbers (input);
            } else {
                ArabNumeral.calculatorWithNumbers (input);
            }
        } while (true);
    }
}

