package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void printModel() {
        System.out.println(ModernCoffeeTable.class + " coffee table: Model Modern ");
    }
}
