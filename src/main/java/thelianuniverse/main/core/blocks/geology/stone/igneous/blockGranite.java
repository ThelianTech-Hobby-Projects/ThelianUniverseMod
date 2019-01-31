package thelianuniverse.main.core.blocks.geology.stone.igneous;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import thelianuniverse.main.core.base.baseBlock.blockBase;


public class blockGranite extends blockBase {
    public blockGranite() {
        super(Material.ROCK,"granite", 2.0F, 1);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }

}
