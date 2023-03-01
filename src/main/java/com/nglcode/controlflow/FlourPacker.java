package com.nglcode.controlflow;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (5, 3, 24));
        System.out.println(canPack (4, 8, 19));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ( (bigCount < 0) || (smallCount < 0) || (goal < 0) ){
            return false;
        }

        int bigCountsToUse = bigCount < goal/5 ? bigCount : goal/5;
        System.out.println("bgToUse: " + bigCountsToUse);
        return (goal - bigCountsToUse*5) <= smallCount;
    }
}
