package vectorwing.blockbox.common.event;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import vectorwing.blockbox.Config;
import vectorwing.blockbox.common.registry.ModItems;

import java.util.List;

@SuppressWarnings("unused")
public class CommonEvents
{
	// TODO: Remap the following IDs:
	// clay_tiles -> tiles
	// jagged_clay_tiles -> broken_tile_mosaic

	public static void addItemsToVanillaCreativeTabs() {
		if (!Config.ADD_ITEMS_TO_VANILLA_TABS.get()) {
			return;
		}
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(event -> {
			VanillaTabOrdering.BUILDING_BLOCKS.reversed().forEach((item, startingPoint) -> event.addAfter(new ItemStack(startingPoint), List.of(new ItemStack(item.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY));
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(event -> {
			// TODO: Figure out a better way of handling the methods which organize this. Manual or automated?
//			VanillaTabOrdering.FUNCTIONAL_BLOCKS.reversed().forEach((item, startingPoint) -> {
//				event.addAfter(new ItemStack(startingPoint), new ItemStack(item.get()), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
//			});
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.ROUGH_GLASS_PANE.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.ROUGH_GLASS.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.WARPED_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.CRIMSON_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.CHERRY_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BAMBOO_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.MANGROVE_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.DARK_OAK_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.ACACIA_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.JUNGLE_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BIRCH_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.SPRUCE_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.OAK_SEAT.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.SOUL_BRAZIER.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BRAZIER.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.PINK_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.MAGENTA_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.PURPLE_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BLUE_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.LIGHT_BLUE_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.CYAN_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			;
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.GREEN_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.LIME_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.YELLOW_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.ORANGE_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.RED_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BROWN_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.BLACK_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.GRAY_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.LIGHT_GRAY_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
			event.addAfter(new ItemStack(Items.PINK_CANDLE), List.of(new ItemStack(ModItems.WHITE_SKY_LANTERN.get())), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
		});
	}
}
