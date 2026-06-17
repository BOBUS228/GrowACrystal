package com.cakeov.grow_a_crystal.block;

import com.cakeov.grow_a_crystal.GrowACrystal;
import com.cakeov.grow_a_crystal.block.custom.Crystal;
import com.cakeov.grow_a_crystal.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GrowACrystal.MOD_ID);

    public static final DeferredBlock<Block> HOLLOW_CRYSTAL = registerBlock("hollow_crystal",
            ()->new Crystal(BlockBehaviour.Properties.of()
                    .strength(4)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> FIRE_CRYSTAL = registerBlock("fire_crystal",
            ()->new Crystal(BlockBehaviour.Properties.of()
                    .strength(4)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> WATER_CRYSTAL = registerBlock("water_crystal",
            ()->new Crystal(BlockBehaviour.Properties.of()
                    .strength(4)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register(IEventBus Bus){
        BLOCKS.register(Bus);
    }

}
