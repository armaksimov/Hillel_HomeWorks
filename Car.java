public class Car {
    int weight;
    int price;
    int maxSpeed;
    int id;
    int fuelConsumption;
    public Car(int id, int price, int maxSpeed, int weight, int fuelConsumption) {
        this.id = id;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    protected String toString(String s) {
        return s;
    }
}
