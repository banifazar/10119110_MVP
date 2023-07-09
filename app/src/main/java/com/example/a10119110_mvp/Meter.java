package com.example.a10119110_mvp;

public class Meter {
    private double meter;

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double toKilometer() {
        double kilometer =  meter / 1000;
        return kilometer;
    }

    public double toCentimeter() {
        double centimeter =  meter * 100;
        return centimeter;
    }
}
