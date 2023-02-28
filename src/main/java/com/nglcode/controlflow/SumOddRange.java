package com.nglcode.controlflow;

public class SumOddRange {

    public static void main(String[] args) {


        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
    }

    public static boolean isOdd(int num) {
        if ( num <= 0 ) {
            return false;
        }
        return num % 2 != 0 ? true : false;
    }

    public static int sumOdd(int start, int end) {

        if ( (start <= 0) || (end <= 0) || (start > end)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if ( isOdd(i) ){
                sum += i;
            }

        }
        return sum;
    }
}
