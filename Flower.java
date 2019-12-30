public class Flower extends Bouquet{
    private String name;
    private int price;
    private int stemLength;
    private int daysToLive;
    private String colour;
    public void Flower(String name, int price, int stemLength, int daysToLive, String colour){
//        super(name, price, stemLength, daysToLive, colour);
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.daysToLive = daysToLive;
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }
    public int getStemLength() {
        return stemLength;
    }
    public void setDaysToLive(int daysToLive) {
        this.daysToLive = daysToLive;
    }
    public int getDaysToLive() {
        return daysToLive;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", price: " + price + ", stem length: " + stemLength + ", days to live: " + daysToLive + ", colour: " + colour;
    }
}
