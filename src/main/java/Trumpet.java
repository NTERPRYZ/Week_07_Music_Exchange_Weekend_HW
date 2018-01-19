public class Trumpet extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    private int numberOfValues;



    public Trumpet(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int numberOfValues){
        super(instrumentType, instrumentMaterial, instrumentColour);
        this.numberOfValues = numberOfValues;
    }

    public int getNumberOfValues() {
        return this.numberOfValues;
    }


}
