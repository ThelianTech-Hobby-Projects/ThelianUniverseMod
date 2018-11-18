package thelianuniverse.main.core.base.baseBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import thelianuniverse.main.util.ModData;

public class blockBase extends Block {


    protected String name;
    public int creativeTab;

    /**
     * This is how we use the Blocks Creative Tab assignment system.
     * @param creativeTab default = 5;
     * Accepted Parameters are 0 to 5.
     * Selecting 0 will assign the Creative tab as Biology
     * Selecting 1 will assign the Creative tab as Geology
     * Selecting 2 will assign the Creative tab as Decor
     * Selecting 3 will assign the Creative tab as Machines
     * Selecting 4 will assign the Creative tab as Transportation
     * Selecting 5 will assign the Default Creative tab as MiscBlocks
     */


    public static CreativeTabs OrganicsBlocksTab = new CreativeTabs("Thelian Biology") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs GeologyBlocksTab = new CreativeTabs("Thelian Geology") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs DecorationsTab = new CreativeTabs("Thelian Decor") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs MachineBlocksTab = new CreativeTabs("Thelian Machines") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs TransportationTab = new CreativeTabs("Thelian Transportation") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs MiscBlocksTab = new CreativeTabs("Thelian Miscellaneous Blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };


    public blockBase(Material material, String name, float hardness, int creativeTab){

        super(material);
        this.name = name;
        this.creativeTab = creativeTab;
        setHardness(hardness);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab();
        ModData.BLOCKS.add(this);
    }

    public blockBase setCreativeTab() {

        int tabSwitch = creativeTab;


        switch (tabSwitch) {
            
            case 0:
                final CreativeTabs tab0 = blockBase.OrganicsBlocksTab;
                super.setCreativeTab(tab0);
                break;

            case 1:
                final CreativeTabs tab1 = blockBase.GeologyBlocksTab;
                super.setCreativeTab(tab1);
                break;

            case 2:
                final CreativeTabs tab2 = blockBase.DecorationsTab;
                super.setCreativeTab(tab2);
                break;

            case 3:
                final CreativeTabs tab3 = blockBase.MachineBlocksTab;
                super.setCreativeTab(tab3);
                break;

            case 4:
                final CreativeTabs tab4 = blockBase.TransportationTab;
                super.setCreativeTab(tab4);
                break;

            case 5:
                final CreativeTabs tab5 = blockBase.MiscBlocksTab;
                super.setCreativeTab(tab5);
                break;

            default:
                final CreativeTabs tab = blockBase.MiscBlocksTab;
                super.setCreativeTab(tab);
                break;
        }
        
        return setCreativeTab();
    }


}
