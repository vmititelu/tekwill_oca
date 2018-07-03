package practice_13_1;

public class Shirt extends Item {
    private char size;
    private char colorCode;

    Shirt(double price, char size, char colorCode){
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
}
