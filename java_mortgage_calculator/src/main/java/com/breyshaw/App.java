package com.breyshaw;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Principal:");
    String principal = scanner.nextLine();
    System.out.println(principal);
    System.out.print("Annual Interest Rate:");
    String annual_interest_rate = scanner.nextLine();
    System.out.println(annual_interest_rate);
    System.out.print("Period (Years):");
    String period = scanner.nextLine();
    System.out.println(period); //printing these for now to test the inputs
    //After taking this info I need to calculate the monthly payments
    }
}
