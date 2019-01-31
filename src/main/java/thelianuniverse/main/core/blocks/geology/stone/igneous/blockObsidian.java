package thelianuniverse.main.core.blocks.geology.stone.igneous;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockObsidian extends blockBase {
    public blockObsidian() {

        super(Material.ROCK, "obsidian", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
