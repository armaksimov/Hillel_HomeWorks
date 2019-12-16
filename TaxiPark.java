import java.util.ArrayList;

public class TaxiPark {
    private Car carsList[];
    String city;
    int stuffQuantity;
    int price;
    public TaxiPark(String city, int stuffQuantity, int price, Car[] carsList){
        this.city = city;
        this.stuffQuantity = stuffQuantity;
        this.price = price;
        setCarsList(carsList);
    }

    public Car[] getCarsList() {
        return carsList;
    }

    public void setCarsList(Car[] carsList) {
        this.carsList = carsList;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
