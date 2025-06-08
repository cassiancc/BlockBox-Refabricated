package vectorwing.blockbox.refabricated.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.portal.PortalShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import vectorwing.blockbox.common.registry.ModBlocks;

@Mixin(PortalShape.class)
public class PortalShapeMixin {
    @WrapOperation(
            method = "method_30487",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z")
    )
    private static boolean addToFrame(BlockState instance, Block block, Operation<Boolean> original) {
        if (instance.is(ModBlocks.POLISHED_OBSIDIAN.get())) {
            return true;
        } else {
            return original.call(instance, block);
        }
    }
}
