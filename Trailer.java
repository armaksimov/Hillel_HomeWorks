package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.*;

public class Trailer implements Car{
    private int id;
    private int price;
    private int maxSpeed;
    private int weight;
//    private int fuelConsumption;
    private int loadCapacity;
    public Trailer(int id, int price, int maxSpeed, int weight, int loadCapacity){
        setId(id);
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        this.loadCapacity = loadCapacity;
        setPrice(price);
    }

    @Override
    public String toString() {
        return ("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + getFuelConsumption() + ", maximum load: " + loadCapacity + "\n");
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    public int getLoadCapacity(){
        return this.loadCapacity;
    }
    @Override
    public void setId(int id) {

    }
    @Override
    public int getId() {
        return 0;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    @Override
    public void setMaxSpeed(int maxSpeed) {

    }
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public void setFuelConsumption(int fuelConsumption) {

    }
    @Override
    public int getFuelConsumption() {
        return 0;
    }
}
