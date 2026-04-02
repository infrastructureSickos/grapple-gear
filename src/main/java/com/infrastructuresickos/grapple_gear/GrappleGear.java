package com.infrastructuresickos.grapple_gear;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GrappleGear.MOD_ID)
public class GrappleGear {
    public static final String MOD_ID = "grapple_gear";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public GrappleGear() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("GrappleGear initialized");
    }
}
