public class Runner {
    public static void main(String[] args) {
        Car cars[] = { new Car(1, "Ford", "F150", 2017, "Red", 7500, "$", "XX XXXX XX"),
                new Car(2, "Jeep", "Cheerokee", 2019, "Black", 12000, "$", "XX XXXX XX"),
                new Car(3, "Bentley", "Continental", 2013, "Blue", 10000, "$", "XX XXXX XX"),
                new Car(4, "Cadillac", "Escalade", 2016, "Black", 20000, "EUR", "XX XXXX XX"),
                new Car(5, "RAM", "2500", 2010, "Black", 6500.5, "$", "XX XXXX XX")};

        CarProcessor processor = new CarProcessor();
        processor.PrintingByMark(cars);
        processor.PrintingByAge(cars);
        processor.PrintingByManufacturingYear(cars);
    }
}