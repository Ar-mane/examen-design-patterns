package com.example.design_patterns.Composite;

import com.example.design_patterns.Aspect.Log;
import com.example.design_patterns.Observer.Observable;
import com.example.design_patterns.Observer.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Rectangle extends Figure implements Serializable {

    public double L;
    public double H;

    public Rectangle(double l,double h,Point p) {
        super(p);
        this.L=l;
        this.H=h;
    }
    public Rectangle() {
        super(new Point(0,0));

    }

    @Override
    @Log
    public double surface() {
        return L*H;
    }

    @Override
    @Log
    public double perimetre() {
        return 2*(L+H);
    }

    @Override
    @Log
    public void desiner() {
        System.out.println("L : "+L+"H :"+H+"piremiter :"+ perimetre()+"surface :"+surface());
    }

    @Override
    public void update(Observable o) {
        int cc=((Parametrage) o).getConteurColor();
        int cs=((Parametrage) o).getColor();
        int ec=((Parametrage) o).getEpaisseur();
        System.out.println("color conteur :"+cc+" colore surface :"+cs+"Epaisseur Color"+ec);
    }
}
