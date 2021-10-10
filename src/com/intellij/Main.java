package com.intellij;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //Constants
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;

            //init the scanner
            Scanner scanner = new Scanner(System.in);

            try {
                //Get principal
                System.out.print("Principal: ");
                int principal = scanner.nextInt();

                //Get annual interest
                System.out.print("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();
                //calculate monthly interest
                float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

                //Get period
                System.out.print("Period (Years): ");
                byte period = scanner.nextByte();
                //calculate number of payments
                int numberOfPayments = period * MONTHS_IN_YEAR;

                //calculate mortgage
                double mortgage = principal
                        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

                //format the result
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

                //Display the result
                System.out.println("Motrgage: " + mortgageFormatted);

            } catch (InputMismatchException error) {
                System.out.println("Something went Wrong, read the error message");
                System.out.println(error);
            }
        }

}
