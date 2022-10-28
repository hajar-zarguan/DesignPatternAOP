package org.example.Observer;

public class ParametreImp implements Observable{
    public Observer obs ;
    double epaisseurContour ;
    double couleurContour ;
    double couleurRemplissage ;

    public ParametreImp(Observer obs, double epaisseurContour, double couleurContour, double couleurRemplissage) {
        this.obs = obs;
        this.epaisseurContour = epaisseurContour;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public ParametreImp() {
    }

    public Observer getObs() {
        return obs;
    }

    public void setObs(Observer obs) {
        this.obs = obs;
    }

    public double getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    public double getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(double couleurContour) {
        this.couleurContour = couleurContour;
    }

    public double getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(double couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    @Override
    public void addObserver(Observer ob) {

    }

    @Override
    public void removeObserver(Observer ob) {

    }

    @Override
    public void notifyObservers() {


    }
}
