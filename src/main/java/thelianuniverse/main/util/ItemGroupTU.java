package thelianuniverse.main.util;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ItemGroupTU extends ItemGroup {
				
				
				
				private ItemGroupTU(int index, String label) {
								super(index, label);
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack();
				}
				
				public static class ItemGroupBiology {
								public static final ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Biology");
				}
				
				public static class ItemGroupGeology {
								public static final ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Geology");
				}
				
				public static class ItemGroupDecor {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Decor");
				}
				
				public static class ItemGroupMachines {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Machines");
								
				}
				
				public static class ItemGroupTransportation {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Transportation");
				}
				
				public static class ItemGroupMaterials{
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Materials");
				}
				
				public static class ItemGroupTools {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Tools");
				}
				
				public static class ItemGroupCombat {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Combat");
				}
				
				public static class  ItemGroupFood {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "ThelianMedicine");
				}
				
				public static class ItemGroupMisc {
								public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.GROUPS.length, "Thelian Core");
				}
}
	/*public static void init() {
								final ItemGroup BIOLOGY = new ItemGroupBiology();
								final ItemGroup GEOLOGY = new ItemGroupGeology();
								final ItemGroup DECOR = new ItemGroupDecor();
								final ItemGroup MACHINES = new ItemGroupMachinces();
								final ItemGroup TRANSPORTATION = new ItemGroupTransportation();
								final ItemGroup MATERIALS = new ItemGroupMaterials();
								final ItemGroup TOOLS = new ItemGroupTools();
								final ItemGroup COMBAT = new ItemGroupCombat();
								final ItemGroup FOOD = new ItemGroupFood();
								final ItemGroup MEDICINE = new ItemGroupMedicine();
								
				}*/
