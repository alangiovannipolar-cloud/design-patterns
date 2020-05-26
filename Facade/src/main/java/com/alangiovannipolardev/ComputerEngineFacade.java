package com.alangiovannipolardev;

import com.alangiovannipolardev.computerSystem.*;

public class ComputerEngineFacade {

    private BootFactory bootFactory = new BootFactory();
    private MotherBoard motherBoard = new MotherBoard();
    private PowerSupply powerSupply = new PowerSupply();
    private BootDevice bootDevice = null;
    private BootLoader bootLoader = new BootLoader();

    public void startEngine() {
        powerSupply.on();
        motherBoard.startUEFI();
        bootDevice = bootFactory.createBootDevice("solid");
        bootDevice.init();
        bootLoader.startOperativeSystem();
    }

    public void stopEngine() {
        bootLoader.shutdown();
        bootDevice.stop();
        motherBoard.stopUEFI();
        powerSupply.off();
    }
}
