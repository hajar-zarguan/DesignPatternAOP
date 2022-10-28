package org.example.Composite;

import org.example.Observer.Observer;

public abstract class Figure implements Observer {

    public abstract double  CalculePerimetre();
    public abstract double  CalculeSurface();
    public abstract void  AfficherFigure();


}
