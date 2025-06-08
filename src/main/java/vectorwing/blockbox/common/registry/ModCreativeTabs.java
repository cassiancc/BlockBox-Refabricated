package vectorwing.blockbox.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import vectorwing.blockbox.BlockBox;
import vectorwing.blockbox.common.event.CommonEvents;
import vectorwing.blockbox.refabricated.RegUtils;

import java.util.function.Supplier;

public class ModCreativeTabs
{

	public static final Supplier<CreativeModeTab> TAB_BLOCK_BOX = RegUtils.regTab("example_tab", () -> FabricItemGroup.builder()
			.title(Component.translatable("itemGroup." + BlockBox.MODID))
			.icon(() -> ModItems.CHISELED_GOLD.get().getDefaultInstance())
			.displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
			.build());

	public static void register() {
		CommonEvents.addItemsToVanillaCreativeTabs();
	}
}
