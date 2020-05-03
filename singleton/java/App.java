package org.singleton;

/**
 * App
 *
 */

public class App
{
    public static void main( String[] args )
    {
       Singleton ob = Singleton.getInstance();
       ob.print("Hello Singleton");
    }
}
