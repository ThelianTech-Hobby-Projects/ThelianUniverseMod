package thelianuniverse.api.main.Util.inventory;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupCombat extends ItemGroup {
				public 	ItemGroupCombat() {
								super("tabTUCombat");
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
}
