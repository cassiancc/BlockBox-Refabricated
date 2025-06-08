package vectorwing.blockbox;

import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.SerializedName;

public class Config extends WrappedConfig
{

	@Comment("Should the items from this mod be organized within vanilla tabs? They will be placed together with similar block sets.")
	@SerializedName("addItemsToVanillaTabs")
	public boolean ADD_ITEMS_TO_VANILLA_TABS = true;

}
