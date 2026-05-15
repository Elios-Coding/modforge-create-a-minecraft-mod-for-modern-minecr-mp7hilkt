package com.modforge.createaminecraftmodformodernminecr;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAMinecraftModForModernMinecrMod implements ModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("create-a-minecraft-mod-for-modern-minecr-mp7hilkt");

    @Override
    public void onInitialize() {
        try {
            LOGGER.info("CreateAMinecraftModForModernMinecrMod loaded");
        } catch (Throwable t) {
            LOGGER.error("Failed during initialization", t);
        }
    }
}
