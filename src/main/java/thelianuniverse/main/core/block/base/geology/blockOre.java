package thelianuniverse.main.core.block.base.geology;


import net.minecraft.block.Block;



public class blockOre extends Block {





    public blockOre(Properties properties) {
        super(properties);
    }


    public enum oreType {
        IGNEOUS,
        METAMORPHIC,
        SEDIMENTARY,

    }

    public enum oreGrade {
        RICH,
        NORMAL,
        POOR;


    }


}
