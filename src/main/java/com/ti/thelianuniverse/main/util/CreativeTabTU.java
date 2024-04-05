package com.ti.thelianuniverse.main.util;


import com.ti.thelianuniverse.api.ThelianUniverseAPI;
import com.ti.thelianuniverse.main.init.ThelianBlock;
import com.ti.thelianuniverse.main.init.ThelianItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabTU {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS_TU =
					DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThelianUniverseAPI.Thelian_ID);

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS_TU.register(eventBus);
	}
	public static final RegistryObject<CreativeModeTab> TU_Blocks = CREATIVE_MODE_TABS_TU.register("Thelians Blocks",
					() -> CreativeModeTab.builder().icon(() -> new ItemStack(ThelianItem.LOGO.get()))
									.title(Component.translatable("creativetab.tublocks_tab"))
									.displayItems((pParameters, pOutput) -> {
											pOutput.accept(ThelianBlock.ANDESITE_BLOCK.get());
									})
									.build());


//    private CreativeTabTU(int index, String label) {
//        super();
//    }
//
//    public ItemStack makeIcon() {
//        return new ItemStack(TUItems.logo);
//    }
//
//    public static class CreativeTabBiology {
//        public static final CreativeTabTU instance = new CreativeTabTU(, "Thelian Biology");
//    }
//
//    public static class CreativeTabGeology {
//        public static final CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Geology");
//    }
//
//    public static class CreativeTabDecor {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Decor");
//    }
//
//    public static class CreativeTabMachines {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Machines");
//
//    }
//
//    public static class CreativeTabTransportation {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Transportation");
//    }
//
//    public static class CreativeTabMaterials {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Materials");
//    }
//
//    public static class CreativeTabTools {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Tools");
//    }
//
//    public static class CreativeTabCombat {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Combat");
//    }
//
//    public static class CreativeTabFood {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Food");
//    }
//
//    public static class CreativeTabMedicine {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Medicine");
//    }
//
//    public static class CreativeTabMisc {
//        public static CreativeTabTU instance = new CreativeTabTU(ItemGroup.getGroupCountSafe(), "Thelian Core");
//    }
}

