package thelianuniverse.main.core.blocks.fluids;

import net.minecraftforge.fluids.Fluid;

import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.baseFluidBlock;

public class blockWater extends baseFluidBlock {
    public blockWater(Fluid fluid, Material material) {
        super(fluid, material.WATER);
        this.setLightOpacity(0);
        this.setHardness(100.0F);
    }


}
