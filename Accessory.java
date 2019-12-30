public class Accessory extends Bouquet{
    private String accessoryName;
    private int price;
    private String colour;
    public void Accessory(String accessoryName, int price, String colour){
        //super(accessoryName, price, colour);
        this.accessoryName = accessoryName;
        this.price = price;
        this.colour = colour;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Name: " + accessoryName + ", price: " + price + ", colour: " + colour;
    }
}
