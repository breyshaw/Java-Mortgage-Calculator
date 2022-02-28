package com.breyshaw;

import java.text.NumberFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    //Declare constants to make it more readable to others
        final byte  MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

    int principal = 0;
    float monthlyInterest = 0;
    int numberOfPayments = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) { //infinite loop to keep asking the same question until a user enters a valid value
        System.out.print("Principal:");
        principal = scanner.nextInt();
        //int allows storing of a value up to 2 billion. When using scanner, next() has to match the variable type, nextInt, nextFloat, etc.
        if (principal >= 1000 && principal <= 1_000_000) {
        break;
        }
        System.out.println("Enter a value between 1,000 and 1,000,000");
    }
    while(true) {
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        if (annualInterest >= 1 && annualInterest <=30) {
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //Again, thest constant look alot better to other programmers than unlabled numbers
            break;
        }
        System.out.println("Enter a value between 1 and 30");
    }

    while (true) {
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte(); // a byte is sufficient here
        if (years >= 1 && years <= 30) {
            numberOfPayments = years * MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
    }

    double mortgage = principal * 
    (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
    }
}
