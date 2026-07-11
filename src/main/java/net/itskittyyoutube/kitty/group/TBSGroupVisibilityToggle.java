package net.itskittyyoutube.kitty.group;

import net.itskittyyoutube.kitty.TBS;

public class TBSGroupVisibilityToggle {
    private boolean isListChanged;
    private TBSGroup group;
    private int itemIndex;
    private float scrollOffs;

    public void toggle(int itemIndex, float scrollOffs) {
        this.isListChanged = true;
        this.group = TBS.findGroupByIndex(itemIndex);
        this.itemIndex = itemIndex;
        this.scrollOffs = scrollOffs;
    }

    public void off() {
        this.isListChanged = false;
    }

    public boolean isListChanged() {
        return isListChanged;
    }

    public TBSGroup getGroup() {
        return group;
    }

    public int getItemIndex() {
        return itemIndex;
    }

    public float getScrollOffs() {
        return scrollOffs;
    }
}
