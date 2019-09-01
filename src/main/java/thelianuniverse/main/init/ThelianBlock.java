package thelianuniverse.main.init;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.registries.ForgeRegistries;

import thelianuniverse.main.core.block.base.geology.*;
import thelianuniverse.main.core.block.base.biology.*;
import thelianuniverse.main.util.ItemGroupTU.*;
import static thelianuniverse.api.main.block.TUBlocks.*;


public class ThelianBlock {
				
				protected static int groupSwitch;
				
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
								andesite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "andesite", 0);
								basalt = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "basalt", 0);
								dacite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "dacite", 0);
								diorite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "diorite", 0);
								gabbro = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "gabbro", 0);
								granite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "granite", 0);
								obsidian = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "obsidian", 0);
								pegmatite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "pegmatite", 0);
								perdotite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "perdotite", 0);
								rhyolite = registerBlock(new blockIgneous(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "rhyolite", 0);
								//Metamorphic
								anthracite = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "anthracite", 0);
								lapis_lazuli = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "lapis_lazuli", 0);
								marble = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "marble", 0);
								novaculite = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "novaculite", 0);
								quartzite = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "quartzite", 0);
								phyllite = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "phyllite", 0);
								soap_stone = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "soap_stone", 0);
								schist = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "schist", 0);
								slate = registerBlock(new blockMetamorphic(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 1.0f).sound(SoundType.STONE)), "slate", 0);
								//Sedimentary
								chert = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "chert", 0);
								coal = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "coal", 0);
								dolomite = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "dolomite", 0);
								conglomerate = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "conglomerate", 0);
								limestone = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "limestone", 0);
								sandstone = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "sandstone", 0);
								rock_salt = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "rock_salt", 0);
								siltstone = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "siltstone", 0 );
								shale = registerBlock(new blockSedimentary(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 1.0f).sound(SoundType.STONE)), "shale", 0);
								//Soil
								soil_chalky = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "chalky_soil", 0);
								soil_clay = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "clay_soil", 0);
								soil_loamy = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "loamy_soil", 0);
								soil_peat = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "peat_soil", 0);
								soil_sandy = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.SAND)), "sandy_soil", 0);
								soil_silty = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "silty_soil", 0);
								soil_top = registerBlock(new blockSoil(Block.Properties.create(Material.EARTH, MaterialColor.GRASS).hardnessAndResistance(0.5f, 1.0f).sound(SoundType.GROUND)), "topsoil", 0);
								//Ore
								ore_bauxite = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "bauxite", 0);
								ore_bismuth = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "bismite", 0);
								ore_cadmium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "greenockite", 0);
								ore_carbon = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "graphite", 0);
								ore_chromium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "chromite", 0);
								ore_cobalt = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "cobaltite", 0);
								ore_copper = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "malachite", 0);
								ore_rich_copper = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "tetrahedrite", 0);
								ore_poor_copper = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "cuprite", 0);
								ore_gold = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "gold", 0);
								ore_bog_iron = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "bogiron", 0);
								ore_hematite_iron = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "hematite", 0);
								ore_limonite_iron = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "limonite", 0);
								ore_magnetite_iron = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "magnetite", 0);
								ore_siderite_iron = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "siderite", 0);
								ore_lead = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "galena", 0);
								ore_lithium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "petalite", 0);
								ore_manganese = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "pyrolusite", 0);
								ore_mercury = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "cinnabar", 0);
								ore_molybdenum = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "molybdenite", 0);
								ore_nickel = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "ferrous", 0);
								ore_osmium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "osmium", 0);
								ore_platinum = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "platinum", 0);
								ore_silver = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "argentite", 0);
								ore_sulfur = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "sulfer", 0);
								ore_tin = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "cassiterite", 0);
								ore_titanium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "rutile", 0);
								ore_uranium = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "uraninite", 0);
								ore_zinc = registerBlock(new blockOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.0f, 1.0f).sound(SoundType.STONE)), "sphalerite", 0);
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
				
				public static Block registerBlock(Block b, String name, int itemGroup) {
								
								groupSwitch = itemGroup;
								BlockItem i = new BlockItem(b, new Item.Properties().group(setItemGroup()));
								b.setRegistryName(name);
								i.setRegistryName(name);
								ForgeRegistries.BLOCKS.register(b);
								ForgeRegistries.ITEMS.register(i);
								return b;
				}
				
}
