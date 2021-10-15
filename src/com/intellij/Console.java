package com.intellij;

import java.util.Scanner;

public class Console {
    //private, i.e. for internal use only
    private static Scanner scanner = new Scanner(System.in);


    //method overloading
    public static double readNumber(String prompt){

        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {

        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
