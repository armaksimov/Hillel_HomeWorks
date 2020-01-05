package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.Car;
import com.hillel.HWs.TaxiPark.interfaces.TaxiPark;

import java.util.ArrayList;

public class TaxiParcProcessor  {
    public static int priceCounter(TaxiPark taxiPark){
        //String carPrice = taxiPark.cars.toString();
        Car cars[] = taxiPark.getCarsList();
        int price = 0;
        for (int i = 0; i < cars.length; i++) {
            price += cars[i].getPrice();
            taxiPark.setPrice(price);
        }
        return price;
    }

    public static Car[] sortingByFuelConsumption(TaxiPark taxiPark){
        Car cars[] = taxiPark.getCarsList();
        Car sorted[] = new Car[cars.length];
        for (int i = 0; i < cars.length - 1; i++)
            if (cars[i].getFuelConsumption() > cars[i + 1].getFuelConsumption())
            {
                sorted[i] = cars[i + 1];
                sorted[i + 1] = cars[i];
            }
        return sorted;
    }

    public static Car[] bubbleSort(Car arr[]) {
        Car sorted[] = new Car[arr.length];
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i].getFuelConsumption() > arr[i + 1].getFuelConsumption())
            {
                sorted[i] = arr[i + 1];
                sorted[i + 1] = arr[i];
            }
        return sorted;
    }

    public static ArrayList findBySpeed(TaxiPark taxiPark){
        int minSpeed = 200;
        ArrayList carsSorted = new ArrayList<Car>();
        Car cars[] = taxiPark.getCarsList();
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getMaxSpeed() >= minSpeed){
                carsSorted.add(cars[i]);
            }
        }
        return carsSorted;
    }
}
