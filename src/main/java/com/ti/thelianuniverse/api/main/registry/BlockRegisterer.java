package com.ti.thelianuniverse.api.main.registry;


import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ForgeRegistries;
import com.ti.thelianuniverse.main.util.ItemGroupTU.*;


public abstract class BlockRegisterer {

    private static int groupSwitch;

    private static ItemGroup setItemGroup() {

        switch (groupSwitch) {

            case 0:
                return ItemGroupGeology.instance;
            case 1:
                return ItemGroupBiology.instance;
            case 2:
                return ItemGroupDecor.instance;
            case 3:
                return ItemGroupMachines.instance;
            case 4:
                return ItemGroupTransportation.instance;
            default:
                return ItemGroupMisc.instance;
        }
    }

    protected static Block registerBlock(Block b, String name, int itemGroup) {

        groupSwitch = itemGroup;
        BlockItem ib = new BlockItem(b, new Item.Properties().tab(setItemGroup()));
        b.setRegistryName(name);
        ib.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(b);
        ForgeRegistries.ITEMS.register(ib);
        return b;
    }

    protected static Block registerBlockNoGroup(Block b, String name) {

        BlockItem ib = new BlockItem(b, new Item.Properties().tab(null));
        b.setRegistryName(name);
        ib.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(b);
        ForgeRegistries.ITEMS.register(ib);
        return b;
    }
}
