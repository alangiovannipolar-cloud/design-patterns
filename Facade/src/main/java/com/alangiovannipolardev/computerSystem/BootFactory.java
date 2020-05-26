package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootFactory.class);

    public BootDevice createBootDevice(String type) {
        BootDevice bootDevice = null;
        switch (type) {
            case "solid":
                bootDevice = new SolidStateDrive();
                break;
            default:
                bootDevice = new UsbDrive();

        }

        return bootDevice;
    }

}
