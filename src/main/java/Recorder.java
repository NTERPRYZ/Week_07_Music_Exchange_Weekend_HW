public class Recorder extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    public int buyingPrice;
    public int sellingPrice;
    private int numberOfHoles;



    public Recorder(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int buyingPrice, int sellingPrice, int numberOfHoles){
        super(instrumentType, instrumentMaterial, instrumentColour, buyingPrice, sellingPrice);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return this.numberOfHoles;
    }
}
