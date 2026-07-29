package uk.margarine.nuts.events;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import uk.margarine.nuts.block.ModBlocks;

@EventBusSubscriber(modid = "nuts", value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register(
                (state, level, pos, tintIndex) -> {
                    if (level == null || pos == null) return FoliageColor.getDefaultColor();
                    return BiomeColors.getAverageFoliageColor(level, pos);
                },
                ModBlocks.HAZEL_LEAVES.get()
        );
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> FoliageColor.getDefaultColor(),
                ModBlocks.HAZEL_LEAVES
        );
    }
}