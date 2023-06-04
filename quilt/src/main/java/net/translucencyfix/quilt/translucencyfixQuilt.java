package net.translucencyfix.quilt;

import net.translucencyfix.fabriclike.translucencyfixFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class translucencyfixQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        translucencyfixFabricLike.init();
    }
}
