package thelianuniverse.main.core.block.geology;


import net.minecraft.block.Block;


public class blockSedimentary extends Block {
				
				public blockSedimentary(Properties properties, float hardnessIn) {
								super(properties);
								properties.hardnessAndResistance(hardnessIn, 0.5F);
				}
}
