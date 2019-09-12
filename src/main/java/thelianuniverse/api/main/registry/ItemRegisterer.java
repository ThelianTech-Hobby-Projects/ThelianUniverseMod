package thelianuniverse.api.main.registry;


import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.registries.ForgeRegistries;

import thelianuniverse.main.util.ItemGroupTU;
import static thelianuniverse.api.main.registry.BlockRegisterer.groupSwitch;

import com.sun.istack.internal.NotNull;


public abstract class ItemRegisterer {
				
				public static ItemGroup setItemGroup() {
								
								switch(groupSwitch) {
												
												case 0:
																return ItemGroupTU.ItemGroupMaterials.instance;
												case 1:
																return ItemGroupTU.ItemGroupTools.instance;
												case 2:
																return ItemGroupTU.ItemGroupCombat.instance;
												case 3:
																return ItemGroupTU.ItemGroupFood.instance;
												case 4:
																return ItemGroupTU.ItemGroupMedcine.instance;
												default:
																return ItemGroupTU.ItemGroupMisc.instance;
								}
				}
				
				public static Item registerItem(Item i, String name, int itemGroup) {
								
								groupSwitch = itemGroup;
								i = new Item(new Item.Properties().group(setItemGroup()));
								i.setRegistryName(name);
								ForgeRegistries.ITEMS.register(i);
								return i;
				}
				
				public static Item registerItemNoGroup(Item i, String name) {
								
								i = new Item(new Item.Properties().group(null));
								i.setRegistryName(name);
								ForgeRegistries.ITEMS.register(i);
								return i;
				}
}
