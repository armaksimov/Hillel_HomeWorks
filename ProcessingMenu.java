import java.awt.desktop.AboutEvent;
import java.util.*;

public class ProcessingMenu {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList bouquets = new ArrayList<Bouquet>();
    static int price = 0;
    static int numberOfCalls = 0;
    static int flowersNumOfCalls = 0;
    static int accessorieNumOfCalls = 0;
    static int oneBouquetPrice = 0;

    public static void printingMainMenu() {
        System.out.println("Flower Box \n 1. Create a bouquet \n 2. See created bouquets \n 3. Count allover price \n 4. Terminate session");
        int command = scanner.nextInt();
        if (command == 1) {
            creatingBouquet();
        }
        else if (command == 2) {
            System.out.println(bouquets);
            printingMainMenu();
        }
        else if (command == 3) {
            System.out.println("Allover price is: " + price);
            printingMainMenu();
        }
        else if (command == 4) {
            System.exit(0);
        }
    }

    public static void creatingBouquet(){
        Bouquet bouquet = new Bouquet();
        System.out.println("Creating a bouquet \n 1. Create and add a flower \n 2. Create and add an accessory \n 3. Count summary price \n 4. Back <-");
        int command = scanner.nextInt();
        if(command == 1){
            bouquet.flowers[flowersNumOfCalls] = addFlower();
            for (int i = 0; i < bouquet.flowers.length; i++) {
                oneBouquetPrice += bouquet.flowers[flowersNumOfCalls].getPrice();
            }
            flowersNumOfCalls++;
        }

        else if(command == 2){
            bouquet.accessory[accessorieNumOfCalls] = addAccessory();
//            System.out.println("Please set number of accessories to be: ");
//            bouquet.setAccessoryLength(scanner.nextInt());
            oneBouquetPrice += bouquet.accessory[accessorieNumOfCalls].getPrice();
            accessorieNumOfCalls++;
        }

        else if(command == 3){
            System.out.println("Price of one bouquet is: " + oneBouquetPrice);
        }

        else if(command == 4){
            printingMainMenu();
            flowersNumOfCalls = 0;
            accessorieNumOfCalls = 0;
        }
        numberOfCalls++;
        bouquets.add(bouquet);
        oneBouquetPrice = 0;
        creatingBouquet();
    }

//    public static int countPrice(){
//        int price = 0;
//        Object[] bouquetsContainer = bouquets.toArray();
//        for (int i = 0; i < bouquets.size(); i++) {
//            Bouquet bouquet = bouquets.get(1);
//        }
//        return price;
//    }

//    public static int countAllOverPrice(){
//        int price = 0;
//        for (int i = 0; i < bouquets.length; i++) {
//            price += countPrice();
//        }
//        return price;
//    }

    public static boolean isPositive(int i){
        if(i > 0)
            return true;
        else
            return false;
    }

    public static Flower addFlower(){
        Flower flower = new Flower();
        System.out.println("Adding a flower \n Enter name");
        flower.setName(scanner.next());
        System.out.println("Enter price");
        int priceOf = scanner.nextInt();
        flower.setPrice(priceOf);
        price += priceOf;
        System.out.println("Enter stem length");
        flower.setStemLength(scanner.nextInt());
        System.out.println("Enter days to live");
        flower.setDaysToLive(scanner.nextInt());
        System.out.println("Enter colour");
        flower.setColour(scanner.next());
        return flower;
    }

    public static Accessory addAccessory(){
        Accessory accessory = new Accessory();
        System.out.println("Adding an accessory \n Enter name");
        accessory.setAccessoryName(scanner.next());
        System.out.println("Enter price");
        int priceOf = scanner.nextInt();
        price += priceOf;
        accessory.setPrice(price);
        System.out.println("Enter color");
        accessory.setColour(scanner.next());
        return accessory;
    }
}
