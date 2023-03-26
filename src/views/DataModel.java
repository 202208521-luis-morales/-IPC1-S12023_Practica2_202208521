package views;

public class DataModel {
    private SubDataModel inventary;
    private SubDataModel production;
    private SubDataModel packaging;
    private SubDataModel departure;

    public DataModel(SubDataModel inventary, SubDataModel production, SubDataModel packaging, SubDataModel departure) {
        this.inventary = inventary;
        this.production = production;
        this.packaging = packaging;
        this.departure = departure;
    }

    public SubDataModel getInventary() {
        return inventary;
    }

    public void setInventary(SubDataModel inventary) {
        this.inventary = inventary;
    }

    public SubDataModel getProduction() {
        return production;
    }

    public void setProduction(SubDataModel production) {
        this.production = production;
    }

    public SubDataModel getPackaging() {
        return packaging;
    }

    public void setPackaging(SubDataModel packaging) {
        this.packaging = packaging;
    }

    public SubDataModel getDeparture() {
        return departure;
    }

    public void setDeparture(SubDataModel departure) {
        this.departure = departure;
    }
    
    
}
