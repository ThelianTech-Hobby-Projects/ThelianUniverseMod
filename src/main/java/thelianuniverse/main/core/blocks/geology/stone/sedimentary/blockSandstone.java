package thelianuniverse.main.core.blocks.geology.stone.sedimentary;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockSandstone extends blockBase {

    public blockSandstone() {

        super(Material.ROCK, "sandstone", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }
}
