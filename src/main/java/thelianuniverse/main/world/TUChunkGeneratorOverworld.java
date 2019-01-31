package thelianuniverse.main.world;

import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorPerlin;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;

import thelianuniverse.api.main.Util.Logger;
import thelianuniverse.api.main.world.TUWorld;
import thelianuniverse.api.main.world.gen.TUChunkGenSettings;



public class TUChunkGeneratorOverworld implements IChunkGenerator {


    public final TUWorld tuWorld;
    private final TUChunkGenSettings settings;
    private Random rand;
    private World world;
    private boolean mapFeaturesEnabled;
    private IBlockState seaBlockState;
    private IBlockState stoneBlockState;
    private NoiseGeneratorPerlin stoneNoiseGen;
    private double[] stoneNoiseArray;
    private final double[] noiseArray;

    private static final double oneEighth = 0.125D;
    private static final double oneFourth = 0.25D;


    public TUChunkGeneratorOverworld(TUWorld tuWorld) {

        Logger.debug("Instantiating CPTUW using generator settings: {}", tuWorld.world().getWorldInfo().getGeneratorOptions());

        this.tuWorld = tuWorld;
        this.world = tuWorld.world();
        this.settings = tuWorld.getGenSettings();

        this.rand = new Random(tuWorld.seed());
        this.tuWorld.setRandom(this.rand);
        this.mapFeaturesEnabled = world.getWorldInfo().isMapFeaturesEnabled();

        this.stoneNoiseGen = new NoiseGeneratorPerlin(this.rand, 4);
        this.noiseArray = new double[825];

        this.stoneBlockState =
        this.seaBlockState = .getDefaultState();

    }

    public Chunk generateChunk(int chunkX, int chunkZ) {


        final ChunkPos chunkPos = new ChunkPos(chunkX, chunkZ);
        final BlockPos blockPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);


        //Creates the Primer
        ChunkPrimer cp = new ChunkPrimer();

        //This Starts Basic Terrain with basic filler blocks
        this.setBasicChunk(chunkX, chunkZ, cp);

        // A hand Over for Biome Block Decoration
        Biome[] biomes = this.world.getBiomeProvider().getBiomes(null, chunkX * 16, chunkZ * 16, 16, 16);
        this.replacementBlocksBiome(chunkX, chunkZ, cp, biomes);

        //Get Structure Templates and add them


        //Creates Chunk and Returns it to the World
        Chunk chunk = new Chunk(this.world, cp, chunkX, chunkZ);
        byte[] chunkBiomes = chunk.getBiomeArray();
        for (int i = 0; i < chunkBiomes.length; ++i) {

            chunkBiomes[i] = (byte) Biome.getIdForBiome(biomes[i]);
        }
        chunk.generateSkylightMap();
        return chunk;
    }

    public void setBasicChunk(int chunkX, int chunkZ, ChunkPrimer cPrimer) {

        //get Noise Values for Chunk Terrain
        this.populateNoiseArray(chunkX, chunkZ);

/**
 *An entire chunk is 16x256x16
 *So lets process chunk into subchunks, each one 4x8x4 blocks in size
 *4 subchunks in x direction, each 4 blocks long
 *32 subchunks in y direction, each 8 blocks long
 *4 subchunks in z direction, each 4 blocks long
 *for a total of 512 subchunks
 * Credit Due to the Devs of BOP for this amazing idea.
 */

        // divides chunk into 4 subchunks in x direction, index as ix
        for (int ix = 0; ix < 4; ++ix) {
            int d_x0 = ix * 5;
            int d_x1 = (ix + 1) * 5;

            // divide chunk into 4 subchunks in z direction, index as iz
            for (int iz = 0; iz < 4; ++iz) {
                int d_x0z0 = (d_x0 + iz) * 33;
                int d_x0z1 = (d_x0 + iz + 1) * 33;
                int d_x1z0 = (d_x1 + iz) * 33;
                int d_x1z1 = (d_x1 + iz + 1) * 33;

                // divide chunk into 32 subchunks in y direction, index as iy
                for (int iy = 0; iy < 32; ++iy) {
                    // get the noise values from the noise array
                    // these are the values at the corners of the subchunk
                    double g_x0y0z0 = this.noiseArray[d_x0z0 + iy];
                    double g_x0y0z1 = this.noiseArray[d_x0z1 + iy];
                    double g_x1y0z0 = this.noiseArray[d_x1z0 + iy];
                    double g_x1y0z1 = this.noiseArray[d_x1z1 + iy];
                    double g_x0y1z0 = this.noiseArray[d_x0z0 + iy + 1];
                    double g_x0y1z1 = this.noiseArray[d_x0z1 + iy + 1];
                    double g_x1y1z0 = this.noiseArray[d_x1z0 + iy + 1];
                    double g_x1y1z1 = this.noiseArray[d_x1z1 + iy + 1];

                    // linearly interpolate between the noise points to get a noise value for each block in the subchunk

                    double noiseStepY00 = (g_x0y1z0 - g_x0y0z0) * oneEighth;
                    double noiseStepY01 = (g_x0y1z1 - g_x0y0z1) * oneEighth;
                    double noiseStepY10 = (g_x1y1z0 - g_x1y0z0) * oneEighth;
                    double noiseStepY11 = (g_x1y1z1 - g_x1y0z1) * oneEighth;

                    double noiseStartX0 = g_x0y0z0;
                    double noiseStartX1 = g_x0y0z1;
                    double noiseEndX0 = g_x1y0z0;
                    double noiseEndX1 = g_x1y0z1;

                    // subchunk is 8 blocks high in y direction, index as jy
                    for (int jy = 0; jy < 8; ++jy) {

                        double noiseStartZ = noiseStartX0;
                        double noiseEndZ = noiseStartX1;

                        double noiseStepX0 = (noiseEndX0 - noiseStartX0) * oneFourth;
                        double noiseStepX1 = (noiseEndX1 - noiseStartX1) * oneFourth;

                        // subchunk is 4 blocks long in x direction, index as jx
                        for (int jx = 0; jx < 4; ++jx) {
                            double noiseStepZ = (noiseEndZ - noiseStartZ) * oneFourth;
                            double noiseVal = noiseStartZ;

                            // subchunk is 4 blocks long in x direction, index as jz
                            for (int jz = 0; jz < 4; ++jz) {

                                // If the noise value is above zero, this block starts as stone
                                // Otherwise it's 'empty' - air above sealevel and water below it
                                if (noiseVal > 0.0D) {

                                    cPrimer.setBlockState(ix * 4 + jx, iy * 8 + jy, iz * 4 + jz, this.stoneBlockState);

                                } else if (iy * 8 + jy < this.settings.seaLevel) {

                                    cPrimer.setBlockState(ix * 4 + jx, iy * 8 + jy, iz * 4 + jz, this.seaBlockState);

                                }
                                noiseVal += noiseStepZ;
                            }

                            noiseStartZ += noiseStepX0;
                            noiseEndZ += noiseStepX1;
                        }

                        noiseStartX0 += noiseStepY00;
                        noiseStartX1 += noiseStepY01;
                        noiseEndX0 += noiseStepY10;
                        noiseEndX1 += noiseStepY11;
                    }
                }
            }
        }
    }

    public void replacementBlocksBiome(int chunkx, int chunkz, ChunkPrimer cp, Biome[] biomes) {

        if (!net.minecraftforge.event.ForgeEventFactory.onReplaceBiomeBlocks(this, chunkx, chunkz, cp, this.world)) return; {

            double d0 = 0.03125D;
            this.stoneNoiseArray = this.stoneNoiseGen.getRegion(
              this.stoneNoiseArray,(double)(chunkx * 16), (double)(chunkz * 16),
              16, 16, d0 * 2.0D, d0 * 2.0D, d0 * 1.0D);

            for (int lx = 0; lx< 16; ++lx) {

                for (int lz = 0; lz < 16; ++lz) {

                    Biome biome = biomes[lz + lx * 16];
                    biome.genTerrainBlocks(this.world, this.rand, cp,chunkx * 16 + lx, chunkz * 16 + lz, this.stoneNoiseArray[lz + lx * 16]);
                }
            }
        }
    }

    public void populate(int chunkX, int chunkZ) {

        BlockFalling.fallInstantly = true;
        ChunkPos cPos = new ChunkPos(chunkX, chunkZ);
        BlockPos bPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);

        Biome biome = this.world.getBiome(bPos.add(16, 0, 16));

        this.rand.setSeed(this.tuWorld.getChunkSeed(chunkX, chunkZ));
        boolean hasVillageGenerated = false;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(this, world, rand, chunkX, chunkZ,false));

        if (this.mapFeaturesEnabled) {
            if (settings.useMineShaftFeature) {

            }
            if (settings.useStrongholdFeature)  {

            }
            if (settings.useVillageFeature) {

            }
            if (settings.useTempleFeature) {

            }
            if (settings.useMonumentFeature) {

            }
        }

    }

}
