package com.hillel.Taxipark3.classes;
public class Car {
    private String mark;
    private String model;
    private int fuelConsumption;
    private int speed;
    private int price;
    private String class_name;
    public Car(String mark, String model, int fuelConsumption, int speed, int price){
        setMark(mark);
        setModel(model);
        setFuelConsumption(fuelConsumption);
        setSpeed(speed);
        setPrice(price);
    }

    @Override
    public String toString() {
        return getMark() + "," + getModel() + "," + getFuelConsumption() + "," + getSpeed() + "," + getPrice() + "," + getClass();
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
