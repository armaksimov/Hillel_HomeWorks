public class SportsCar extends Car{
    private String tiresBrand;
    private String supportColor;
    public SportsCar(int id, int price,  int maxSpeed, int weight, int fuelConsumption, String tiresBrand, String supportColor){
        super(id, price, maxSpeed, weight, fuelConsumption);
        this.tiresBrand = tiresBrand;
        this.supportColor = supportColor;
        setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString("Id: " + id + ", price: " + price + ", max speed: " + maxSpeed + ", weight: " + weight + ", fuel consumption: " + fuelConsumption + ", tires brand: " + tiresBrand + ", supports color: " + supportColor + "\n");
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
    public int getPrice(){
        return price;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setSupportColor(String supportColor) {
        this.supportColor = supportColor;
    }
    public String getSupportColor() {
        return this.supportColor;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setTiresBrand(String tiresBrand) {
        this.tiresBrand = tiresBrand;
    }
    public String getTiresBrand() {
        return tiresBrand;
    }
}
