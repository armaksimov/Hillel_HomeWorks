package com.hillel.Taxipark3.functions;

import java.io.*;
import com.hillel.Taxipark3.classes.Car;
import java.util.Scanner;

public class Funcs {
    public static String[] inputReader(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split(";\r\n");
        fis.close();

        return stringArray;
    }
    public static void writerToFile(File file, Car cars[]) throws IOException{
        try(FileWriter writer = new FileWriter(file, false))
        {
            for (int i = 0; i < cars.length; i++) {
                writer.write(String.valueOf(cars[i]));
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
