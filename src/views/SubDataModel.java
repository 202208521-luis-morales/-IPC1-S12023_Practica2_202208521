package views;

public class SubDataModel {
    private int time;
    private double cost;

    public SubDataModel(int time, double cost) {
        this.time = time;
        this.cost = cost;
    }
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
}
