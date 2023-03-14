package com.nglcode.oop.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if ( tonerLevel < 0 || tonerLevel > 100 ) {
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if ( tonerAmount > 0 && tonerAmount <= 100) {
            if ( tonerLevel + tonerAmount > 100 ) {
                return -1;
            } else {
                return tonerLevel += tonerAmount;
            }
        } else {
           return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if ( duplex ) {
            pagesToPrint = (int) Math.ceil( (double) pages / 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
