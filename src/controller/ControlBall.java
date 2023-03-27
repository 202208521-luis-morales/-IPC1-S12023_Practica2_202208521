package controller;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import views.DataModel;
import views.MenuView;
import views.SimulationView;

public class ControlBall {
    // En este caso no vamos a verificar si los datos no están vacíos ya que ya lo verificamos en la vista "MenuView"
    public static DataModel[] simulationData = MenuView.simulationData;
    private Double x = 738.0;
    private Double y = 425.0;
    private Color clr = Color.darkGray;
    // Variable para ver si hay que cambiar los labels en la vista SimulationView
    private int typeLabel = -1;
    
    public void moveBall(int partOfCicle) {
         /* Posiciones del círculo: 
            1) 738, 425(inicial)
            2) 500, 425
            3) 500, 230
            4) 260, 230
            5) 260, 425
            6) 37, 425
        */
        /*
            partOfCircle= el valor de i en el ciclo que se está usando esta función; el progreso del recorrido completo
            Para calcular el valor en los if's, la fórmula sería valor(i=0)=PosiciónXInicial-PosiciónXFinal=738-500=238, 
            Desplazamiento=en este caso, cuanto va a caminar la i
            Si coordenada(i-1)!=coordenada(i) donde coordenada es x o y, entonces 
                coordenadaQueCambia=coordenada (que puede tomar los valores de y o x)
                Desplazamiento=|coordenadaQueCambia(i)-coordenadaQueCambia(i-1)|
            valor(i)=valor(i-1)+Desplazamiento(i)
            ejemplo de if = if(partOfCicle >= valor(i-1) && partOfCicle < valor(i))
            Lo que está adentro de los if's es el comportamiento de las coordenadas en esa fase del movimiento
        
        */
        
        // Método: como se debe de mover el círculo
        // 1->2
        if(partOfCicle < 238) {
            x--;
        }
        
        // 2->3
        if(partOfCicle >= 238 && partOfCicle < 433) {
            y--;
        }
        
        // 3->4
        if(partOfCicle >= 433 && partOfCicle < 673) {
            x--;
        }
        
        // 4->5
        if(partOfCicle >= 673 && partOfCicle < 868) {
            y++;
        }
        
        // 5->6
        if(partOfCicle >= 868 && partOfCicle < 1091) {
            x--;
        }
        
        // Método: verificar qué color usar en el círculo dado i=partOfCircle
        /* En que i=partOfCircle debe de cambiar de color
        1) 130
        2) 312
        3) 364
        4) 533
        5) 570
        6) 740
        7) 790
        8) 976
    */
        // Lo que está en los case es lo que está previamente calculado en un recorrido sin parar
        switch (partOfCicle) {
            case 130 -> {
                clr = Color.blue;
                typeLabel = 1;
            }
            
            case 312 -> {
                clr = Color.darkGray;
                typeLabel = 2;
            }
            
            case 364 -> {
                clr = new Color(0,119,35);
                typeLabel = 3;
            }
            
            case 533 -> {
                clr = Color.darkGray;
                typeLabel = 4;
            }
            
            case 570 -> {
                clr = Color.magenta;
                typeLabel = 5;
            }
            
            case 740 -> {
                clr = Color.darkGray;
                typeLabel = 6;
            }
            
            case 790 -> {
                clr = Color.red;
                typeLabel = 7;
            }
            
            case 976 -> {
                clr = Color.darkGray;
                typeLabel = 8;
            }
        }
    }
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, 35, 35);
    }

    public Double getX() {
        return x;
    }
    
    public Double getY() {
        return y;
    }

    public Color getClr() {
        return clr;
    }

    public int getTypeLabel() {
        return typeLabel;
    }
    
    
}
