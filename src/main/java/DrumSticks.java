public class DrumSticks implements ISell{

    public String name;
    public int buyingPrice;
    public int sellingPrice;

    public DrumSticks(String name, int buyingPrice, int sellingPrice){
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    public int calculateMarkUp(){
        return this.sellingPrice - this.buyingPrice;
    }

}
