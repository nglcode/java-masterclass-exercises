package com.nglcode.controlflow;

public class PaintJob {

    public static void main(String[] args) {

        int x = getBucketCount(-3.4, 2.1, 1.5, 2);
        int y = getBucketCount(3.4, 2.1, 1.5, 2);
        int a = getBucketCount(-3.4, 2.1, 1.5);
        int b = getBucketCount(3.4, 2.1, 1.5);
        int c = getBucketCount(3.4, 1.5);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if ( (width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        double area = width * height;
        return getBucketCount(area, areaPerBucket)-extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ( (width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ( (area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        return (int) Math.ceil( area / areaPerBucket );
    }
}
