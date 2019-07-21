package thelianuniverse.main.core.init;


import net.minecraft.block.Block;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import thelianuniverse.api.main.Util.IModelRegister;
import thelianuniverse.main.util.ModData;

public final class ModBlocks {

    public static void register(IForgeRegistry<Block> evt) {

        for (Block block : ModData.BLOCKS) {

            evt.register(block);
        }
    }

    
    public static void modelsRegisters(ModelRegistryEvent evt) {

        for (Block block: ModData.BLOCKS) {

            if (block instanceof IModelRegister) {
                ((IModelRegister) block).modelRegisters(evt);
            }
        }
    }
}
