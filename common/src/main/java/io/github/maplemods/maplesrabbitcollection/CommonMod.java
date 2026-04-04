package io.github.maplemods.maplesrabbitcollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesrabbitcollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "autumn", "flannel_rabbit", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "autumn", "pumpkin_rabbit", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "spring", "cherry_blossom_rabbit", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "spring", "flower_rabbit", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "summer", "midsommar_rabbit", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "summer", "watermelon_rabbit", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "winter", "frozen_rabbit", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "winter", "snow_covered_rabbit", 1);
    }
}
