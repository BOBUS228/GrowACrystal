package com.cakeov.grow_a_crystal.datagen;

import com.cakeov.grow_a_crystal.GrowACrystal;
import com.cakeov.grow_a_crystal.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GrowACrystal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HOLLOW_CRYSTAL.get())
                .add(ModBlocks.FIRE_CRYSTAL.get())
                .add(ModBlocks.WATER_CRYSTAL.get())
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.HOLLOW_CRYSTAL.get())
                .add(ModBlocks.FIRE_CRYSTAL.get())
                .add(ModBlocks.WATER_CRYSTAL.get())
        ;
    }
}
