package com.nglcode.oop;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        Point point = new Point(0,0);
        return distance(point);
    }

    public double distance(int x, int y) {
        Point point = new Point(x,y);
        return distance(point);
    }

    public double distance(Point anotherPoint) {
        Point a = new Point(this.getX(), this.getY());
        Point b = anotherPoint;
        double factorA = Double.valueOf( (b.getX()-a.getX()) * (b.getX()-a.getX()) );
        double factorB = Double.valueOf( (b.getY()-a.getY()) * (b.getY()-a.getY()) );
        return Math.sqrt( (factorA + factorB) );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
