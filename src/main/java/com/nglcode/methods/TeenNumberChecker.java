package com.nglcode.methods;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if ( isTeen(n1) || isTeen(n2) || isTeen(n3) ) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if ( (age > 12) && (age < 20) ) {
            return true;
        }
        return false;
    }
}
