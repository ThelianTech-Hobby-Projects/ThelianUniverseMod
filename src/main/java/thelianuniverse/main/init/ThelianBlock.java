package thelianuniverse.main.init;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.registries.ForgeRegistries;

import thelianuniverse.main.core.block.base.blockIgneous;
import thelianuniverse.main.util.ItemGroupTU.*;
import static thelianuniverse.api.main.block.TUBlocks.*;


public class ThelianBlock {
				
				public static int groupSwitch;
				
				public static void init() {
								
								/*
									 This is how we use the Blocks ItemGroup assignment system.
									 @param setItemGroup default = 5;
									* Accepted Parameters are 0 to 5.
									* Selecting 0 will assign the ItemGroup as Geology
									* Selecting 1 will assign the ItemGroup as Biology
									* Selecting 2 will assign the ItemGroup as Decor
									* Selecting 3 will assign the ItemGroup as Machines
									* Selecting 4 will assign the ItemGroup as Transportation
									* Selecting 5 will assign the Default ItemGroup as MiscBlocks
									*/
								
								// Lets Register Geology Blocks Here
								  //Igneous
								andesite = registerBlock();
								basalt = registerBlock();
								dacite = registerBlock();
								diorite = registerBlock();
								gabbro = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f,1.0f).sound(SoundType.STONE)), "gabbro", 0);
								granite = registerBlock();
								obsidian = registerBlock();
								pegmatite = registerBlock();
								perdotite = registerBlock();
								rhyolite = registerBlock();
								  //Metamorphic
								anthracite = registerBlock();
								lapis_lazuli = registerBlock();
								marble = registerBlock();
								novaculite = registerBlock();
								quartzite = registerBlock();
								phyllite = registerBlock();
								soap_stone = registerBlock();
								schist = registerBlock();
								slate = registerBlock();
								  //sedimentary
								
								//Lets Register Biology Blocks Here
				}
				
				public static ItemGroup setItemGroup() {
								
								switch(groupSwitch) {
												
												case 0:
																return ItemGroupGeology.instance;
												case 1:
																return ItemGroupBiology.instance;
												case 2:
																return ItemGroupDecor.instance;
												case 3:
																return ItemGroupMachines.instance;
												case 4:
																return ItemGroupTransportation.instance;
												default:
																return ItemGroupMisc.instance;
								}
				}
				
				public static Block registerBlock(Block b, String name,  int itemGroup) {
								
								groupSwitch = itemGroup;
								BlockItem i = new BlockItem(b, new Item.Properties().group(setItemGroup()));
								b.setRegistryName(name);
								i.setRegistryName(name);
								ForgeRegistries.BLOCKS.register(b);
								ForgeRegistries.ITEMS.register(i);
								return b;
				}
				
				public static Block registerBlock(Block b, BlockItem i, String name) {
								
								b.setRegistryName(name);
								ForgeRegistries.BLOCKS.register(b);
								
								if (i != null) {
												i.setRegistryName(name);
												ForgeRegistries.ITEMS.register(i);
								}
								return b;
				}
}
