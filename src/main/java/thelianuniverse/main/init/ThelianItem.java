package thelianuniverse.main.init;


import net.minecraft.item.Item;
import thelianuniverse.api.main.registry.ItemRegisterer;

import static thelianuniverse.api.main.item.TUItems.logo;

public class ThelianItem extends ItemRegisterer {

    public static void init() {

        logo = registerItemNoGroup(new Item(new Item.Properties()), "logo");

    }
}
