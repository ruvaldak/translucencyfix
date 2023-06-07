package net.translucencyfix.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.translucencyfix.translucencyfix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(translucencyfix.MOD_ID)
public class translucencyfixForge {
    public translucencyfixForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(translucencyfix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        translucencyfix.init();
    }
}
