public class Tshirt implements ISell{

    public String gender;
    public String size;
    public String make;
    public int buyingPrice;
    public int sellingPrice;

    public Tshirt(String gender, String size, String make, int buyingPrice, int sellingPrice) {
        this.gender = gender;
        this.size = size;
        this.make = make;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }

    public int calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }
}
