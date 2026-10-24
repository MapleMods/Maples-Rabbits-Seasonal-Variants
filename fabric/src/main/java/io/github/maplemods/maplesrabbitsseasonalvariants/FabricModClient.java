package io.github.maplemods.maplesrabbitsseasonalvariants;

import net.fabricmc.api.ClientModInitializer;

public class FabricModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CommonMod.init();
	}
}
