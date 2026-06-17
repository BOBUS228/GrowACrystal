package com.cakeov.grow_a_crystal.datagen;

import com.cakeov.grow_a_crystal.GrowACrystal;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GrowACrystal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
