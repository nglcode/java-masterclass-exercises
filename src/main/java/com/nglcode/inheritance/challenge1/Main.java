package com.nglcode.inheritance.challenge1;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee salaried1 = new SalariedEmployee("Tom", "01/01/1980", "10/01/2010", 15000);
        System.out.println(salaried1);
        System.out.println("Paycheck = $" + salaried1.collectPay());
        salaried1.retire();
        System.out.println("Retired Paycheck = $" + salaried1.collectPay());

        HourlyEmployee hourly1 = new HourlyEmployee("Anna", "01/01/1983", "03/03/2018", 15);
        System.out.println(hourly1);
        System.out.println("Paycheck = $" + hourly1.collectPay());
        System.out.println("Holiday Paycheck = $" + hourly1.getDoublePay());




    }
}
