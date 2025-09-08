package net.moretoolsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moretoolsmod.MoreToolsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolsMod.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(new ObsidianTools(), new Item.Properties().attributes(PickaxeItem.createAttributes(new ObsidianTools(), 1.0F, -2.8F))));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(new ObsidianTools(), new Item.Properties().attributes(SwordItem.createAttributes(new ObsidianTools(), 3, -2.4F))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
