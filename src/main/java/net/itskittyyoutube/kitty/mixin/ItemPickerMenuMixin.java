package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.group.TBSGroup;
import net.itskittyyoutube.kitty.group.TBSGroupVisibilityToggle;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.Collections;

@Mixin(CreativeModeInventoryScreen.ItemPickerMenu.class)
public abstract class ItemPickerMenuMixin {

    @Shadow @Final public NonNullList<@NotNull ItemStack> items;

    @Shadow public abstract void scrollTo(float scrollOffs);

    @Inject(method = "getCarried", at = @At("HEAD"))
    private void toggleGroupVisibility(CallbackInfoReturnable<ItemStack> cir) {
        TBSGroupVisibilityToggle toggle = TBS.itemsChanged;
        if (toggle.isListChanged()) {
            TBSGroup tbsGroup = toggle.getGroup();
            tbsGroup.setVisibility(!tbsGroup.isVisibility());

            if (tbsGroup.isVisibility()) {
                ArrayList<ItemStack> itemsColl = tbsGroup.getItems();
                Collections.reverse(itemsColl);
                itemsColl.forEach(itemStack -> items.add(toggle.getItemIndex() + 1, itemStack));
            }
            else tbsGroup.getItems().forEach(ignore -> items.remove(toggle.getItemIndex() + 1));

            toggle.off();
            scrollTo(toggle.getScrollOffs());
            TBS.tempItemStacks = new ArrayList<>(items);
            TBS.setIndexes();
        }
    }
}
