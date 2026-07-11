package net.itskittyyoutube.kitty.mixin;

import net.minecraft.client.renderer.blockentity.AbstractSignRenderer;
import org.spongepowered.asm.mixin.Mixin;

/**
 * Custom wood sign models previously patched {@code SignBlockEntityRenderer}'s constructor maps.
 * Signs now route through {@link AbstractSignRenderer}; texture overrides remain via {@code Sheets} mixins.
 */
@Mixin(AbstractSignRenderer.class)
public class SignBlockEntityRendererMixin {
}
