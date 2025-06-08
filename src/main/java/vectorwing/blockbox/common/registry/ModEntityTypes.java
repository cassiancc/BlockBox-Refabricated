package vectorwing.blockbox.common.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import vectorwing.blockbox.common.entity.SeatEntity;
import vectorwing.blockbox.refabricated.RegUtils;

import java.util.function.Supplier;

public class ModEntityTypes
{

	public static final Supplier<EntityType<SeatEntity>> SEAT = RegUtils.regEntity("seat", () ->
			EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MISC)
					.sized(0.25f, 0.35f)
					.clientTrackingRange(3)
					.updateInterval(Integer.MAX_VALUE)
					.build("seat"));

	public static void register() {

	}
}
