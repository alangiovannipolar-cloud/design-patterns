package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void printModel() {
        System.out.println(ModernSofa.class + " sofa: Model Modern ");
    }
}
