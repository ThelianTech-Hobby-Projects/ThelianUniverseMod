package thelianuniverse.main.core.blocks.geology.stone.metamorphic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockSchist extends blockBase {

    public blockSchist() {

        super(Material.ROCK, "schist", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
