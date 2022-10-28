package org.example.Observer;

public interface Observable {

    public  void addObserver(Observer ob);
    public  void removeObserver(Observer ob);
    public  void notifyObservers();
}
