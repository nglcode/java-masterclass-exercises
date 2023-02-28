package com.nglcode.controlflow;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);

        System.out.println(reverse(-2));
        System.out.println(getDigitCount(0));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int lastDigit = 0;
        int loops = getDigitCount(number);
        int reversedNum = reverse(number);

        for (int i = 0; i < loops; i++) {
            lastDigit = reversedNum % 10;
            switch (lastDigit) {
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
                default: System.out.println("Other"); break;
            }
            reversedNum = reversedNum / 10;
        }

    }

    public static int reverse(int number) {
        int absNumber = Math.abs(number);
        int reverse = 0;
        while (absNumber > 0) {
            int lastDigit = absNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            absNumber = absNumber / 10;
        }

        if ( number < 0 ){
            reverse = reverse * (-1);
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        do {
            counter++;
            number = number / 10;
        } while (number > 0);
        return counter;
    }
}
