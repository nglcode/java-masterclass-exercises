package com.nglcode.controlflow;

public class LargestPrime {

    public static void main(String[] args) {

//        getLargestPrime (21);
//        getLargestPrime (7);
//        getLargestPrime (45);
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (7));
        System.out.println(getLargestPrime (45));
    }

    public static int getLargestPrime(int number) {

        if ( number <= 1 ){
            return -1;
        }

        int maxPrimeNum = -1;
        int counter = 0;

        for (int i = 2; i < number; i++){
            if ( number % i == 0 ) {
                counter++;
                maxPrimeNum = i;
            }
        }

        if ( counter == 0 ) {
            maxPrimeNum = number;
        } else {
            maxPrimeNum = getLargestPrime(maxPrimeNum);
        }

        return maxPrimeNum;

    }


}
