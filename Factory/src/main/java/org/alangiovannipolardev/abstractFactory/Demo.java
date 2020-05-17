package org.alangiovannipolardev.abstractFactory;

import org.alangiovannipolardev.abstractFactory.interfaces.Chair;
import org.alangiovannipolardev.abstractFactory.interfaces.CoffeeTable;
import org.alangiovannipolardev.abstractFactory.interfaces.Furniture;
import org.alangiovannipolardev.abstractFactory.interfaces.Sofa;

public class Demo {
    public static Furniture furniture = null;
    public static Chair chair = null;
    public static Sofa sofa = null;
    public static CoffeeTable coffeeTable = null;

    public static void main( String[] args )
    {
        String[] models = {"modern","victorian"};

        for(String model: models) {
            configure(model);
            buildFurniture();
            printModels();
        }

    }

    public static void configure(String type) {
        if( type.equalsIgnoreCase("modern") ) {
            furniture = new FurnitureModern();
        } else  if( type.equalsIgnoreCase("victorian") ){
            furniture = new FurnitureVictorian();
        }
    }

    public static void buildFurniture() {
        chair = furniture.createChair();
        sofa = furniture.createSofa();
        coffeeTable = furniture.createCoffeeTable();
    }

    public static void printModels() {
        chair.printModel();
        sofa.printModel();
        coffeeTable.printModel();
    }
}
