package vectorwing.blockbox.common.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import vectorwing.blockbox.refabricated.RegUtils;

import java.util.function.Supplier;

public class ModParticleTypes
{

	public static final Supplier<SimpleParticleType> SPARKLE = RegUtils.regParticle("sparkle",
			() -> FabricParticleTypes.simple(true));

	public static void register() {

	}
}
