package org.example.Composite;

import org.example.Observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class groupe extends Figure{
    List<Figure> list ;
    public  void addFigure(Figure f ){
         list.add(f);
    }
    public  void removeFigure(Figure f ){
        list.remove(f);
    }
    public List<Figure> getChild(Figure f ){
        List list= new ArrayList<Figure>();
        return list;
    }
    @Override
    public double CalculePerimetre() {
        double somme =0;
        for ( Figure  f : list ) {
            somme = f.CalculePerimetre();
        }
        return  somme;
    }
    @Override
    public double CalculeSurface() {
        double somme =0;
        for ( Figure  f : list ) {
            somme = f.CalculeSurface();
        }
        return  somme;
    }
    @Override
    public void AfficherFigure() {
        System.out.println( "-------Groupe----------");
        for ( Figure  f : list ) {
            f.AfficherFigure();
        } System.out.println( "---------------------");
    }

    public groupe() {
    }

    public List<Figure> getList() {
        return list;
    }

    public void setList(List<Figure> list) {
        this.list = list;
    }

    public groupe(List<Figure> list) {
        this.list = list;
    }

    @Override
    public void update(Observable obs) {

    }
}
