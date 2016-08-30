package com.wk.pattern.observer;

public class XBabySubject extends BabySubject {

    private boolean needMother = false;

    public boolean isNeedMother() {
        return needMother;
    }

    @Override
    public void cry() {
        needMother = true;
        System.out.println("xBaby crying need to mother");
        nodifyObservers(needMother);
    }

    public static void main(String[] args) {
        BabySubject baby = new XBabySubject();
        MotherObserver mother = new XMotherObserver();
        baby.addObserver(mother);
        baby.cry();
    }
}
