package net.itskittyyoutube.kitty.mixin;

import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.phys.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public class OPENIFYOUDARE {

    @Inject(method = "onHitEntity", at = @At("HEAD"))
    private void makeCreativeVulnerable(EntityHitResult entityHitResult, CallbackInfo ci) {
        System.out.println("<KittyStudios> Arrow hit! I’m sure you’re very proud—now go see what the sun looks like.");
    }
}