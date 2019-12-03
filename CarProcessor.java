import java.util.Scanner;

public class CarProcessor {
    public void PrintingByMark(Car[] cars) {
        System.out.println("Input car mark to sort by");
        Car carsCopy[] = cars;
        Scanner scanner = new Scanner(System.in);
        String markInput = scanner.nextLine();
        for (int i = 0; i < cars.length; i++) {
            if(markInput.equals(cars[i].mark)){
                PrintCar(cars[i]);
            }
        }
    }

    public void PrintingByAge(Car[] cars) {
        System.out.println("Input maximum car age");
        Scanner scanner = new Scanner(System.in);
        int maxAge = scanner.nextInt();
        int year = 2019;
        int vehicleAge = 0;
        for (int i = 0; i < cars.length; i++) {
            vehicleAge = year - cars[i].manufacturingYear;
            if(vehicleAge <= maxAge){
                PrintCar(cars[i]);
            }
        }
    }

    public void PrintingByManufacturingYear(Car[] cars) {
        System.out.println("Input manufacturing year");
        Scanner scanner = new Scanner(System.in);
        int preferredManufacturingYear = scanner.nextInt();
        System.out.println("Input minimum price");
        int minPrice = scanner.nextInt();

        for (int i = 0; i < cars.length; i++) {
            if(preferredManufacturingYear == cars[i].manufacturingYear && cars[i].price >= minPrice){
                PrintCar(cars[i]);
            }
        }
    }

    public void PrintCar(Car car){
        System.out.println("Car id: " + car.id + ", mark: " + car.mark + ", model: " + car.model + ", manufacturing year: " + car.manufacturingYear + ", color: " + car.color + ", price: " + car.price + car.currency + ", registration plate number: " + car.regPlate);
    }
}
