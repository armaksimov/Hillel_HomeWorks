import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        Car cars[] = new Car[]{new Bus(1, 5000, 160, 3500, 15, 50),
                new SportsCar(2, 7500, 280, 1500, 8, "Michelin", "Red"),
                new Truck(3, 15000, 200, 3000, 12, 4000, "Silver"),
                new Trailer(5, 2000, 0, 400, 1500)};


        TaxiPark taxiPark1 = new TaxiPark("rk", 22, 8, cars);

        int price = TaxiParcProcessor.priceCounter(taxiPark1);
        taxiPark1.price = price;
        System.out.println("Summarized cost of taxipark = " + taxiPark1.price);
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
