package org.alangiovannipolardev.factory.method;

public class Truck implements Transport {
    @Override
    public void delivery() {
        System.out.println("Truck Delivery");
    }
}
