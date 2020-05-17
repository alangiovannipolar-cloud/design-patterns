package org.alangiovannipolardev.simple.factory;

public class KnifeBread  implements Knife {


    @Override
    public void sharpen() {
        System.out.println(KnifeBread.class + "  sharpen");
    }

    @Override
    public void polish() {
        System.out.println(KnifeBread.class + "  polish");
    }

    @Override
    public void pack() {
        System.out.println(KnifeBread.class + "  pack");
    }
}
