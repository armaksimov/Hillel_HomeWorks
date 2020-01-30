package com.hillel.Taxipark4.funcs;

import com.hillel.Taxipark4.classes.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FuelConsumptionComparator{

    public void sortByFC(){
//        Arrays.sort(Runner.getCars(), comparatorCompare);
//        Arrays.sort(Runner.getCars(), fuelComparationViaLambda);
    }

    public int easyCompare(Car car1, Car car2){
        return car2.getFuelConsumption() - car1.getFuelConsumption();
    }

    private Comparator<Car> comparatorCompare = new Comparator<Car>() {
        @Override
        public int compare(Car car1, Car car2) {
            return car2.getFuelConsumption() - car1.getFuelConsumption();
        }
    };

    public Comparator<Car> fuelComparationViaLambda = ((car, car1) -> car.getFuelConsumption() - car1.getFuelConsumption());
}
