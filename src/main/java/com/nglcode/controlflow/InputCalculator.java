package com.nglcode.controlflow;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;
        int currentNum = 0;

        while (true) {

            try {
                currentNum = Integer.parseInt(scanner.nextLine());
                counter++;
                sum += currentNum;
                avg = Math.round( (double) sum / counter);
            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
