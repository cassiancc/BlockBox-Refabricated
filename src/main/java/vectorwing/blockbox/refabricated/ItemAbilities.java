package vectorwing.blockbox.refabricated;

import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.Holder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.function.Predicate;

public class ItemAbilities {

    //I've taken a similar approach to FDRF here - item tags are used in place of ItemAbilities, with the names retained to allow merging.

    public static final TagKey<Item> FIRESTARTER_LIGHT = ConventionalItemTags.IGNITER_TOOLS;
    public static final TagKey<Item> SHOVEL_DOUSE = ItemTags.SHOVELS;
    public static final TagKey<Item> AXE_STRIP = ItemTags.AXES;
    public static final TagKey<Item> SWORD_DIG = ItemTags.SWORDS;
}
