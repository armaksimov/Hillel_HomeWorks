import java.util.ArrayList;

public class Bouquet {
    private int flowersLength;
    private int accessoryLength;
    Flower[] flowers = new Flower[4];
    Accessory[] accessory = new Accessory[4];
    int price;

    public void Bouquet(Flower[] flowers, Accessory[] accessories){
        this.flowers = flowers;
        this.accessory = accessories;
    }

    public int countPrice(){
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getPrice();
        }
        for (int i = 0; i < accessoryLength; i++) {
            price += accessory[i].getPrice();
        }
        return price;
    }

    public void setAccessoryLength(int accessoryLength) {
        this.accessoryLength = accessoryLength;
    }

    public void setFlowersLength(int flowersLength) {
        this.flowersLength = flowersLength;
    }

    @Override
    public String toString() {
        return "Flowers: " + flowers + "; Accessories: "+ accessory;
    }
}
