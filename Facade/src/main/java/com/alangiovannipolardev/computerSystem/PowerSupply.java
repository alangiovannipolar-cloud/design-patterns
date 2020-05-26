package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerSupply {

    private static final Logger LOGGER = LoggerFactory.getLogger(PowerSupply.class);

    public void on() {
        LOGGER.info("Supplies Power");
    }

    public void off() {
        LOGGER.info("Power off");
    }

}
