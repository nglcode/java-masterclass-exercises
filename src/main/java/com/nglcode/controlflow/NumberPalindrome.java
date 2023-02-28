package com.nglcode.controlflow;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        int absNumber = Math.abs(number);
        int reverse = 0;

        while (absNumber > 0) {
            int lastDigit = Math.abs(absNumber % 10);
            reverse = reverse * 10;
            reverse += lastDigit;
            absNumber = absNumber / 10;
        }

        absNumber = Math.abs(number);

        if ( (reverse == absNumber) ) {
            return true;
        }

        return false;

    }
}
