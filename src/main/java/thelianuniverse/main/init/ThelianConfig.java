package thelianuniverse.main.init;


import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.text.html.HTMLDocument;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import thelianuniverse.api.main.Util.Logger;


public class ThelianConfig {
				
				
				public static void init() {
								
								Path configPath = FMLPaths.CONFIGDIR.get();
								Path thelianConfigPath = Paths.get(configPath.toAbsolutePath().toString(), "thelianuniverse");
								
								try {
												
												Files.createDirectory(thelianConfigPath);
												
								} catch(FileAlreadyExistsException e) {
								
								} catch(IOException e) {
												
												Logger.error("Failed to create a Config Directory");
								}
								
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, serverConfig.SPEC, "thelianuniverse/server.toml");
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Main.SPEC, "thelianuniverse/main.toml");
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThelianBiomes.SPEC, "thelianuniverse/ThelianBiomes.toml");
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThelianCrafting.SPEC, "thelianuniverse/ThelianCrafting.toml");
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThelianTerrain.SPEC, "thelianuniverse/ThelianTerrain.toml");
				}
				
				public static class Main {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								
								
								public static final ForgeConfigSpec.ConfigValue<Boolean> ThelianDebug;
								
								public static final ForgeConfigSpec.ConfigValue<Boolean> ThelianBiomes;
								public static final ForgeConfigSpec.ConfigValue<Boolean> ThelianCrafting;
								public static final ForgeConfigSpec.ConfigValue<Boolean> ThelianTerrian;
							
								
								
								
								
								
								static {
												
												BUILDER.comment("Main Config to Turn On or Off Modules of the mod");
												BUILDER.push("Main");
												ThelianDebug = BUILDER.comment("This is used to debug the mod" +
												"WARNING: DO NOT TURN ON UNLESS DIRECTED TO DO IT BY A MOD DEV!").define("ThelianDebug", false);
												ThelianBiomes = BUILDER.comment("Activates Thelian Biomes Module").define("ThelianBiomes", false);
												ThelianCrafting = BUILDER.comment("Activates Thelian Crafting Module").define("ThelianCrafting", false);
												ThelianTerrian = BUILDER.comment("Activates Thelian Terrain Module").define("ThelianTerrian", false);
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				public static class ThelianBiomes {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								static {
												BUILDER.comment("Use this to Customized Thelian Biome settings");
												BUILDER.push("Main");
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				public static class ThelianCrafting {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								static {
												BUILDER.comment("Use this to Customize the ThelianCrafting Module");
												BUILDER.push("Main");
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				public static class ThelianTerrain {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								static {
												BUILDER.comment("Use this to Customize the ThelianTerrian Module");
												BUILDER.push("Main");
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				public static class serverConfig {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								public static final ForgeConfigSpec.ConfigValue<Boolean> USEWORLDTYPE;
								
								static {
												BUILDER.comment("Use this when running any server instance. Otherwise you can Ignore this file.");
												BUILDER.push("biomes");
												USEWORLDTYPE = BUILDER.comment("Use the ThelianUniverse Word type for Thelian Terrain/biomes in a dedicated server.").define("use_TU_WorldType", true);
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				
}
