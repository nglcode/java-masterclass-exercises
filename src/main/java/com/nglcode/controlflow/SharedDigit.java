package com.nglcode.controlflow;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(15, 30));
    }

    public static boolean hasSharedDigit(int n1, int n2) {

        if ( (n1 < 10) || (n1 > 99) || (n2 < 10) || (n2 > 99)) {
            return false;
        }

        int n1FirstDigit = n1 / 10;
        int n1LastDigit = n1 % 10;

        int n2FirstDigit = n2 / 10;
        int n2LastDigit = n2 % 10;

        if ( (n1FirstDigit == n2FirstDigit)
                || (n1FirstDigit == n2LastDigit)
                || (n1LastDigit == n2FirstDigit)
                || (n1LastDigit == n2LastDigit) ) {
            return true;
        }

        return false;
    }
}
