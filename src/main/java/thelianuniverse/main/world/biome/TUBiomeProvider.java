package thelianuniverse.main.world.biome;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;

import thelianuniverse.api.main.world.TUWorld;
import thelianuniverse.main.world.WorldTypeTU;

public class TUBiomeProvider extends BiomeProvider {

    public TUBiomeProvider(TUWorld tuWorld) {

        super(tuWorld.world().getWorldInfo());
    }

}