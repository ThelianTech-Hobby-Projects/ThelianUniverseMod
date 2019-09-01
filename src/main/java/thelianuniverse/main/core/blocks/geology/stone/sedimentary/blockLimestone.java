package thelianuniverse.main.core.blocks.geology.stone.sedimentary;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockLimestone extends blockBase {

    public blockLimestone() {
        super(Material.ROCK, "limestone", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
