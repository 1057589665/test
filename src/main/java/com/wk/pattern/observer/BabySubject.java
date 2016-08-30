package com.wk.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class BabySubject {
    private List<MotherObserver> observers = new ArrayList<MotherObserver>();

    public void addObserver(MotherObserver observer) {
        observers.add(observer);
    }

    public void delObserver(MotherObserver observer) {
        observers.remove(observer);
    }

    public void nodifyObservers(boolean needMother) {
        for (MotherObserver motherObserver : observers) {
            motherObserver.update(needMother);
        }
    }

    abstract void cry();
}
