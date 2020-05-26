package com.alangiovannipolardev.computerSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootLoader.class);

    public void startOperativeSystem() {
        LOGGER.info("Init Operative System ..... ");
    }

    public void shutdown() {
        LOGGER.info("Shutdown Operative System ..... ");
    }
}
