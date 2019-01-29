package thelianuniverse.main.core.init;


import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import net.minecraft.block.Block;


import thelianuniverse.api.main.Util.IModelRegister;
import thelianuniverse.main.util.ModData;

public final class ModBlocks {

    public static void register(IForgeRegistry<Block> evt) {

        for (Block block : ModData.BLOCKS) {

            evt.register(block);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void modelsRegisters(ModelRegistryEvent evt) {

        for (Block block: ModData.BLOCKS) {

            if (block instanceof IModelRegister) {
                ((IModelRegister) block).modelRegisters(evt);
            }
        }
    }
}
