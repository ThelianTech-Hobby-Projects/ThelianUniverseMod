package thelianuniverse.main.core.blocks.geology.stone.metamorphic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockMarble extends blockBase {

    public blockMarble() {

        super(Material.ROCK,"marble", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe",1);
    }

}
