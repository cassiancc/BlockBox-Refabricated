package vectorwing.blockbox.common.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import vectorwing.blockbox.BlockBox;
import vectorwing.blockbox.refabricated.RegUtils;

import java.util.function.Supplier;

public class ModSounds
{
	// Stove
	public static final Supplier<SoundEvent> ITEM_SWORD_CARVE = RegUtils.regSound("item.sword.carve",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(BlockBox.MODID, "item.sword.carve")));

	public static void register() {

	}
}
