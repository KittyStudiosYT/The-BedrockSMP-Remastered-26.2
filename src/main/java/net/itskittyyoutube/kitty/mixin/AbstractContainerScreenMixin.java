package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.group.TBSGroup;
import net.itskittyyoutube.kitty.config.TBSCompat;
import net.itskittyyoutube.kitty.config.TBSConfigs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//~ if >=1.21.6 'RenderType' -> 'RenderPipelines'

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin<T extends AbstractContainerMenu> {

    @Unique private int tick = 0;
    @Unique private int seconds = 0;

    @Shadow @Final protected T menu;
    @Shadow protected Slot hoveredSlot;

    @Unique private static boolean iig$onScreen(int index) {
        return index <= 44;
    }

    @Shadow protected abstract List<Component> getTooltipFromContainerItem(ItemStack itemStack);

    @Unique
    private int iig$calculateIndex(Slot slot) {
        var slots = menu.slots;
        if (slots.size() < 2) {
            return -1;
        }
        int result = TBS.tempItemStacks.indexOf(slots.get(1).getItem());
        if (!slots.get(0).getItem().equals(slots.get(1).getItem())) result--;
        return result + slot.index;
    }

    @Unique
    private Identifier iig$getSprite(String location) {
        String id = TBS.MOD_ID;
        String path = "container/" + location;
        /*? >=1.21*/ return Identifier.fromNamespaceAndPath(id, path);
        /*? <=1.20.6*/ //return new Identifier(id, "textures/gui/sprites/" + path + ".png");
    }

    @Unique
    private void iig$renderSprite(GuiGraphicsExtractor graphics, String location, int x, int y, int size) {
        //? >=1.21.6 {
        graphics.blitSprite(RenderPipelines.GUI_TEXTURED, iig$getSprite(location), x, y, size, size);
        //?} >=1.21.2 {
        /*graphics.blitSprite(RenderType::guiTextured, iig$getSprite(location), x, y, size, size);
        *///?} >=1.21 {
        /*RenderSystem.disableDepthTest();
        graphics.blitSprite(iig$getSprite(location), x, y, size, size);
        RenderSystem.enableDepthTest();
        *///?} else {
        /*RenderSystem.disableDepthTest();
        graphics.blit(iig$getSprite(location), x, y, 0, 0, size, size, size, size);
        RenderSystem.enableDepthTest();*///?}
    }

    //~ if >=26.1 'renderSlot' -> 'extractSlot'
    @Redirect(method = "extractSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/Slot;getItem()Lnet/minecraft/world/item/ItemStack;", ordinal = 0))
    private ItemStack renderItems(Slot slot) {
        int index = iig$calculateIndex(slot);
        TBSGroup tbsGroup = TBS.findGroupByIndex(index);

        return (TBSCompat.isClothConfigLoaded() && TBSConfigs.getConfig().showGroupItems
                && tbsGroup != null && tbsGroup.getIconIndex() == index && iig$onScreen(slot.index))
                ? tbsGroup.getItems().get(seconds % tbsGroup.getItems().size())
                : slot.getItem();
    }

    //~ if >=26.1 'renderSlot' -> 'extractSlot'
    @Inject(method = "extractSlot", at = @At("HEAD"))
    private void renderSlotSprites(GuiGraphicsExtractor graphics, Slot slot, /*? >=1.21.11 {*/ int mouseX, int mouseY, /*?}*/ CallbackInfo ci) {
        ArrayList<TBSGroup> groupsOnSelectedTab = TBS.groupsOnSelectedTab(TBS.selectedTab);
        int index = iig$calculateIndex(slot);
        for (TBSGroup tbsGroup : groupsOnSelectedTab) {
            if (iig$onScreen(slot.index) && tbsGroup.isVisibility()) {
                if (tbsGroup.getIconIndex() == index)
                    iig$renderSprite(graphics, "icon_slot", slot.x-1, slot.y-1, 18);

                for (ItemStack itemStack : tbsGroup.getItems())
                    for (HashMap<ItemStack, Integer> itemStacksMap : tbsGroup.getItemsWithIndexes())
                        if (itemStacksMap.containsKey(itemStack) && itemStacksMap.containsValue(index))
                            iig$renderSprite(graphics, "item_slot", slot.x-1, slot.y-1, 18);
            }
        }
    }

    //~ if >=26.1 'renderSlot' -> 'extractSlot'
    @Inject(method = "extractSlot", at = @At("TAIL"))
    private void renderVisibilitySprites(GuiGraphicsExtractor graphics, Slot slot, /*? >=1.21.11 {*/ int mouseX, int mouseY, /*?}*/ CallbackInfo ci) {
        ArrayList<TBSGroup> groupsOnSelectedTab = TBS.groupsOnSelectedTab(TBS.selectedTab);
        int index = iig$calculateIndex(slot);
        for (TBSGroup tbsGroup : groupsOnSelectedTab) {
            if (iig$onScreen(slot.index) && tbsGroup.getIconIndex() == index) {
                if (tbsGroup.isVisibility())
                    iig$renderSprite(graphics, "minus", slot.x, slot.y, 16);
                else
                    iig$renderSprite(graphics, "plus", slot.x, slot.y, 16);
            }
        }
    }

    //~ if >=26.1 'renderTooltip' -> 'extractTooltip'
    @Redirect(method = "extractTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;getTooltipFromContainerItem(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;"))
    private List<Component> renderGroupName(AbstractContainerScreen instance, ItemStack itemStack) {
        int index = iig$calculateIndex(hoveredSlot);
        TBSGroup tbsGroup = TBS.findGroupByIndex(index);

        return (tbsGroup != null && index == tbsGroup.getIconIndex() && iig$onScreen(hoveredSlot.index))
                ? List.of(tbsGroup.getName())
                : this.getTooltipFromContainerItem(itemStack);
    }

    //~ if >=26.1 'renderTooltip' -> 'extractTooltip'
    @Inject(method = "extractTooltip", at = @At("HEAD"))
    private void getTicks(CallbackInfo ci) {
        tick++;
        if (tick == Minecraft.getInstance().options.framerateLimit().get()) {
            tick = 0;
            seconds++;
        }
    }
}
