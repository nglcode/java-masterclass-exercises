package com.nglcode.controlflow;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {

        if ( number < 0 ){
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        System.out.println(firstDigit + " - " + lastDigit);

        return firstDigit + lastDigit;


    }
}
