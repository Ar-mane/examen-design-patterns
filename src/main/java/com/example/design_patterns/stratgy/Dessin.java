package com.example.design_patterns.stratgy;


import com.example.design_patterns.Composite.Figure;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dessin {
    ArrayList<Figure> figures;
    ITraiter t;

    public Dessin() {
        figures = new ArrayList<>();
    }

    public void traier() {
        t.traiter();
    }


    public void add(Figure f) {
        figures.add(f);
    }

    public void remove(Figure f) {
        figures.remove(f);
    }

    public void afficherDessin() {
        for (Figure f : figures) {
            f.desiner();
        }
    }

    public void serialiser() throws Exception {

        ObjectOutputStream obs = new ObjectOutputStream(
                new FileOutputStream("serializedFile")
        );
        for (Figure f : figures) {
            obs.writeObject(f);
            obs.flush();
        }
        obs.close();
    }


}
