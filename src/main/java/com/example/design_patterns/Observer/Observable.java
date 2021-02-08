package com.example.design_patterns.Observer;

import com.example.design_patterns.Composite.Figure;

public interface Observable {

    void notif();

    void remove(Figure f);

    void add(Figure f);

}
