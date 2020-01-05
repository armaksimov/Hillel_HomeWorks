package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.*;

public class Bus implements Car {
    private int id;
    private int price;
    private int maxSpeed;
    private int weight;
    private int fuelConsumption;
    private int passengerCapacity;
    public Bus(int id, int price, int maxSpeed, int weight, int fuelConsumption, int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
        setPrice(price);
        setFuelConsumption(fuelConsumption);
        setMaxSpeed(maxSpeed);
        setPassengerCapacity(passengerCapacity);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return ("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", passenger capacity: " + passengerCapacity + "\n");
    }

    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption(){
        return this.fuelConsumption;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
