package net.translucencyfix.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawableHelper;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrawableHelper.class)
public class MixinDrawableHelper {
    @Inject(method = "drawTexturedQuad(Lorg/joml/Matrix4f;IIIIIFFFF)V", at = @At("HEAD"))
    private static void drawTexturedQuad(CallbackInfo ci) {
        RenderSystem.enableBlend();
        //RenderSystem.defaultBlendFunc();
    }
}
 