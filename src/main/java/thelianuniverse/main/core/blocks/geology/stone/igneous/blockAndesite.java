package thelianuniverse.main.core.blocks.geology.stone.igneous;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockAndesite extends blockBase {

    public blockAndesite() {

        super(Material.ROCK, "andesite", 2.0f, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
