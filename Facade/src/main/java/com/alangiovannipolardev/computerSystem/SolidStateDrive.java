package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolidStateDrive implements BootDevice {
    private static final Logger LOGGER = LoggerFactory.getLogger(SolidStateDrive.class);

    @Override
    public void init() {
        LOGGER.info("Init Solid Drive ..... ");
    }

    @Override
    public void stop() {
        LOGGER.info("Stop Solid Drive ..... ");
    }
}
