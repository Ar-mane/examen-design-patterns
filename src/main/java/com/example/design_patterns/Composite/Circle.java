package com.example.design_patterns.Composite;


import com.example.design_patterns.Aspect.Log;
import com.example.design_patterns.Aspect.SecuredByAspect;
import com.example.design_patterns.Observer.Observable;
import com.example.design_patterns.Observer.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Circle extends Figure implements Serializable {
    public double rayon;

    public Circle(double v, Point point) {
        super(point);
    }

    public Circle() {
        super(new Point(0, 0));
    }

    @Log
    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void desiner() {
        System.out.println("rayen :" + rayon + "Surface : " + surface() + "pirimetre :" + perimetre());
    }

    @Override
    @Log
    @SecuredByAspect(roles = {"ADMIN"})
    public void update(Observable o) {
        int cc = ((Parametrage) o).getConteurColor();
        int cs = ((Parametrage) o).getColor();
        int ec = ((Parametrage) o).getEpaisseur();
        System.out.println("color conteur :" + cc + " colore surface :" + cs + "Epaisseur Color" + ec);
    }
}
