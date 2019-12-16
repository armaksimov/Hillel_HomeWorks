public class Truck extends Car{
    private int maxLoad;
    private String color;
    public Truck(int id, int price, int maxSpeed, int weight, int fuelConsumption, int maxLoad, String color){
        super(id, price, maxSpeed, weight, fuelConsumption);
        this.maxLoad = maxLoad;
        this.color = color;
        setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", maximum load: " + maxLoad + ", color: " + color + "\n");
    }

    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption(){
        return this.fuelConsumption;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxLoad(int passengerCapacity) {
        this.maxLoad = passengerCapacity;
    }
    public int getMaxLoad() {
        return maxLoad;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
