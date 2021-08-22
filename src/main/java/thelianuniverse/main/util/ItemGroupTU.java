package thelianuniverse.main.util;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thelianuniverse.api.main.item.TUItems;


public class ItemGroupTU extends ItemGroup {


    private ItemGroupTU(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(TUItems.logo);
    }

    public static class ItemGroupBiology {
        public static final ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Biology");
    }

    public static class ItemGroupGeology {
        public static final ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Geology");
    }

    public static class ItemGroupDecor {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Decor");
    }

    public static class ItemGroupMachines {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Machines");

    }

    public static class ItemGroupTransportation {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Transportation");
    }

    public static class ItemGroupMaterials {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Materials");
    }

    public static class ItemGroupTools {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Tools");
    }

    public static class ItemGroupCombat {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Combat");
    }

    public static class ItemGroupFood {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Food");
    }

    public static class ItemGroupMedicine {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Medicine");
    }

    public static class ItemGroupMisc {
        public static ItemGroupTU instance = new ItemGroupTU(ItemGroup.getGroupCountSafe(), "Thelian Core");
    }
}

