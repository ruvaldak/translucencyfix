package net.translucencyfix.fabric;

import net.translucencyfix.translucencyfixExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class translucencyfixExpectPlatformImpl {
    /**
     * This is our actual method to {@link translucencyfixExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
