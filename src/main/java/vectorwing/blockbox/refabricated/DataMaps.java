package vectorwing.blockbox.refabricated;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.world.level.block.Block;
import vectorwing.blockbox.common.registry.ModBlocks;
import vectorwing.blockbox.common.tag.ModTags;

import java.util.function.Supplier;

public class DataMaps {

    // Fabric replacements for NeoForge data maps.
    public static void register() {
        FuelRegistry.INSTANCE.add(ModTags.PALISADE_ITEMS, 150);
        FuelRegistry.INSTANCE.add(ModTags.SPIKED_PALISADE_ITEMS, 150);
        FuelRegistry.INSTANCE.add(ModTags.WOODEN_SEAT_ITEMS, 200);

        oxi(ModBlocks.COPPER_BARS, ModBlocks.EXPOSED_COPPER_BARS);
        oxi(ModBlocks.EXPOSED_COPPER_BARS, ModBlocks.WEATHERED_COPPER_BARS);
        oxi(ModBlocks.WEATHERED_COPPER_BARS, ModBlocks.OXIDIZED_COPPER_BARS);

        oxi(ModBlocks.COPPER_PILLAR, ModBlocks.EXPOSED_COPPER_PILLAR);
        oxi(ModBlocks.EXPOSED_COPPER_PILLAR, ModBlocks.WEATHERED_COPPER_PILLAR);
        oxi(ModBlocks.WEATHERED_COPPER_PILLAR, ModBlocks.OXIDIZED_COPPER_PILLAR);

        wax(ModBlocks.COPPER_BARS, ModBlocks.WAXED_COPPER_BARS);
        wax(ModBlocks.EXPOSED_COPPER_BARS, ModBlocks.WAXED_EXPOSED_COPPER_BARS);
        wax(ModBlocks.WEATHERED_COPPER_BARS, ModBlocks.WAXED_WEATHERED_COPPER_BARS);
        wax(ModBlocks.OXIDIZED_COPPER_BARS, ModBlocks.WAXED_OXIDIZED_COPPER_BARS);

        wax(ModBlocks.COPPER_PILLAR, ModBlocks.WAXED_COPPER_PILLAR);
        wax(ModBlocks.EXPOSED_COPPER_PILLAR, ModBlocks.WAXED_EXPOSED_COPPER_PILLAR);
        wax(ModBlocks.WEATHERED_COPPER_PILLAR, ModBlocks.WAXED_WEATHERED_COPPER_PILLAR);
        wax(ModBlocks.OXIDIZED_COPPER_PILLAR, ModBlocks.WAXED_OXIDIZED_COPPER_PILLAR);
    }

    private static void oxi(Supplier<Block> less, Supplier<Block> more) {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(less.get(), more.get());
    }

    private static void wax(Supplier<Block> unwaxed, Supplier<Block> waxed) {
        OxidizableBlocksRegistry.registerWaxableBlockPair(unwaxed.get(), waxed.get());
    }
}
