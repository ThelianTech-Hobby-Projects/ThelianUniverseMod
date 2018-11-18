package thelianuniverse.api.main.world;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.world.World;

public final class TUWorld {

    private final World world;


    private static final Map<World, TUWorld> INSTANCE_CACHE = new HashMap<>();


    private TUWorld(World world) {

        this.world = world;
    }
}
