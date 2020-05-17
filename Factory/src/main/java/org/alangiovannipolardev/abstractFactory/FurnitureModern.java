package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Chair;
import org.alangiovannipolardev.abstractFactory.interfaces.CoffeeTable;
import org.alangiovannipolardev.abstractFactory.interfaces.Furniture;
import org.alangiovannipolardev.abstractFactory.interfaces.Sofa;

public class FurnitureModern implements Furniture {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
