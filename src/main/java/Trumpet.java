public class Trumpet extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    public int buyingPrice;
    public int sellingPrice;
    private int numberOfValues;



    public Trumpet(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int buyingPrice, int sellingPrice, int numberOfValues){
        super(instrumentType, instrumentMaterial, instrumentColour, buyingPrice, sellingPrice);
        this.numberOfValues = numberOfValues;
    }

    public int getNumberOfValues() {
        return this.numberOfValues;
    }


}
