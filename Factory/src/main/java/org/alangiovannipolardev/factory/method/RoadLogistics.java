package org.alangiovannipolardev.factory.method;

public class RoadLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Truck();
    }
}
