package com.example.design_patterns.Composite;


import com.example.design_patterns.Aspect.Log;
import com.example.design_patterns.Observer.Observer;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@NoArgsConstructor
public abstract class Figure implements Observer, Serializable {

    public Point point;

    public Figure(Point point) {
        this.point = point;
    }
    @Log
    public abstract double surface();
    @Log
    public abstract double perimetre();
    @Log
    public abstract void desiner();

}
