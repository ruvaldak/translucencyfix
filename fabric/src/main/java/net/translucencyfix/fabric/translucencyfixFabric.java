package net.translucencyfix.fabric;

import net.translucencyfix.fabriclike.translucencyfixFabricLike;
import net.fabricmc.api.ModInitializer;

public class translucencyfixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        translucencyfixFabricLike.init();
    }
}
