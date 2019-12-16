public class Bus extends Car{
    private int passengerCapacity;
    public Bus(int id, int price, int maxSpeed, int weight, int fuelConsumption, int passengerCapacity){
        super(id, price, maxSpeed, weight, fuelConsumption);
        this.passengerCapacity = passengerCapacity;

//        setPrice(price);
//        setFuelConsumption(fuelConsumption);
//        setMaxSpeed(maxSpeed);
//        setPassengerCapacity(passengerCapacity);
//        setWeight(weight);
    }

    @Override
    public String toString() {
        return super.toString("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", passenger capacity: " + passengerCapacity + "\n");
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
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
