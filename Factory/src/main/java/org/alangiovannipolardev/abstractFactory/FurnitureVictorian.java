package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Chair;
import org.alangiovannipolardev.abstractFactory.interfaces.CoffeeTable;
import org.alangiovannipolardev.abstractFactory.interfaces.Furniture;
import org.alangiovannipolardev.abstractFactory.interfaces.Sofa;

public class FurnitureVictorian implements Furniture {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
