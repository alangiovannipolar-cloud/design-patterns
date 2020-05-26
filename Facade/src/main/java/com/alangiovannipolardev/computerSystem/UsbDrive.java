package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsbDrive implements BootDevice {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsbDrive.class);

    @Override
    public void init() {
        LOGGER.info("Init Usb ..... ");
    }

    @Override
    public void stop() {
        LOGGER.info("Stop Usb ..... ");
    }
}
