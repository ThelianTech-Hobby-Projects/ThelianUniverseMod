package thelianuniverse.main.init;


public class ModInit {
				
				private ModInit() {
				
				}
				
				public static void init() {
								ThelianConfig.init();
								ThelianSound.init();
								ThelianEntity.init();
								ThelianBlock.init();
								ThelianItem.init();
								ThelianBiome.init();
								
				}
}
