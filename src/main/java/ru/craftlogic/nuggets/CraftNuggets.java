package ru.craftlogic.nuggets;


import cofh.thermalfoundation.ThermalFoundation;
import cofh.thermalfoundation.item.ItemMaterial;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.craftlogic.api.CraftAPI;
import ru.craftlogic.nuggets.common.block.BlockNugget;

import static ru.craftlogic.api.CraftBlocks.registerBlock;

@Mod(modid = CraftNuggets.MOD_ID, version = CraftNuggets.VERSION, dependencies = "required-after:" + CraftAPI.MOD_ID + ";after:" + ThermalFoundation.MOD_ID)
public class CraftNuggets {
    public static final String MOD_ID = CraftAPI.MOD_ID + "-nuggets";
    public static final String VERSION = "0.1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        registerBlock(new BlockNugget("gold", () -> new ItemStack(Items.GOLD_NUGGET)));
        registerBlock(new BlockNugget("iron", () -> new ItemStack(Items.IRON_NUGGET)));
        if (Loader.isModLoaded(ThermalFoundation.MOD_ID)) {
            registerBlock(new BlockNugget("copper", () -> ItemMaterial.nuggetCopper.copy()));
            registerBlock(new BlockNugget("tin", () -> ItemMaterial.nuggetTin.copy()));
            registerBlock(new BlockNugget("silver", () -> ItemMaterial.nuggetSilver.copy()));
            registerBlock(new BlockNugget("lead", () -> ItemMaterial.nuggetLead.copy()));
            registerBlock(new BlockNugget("aluminum", () -> ItemMaterial.nuggetAluminum.copy()));
            registerBlock(new BlockNugget("platinum", () -> ItemMaterial.nuggetPlatinum.copy()));
            registerBlock(new BlockNugget("iridium", () -> ItemMaterial.nuggetIridium.copy()));
            registerBlock(new BlockNugget("mithril", () -> ItemMaterial.nuggetMithril.copy()));
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
