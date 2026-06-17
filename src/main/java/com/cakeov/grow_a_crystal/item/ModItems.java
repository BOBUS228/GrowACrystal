package com.cakeov.grow_a_crystal.item;

import com.cakeov.grow_a_crystal.GrowACrystal;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GrowACrystal.MOD_ID);

    public static void register(IEventBus Bus){
        ITEMS.register(Bus);
    }
}
