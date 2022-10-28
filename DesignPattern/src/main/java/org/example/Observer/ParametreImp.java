package org.example.Observer;

public class ParametreImp implements Observable{
    public Observer obs ;

    public ParametreImp(Observer obs) {
        this.obs = obs;

    }

    public ParametreImp() {
    }

    public Observer getObs() {
        return obs;
    }

    public void setObs(Observer obs) {
        this.obs = obs;
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
