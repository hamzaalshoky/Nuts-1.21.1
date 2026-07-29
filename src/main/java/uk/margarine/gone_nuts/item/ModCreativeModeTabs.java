package uk.margarine.gone_nuts.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.margarine.gone_nuts.Nuts;
import uk.margarine.gone_nuts.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Nuts.MODID);

    public static final Supplier<CreativeModeTab> NUTS_TABS = CREATIVE_MODE_TAB.register("nuts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALMOND.get()))
                    .title(Component.translatable("creativetab.gone_nuts.nuts"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALMOND);
                        output.accept(ModBlocks.ALMOND_TILES);
                        output.accept(ModBlocks.ALMOND_TILE_STAIRS);
                        output.accept(ModBlocks.ALMOND_TILE_SLAB);
                        output.accept(ModBlocks.ALMOND_TILE_WALL);
                        output.accept(ModItems.BISCOTTI);
                        output.accept(ModItems.ALMOND_CROISSANT);
                        output.accept(ModItems.ALMOND_BERRY_TART);
                        output.accept(ModItems.MARZIPAN);
                        output.accept(ModBlocks.HAZEL_LEAVES);
                        output.accept(ModItems.HAZELNUT);
                        output.accept(ModItems.CHOCOLATE_TRUFFLE);
                        output.accept(ModItems.HAZELNUT_TOAST);
                        output.accept(ModItems.NOUGAT);
                        output.accept(ModItems.DACQUOISE);
                        output.accept(ModItems.PEANUT_SEEDS);
                        output.accept(ModItems.PEANUT);
                        output.accept(ModItems.ROASTED_PEANUTS);
                        output.accept(ModItems.PEANUT_BUTTER_COOKIE);
                        output.accept(ModItems.PBNJ_SANDWICH);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
