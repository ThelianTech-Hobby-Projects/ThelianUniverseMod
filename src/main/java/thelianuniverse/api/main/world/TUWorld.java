package thelianuniverse.api.main.world;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.minecraft.world.World;

import thelianuniverse.api.main.world.gen.TUChunkGenSettings;



public final class TUWorld {

    private static final Map<World, TUWorld> INSTANCE_CACHE = new HashMap<>();

    private final World world;
    private final TUChunkGenSettings genSettings;
    private Random generatorRandom = null;

    private TUWorld(World world) {

        this.world = world;
        this.genSettings = TUChunkGenSettings.Factory.jsonToFactory(world.getWorldInfo().getGeneratorOptions()).build();
    }

    /**
     * Gets an instance of TUWorld of a {@link World} from the cache. If one does not exist, create it and store it first.
     *
     * @param world the world from which to get an instance of TUWorld for
     * @return a cached or new instance of TUWorld
     */
    public static TUWorld getInstance(World world) {

        if (!INSTANCE_CACHE.containsKey(world)) {
            INSTANCE_CACHE.put(world, new TUWorld(world));
        }
        return INSTANCE_CACHE.get(world);
    }

    /**
     * Removes an instance of TUWorld from the cache. This should be done when worlds are unloaded
     *
     * @param world the world to remove an instance of TUWorld for
     * @return true if an instance was removed, false otherwise
     */
    public static boolean removeInstance(World world) {

        return (INSTANCE_CACHE.remove(world) != null);
    }

    /**
     * Syncs this objects Random to the chunk generator
     *
     * @param random the chunk generator Random
     */
    public void setRandom(Random random) {
        if (this.generatorRandom == null) {
            this.generatorRandom = random;
        }
    }

    /**
     * Gets the {@link World} object for this wrapper.
     *
     * @return The world object for this wrapper
     */
    public World world() {

        return this.world;
    }

    /**
     * Gets the stored {@link TUChunkGenSettings} instance for the world of this wrapper.
     *
     * @return The stored TUChunkGenSettings object
     */
    public TUChunkGenSettings getGenSettings() {

        return this.genSettings;
    }

    /**
     * Alias to get the seed value of the {@link World} for this wrapper.
     *
     * @return The seed value
     */
    public long seed() {

        return this.world().getSeed();
    }

    public Random rand() {
        return this.generatorRandom;
    }

    public long getChunkSeed(final int chunkX, final int chunkZ) {
        final long seed = world().getSeed();
        final Random rand = new Random(seed);
        return (chunkX * (rand.nextLong() / 2L * 2L + 1L)) + (chunkZ * (rand.nextLong() / 2L * 2L + 1L)) ^ seed;
    }

}
