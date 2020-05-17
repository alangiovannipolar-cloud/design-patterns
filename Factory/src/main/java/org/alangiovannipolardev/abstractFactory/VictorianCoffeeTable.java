package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void printModel() {
        System.out.println(VictorianCoffeeTable.class + " coffee table: Model Victorian ");
    }
}
