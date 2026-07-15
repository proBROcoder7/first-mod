package com.kneebuster;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KneeBuster implements ModInitializer {

    public static final String MOD_ID = "kneebuster";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Knee Buster loaded!");
    }
}