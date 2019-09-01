package thelianuniverse.main.core.fluids;

import net.minecraft.util.ResourceLocation;

import thelianuniverse.api.main.block.IFluid;

public class fluidWater extends IFluid {

    public static final String fluidName = "saltwater";
    public static final fluidWater instance = new fluidWater();

    public fluidWater() {
        super(fluidName, new ResourceLocation(""), new ResourceLocation(""));
    }
}
