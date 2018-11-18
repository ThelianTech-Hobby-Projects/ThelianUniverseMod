package thelianuniverse.main.world;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import static thelianuniverse.api.main.ThelianUniverseAPI.TU_WORLDTYPE_ID;

import thelianuniverse.main.client.gui.TUGUIConfigureWorld;
import thelianuniverse.main.world.biome.TUBiomeProvider;

@SuppressWarnings("EqualsAndHashcode")
public final class WorldTypeTU extends WorldType {

    private static WorldTypeTU INSTANCE;


    private WorldTypeTU() {
        super(TU_WORLDTYPE_ID);
    }

    private static WorldTypeTU getInstance() {
        if (INSTANCE == null) {
            init();
        }
        return INSTANCE;
    }

    public static void init() {
        INSTANCE = new WorldTypeTU();
    }

    public BiomeProvider getBiomeProvider(World world) {

        return new TUBiomeProvider(world);
    }

    @Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {

        return new TUChunkGeneratorOverworld(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), generatorOptions);
    }

    public boolean isCustomizable() {

        return true;
    }

   /* @Override
    @SideOnly(Side.CLIENT)
    public void onCustomizeButton(Minecraft mc, GuiCreateWorld guiCreateWorld) {

        mc.displayGuiScreen(new TUGUIConfigureWorld(guiCreateWorld, guiCreateWorld.chunkProviderSettingsJson));
    }*/
}
