package com.ti.thelianuniverse.main.init;


import com.ti.thelianuniverse.api.registry.BlockRegisterer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.RegistryObject;


public class ThelianBlock extends BlockRegisterer {

        // Lets Register Geology Blocks Here
        //Igneous
public static final RegistryObject<Block> ANDESITE_BLOCK = registerBlock("andesite_block",
        () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
        // Lets Register Geology Blocks Here
        //Igneous
       /* basalt
        dacite
        diorite
        gabbro
        granite
        obsidian
        pegmatite
        perdotite
        rhyolite
        //Metamorphic
        anthracite
        lapis_lazul
        marble
        novaculite
        quartzite
        phyllite
        soap_stone
        schist
        slate
        //Sedimentary
        chert
        coal
        dolomite
        conglomerate
        limestone
        sandstone
        rock_salt
        siltstone
        shale
        //Soil
        soil_chalky
        soil_clay
        soil_loamy
        soil_peat
        soil_sandy
        soil_silty
        soil_top
        //Ore
        ore_aluminium
        ore_bismuth
        ore_cadmium
        ore_carbon
        ore_chromium
        ore_coal
        ore_cobalt
        ore_copper
        ore_rich_copper
        ore_poor_copper
        ore_gold;
        ore_bog_iron
        ore_hematite_iron
        ore_magnetite_iron"
        ore_lead
        ore_lithium
        ore_manganese
        ore_mercury
        ore_molybdenum
        ore_nickel
        ore_osmium
        ore_platinum
        ore_silver
        ore_sulfur
        ore_tin
        ore_titanium
        ore_tungsten
        ore_uranium
        ore_zinc
        Lets Register Biology Blocks Here
*/

    }


}
