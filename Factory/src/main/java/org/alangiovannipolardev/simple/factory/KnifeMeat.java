package org.alangiovannipolardev.simple.factory;

public class KnifeMeat  implements Knife {

    @Override
    public void sharpen() {
        System.out.println(KnifeMeat.class + "  sharpen");
    }

    @Override
    public void polish() {
        System.out.println(KnifeMeat.class + "  polish");
    }

    @Override
    public void pack() {
        System.out.println(KnifeMeat.class + "  pack");
    }
}
