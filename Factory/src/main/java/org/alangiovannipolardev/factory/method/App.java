package org.alangiovannipolardev.factory.method;

import java.util.ArrayList;

/**
 * Factory Method Pattern
 *
 */
public class App
{

    public static ArrayList<Transport> transports = new ArrayList<>();
    public static RoadLogistics roadLogistics = new RoadLogistics();
    public static SeaLogistics seaLogistics = new SeaLogistics();

    public static void main( String[] args )
    {
        configureTransports(getOrders());
        deliveries();
    }

    public static String[] getOrders() {
        return new String[] {
                "road",
                "sea",
                "road",
                "sea",
        };
    }

    public static void configureTransports(String[] ordersFor) {
        for(String order: ordersFor) {
            if(order.equals("road")) {
                transports.add(roadLogistics.creatTransport());
            } else if(order.equals("sea")) {
                transports.add(seaLogistics.creatTransport());
            }
        }
    }

    public static void deliveries() {
        for(Transport trans: transports) {
            trans.delivery();
        }
    }

}
