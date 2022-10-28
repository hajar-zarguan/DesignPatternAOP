package org.example;

import org.example.Composite.*;
import org.example.Strategy.Dessin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        Figure cercle = new Cercle(p, 8.9);
        Point p2 = new Point(2,2);
        Figure rect = new Rectangle(p2, 7,8);
        Figure re = new Rectangle(p2, 5,8);
        groupe g = new groupe();
        g.setList(new ArrayList<Figure>());
        g.addFigure(re);
        g.addFigure(cercle);
        Dessin d  = new Dessin();
        d.setFigureList(new ArrayList<Figure>());
        d.AjouterFigure(cercle);
        d.AjouterFigure(g);
        d.AjouterFigure(rect);
        d.AfficherDessin();


    }
}