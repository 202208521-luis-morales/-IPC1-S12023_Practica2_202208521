package controller;

import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.SimulationView;

public class ControlBall {
    private Double x = 738.0;
    private Double y = 425.0;
    
    public void moveBall() {
        x=x-1;
    }
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, 35, 35);
    }
}
