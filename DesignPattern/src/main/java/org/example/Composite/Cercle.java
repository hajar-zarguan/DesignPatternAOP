package org.example.Composite;

import org.example.Observer.Observable;

public class Cercle  extends Figure{
    Point centre ;
    double rayon;
    public Cercle() {
    }
    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    public Point getCentre() {
        return centre;
    }
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public double CalculePerimetre() {
        return 2 *Math.PI * rayon ;
    }
    @Override
    public double CalculeSurface() {
        return Math.PI * rayon *rayon;
    }

    @Override
    public void AfficherFigure() {
        System.out.println( "\tCercle : rayon ="+rayon+ "centre :("+centre.getX()+";"+centre.getY() +")");
        System.out.println( "\t\tSurface :"+ CalculeSurface());
        System.out.println( "\t\tPerimetre :"+ CalculePerimetre());
    }


    @Override
    public void update(Observable obs) {

    }
}
