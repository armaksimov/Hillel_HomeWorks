package com.hillel.Taxipark4.classes;

public class Universal extends Car{
    String className;
    public Universal(String mark, String model, int fuelConsumption, int speed, int price) {
        super(mark, model, fuelConsumption, speed, price);
        this.className = getClass().getName();
    }

    @Override
    public String toString() {
        return getMark() + "," + getModel() + "," + getFuelConsumption() + "," + getSpeed() + "," + getPrice() + "," + getClass().getName() + "; \r\n";
    }
}
