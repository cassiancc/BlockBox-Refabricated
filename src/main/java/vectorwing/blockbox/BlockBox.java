package vectorwing.blockbox;

import com.mojang.logging.LogUtils;
import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;
import vectorwing.blockbox.common.registry.*;
import vectorwing.blockbox.refabricated.DataMaps;

public class BlockBox implements ModInitializer
{
	public static final String MODID = "blockbox";
	public static final Logger LOGGER = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		NeoForgeConfigRegistry.INSTANCE.register(MODID, ModConfig.Type.COMMON, Config.SPEC);

		ModBlocks.register();
		ModItems.register();
		ModEntityTypes.register();
		ModSounds.register();
		ModParticleTypes.register();
		ModCreativeTabs.register();

		DataMaps.register();
	}
}
