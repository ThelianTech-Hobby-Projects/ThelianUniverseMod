package thelianuniverse.api.main.Util.inventory;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupMaterials extends ItemGroup {
				public 	ItemGroupMaterials() {
								super("tabTUMaterials");
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
}
