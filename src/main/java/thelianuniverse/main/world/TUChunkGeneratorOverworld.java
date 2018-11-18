package thelianuniverse.main.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;

import thelianuniverse.main.core.blocks.fluids.blockWater;
import thelianuniverse.main.core.init.ModBlocks;


public class TUChunkGeneratorOverworld implements IChunkGenerator {

    private Random random;
    private World world;
    private IBlockState seaBlockState;
    private IBlockState stoneBlockState;
    private final boolean isMapFeaturesOn;
    private final double[] noiseArray;

    private static final double oneEighth = 0.125D;
    private static final double oneFourth = 0.25D;


    public TUChunkGeneratorOverworld(World getWorld, long seed, boolean isMapFeaturesOn, String chunkSettingsProviderString) {

        this.world = getWorld;
        this.isMapFeaturesOn = isMapFeaturesOn;
        this.random = new Random(seed);


        this.noiseArray = new double[825];

        this.stoneBlockState =
        this.seaBlockState = .getDefaultState();

    }

    public Chunk generateChunk(int chunkX, int chunkZ) {


        final ChunkPos chunkPos = new ChunkPos(chunkX, chunkZ);
        final BlockPos blockPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);

        // Creates a Random Long for use with Generation
        this.random.setSeed((long) chunkX * 341873128712L + (long) chunkZ * 132897987541L);


        //Creates the Primer
        ChunkPrimer cp = new ChunkPrimer();

        //This Starts Basic Terrain with basic filler blocks
        this.setBasicChunk(chunkX, chunkZ, cp);

        // A hand Over for Biome Block Decoration
        Biome[] biomes = this.world.getBiomeProvider().getBiomes(null, chunkX * 16, chunkZ * 16, 16, 16);
        this.genBiomeBlockPlacement(chunkX, chunkZ, cp, biomes);

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

    public void

}
