package com.nglcode.methods;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        int num1 = (int) (n1 * 1000);
        int num2 = (int) (n2 * 1000);

        if ( num1 == num2 ) {
            return true;
        }
        return false;
    }
}
