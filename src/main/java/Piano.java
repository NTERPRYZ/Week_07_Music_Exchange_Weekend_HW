public class Piano extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    public int buyingPrice;
    public int sellingPrice;
    private String materialOfKeys;



    public Piano(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int buyingPrice, int sellingPrice, String materialOfKeys){
        super(instrumentType, instrumentMaterial, instrumentColour, buyingPrice, sellingPrice);
        this.materialOfKeys = materialOfKeys;
    }

    public String getMaterialOfKeys() {
        return this.materialOfKeys;
    }
}
