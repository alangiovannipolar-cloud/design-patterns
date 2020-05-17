package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println(ModernChair.class + " hasLegs");
    }

    @Override
    public void sitOn() {
        System.out.println(ModernChair.class + " sitOn");
    }

    @Override
    public void printModel() {
        System.out.println(ModernChair.class + " chair: Model Modern ");
    }

}
