import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Car cars[] = new Car[]{new Hatchback("BMW", "118i", 12, 250, 15000),
                        new Hatchback("Audi", "Q8", 15, 240, 14000),
                        new Universal("Dodge", "Grand Caravan", 17, 220, 10000)};
        File file = new File("Cars.txt");
        try(FileWriter writer = new FileWriter("Cars.txt", false))
        {
            for (int i = 0; i < cars.length; i++) {
                writer.write(String.valueOf(cars[i]));
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }

        FileInputStream fis = new FileInputStream("Cars.txt");
        byte[] byteArray = new byte[(int)file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split(";\r\n");
        fis.close();

        int count = 0;
        FileReader reader = new FileReader("Cars.txt");
        Scanner scanner = new Scanner(reader);
        String lines[] = new String[stringArray.length];
        while (count < lines.length){
            lines[count]= scanner.next();
            count++;
        }
        reader.close();
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
