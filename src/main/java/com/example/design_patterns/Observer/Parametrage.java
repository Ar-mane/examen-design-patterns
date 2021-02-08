package com.example.design_patterns.Observer;

import com.example.design_patterns.Aspect.Log;
import com.example.design_patterns.Aspect.SecuredByAspect;
import com.example.design_patterns.Composite.Figure;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
public class Parametrage implements Observable {

    public int conteurColor;
    public int color;
    public int epaisseur;

    public List<Observer> figures;

    public Parametrage() {
        figures = new ArrayList<>();
    }

    @Override
    public void notif() {
        for (Observer o : figures)
            o.update(this);
    }

    @Log
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void remove(Figure f) {
        figures.remove(f);
    }

    @Log
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void add(Figure f) {
        figures.add(f);
    }
}
