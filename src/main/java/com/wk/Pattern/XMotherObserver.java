package com.wk.Pattern;

public class XMotherObserver implements MotherObserver {

    private boolean babyNeedMother = false;

    public void update(boolean needMother) {
        babyNeedMother = needMother;
        if (babyNeedMother) {
            System.out.println("Mother to take care of the baby");
        }
    }

}
