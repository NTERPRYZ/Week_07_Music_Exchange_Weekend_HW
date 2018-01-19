public abstract class Instrument implements IPlayable {

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;


    public Instrument(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour) {
        this.instrumentType = instrumentType;
        this.instrumentMaterial = instrumentMaterial;
        this.instrumentColour = instrumentColour;
    }

    public InstrumentType getInstrumentType(){
        return this.instrumentType;
    }

    public InstrumentMaterial getInstrumentMaterial(){
        return this.instrumentMaterial;
    }

    public InstrumentColour getInstrumentColour(){
        return this.instrumentColour;
    }

    public String play(String data){
        return "I'm a " + instrumentType + " type instrument and I can Be played";
    }
}


