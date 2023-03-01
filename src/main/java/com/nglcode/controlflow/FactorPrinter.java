package com.nglcode.controlflow;

public class FactorPrinter {

    public static void main(String[] args) {

//        printFactors(6);
//        printFactors(32);
        printFactors(45);
    }

    public static void printFactors(int number) {

        if ( number < 1 ){
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if ( number % i == 0 ) {
                System.out.println(i);
            }
        }

    }
}
