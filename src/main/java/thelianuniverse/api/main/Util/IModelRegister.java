package thelianuniverse.api.main.Util;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public interface IModelRegister {

    @SideOnly(Side.CLIENT)
    default void modelRegisters(ModelRegistryEvent evt) {
         if (this instanceof Item) {

             ModelLoader.setCustomModelResourceLocation((Item) this, 0, new ModelResourceLocation(((IForgeRegistryEntry<?>) this).getRegistryName(), "model"));
         }

         else if (this instanceof Block) {

             ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock((Block) this), 0, new ModelResourceLocation(((IForgeRegistryEntry<?>) this).getRegistryName(), "model") );
         }

         else

             throw new IllegalArgumentException("Unable to Load Model");

    }
}
