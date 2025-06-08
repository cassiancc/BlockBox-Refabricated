package vectorwing.blockbox.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import vectorwing.blockbox.client.event.ClientSetupEvents;
import vectorwing.blockbox.common.registry.ModBlocks;

public class BlockBoxClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSetupEvents.registerParticles();
        ClientSetupEvents.onRegisterRenderers();
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                ModBlocks.COPPER_BARS.get(),
                ModBlocks.EXPOSED_COPPER_BARS.get(),
                ModBlocks.WEATHERED_COPPER_BARS.get(),
                ModBlocks.OXIDIZED_COPPER_BARS.get(),
                ModBlocks.WAXED_COPPER_BARS.get(),
                ModBlocks.WAXED_EXPOSED_COPPER_BARS.get(),
                ModBlocks.WAXED_WEATHERED_COPPER_BARS.get(),
                ModBlocks.WAXED_OXIDIZED_COPPER_BARS.get(),
                ModBlocks.GOLDEN_BARS.get(),
                ModBlocks.BRAZIER.get(),
                ModBlocks.SOUL_BRAZIER.get(),

                ModBlocks.SPIKED_ACACIA_PALISADE.get(),
                ModBlocks.SPIKED_BIRCH_PALISADE.get(),
                ModBlocks.SPIKED_CHERRY_PALISADE.get(),
                ModBlocks.SPIKED_CRIMSON_PALISADE.get(),
                ModBlocks.SPIKED_JUNGLE_PALISADE.get(),
                ModBlocks.SPIKED_DARK_OAK_PALISADE.get(),
                ModBlocks.SPIKED_WARPED_PALISADE.get(),
                ModBlocks.SPIKED_SPRUCE_PALISADE.get(),
                ModBlocks.SPIKED_OAK_PALISADE.get(),
                ModBlocks.SPIKED_MANGROVE_PALISADE.get(),

                ModBlocks.STRIPPED_SPIKED_ACACIA_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_BIRCH_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_CHERRY_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_CRIMSON_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_JUNGLE_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_DARK_OAK_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_WARPED_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_SPRUCE_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_OAK_PALISADE.get(),
                ModBlocks.STRIPPED_SPIKED_MANGROVE_PALISADE.get(),

                ModBlocks.GOLDEN_TRAPDOOR.get(),
                ModBlocks.IRON_PLATE_TRAPDOOR.get(),
                ModBlocks.IRON_PLATE_DOOR.get(),

                ModBlocks.WHITE_SKY_LANTERN.get(),
                ModBlocks.LIGHT_GRAY_SKY_LANTERN.get(),
                ModBlocks.GRAY_SKY_LANTERN.get(),
                ModBlocks.BLACK_SKY_LANTERN.get(),
                ModBlocks.BROWN_SKY_LANTERN.get(),
                ModBlocks.RED_SKY_LANTERN.get(),
                ModBlocks.ORANGE_SKY_LANTERN.get(),
                ModBlocks.YELLOW_SKY_LANTERN.get(),
                ModBlocks.LIME_SKY_LANTERN.get(),
                ModBlocks.GREEN_SKY_LANTERN.get(),
                ModBlocks.CYAN_SKY_LANTERN.get(),
                ModBlocks.LIGHT_BLUE_SKY_LANTERN.get(),
                ModBlocks.BLUE_SKY_LANTERN.get(),
                ModBlocks.PURPLE_SKY_LANTERN.get(),
                ModBlocks.MAGENTA_SKY_LANTERN.get(),
                ModBlocks.PINK_SKY_LANTERN.get()
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(),
                ModBlocks.ROUGH_GLASS.get(),
                ModBlocks.ROUGH_GLASS_PANE.get()
        );

    }
}
