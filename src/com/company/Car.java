package com.company;

public class Car {
    private Wheel wheel;
    private SteeringWheel steeringWheel;
    private String carName;

    public void Car(Wheel wheel, SteeringWheel steeringWheel, String carName){
       wheel.getSizeWheel();
       this.steeringWheel = steeringWheel;
       carName = "Мазяка";
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
