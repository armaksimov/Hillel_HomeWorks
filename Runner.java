package com.hillel.Taxipark3.functions;
import java.io.*;
import java.util.Scanner;
import com.hillel.Taxipark3.classes.Car;
import com.hillel.Taxipark3.classes.Hatchback;
import com.hillel.Taxipark3.classes.Universal;

public class Runner {
    public static void main(String[] args) throws IOException {
        Car[] cars = new Car[]{new Hatchback("BMW", "118i", 12, 250, 15000),
                        new Hatchback("Audi", "Q8", 15, 240, 14000),
                        new Universal("Dodge", "Grand Caravan", 17, 220, 10000)};

        File file = new File("Cars.txt");

        Funcs.writerToFile(file, cars);

        String lines[] = Funcs.inputReader(file);

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
}
