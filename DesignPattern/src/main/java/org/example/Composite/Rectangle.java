package org.example.Composite;

import org.example.Observer.Observable;

public class Rectangle extends Figure{

    Point coinSuperieur  ;
    double L ;
    double H ;

    public Rectangle(Point coinSuperieur, double l, double h) {
        this.coinSuperieur = coinSuperieur;
        L = l;
        H = h;
    }

    public Rectangle() {
    }

    public Point getCoinSuperieur() {
        return coinSuperieur;
    }

    public void setCoinSuperieur(Point coinSuperieur) {
        this.coinSuperieur = coinSuperieur;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    @Override
    public double CalculePerimetre() {
        return 2*(L+H);
    }

    @Override
    public double CalculeSurface() {
        return L *H;
    }

    @Override
    public void AfficherFigure() {
        System.out.println( "\tRectangle : L ="+L+ "; H ="+H);
        System.out.println( "\t\tSurface :"+ CalculeSurface());
        System.out.println( "\t\tPerimetre :"+ CalculePerimetre());
    }

    @Override
    public void update(Observable obs) {

    }
}
