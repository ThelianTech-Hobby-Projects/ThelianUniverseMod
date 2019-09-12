package thelianuniverse.main.init;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.registries.ForgeRegistries;

import thelianuniverse.api.main.registry.ItemRegisterer;
import thelianuniverse.main.util.ItemGroupTU.*;
import static thelianuniverse.api.main.item.TUItems.*;

public class ThelianItem extends ItemRegisterer {
				
				public static void init() {
								
								logo = registerItemNoGroup(new Item(new Item.Properties()), "logo" );
				
				}
}
