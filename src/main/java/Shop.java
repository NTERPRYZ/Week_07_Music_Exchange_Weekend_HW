import java.util.ArrayList;

public class Shop implements ISell{

    public int buyingPrice;
    public int sellingPrice;
    public ArrayList<String> item;

    public int calculateMarkUp(){
       return this.sellingPrice - this.buyingPrice;
    }


//    public int calculateTotalMarkUp(){
//        return this.totalSellingPrice - this.totalBuyingPrice;
//    }
}
