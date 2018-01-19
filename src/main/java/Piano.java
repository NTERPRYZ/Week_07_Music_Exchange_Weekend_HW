public class Piano extends Instrument{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    private String materialOfKeys;



    public Piano(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, String materialOfKeys){
        super(instrumentType, instrumentMaterial, instrumentColour);
        this.materialOfKeys = materialOfKeys;
    }

    public String getMaterialOfKeys() {
        return this.materialOfKeys;
    }
}
