package com.nglcode.oop;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
        add(complexNumber);
    }

    public void add(ComplexNumber complexNumber) {
        real += complexNumber.getReal();
        imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
        subtract(complexNumber);
    }

    public void subtract(ComplexNumber complexNumber) {
        real -= complexNumber.getReal();
        imaginary -= complexNumber.getImaginary();
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
