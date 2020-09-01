package ru.craftlogic.nuggets.common.block;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import ru.craftlogic.api.block.BlockLyingItem;
import ru.craftlogic.api.world.Location;

import java.util.function.Supplier;

public class BlockNugget extends BlockLyingItem {
    private final Supplier<ItemStack> item;

    public BlockNugget(String metal, Supplier<ItemStack> item) {
        super("nugget_" + metal, 0F, CreativeTabs.MATERIALS);
        this.item = item;
        setSoundType(SoundType.METAL);
    }

    @Override
    public ItemStack getItem(Location location) {
        return item.get();
    }

    @Override
    public void addDrops(Location location, NonNullList<ItemStack> items, int fortune) {
        items.add(item.get());
    }
}
