package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void printModel() {
        System.out.println(VictorianSofa.class + " sofa: Model Victorian ");
    }
}
