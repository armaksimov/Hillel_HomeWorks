package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.*;

public class SportsCar implements Car {
    private int id;
    private int price;
    private int maxSpeed;
    private int weight;
    private int fuelConsumption;
    private String tiresBrand;
    private String supportColor;
    public SportsCar(int id, int price,  int maxSpeed, int weight, int fuelConsumption, String tiresBrand, String supportColor){
//        super(id, price, maxSpeed, weight, fuelConsumption);
        setId(id);
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setFuelConsumption(fuelConsumption);
        this.tiresBrand = tiresBrand;
        this.supportColor = supportColor;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", tires brand: " + tiresBrand + ", supports color: " + supportColor + "\n";
    }

    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption(){
        return this.fuelConsumption;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setSupportColor(String supportColor) {
        this.supportColor = supportColor;
    }
    public String getSupportColor() {
        return this.supportColor;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setTiresBrand(String tiresBrand) {
        this.tiresBrand = tiresBrand;
    }
    public String getTiresBrand() {
        return tiresBrand;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
