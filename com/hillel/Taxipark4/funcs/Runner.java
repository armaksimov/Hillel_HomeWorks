package com.hillel.Taxipark4.funcs;

import com.hillel.Taxipark4.classes.Car;
import com.hillel.Taxipark4.classes.Hatchback;
import com.hillel.Taxipark4.classes.Universal;
import com.hillel.Taxipark4.funcs.functions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Runner {
     static ArrayList<Car> cars = new ArrayList<Car>();
     public static void main(String[] args) throws IOException {

//         Car[] cars = new Car[]{new Hatchback("BMW", "118i", 12, 250, 15000),
//                 new Hatchback("Audi", "Q8", 15, 240, 14000),
//                 new Universal("Dodge", "Grand Caravan", 17, 220, 10000)};

         cars.add(new Hatchback("BMW", "118i", 12, 250, 15000));
         cars.add(new Hatchback("Audi", "Q8", 15, 240, 14000));
         cars.add(new Universal("Dodge", "Grand Caravan", 17, 220, 10000));

         File file = new File("Cars.txt");

         functions.writerToFile(file, cars);

         String lines[] = functions.inputReader(file);

         Car carsArr[] = new Car[lines.length];

         for (int i = 0; i < lines.length; i++) {

            String carParams[] = lines[i].split(",");
            if(carParams[5].equals("Hatchback"))
                carsArr[i] = new Hatchback(carParams[0], carParams[1], Integer.parseInt(carParams[2]), Integer.parseInt(carParams[3]), Integer.parseInt(carParams[4]));
            else
                carsArr[i] = new Universal(carParams[0], carParams[1], Integer.parseInt(carParams[2]), Integer.parseInt(carParams[3]), Integer.parseInt(carParams[4]));
         }
         System.out.print(carsArr[0]);
     }

    public static ArrayList<Car> getCars() {
        return cars;
    }
}

