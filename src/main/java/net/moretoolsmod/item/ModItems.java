package net.moretoolsmod.item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.material.MapColor;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moretoolsmod.MoreToolsMod;
import net.minecraft.world.level.material.MapColor;

import static net.moretoolsmod.item.ModItems.ITEMS;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolsMod.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(new ObsidianTools(), new Item.Properties().attributes(PickaxeItem.createAttributes(new ObsidianTools(), 1.0F, -2.8F))));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(new ObsidianTools(), new Item.Properties().attributes(SwordItem.createAttributes(new ObsidianTools(), 3, -2.4F))));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(new ObsidianTools(), new Item.Properties().attributes(HoeItem.createAttributes(new ObsidianTools(), 3, -2.4F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
