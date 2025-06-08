package vectorwing.blockbox.refabricated.integration;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiWorldInteractionRecipe;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import vectorwing.blockbox.BlockBox;
import vectorwing.blockbox.refabricated.ItemAbilities;

import java.util.List;

public class EmiIntegration implements EmiPlugin {
    @Override
    public void register(EmiRegistry emiRegistry) {
        var palisades = List.of(
        "oak_palisade",
                "spruce_palisade",
                "birch_palisade",
                "jungle_palisade",
                "acacia_palisade",
                "dark_oak_palisade",
                "mangrove_palisade",
                "cherry_palisade",
                "crimson_palisade",
                "warped_palisade",
                "stripped_oak_palisade",
                "stripped_spruce_palisade",
                "stripped_birch_palisade",
                "stripped_jungle_palisade",
                "stripped_acacia_palisade",
                "stripped_dark_oak_palisade",
                "stripped_mangrove_palisade",
                "stripped_cherry_palisade",
                "stripped_crimson_palisade",
                "stripped_warped_palisade"
        );

        for (String palisade : palisades) {
            if (!palisade.contains("stripped")) {
                emiRegistry.addRecipe(EmiWorldInteractionRecipe.builder().id(locate("/axe_stripping/"+ palisade)).leftInput(EmiStack.of(get(palisade).asItem())).rightInput(EmiIngredient.of(ItemAbilities.AXE_STRIP), true).output(EmiStack.of(get("stripped_"+palisade).asItem())).build());
            }
            emiRegistry.addRecipe(EmiWorldInteractionRecipe.builder().id(locate("/sword_carving/"+ palisade)).leftInput(EmiStack.of(get(palisade).asItem())).rightInput(EmiIngredient.of(ItemAbilities.SWORD_DIG), true).output(EmiStack.of(getSpikedPalisade(palisade).asItem())).build());
        }

    }

    private ItemLike getSpikedPalisade(String palisade) {
        var id = palisade;
        if (id.contains("stripped")) {
            id = id.replace("stripped", "stripped_spiked");
        } else {
            id = "spiked_"+palisade;
        }
        return get(id);
    }

    private ItemLike get(String id) {
        return BuiltInRegistries.BLOCK.get(locate(id));
    }

    private ResourceLocation locate(String id) {
        return ResourceLocation.fromNamespaceAndPath(BlockBox.MODID, id);
    }
}
