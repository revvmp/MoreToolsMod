package net.moretoolsmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;


public class ObsidianTools implements Tier {
    private static final int USES = 2500;
    private static final float SPEED = 8.0F;
    private static final float DAMAGE = 3.0F;
    private static final int ENCHANTMENT_VALUE = 10;

    @Override
    public int getUses() {
        return USES;
    }

    @Override
    public float getSpeed() {
        return SPEED;
    }

    @Override
    public float getAttackDamageBonus() {
        return DAMAGE;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
    }

    @Override
    public int getEnchantmentValue() {
        return ENCHANTMENT_VALUE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.OBSIDIAN);
    }
}
