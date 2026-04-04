package io.github.maplemods.maplesrabbitcollection;

import net.fabricmc.api.ClientModInitializer;

public class FabricModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CommonMod.init();
	}
}
