package com.company;

public class Wheel {
    private String nameFirm;
    private double sizeWheel;

    public Wheel(double sizeWheel, String nameFirm){
        this.sizeWheel = sizeWheel;
        this.nameFirm = nameFirm;
    }

    public String getNameFirm() {
        return nameFirm;
    }

    public void setNameFirm(String nameFirm) {
        this.nameFirm = nameFirm;
    }

    public double getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(double sizeWheel) {
        this.sizeWheel = sizeWheel;
    }
}
