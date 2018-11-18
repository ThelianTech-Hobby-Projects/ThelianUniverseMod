package thelianuniverse.main.core.base.baseItem;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import thelianuniverse.main.util.ModData;

public class itemBase extends Item {

    /**
     * This is how we use the Items Creative Tab assignment system.
     * @param creativeTab default = 5;
     * Accepted Parameters are 0 to 5.                    
     * Selecting 0 will assign the Creative tab as Materials
     * Selecting 1 will assign the Creative tab as Tools
     * Selecting 2 will assign the Creative tab as Combat
     * Selecting 3 will assign the Creative tab as Food
     * Selecting 4 will assign the Creative tab as Medicine
     * Selecting 5 will assign the Default Creative tab as MiscItems
     */
    
    
    protected String name;
    public int creativeTab;
    
    public static CreativeTabs MaterialsItemTab = new CreativeTabs("Thelian Materials") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };
    public static CreativeTabs ToolsItemTab = new CreativeTabs("Thelian Tools") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs CombatTab = new CreativeTabs("Thelian Combat") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs FoodsTab = new CreativeTabs("Thelian Food") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };
    
    public static CreativeTabs MedicalTab = new CreativeTabs("Thelian Medicine") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs MiscTab = new CreativeTabs("Thelian Miscellaneous Items ") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };
    

    public itemBase(String name, int creativeTab) {

        this.name = name;
        this.creativeTab = creativeTab;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab();
        ModData.ITEMS.add(this);
    }


    public itemBase setCreativeTab() {

        int tabSwitch = creativeTab;


        switch (tabSwitch) {

            case 0:
                final CreativeTabs tab0 = itemBase.MaterialsItemTab;
                super.setCreativeTab(tab0);
                break;

            case 1:
                final CreativeTabs tab1 = itemBase.ToolsItemTab;
                super.setCreativeTab(tab1);
                break;

            case 2:
                final CreativeTabs tab2 = itemBase.CombatTab;
                super.setCreativeTab(tab2);
                break;

            case 3:
                final CreativeTabs tab3 = itemBase.FoodsTab;
                super.setCreativeTab(tab3);
                break;
                
            case 4: 
                final CreativeTabs tab4 = itemBase.MedicalTab;
                super.setCreativeTab(tab4);
                break;
                
            case 5:
                final CreativeTabs tab5 = itemBase.MiscTab;
                super.setCreativeTab(tab5);
                break;

            default:
                final CreativeTabs tab = itemBase.MiscTab;
                super.setCreativeTab(tab);
                break;
        }

        return setCreativeTab();
    }

}
