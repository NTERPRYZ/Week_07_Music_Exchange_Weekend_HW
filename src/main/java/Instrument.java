public abstract class Instrument implements IPlayable, ISell{

    protected InstrumentType instrumentType;
    protected InstrumentMaterial instrumentMaterial;
    protected InstrumentColour instrumentColour;
    public int buyingPrice;
    public int sellingPrice;



    public Instrument(InstrumentType instrumentType, InstrumentMaterial instrumentMaterial, InstrumentColour instrumentColour, int buyingPrice, int sellingPrice) {
        this.instrumentType = instrumentType;
        this.instrumentMaterial = instrumentMaterial;
        this.instrumentColour = instrumentColour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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

    public int getBuyingPrice(){
        return this.buyingPrice;
    }

    public int getSellingPrice(){
        return this.sellingPrice;
    }

    public String play(){
        return "I'm a " + instrumentType + " type instrument and I can Be played";
    }

    public int calculateMarkUp(){
        return this.sellingPrice - this.buyingPrice;
    }
}


