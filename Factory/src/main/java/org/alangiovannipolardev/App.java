package org.alangiovannipolardev;

/**
 * Hello world!
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
