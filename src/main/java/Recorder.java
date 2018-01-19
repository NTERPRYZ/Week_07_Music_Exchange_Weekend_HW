public class Recorder extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    private int numberOfHoles;



    public Recorder(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int numberOfHoles){
        super(instrumentType, instrumentMaterial, instrumentColour);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return this.numberOfHoles;
    }
}
