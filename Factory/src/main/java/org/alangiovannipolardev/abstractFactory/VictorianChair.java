package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println(VictorianChair.class + " hasLegs");
    }

    @Override
    public void sitOn() {
        System.out.println(VictorianChair.class + " sitOn");
    }

    @Override
    public void printModel() {
        System.out.println(VictorianChair.class + " chair: Model Victorian ");
    }
}
