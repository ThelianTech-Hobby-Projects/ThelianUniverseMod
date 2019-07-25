package thelianuniverse.api.main.Util.inventory;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupDecor extends ItemGroup {
				public ItemGroupDecor() {
								super("tabTUDecor");
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
}
