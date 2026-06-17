package com.cakeov.grow_a_crystal.datagen;

import com.cakeov.grow_a_crystal.GrowACrystal;
import com.cakeov.grow_a_crystal.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GrowACrystal.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.HOLLOW_CRYSTAL);
        blockWithItem(ModBlocks.FIRE_CRYSTAL);
        blockWithItem(ModBlocks.WATER_CRYSTAL);
    }

    private void blockWithItem (DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }

}
