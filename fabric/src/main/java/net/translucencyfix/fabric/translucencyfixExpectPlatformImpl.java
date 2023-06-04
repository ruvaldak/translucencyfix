package net.translucencyfix.fabric;

import net.translucencyfix.translucencyfixExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class translucencyfixExpectPlatformImpl {
    /**
     * This is our actual method to {@link translucencyfixExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
