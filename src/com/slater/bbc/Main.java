package com.slater.bbc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer userInput = userInput();
        RomanNumeral romanNumeral = new RomanNumeral();
	    while (userInput != -1) {
            if (userInput == -2) userInput = userInput();
	        String newRomanNumeral = romanNumeral.generate(userInput);
	        System.out.println(newRomanNumeral);
            userInput = userInput();
        }
    }

    private static Integer userInput () {
        System.out.println("Enter number to see Roman Numeral Comparison - enter -1 to exit");
        Scanner scanner = new Scanner(System.in);
        Integer comparisonNumber = 0;
        Boolean valid = false;
        while (!valid) {
            try{
                comparisonNumber = scanner.nextInt();
                if (comparisonNumber == (int)comparisonNumber ) valid = true;
            }
            catch (InputMismatchException input) {
                System.out.println("You must enter a number - enter -1 to exit");
                scanner.next();
            }
        }

        return comparisonNumber;
    }
}
