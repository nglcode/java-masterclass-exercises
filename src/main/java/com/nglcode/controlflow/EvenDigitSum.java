package com.nglcode.controlflow;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));

    }

    public static int getEvenDigitSum(int number) {

        if ( number < 0 ){
            return -1;
        }

        int lastDigit = 0;
        int sum = 0;

        while (number != 0) {
            lastDigit = number % 10;
            sum += lastDigit % 2 == 0 ? lastDigit : 0;
            number = number / 10;
        }
        return sum;
    }
}
