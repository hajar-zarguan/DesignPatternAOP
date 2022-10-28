package org.example.Strategy;

import org.example.Composite.Figure;

import java.util.List;

public class Dessin {
    List<Figure> figureList ;

    int id ;
    String nomDessin ;

    public Dessin(List<Figure> figureList, int id, String nomDessin) {
        this.figureList = figureList;
        this.id = id;
        this.nomDessin = nomDessin;
    }

    public List<Figure> getFigureList() {
        return figureList;
    }

    public void setFigureList(List<Figure> figureList) {
        this.figureList = figureList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDessin() {
        return nomDessin;
    }

    public void setNomDessin(String nomDessin) {
        this.nomDessin = nomDessin;
    }

    public Dessin() {

    }

    public  void Traiter(StrategieTraitement strategieTraitement){}
    public  void AjouterFigure(Figure f){}
    public  void AfficherDessin(Figure f){}
    public  void SupprimerFigure(Figure f){}


}
