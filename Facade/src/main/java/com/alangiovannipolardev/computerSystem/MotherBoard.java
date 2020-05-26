package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotherBoard {

    private static final Logger LOGGER = LoggerFactory.getLogger(MotherBoard.class);

    public void startUEFI() {
        LOGGER.info("Start Unified Extensible Firmware Interface");
        LOGGER.info("Testing hardware");
    }

    public void stopUEFI() {
        LOGGER.info("Stop Unified Extensible Firmware Interface");
    }


}
