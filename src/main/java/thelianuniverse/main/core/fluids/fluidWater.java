package thelianuniverse.main.core.fluids;

import net.minecraft.util.ResourceLocation;

import thelianuniverse.api.main.block.IFluid;

public class fluidWater extends IFluid {


    public fluidWater(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super("water", new ResourceLocation(""), new ResourceLocation(""));
    }
}
