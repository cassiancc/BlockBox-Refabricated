package vectorwing.blockbox.client.event;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import vectorwing.blockbox.client.particle.SparkleParticle;
import vectorwing.blockbox.common.entity.SeatEntity;
import vectorwing.blockbox.common.registry.ModEntityTypes;
import vectorwing.blockbox.common.registry.ModParticleTypes;

public class ClientSetupEvents
{
	public static void registerParticles() {
		ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SPARKLE.get(), SparkleParticle.Provider::new);
	}

	public static void onRegisterRenderers() {
		EntityRendererRegistry.register(ModEntityTypes.SEAT.get(), SeatEntity.Renderer::new);
	}
}
