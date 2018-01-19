public class Guitar extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    public int buyingPrice;
    public int sellingPrice;
    private int numberOfStrings;



    public Guitar(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int buyingPrice, int sellingPrice, int numberOfStrings){
        super(instrumentType, instrumentMaterial, instrumentColour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
