package net.itskittyyoutube.kitty.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.effect.MobEffects; // Added for the potion check
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow protected abstract void setSharedFlag(int flag, boolean value);

    @Shadow public abstract boolean hasGlowingTag();

    @Inject(method = "tick", at = @At("TAIL"))
    private void updateGlow(CallbackInfo ci) {
        Entity entity = (Entity) (Object) this;

        if (entity instanceof AgeableMob ageableMob) {

            if (ageableMob.isBaby() && ageableMob.isAgeLocked()) {
                this.setSharedFlag(6, true);
            } else {
                // Check BOTH the NBT tag AND the Potion Effect!
                // This guarantees Spectral Arrows and regular vanilla mechanics are respected.
                boolean naturallyGlowing = this.hasGlowingTag() || ageableMob.hasEffect(MobEffects.GLOWING);

                this.setSharedFlag(6, naturallyGlowing);
            }
        }
    }
}
