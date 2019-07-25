package thelianuniverse.main.core.init;


import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import thelianuniverse.api.main.Util.Logger;


public class ThelianConfig {
				
				public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
				public static final Main main = new Main(BUILDER);
				
				public static final ForgeConfigSpec SPEC = BUILDER.build();
				
				public static class Main {
								public final ForgeConfigSpec.ConfigValue<Boolean> ThelianDebug;
								
								public final ForgeConfigSpec.ConfigValue<Boolean> loadRTG;
								
								Main(ForgeConfigSpec.Builder builder) {
												builder.push("Main");
												
												ThelianDebug = builder.comment("This is For Debugging the mod.").comment("WARNING: DO NOT TURN ON UNLESS DIRECTED TO DO IT BY A MOD DEV!").define("ThelianDebug",false);
												
												loadRTG = builder.comment("This Determines if Realistic Terrain is turned on or off.").comment("Default: True").define("loadRTG", true);
												
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
				
				public static void init() {
								
								Path configPath = FMLPaths.CONFIGDIR.get();
								Path thelianConfigPath = Paths.get(configPath.toAbsolutePath().toString(), "thelianuniverse");
								
								try {
												
												Files.createDirectory(thelianConfigPath);
												
								} catch(FileAlreadyExistsException e) {
								
								} catch(IOException e) {
												
												Logger.error("Failed to create a Config Directory");
								}
								
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, serverConfig.SPEC , "thelianuniverse/server.toml");
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThelianConfig.SPEC);
				}
}
