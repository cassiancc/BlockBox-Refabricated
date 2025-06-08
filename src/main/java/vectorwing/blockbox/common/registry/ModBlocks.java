package vectorwing.blockbox.common.registry;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.Nullable;
import vectorwing.blockbox.BlockBox;
import vectorwing.blockbox.common.block.*;
import vectorwing.blockbox.refabricated.RegUtils;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks
{

	public static final BlockBehaviour.Properties PROPERTIES_PACKED_SNOW = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(0.6F).sound(SoundType.SNOW);
	public static final BlockBehaviour.Properties PROPERTIES_PACKED_ICE = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE).strength(0.4F).requiresCorrectToolForDrops();
	public static final BlockBehaviour.Properties PROPERTIES_IRON_PLATE = BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(4.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK);
	public static final BlockBehaviour.Properties PROPERTIES_PALISADE = BlockBehaviour.Properties.of().strength(2.0F).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).ignitedByLava();
	public static final BlockBehaviour.Properties PROPERTIES_SKY_LANTERN = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.GUITAR).noOcclusion().lightLevel((state) -> 15).ignitedByLava().sound(SoundType.WOOL);

	public static final Supplier<Block> GRANITE_BRICKS = RegUtils.regBlock("granite_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE));
	public static final Supplier<Block> GRANITE_BRICK_STAIRS = RegUtils.regBlock("granite_brick_stairs", () -> stair(ModBlocks.GRANITE_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
	public static final Supplier<Block> GRANITE_BRICK_SLAB = RegUtils.regBlock("granite_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
	public static final Supplier<Block> GRANITE_BRICK_WALL = RegUtils.regBlock("granite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).forceSolidOn()));
	public static final Supplier<Block> DIORITE_BRICKS = RegUtils.regBlock("diorite_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE));
	public static final Supplier<Block> DIORITE_BRICK_STAIRS = RegUtils.regBlock("diorite_brick_stairs", () -> stair(ModBlocks.DIORITE_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
	public static final Supplier<Block> DIORITE_BRICK_SLAB = RegUtils.regBlock("diorite_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
	public static final Supplier<Block> DIORITE_BRICK_WALL = RegUtils.regBlock("diorite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).forceSolidOn()));
	public static final Supplier<Block> ANDESITE_BRICKS = RegUtils.regBlock("andesite_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE));
	public static final Supplier<Block> ANDESITE_BRICK_STAIRS = RegUtils.regBlock("andesite_brick_stairs", () -> stair(ModBlocks.ANDESITE_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
	public static final Supplier<Block> ANDESITE_BRICK_SLAB = RegUtils.regBlock("andesite_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
	public static final Supplier<Block> ANDESITE_BRICK_WALL = RegUtils.regBlock("andesite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).forceSolidOn()));

	public static final Supplier<Block> SANDSTONE_BRICKS = RegUtils.regBlock("sandstone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE));
	public static final Supplier<Block> SANDSTONE_BRICK_STAIRS = RegUtils.regBlock("sandstone_brick_stairs", () -> stair(ModBlocks.SANDSTONE_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
	public static final Supplier<Block> SANDSTONE_BRICK_SLAB = RegUtils.regBlock("sandstone_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(ModBlocks.SANDSTONE_BRICKS.get())));
	public static final Supplier<Block> RED_SANDSTONE_BRICKS = RegUtils.regBlock("red_sandstone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE));
	public static final Supplier<Block> RED_SANDSTONE_BRICK_STAIRS = RegUtils.regBlock("red_sandstone_brick_stairs", () -> stair(ModBlocks.RED_SANDSTONE_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
	public static final Supplier<Block> RED_SANDSTONE_BRICK_SLAB = RegUtils.regBlock("red_sandstone_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(ModBlocks.RED_SANDSTONE_BRICKS.get())));

	public static final Supplier<Block> TILES = RegUtils.regBlock("tiles", BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS));
	public static final Supplier<Block> TILE_STAIRS = RegUtils.regBlock("tile_stairs", () -> stair(ModBlocks.TILES.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
	public static final Supplier<Block> TILE_SLAB = RegUtils.regBlock("tile_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
	public static final Supplier<Block> BROKEN_TILE_MOSAIC = RegUtils.regBlock("broken_tile_mosaic", BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS));

	public static final Supplier<Block> PACKED_SNOW = RegUtils.regBlock("packed_snow", () -> new PackedSnowBlock(PROPERTIES_PACKED_SNOW));
	public static final Supplier<Block> CARVED_SNOW = RegUtils.regBlock("carved_snow", () -> new CarvedSnowBlock(PROPERTIES_PACKED_SNOW));
	public static final Supplier<Block> SNOW_BRICKS = RegUtils.regBlock("snow_bricks", PROPERTIES_PACKED_SNOW);
	public static final Supplier<Block> SNOW_BRICK_STAIRS = RegUtils.regBlock("snow_brick_stairs", () -> stair(ModBlocks.SNOW_BRICKS.get(), PROPERTIES_PACKED_SNOW));
	public static final Supplier<Block> SNOW_BRICK_SLAB = RegUtils.regBlock("snow_brick_slab", () -> slab(PROPERTIES_PACKED_SNOW));
	public static final Supplier<Block> SNOW_BRICK_WALL = RegUtils.regBlock("snow_brick_wall", () -> new WallBlock(PROPERTIES_PACKED_SNOW.forceSolidOn()));
	public static final Supplier<Block> POLISHED_PACKED_ICE = RegUtils.regBlock("polished_packed_ice", PROPERTIES_PACKED_ICE);
	public static final Supplier<Block> PACKED_ICE_BRICKS = RegUtils.regBlock("packed_ice_bricks", PROPERTIES_PACKED_ICE);
	public static final Supplier<Block> PACKED_ICE_BRICK_STAIRS = RegUtils.regBlock("packed_ice_brick_stairs", () -> stair(ModBlocks.PACKED_ICE_BRICKS.get(), PROPERTIES_PACKED_ICE));
	public static final Supplier<Block> PACKED_ICE_BRICK_SLAB = RegUtils.regBlock("packed_ice_brick_slab", () -> slab(PROPERTIES_PACKED_ICE));
	public static final Supplier<Block> PACKED_ICE_BRICK_WALL = RegUtils.regBlock("packed_ice_brick_wall", () -> new WallBlock(PROPERTIES_PACKED_ICE.forceSolidOn()));

	public static final Supplier<Block> POLISHED_OBSIDIAN = RegUtils.regBlock("polished_obsidian", () -> new PortalFrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));

	public static final Supplier<Block> ROUGH_GLASS = RegUtils.regBlock("rough_glass", () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
	public static final Supplier<Block> ROUGH_GLASS_PANE = RegUtils.regBlock("rough_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE)));

	public static final Supplier<Block> COPPER_BARS = RegUtils.regBlock("copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE)));
	public static final Supplier<Block> EXPOSED_COPPER_BARS = RegUtils.regBlock("exposed_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_GRATE)));
	public static final Supplier<Block> WEATHERED_COPPER_BARS = RegUtils.regBlock("weathered_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER_GRATE)));
	public static final Supplier<Block> OXIDIZED_COPPER_BARS = RegUtils.regBlock("oxidized_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER_GRATE)));
	public static final Supplier<Block> WAXED_COPPER_BARS = RegUtils.regBlock("waxed_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE)));
	public static final Supplier<Block> WAXED_EXPOSED_COPPER_BARS = RegUtils.regBlock("waxed_exposed_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_GRATE)));
	public static final Supplier<Block> WAXED_WEATHERED_COPPER_BARS = RegUtils.regBlock("waxed_weathered_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER_GRATE)));
	public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BARS = RegUtils.regBlock("waxed_oxidized_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER_GRATE)));

	public static final Supplier<Block> COPPER_PILLAR = RegUtils.regBlock("copper_pillar", () -> new WeatheringCopperPillarBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));
	public static final Supplier<Block> EXPOSED_COPPER_PILLAR = RegUtils.regBlock("exposed_copper_pillar", () -> new WeatheringCopperPillarBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER)));
	public static final Supplier<Block> WEATHERED_COPPER_PILLAR = RegUtils.regBlock("weathered_copper_pillar", () -> new WeatheringCopperPillarBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)));
	public static final Supplier<Block> OXIDIZED_COPPER_PILLAR = RegUtils.regBlock("oxidized_copper_pillar", () -> new WeatheringCopperPillarBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER)));
	public static final Supplier<Block> WAXED_COPPER_PILLAR = RegUtils.regBlock("waxed_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));
	public static final Supplier<Block> WAXED_EXPOSED_COPPER_PILLAR = RegUtils.regBlock("waxed_exposed_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER)));
	public static final Supplier<Block> WAXED_WEATHERED_COPPER_PILLAR = RegUtils.regBlock("waxed_weathered_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)));
	public static final Supplier<Block> WAXED_OXIDIZED_COPPER_PILLAR = RegUtils.regBlock("waxed_oxidized_copper_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER)));

	public static final Supplier<Block> IRON_PLATE = RegUtils.regBlock("iron_plate", PROPERTIES_IRON_PLATE);
	public static final Supplier<Block> IRON_TREAD_PLATE = RegUtils.regBlock("iron_tread_plate", PROPERTIES_IRON_PLATE);
	public static final Supplier<Block> IRON_TREAD_PLATE_STAIRS = RegUtils.regBlock("iron_tread_plate_stairs", () -> stair(ModBlocks.IRON_TREAD_PLATE.get(), PROPERTIES_IRON_PLATE));
	public static final Supplier<Block> IRON_TREAD_PLATE_SLAB = RegUtils.regBlock("iron_tread_plate_slab", () -> slab(PROPERTIES_IRON_PLATE));
	public static final Supplier<Block> CORRUGATED_IRON_PLATE = RegUtils.regBlock("corrugated_iron_plate", PROPERTIES_IRON_PLATE);
	public static final Supplier<Block> CORRUGATED_IRON_PLATE_STAIRS = RegUtils.regBlock("corrugated_iron_plate_stairs", () -> stair(ModBlocks.CORRUGATED_IRON_PLATE.get(), PROPERTIES_IRON_PLATE));
	public static final Supplier<Block> CORRUGATED_IRON_PLATE_SLAB = RegUtils.regBlock("corrugated_iron_plate_slab", () -> slab(PROPERTIES_IRON_PLATE));
	public static final Supplier<Block> IRON_PLATE_PILLAR = RegUtils.regBlock("iron_plate_pillar",
			() -> new RotatedPillarBlock(PROPERTIES_IRON_PLATE));
	public static final Supplier<Block> IRON_PLATE_DOOR = RegUtils.regBlock("iron_plate_door",
			() -> new DoorBlock(ModBlockSets.IRON_PLATE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_DOOR)));
	public static final Supplier<Block> IRON_PLATE_TRAPDOOR = RegUtils.regBlock("iron_plate_trapdoor",
			() -> new TrapDoorBlock(ModBlockSets.IRON_PLATE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_TRAPDOOR)));

	public static final Supplier<Block> CHISELED_GOLD = RegUtils.regBlock("chiseled_gold", BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));
	public static final Supplier<Block> GOLDEN_TILES = RegUtils.regBlock("golden_tiles", BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));
	public static final Supplier<Block> GOLDEN_BRICKS = RegUtils.regBlock("golden_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));
	public static final Supplier<Block> GOLDEN_BRICK_STAIRS = RegUtils.regBlock("golden_brick_stairs", () -> stair(ModBlocks.GOLDEN_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
	public static final Supplier<Block> GOLDEN_BRICK_SLAB = RegUtils.regBlock("golden_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
	public static final Supplier<Block> GOLDEN_PILLAR = RegUtils.regBlock("golden_pillar",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
	public static final Supplier<Block> GOLDEN_DOOR = RegUtils.regBlock("golden_door",
			() -> new DoorBlock(ModBlockSets.GOLD.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_DOOR)));
	public static final Supplier<Block> GOLDEN_TRAPDOOR = RegUtils.regBlock("golden_trapdoor",
			() -> new TrapDoorBlock(ModBlockSets.GOLD.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_TRAPDOOR)));
	public static final Supplier<Block> GOLDEN_BARS = RegUtils.regBlock("golden_bars",
			() -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));

	public static final Supplier<Block> POLISHED_AMETHYST = RegUtils.regBlock("polished_amethyst", BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK));
	public static final Supplier<Block> CUT_AMETHYST = RegUtils.regBlock("cut_amethyst", BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK));
	public static final Supplier<Block> CUT_AMETHYST_STAIRS = RegUtils.regBlock("cut_amethyst_stairs", () -> stair(ModBlocks.CUT_AMETHYST.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
	public static final Supplier<Block> CUT_AMETHYST_SLAB = RegUtils.regBlock("cut_amethyst_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
	public static final Supplier<Block> AMETHYST_MOSAIC = RegUtils.regBlock("amethyst_mosaic", BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK));
	public static final Supplier<Block> AMETHYST_MOSAIC_STAIRS = RegUtils.regBlock("amethyst_mosaic_stairs", () -> stair(ModBlocks.AMETHYST_MOSAIC.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
	public static final Supplier<Block> AMETHYST_MOSAIC_SLAB = RegUtils.regBlock("amethyst_mosaic_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	public static final Supplier<Block> LAPIS_LAZULI_BRICKS = RegUtils.regBlock("lapis_lazuli_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK));
	public static final Supplier<Block> LAPIS_LAZULI_BRICK_STAIRS = RegUtils.regBlock("lapis_lazuli_brick_stairs", () -> stair(ModBlocks.LAPIS_LAZULI_BRICKS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
	public static final Supplier<Block> LAPIS_LAZULI_BRICK_SLAB = RegUtils.regBlock("lapis_lazuli_brick_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
	public static final Supplier<Block> LAPIS_LAZULI_MOSAIC = RegUtils.regBlock("lapis_lazuli_mosaic", BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK));
	public static final Supplier<Block> LAPIS_LAZULI_MOSAIC_STAIRS = RegUtils.regBlock("lapis_lazuli_mosaic_stairs", () -> stair(ModBlocks.LAPIS_LAZULI_MOSAIC.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
	public static final Supplier<Block> LAPIS_LAZULI_MOSAIC_SLAB = RegUtils.regBlock("lapis_lazuli_mosaic_slab", () -> slab(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));

	public static final Supplier<Block> OAK_SEAT = RegUtils.regBlock("oak_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
	public static final Supplier<Block> SPRUCE_SEAT = RegUtils.regBlock("spruce_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
	public static final Supplier<Block> BIRCH_SEAT = RegUtils.regBlock("birch_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
	public static final Supplier<Block> JUNGLE_SEAT = RegUtils.regBlock("jungle_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
	public static final Supplier<Block> ACACIA_SEAT = RegUtils.regBlock("acacia_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
	public static final Supplier<Block> DARK_OAK_SEAT = RegUtils.regBlock("dark_oak_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
	public static final Supplier<Block> MANGROVE_SEAT = RegUtils.regBlock("mangrove_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
	public static final Supplier<Block> CHERRY_SEAT = RegUtils.regBlock("cherry_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
	public static final Supplier<Block> BAMBOO_SEAT = RegUtils.regBlock("bamboo_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
	public static final Supplier<Block> CRIMSON_SEAT = RegUtils.regBlock("crimson_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
	public static final Supplier<Block> WARPED_SEAT = RegUtils.regBlock("warped_seat", () -> new SeatBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)));

	public static final Supplier<Block> OAK_PALISADE = RegUtils.regBlock("oak_palisade", () -> palisade(ModBlocks.SPIKED_OAK_PALISADE, ModBlocks.STRIPPED_OAK_PALISADE, MapColor.WOOD));
	public static final Supplier<Block> SPIKED_OAK_PALISADE = RegUtils.regBlock("spiked_oak_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_OAK_PALISADE, MapColor.WOOD));
	public static final Supplier<Block> SPRUCE_PALISADE = RegUtils.regBlock("spruce_palisade", () -> palisade(ModBlocks.SPIKED_SPRUCE_PALISADE, ModBlocks.STRIPPED_SPRUCE_PALISADE, MapColor.PODZOL));
	public static final Supplier<Block> SPIKED_SPRUCE_PALISADE = RegUtils.regBlock("spiked_spruce_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_SPRUCE_PALISADE, MapColor.PODZOL));
	public static final Supplier<Block> BIRCH_PALISADE = RegUtils.regBlock("birch_palisade", () -> palisade(ModBlocks.SPIKED_BIRCH_PALISADE, ModBlocks.STRIPPED_BIRCH_PALISADE, MapColor.SAND));
	public static final Supplier<Block> SPIKED_BIRCH_PALISADE = RegUtils.regBlock("spiked_birch_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_BIRCH_PALISADE, MapColor.SAND));
	public static final Supplier<Block> JUNGLE_PALISADE = RegUtils.regBlock("jungle_palisade", () -> palisade(ModBlocks.SPIKED_JUNGLE_PALISADE, ModBlocks.STRIPPED_JUNGLE_PALISADE, MapColor.DIRT));
	public static final Supplier<Block> SPIKED_JUNGLE_PALISADE = RegUtils.regBlock("spiked_jungle_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_JUNGLE_PALISADE, MapColor.DIRT));
	public static final Supplier<Block> ACACIA_PALISADE = RegUtils.regBlock("acacia_palisade", () -> palisade(ModBlocks.SPIKED_ACACIA_PALISADE, ModBlocks.STRIPPED_ACACIA_PALISADE, MapColor.COLOR_ORANGE));
	public static final Supplier<Block> SPIKED_ACACIA_PALISADE = RegUtils.regBlock("spiked_acacia_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_ACACIA_PALISADE, MapColor.COLOR_ORANGE));
	public static final Supplier<Block> DARK_OAK_PALISADE = RegUtils.regBlock("dark_oak_palisade", () -> palisade(ModBlocks.SPIKED_DARK_OAK_PALISADE, ModBlocks.STRIPPED_DARK_OAK_PALISADE, MapColor.COLOR_BROWN));
	public static final Supplier<Block> SPIKED_DARK_OAK_PALISADE = RegUtils.regBlock("spiked_dark_oak_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_DARK_OAK_PALISADE, MapColor.COLOR_BROWN));
	public static final Supplier<Block> MANGROVE_PALISADE = RegUtils.regBlock("mangrove_palisade", () -> palisade(ModBlocks.SPIKED_MANGROVE_PALISADE, ModBlocks.STRIPPED_MANGROVE_PALISADE, MapColor.COLOR_RED));
	public static final Supplier<Block> SPIKED_MANGROVE_PALISADE = RegUtils.regBlock("spiked_mangrove_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_MANGROVE_PALISADE, MapColor.COLOR_RED));
	public static final Supplier<Block> CHERRY_PALISADE = RegUtils.regBlock("cherry_palisade", () -> palisade(ModBlocks.SPIKED_CHERRY_PALISADE, ModBlocks.STRIPPED_CHERRY_PALISADE, MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
	public static final Supplier<Block> SPIKED_CHERRY_PALISADE = RegUtils.regBlock("spiked_cherry_palisade", () -> spikedPalisade(ModBlocks.STRIPPED_SPIKED_CHERRY_PALISADE, MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
	public static final Supplier<Block> CRIMSON_PALISADE = RegUtils.regBlock("crimson_palisade", () -> netherPalisade(ModBlocks.SPIKED_CRIMSON_PALISADE, ModBlocks.STRIPPED_CRIMSON_PALISADE, MapColor.CRIMSON_STEM));
	public static final Supplier<Block> SPIKED_CRIMSON_PALISADE = RegUtils.regBlock("spiked_crimson_palisade", () -> netherSpikedPalisade(ModBlocks.STRIPPED_SPIKED_CRIMSON_PALISADE, MapColor.CRIMSON_STEM));
	public static final Supplier<Block> WARPED_PALISADE = RegUtils.regBlock("warped_palisade", () -> netherPalisade(ModBlocks.SPIKED_WARPED_PALISADE, ModBlocks.STRIPPED_WARPED_PALISADE, MapColor.WARPED_STEM));
	public static final Supplier<Block> SPIKED_WARPED_PALISADE = RegUtils.regBlock("spiked_warped_palisade", () -> netherSpikedPalisade(ModBlocks.STRIPPED_SPIKED_WARPED_PALISADE, MapColor.WARPED_STEM));

	public static final Supplier<Block> STRIPPED_OAK_PALISADE = RegUtils.regBlock("stripped_oak_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_OAK_PALISADE, null, MapColor.WOOD));
	public static final Supplier<Block> STRIPPED_SPIKED_OAK_PALISADE = RegUtils.regBlock("stripped_spiked_oak_palisade", () -> spikedPalisade(null, MapColor.WOOD));
	public static final Supplier<Block> STRIPPED_SPRUCE_PALISADE = RegUtils.regBlock("stripped_spruce_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_SPRUCE_PALISADE, null, MapColor.PODZOL));
	public static final Supplier<Block> STRIPPED_SPIKED_SPRUCE_PALISADE = RegUtils.regBlock("stripped_spiked_spruce_palisade", () -> spikedPalisade(null, MapColor.PODZOL));
	public static final Supplier<Block> STRIPPED_BIRCH_PALISADE = RegUtils.regBlock("stripped_birch_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_BIRCH_PALISADE, null, MapColor.SAND));
	public static final Supplier<Block> STRIPPED_SPIKED_BIRCH_PALISADE = RegUtils.regBlock("stripped_spiked_birch_palisade", () -> spikedPalisade(null, MapColor.SAND));
	public static final Supplier<Block> STRIPPED_JUNGLE_PALISADE = RegUtils.regBlock("stripped_jungle_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_JUNGLE_PALISADE, null, MapColor.DIRT));
	public static final Supplier<Block> STRIPPED_SPIKED_JUNGLE_PALISADE = RegUtils.regBlock("stripped_spiked_jungle_palisade", () -> spikedPalisade(null, MapColor.DIRT));
	public static final Supplier<Block> STRIPPED_ACACIA_PALISADE = RegUtils.regBlock("stripped_acacia_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_ACACIA_PALISADE, null, MapColor.COLOR_ORANGE));
	public static final Supplier<Block> STRIPPED_SPIKED_ACACIA_PALISADE = RegUtils.regBlock("stripped_spiked_acacia_palisade", () -> spikedPalisade(null, MapColor.COLOR_ORANGE));
	public static final Supplier<Block> STRIPPED_DARK_OAK_PALISADE = RegUtils.regBlock("stripped_dark_oak_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_DARK_OAK_PALISADE, null, MapColor.COLOR_BROWN));
	public static final Supplier<Block> STRIPPED_SPIKED_DARK_OAK_PALISADE = RegUtils.regBlock("stripped_spiked_dark_oak_palisade", () -> spikedPalisade(null, MapColor.COLOR_BROWN));
	public static final Supplier<Block> STRIPPED_MANGROVE_PALISADE = RegUtils.regBlock("stripped_mangrove_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_MANGROVE_PALISADE, null, MapColor.COLOR_RED));
	public static final Supplier<Block> STRIPPED_SPIKED_MANGROVE_PALISADE = RegUtils.regBlock("stripped_spiked_mangrove_palisade", () -> spikedPalisade(null, MapColor.COLOR_RED));
	public static final Supplier<Block> STRIPPED_CHERRY_PALISADE = RegUtils.regBlock("stripped_cherry_palisade", () -> palisade(ModBlocks.STRIPPED_SPIKED_CHERRY_PALISADE, null, MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
	public static final Supplier<Block> STRIPPED_SPIKED_CHERRY_PALISADE = RegUtils.regBlock("stripped_spiked_cherry_palisade", () -> spikedPalisade(null, MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
	public static final Supplier<Block> STRIPPED_CRIMSON_PALISADE = RegUtils.regBlock("stripped_crimson_palisade", () -> netherPalisade(ModBlocks.STRIPPED_SPIKED_CRIMSON_PALISADE, null, MapColor.CRIMSON_STEM));
	public static final Supplier<Block> STRIPPED_SPIKED_CRIMSON_PALISADE = RegUtils.regBlock("stripped_spiked_crimson_palisade", () -> netherSpikedPalisade(null, MapColor.CRIMSON_STEM));
	public static final Supplier<Block> STRIPPED_WARPED_PALISADE = RegUtils.regBlock("stripped_warped_palisade", () -> netherPalisade(ModBlocks.STRIPPED_SPIKED_WARPED_PALISADE, null, MapColor.WARPED_STEM));
	public static final Supplier<Block> STRIPPED_SPIKED_WARPED_PALISADE = RegUtils.regBlock("stripped_spiked_warped_palisade", () -> netherSpikedPalisade(null, MapColor.WARPED_STEM));


	public static final Supplier<Block> BRAZIER = RegUtils.regBlock("brazier", () ->  new BrazierBlock(1, BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)
			.lightLevel(litBlockEmission(15))
	));
	public static final Supplier<Block> SOUL_BRAZIER = RegUtils.regBlock("soul_brazier", () ->  new BrazierBlock(2, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)
			.lightLevel(litBlockEmission(10))
	));

	public static final Supplier<Block> WHITE_SKY_LANTERN = RegUtils.regBlock("white_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.SNOW)));
	public static final Supplier<Block> LIGHT_GRAY_SKY_LANTERN = RegUtils.regBlock("light_gray_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_LIGHT_GRAY)));
	public static final Supplier<Block> GRAY_SKY_LANTERN = RegUtils.regBlock("gray_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_GRAY)));
	public static final Supplier<Block> BLACK_SKY_LANTERN = RegUtils.regBlock("black_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_BLACK)));
	public static final Supplier<Block> BROWN_SKY_LANTERN = RegUtils.regBlock("brown_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_BROWN)));
	public static final Supplier<Block> RED_SKY_LANTERN = RegUtils.regBlock("red_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_RED)));
	public static final Supplier<Block> ORANGE_SKY_LANTERN = RegUtils.regBlock("orange_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_ORANGE)));
	public static final Supplier<Block> YELLOW_SKY_LANTERN = RegUtils.regBlock("yellow_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_YELLOW)));
	public static final Supplier<Block> LIME_SKY_LANTERN = RegUtils.regBlock("lime_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_LIGHT_GREEN)));
	public static final Supplier<Block> GREEN_SKY_LANTERN = RegUtils.regBlock("green_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_GREEN)));
	public static final Supplier<Block> CYAN_SKY_LANTERN = RegUtils.regBlock("cyan_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_CYAN)));
	public static final Supplier<Block> LIGHT_BLUE_SKY_LANTERN = RegUtils.regBlock("light_blue_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_LIGHT_BLUE)));
	public static final Supplier<Block> BLUE_SKY_LANTERN = RegUtils.regBlock("blue_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_BLUE)));
	public static final Supplier<Block> PURPLE_SKY_LANTERN = RegUtils.regBlock("purple_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_PURPLE)));
	public static final Supplier<Block> MAGENTA_SKY_LANTERN = RegUtils.regBlock("magenta_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_MAGENTA)));
	public static final Supplier<Block> PINK_SKY_LANTERN = RegUtils.regBlock("pink_sky_lantern", () ->  new SkyLanternBlock(PROPERTIES_SKY_LANTERN.mapColor(MapColor.COLOR_PINK)));

	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return state -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
	}

	private static Block stair(Block baseBlock, BlockBehaviour.Properties properties) {
		return new StairBlock(baseBlock.defaultBlockState(), properties);
	}

	private static Block slab(BlockBehaviour.Properties properties) {
		return new SlabBlock(properties);
	}

	private static Block palisade(Supplier<Block> spikedForm, @Nullable Supplier<Block> strippedForm, MapColor mapColor) {
		return palisade(spikedForm, strippedForm, mapColor, SoundType.WOOD);
	}

	private static Block palisade(Supplier<Block> spikedForm, @Nullable Supplier<Block> strippedForm, MapColor mapColor, SoundType soundType) {
		return new PalisadeBlock(spikedForm, strippedForm, PROPERTIES_PALISADE.mapColor(mapColor).sound(soundType).ignitedByLava());
	}

	private static Block netherPalisade(Supplier<Block> spikedForm, @Nullable Supplier<Block> strippedForm, MapColor mapColor) {
		return new PalisadeBlock(spikedForm, strippedForm, PROPERTIES_PALISADE.mapColor(mapColor).sound(SoundType.STEM));
	}

	private static Block spikedPalisade(@Nullable Supplier<Block> strippedForm, MapColor mapColor) {
		return spikedPalisade(strippedForm, mapColor, SoundType.WOOD);
	}

	private static Block spikedPalisade(@Nullable Supplier<Block> strippedForm, MapColor mapColor, SoundType soundType) {
		return new SpikedPalisadeBlock(strippedForm, PROPERTIES_PALISADE.mapColor(mapColor).sound(soundType).ignitedByLava());
	}

	private static Block netherSpikedPalisade(@Nullable Supplier<Block> strippedForm, MapColor mapColor) {
		return new SpikedPalisadeBlock(strippedForm, PROPERTIES_PALISADE.mapColor(mapColor).sound(SoundType.STEM));
	}

	public static void register() {

	}
}
