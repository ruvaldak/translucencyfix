package net.translucencyfix.forge;

import net.translucencyfix.translucencyfixExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class translucencyfixExpectPlatformImpl {
    /**
     * This is our actual method to {@link translucencyfixExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
