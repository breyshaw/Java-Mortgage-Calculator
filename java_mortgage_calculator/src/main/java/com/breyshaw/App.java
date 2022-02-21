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

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal:");
    int principal = scanner.nextInt();
    //int allows storing of a value up to 2 billion. When using scanner, next() has to match the variable type, nextInt, nextFloat, etc.
    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //Again, thest constant look alot better to other programmers than unlabled numbers
    System.out.print("Period (Years): ");
    byte years = scanner.nextByte(); // a byte is sufficient here
    int numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage = principal * 
    (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
    }
}
