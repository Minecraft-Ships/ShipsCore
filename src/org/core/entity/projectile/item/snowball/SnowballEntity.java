package org.core.entity.projectile.item.snowball;

import org.core.entity.EntityType;
import org.core.entity.EntityTypes;
import org.core.entity.projectile.ItemProjectileEntity;
import org.core.inventory.item.ItemStack;
import org.core.inventory.item.ItemTypes;

public interface SnowballEntity extends ItemProjectileEntity {

    default ItemStack getItem(){
        return ItemTypes.SNOWBALL.getDefaultItemStack().copyWithQuantity(1);
    }

    @Override
    default EntityType<LiveSnowballEntity, SnowballEntitySnapshot> getType(){
        return EntityTypes.SNOWBALL;
    }
}