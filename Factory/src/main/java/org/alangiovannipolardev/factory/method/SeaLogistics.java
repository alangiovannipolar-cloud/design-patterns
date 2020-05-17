package org.alangiovannipolardev.factory.method;

public class SeaLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Ship();
    }
}
