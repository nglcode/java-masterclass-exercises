package com.nglcode.methods;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(10.25);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double kphConversion = 1.609;
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / kphConversion);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
