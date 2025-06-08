package vectorwing.blockbox;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import vectorwing.blockbox.common.registry.*;
import vectorwing.blockbox.refabricated.DataMaps;

public class BlockBox implements ModInitializer
{
	public static final String MODID = "blockbox";
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final Config CONFIG = Config.createToml(FabricLoader.getInstance().getConfigDir(), "", MODID + "-common", Config.class);

	@Override
	public void onInitialize() {

		ModBlocks.register();
		ModItems.register();
		ModEntityTypes.register();
		ModSounds.register();
		ModParticleTypes.register();
		ModCreativeTabs.register();

		DataMaps.register();
	}
}
