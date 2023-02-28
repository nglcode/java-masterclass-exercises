package com.nglcode.methods;

public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int minVal = 25;
        int maxVal = summer ? 45 : 35;

        if ( (temperature >= minVal) && (temperature <= maxVal) ) {
            return true;
        }

        return false;
    }
}
