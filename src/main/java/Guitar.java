public class Guitar extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    private int numberOfStrings;



    public Guitar(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int numberOfStrings){
        super(instrumentType, instrumentMaterial, instrumentColour);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(String data){
        return "I'm a " + instrumentType + " type instrument and I can Be played";
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
