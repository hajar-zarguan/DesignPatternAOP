package org.example.Composite;

import org.example.Observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class groupe extends Figure{
    List<Figure> list ;

    public  void addFigure(Figure f ){}
    public  void removeFigure(Figure f ){}
    public List<Figure> getChild(Figure f ){
        List list= new ArrayList<Figure>();
        return list;
    }

    @Override
    public double CalculePerimetre() {
        return 0;
    }

    @Override
    public double CalculeSurface() {
        return 0;
    }

    @Override
    public void AfficherFigure() {

    }




    @Override
    public void update(Observable obs) {

    }
}
