package org.alangiovannipolardev.simple.factory;

/**
 * Factory Pattern
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        KnifeStore knifeStore = new KnifeStore(new KnifeFactory());
        Knife knifeBread = knifeStore.orderKnife("bread");
        Knife knifeMeat = knifeStore.orderKnife("meat");
    }

}
