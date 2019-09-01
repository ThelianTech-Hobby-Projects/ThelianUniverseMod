package thelianuniverse.main.init;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.registries.ForgeRegistries;

import thelianuniverse.main.util.ItemGroupTU.*;
import static thelianuniverse.api.main.item.TUItems.*;

public class ThelianItem {
				
				protected static int groupSwitch;
				
				public static void init() {
								
								logo = registerItem(new Item(new Item.Properties()), "thelian_logo", 5);
				
				}
				
				
				public static ItemGroup setItemGroup() {
								
								switch(groupSwitch) {
												
												case 0:
																return ItemGroupMaterials.instance;
												case 1:
																return ItemGroupTools.instance;
												case 2:
																return ItemGroupCombat.instance;
												case 3:
																return ItemGroupFood.instance;
												case 4:
																return ItemGroupMedcine.instance;
												case 5:
																return null;
												default:
																return ItemGroupMisc.instance;
								}
				}
				
				public static Item registerItem(Item i, String name, int itemGroup) {
								groupSwitch = itemGroup;
								i = new Item(new Item.Properties().group(setItemGroup()));
								i.setRegistryName(name);
								ForgeRegistries.ITEMS.register(i);
								return i;
				}
}
