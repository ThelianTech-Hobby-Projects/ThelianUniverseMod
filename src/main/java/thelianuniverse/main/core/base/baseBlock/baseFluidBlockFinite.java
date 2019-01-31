package thelianuniverse.main.core.base.baseBlock;

import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;

import net.minecraft.block.material.Material;

import thelianuniverse.main.util.ModData;

public abstract class baseFluidBlockFinite extends BlockFluidFinite {
    public baseFluidBlockFinite(Fluid fluid, Material material) {

        super(fluid, material);
        ModData.BLOCKS.add(this);

    }
}
