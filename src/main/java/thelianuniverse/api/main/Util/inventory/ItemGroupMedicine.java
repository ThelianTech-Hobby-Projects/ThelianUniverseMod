package thelianuniverse.api.main.Util.inventory;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupMedicine extends ItemGroup {
				public 	ItemGroupMedicine() {
								super("tabTUMedicine");
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
}
