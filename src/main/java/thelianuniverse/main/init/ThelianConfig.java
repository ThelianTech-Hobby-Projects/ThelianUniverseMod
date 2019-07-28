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
				}
				
				public static class Main {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								
								
								public static final ForgeConfigSpec.ConfigValue<Boolean> ThelianDebug;
								
								
								static {
												
												BUILDER.comment("Main Config to Turn On or Off Modules of the mod");
												BUILDER.push("Main");
												BUILDER.comment("This is For Debugging the mod.");
												ThelianDebug = BUILDER.comment("WARNING: DO NOT TURN ON UNLESS DIRECTED TO DO IT BY A MOD DEV!").define("ThelianDebug", false);
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				public static class serverConfig {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								public static final ForgeConfigSpec.BooleanValue USEWORLDTYPE;
								
								static {
												BUILDER.comment("Use this when running any server instance. Otherwise you can Ignore this file.");
												BUILDER.push("biomes");
												USEWORLDTYPE = BUILDER.comment("Use the ThelianUniverse Word type for Thelian Terrain/biomes in a dedicated server.").define("use_TU_WorldType", true);
												BUILDER.pop();
												SPEC = BUILDER.build();
								}
				}
				
				
}
