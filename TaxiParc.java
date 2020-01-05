package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.*;

public class TaxiParc implements TaxiPark {
    Car carsList[];
    String city;
    int stuffQuantity;
    int price;

    public TaxiParc(String city, int stuffQuantity, int price, Car[] carsList){
        setCarsList(carsList);
        setCity(city);
        setStaffQuantity(stuffQuantity);
        setPrice(price);
    }

    @Override
    public void setCarsList(Car[] carsList) {
        this.carsList = carsList;
    }
    @Override
    public Car[] getCarsList() {
        return carsList;
    }
    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
    @Override
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String getCity() {
        return this.city;
    }
    @Override
    public void setStaffQuantity(int staffQuantity) {
        this.stuffQuantity = staffQuantity;
    }
    @Override
    public int gerStaffQuantity() {
        return this.stuffQuantity;
    }
}
