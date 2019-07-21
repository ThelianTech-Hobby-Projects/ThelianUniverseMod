package thelianuniverse.main.core.init;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import net.minecraft.item.Item;

import thelianuniverse.api.main.Util.IModelRegister;
import thelianuniverse.main.util.ModData;

public final class ModItems {

    public static void register(IForgeRegistry<Item> evt) {

        for (Item item : ModData.ITEMS) {

            evt.register(item);
        }
    }


    public static void modelsRegisters(ModelRegistryEvent evt) {

        for (Item item: ModData.ITEMS) {

            if (item instanceof IModelRegister) {
                ((IModelRegister) item).modelRegisters(evt);
            }
        }
    }
}
