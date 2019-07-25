package thelianuniverse.api.main.Util.inventory;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupFood extends ItemGroup {
				public 	ItemGroupFood() {
								super("tabTUFood");
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
}
