package net.moretoolsmod.item;

import net.moretoolsmod.MoreToolsMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    // Deferred registers
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreToolsMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolsMod.MOD_ID);

    // Poop Ore block
    public static final RegistryObject<Block> POOP_ORE = BLOCKS.register("poop_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)       // pick a color (1.19+)
                    .strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    // BlockItem so it shows in inventory/creative and can be placed
    public static final RegistryObject<Item> POOP_ORE_ITEM = ITEMS.register("poop_ore",
            () -> new BlockItem(POOP_ORE.get(), new Item.Properties()));
}
