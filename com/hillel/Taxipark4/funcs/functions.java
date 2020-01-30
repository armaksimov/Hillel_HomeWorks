package com.hillel.Taxipark4.funcs;

import com.hillel.Taxipark4.classes.Car;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class functions {
    public static String[] inputReader(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split(";\r\n");
        fis.close();

        return stringArray;
    }
    public static void writerToFile(File file, ArrayList<Car> cars) throws IOException{
        try(FileWriter writer = new FileWriter(file, false))
        {
            for (int i = 0; i < cars.size(); i++) {
                writer.write(String.valueOf(cars.get(i)));
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
