package com.alangiovannipolardev;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ComputerEngineFacade computerEngineFacade = new ComputerEngineFacade();

        computerEngineFacade.startEngine();
        computerEngineFacade.stopEngine();
    }
}
