package com.nglcode.controlflow;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (40, 22, 71));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if ( !isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }

        int n1Last = n1 % 10;
        int n2Last = n2 % 10;
        int n3Last = n3 % 10;
        int counter = 0;

        if ( n1Last == n2Last ) {
            counter++;
        }
        if ( n1Last == n3Last ) {
            counter++;
        }
        if ( n2Last == n3Last ) {
            counter++;
        }

        return (counter > 0);
    }

    public static boolean isValid(int num) {
        return ( (num >= 10) && (num <= 1000) );
    }
}
