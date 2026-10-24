package io.github.maplemods.maplesrabbitsseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesrabbitsseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "autumn", "flannel_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "autumn", "flannel_rabbit", "*", "flannel_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "autumn", "flannel_rabbit", "*baby", "flannel_rabbit");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "autumn", "pumpkin_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "autumn", "pumpkin_rabbit", "*", "pumpkin_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "autumn", "pumpkin_rabbit", "*baby", "pumpkin_rabbit");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "spring", "cherry_blossom_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "spring", "cherry_blossom_rabbit", "*", "cherry_blossom_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "spring", "cherry_blossom_rabbit", "*baby", "cherry_blossom_rabbit");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "spring", "flower_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "spring", "flower_rabbit", "*", "flower_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "spring", "flower_rabbit", "*baby", "flower_rabbit");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "summer", "midsommar_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "summer", "midsommar_rabbit", "*", "midsommar_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "summer", "midsommar_rabbit", "*baby", "midsommar_rabbit");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "summer", "watermelon_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "summer", "watermelon_rabbit", "*", "watermelon_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "summer", "watermelon_rabbit", "*baby", "watermelon_rabbit");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "winter", "frozen_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "winter", "frozen_rabbit", "*", "frozen_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "winter", "frozen_rabbit", "*baby", "frozen_rabbit");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RABBIT, "winter", "snow_covered_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "winter", "snow_covered_rabbit", "*", "snow_covered_rabbit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RABBIT, "winter", "snow_covered_rabbit", "*baby", "snow_covered_rabbit");
    }
}
