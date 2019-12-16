public class Trailer extends Car{
    private int loadCapacity;
    public Trailer(int id, int price, int maxSpeed, int weight, int loadCapacity){
        super(id, price, maxSpeed, weight, 0);
        this.loadCapacity = loadCapacity;
        setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", maximum load: " + loadCapacity + "\n");
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    public int getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
