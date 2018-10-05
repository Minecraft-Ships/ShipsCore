package org.core.inventory.parts;

import org.core.inventory.item.ItemStack;
import org.core.inventory.parts.snapshot.SlotSnapshot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface Slot extends InventoryPart {

    public Optional<Integer> getPosition();
    public Optional<ItemStack> getItem();
    public Slot setItem(ItemStack stack);

    @Override
    default SlotSnapshot createSnapshot(){
        return new SlotSnapshot(this);
    }

    @Override
    public default Set<Slot> getSlots(){
        return new HashSet<>(Arrays.asList(this));
    }
}