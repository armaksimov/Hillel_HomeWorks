package com.hillel.HWs.TaxiPark.classes;

import com.hillel.HWs.TaxiPark.interfaces.Car;
import com.hillel.HWs.TaxiPark.interfaces.TaxiPark;

public class Runner {
    public static void main(String[] args){
        Car cars[] = new Car[]{new Bus(1, 5000, 160, 3500, 15, 50),
                new SportsCar(2, 7500, 280, 1500, 8, "Michelin", "Red"),
                new Truck(3, 15000, 200, 3000, 12, 4000, "Silver"),
                new Trailer(5, 2000, 0, 400, 1500)};


        TaxiParc taxiPark1 = new TaxiParc("rk", 22, 0, cars);

        int price = TaxiParcProcessor.priceCounter(taxiPark1);
        taxiPark1.setPrice(price);
        System.out.println("Summarized cost of taxipark = " + taxiPark1.getPrice());
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////////////
        Car sortedCars[] = TaxiParcProcessor.sortingByFuelConsumption(taxiPark1);
        for (int i = 0; i < cars.length; i++) {
            System.out.print(sortedCars[i].toString());
        }
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Vehicle, which have speed more than 200KM/H " + TaxiParcProcessor.findBySpeed(taxiPark1));
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < sortedCars.length; i++) {
            System.out.print(sortedCars[i]);
        }

    }
}
