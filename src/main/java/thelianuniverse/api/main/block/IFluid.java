package thelianuniverse.api.main.block;



import net.minecraftforge.fluids.Fluid;

import net.minecraft.util.ResourceLocation;

public abstract class IFluid extends Fluid {

    public IFluid(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing);
    }

}
