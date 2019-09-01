package thelianuniverse.main.core.blocks.geology.stone.igneous;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockScoria extends blockBase {

    public blockScoria() {

        super(Material.ROCK, "scoria", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
