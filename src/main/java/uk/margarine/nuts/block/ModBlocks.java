package uk.margarine.nuts.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.margarine.nuts.Nuts;
import uk.margarine.nuts.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Nuts.MODID);

    public static final DeferredBlock<Block> ALMOND_TILES = registerBlock("almond_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> ALMOND_TILE_STAIRS = registerBlock("almond_tile_stairs",
            () -> new StairBlock(ModBlocks.ALMOND_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(3)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> ALMOND_TILE_SLAB = registerBlock("almond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .strength(3)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> ALMOND_TILE_WALL = registerBlock("almond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                            .strength(3)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> HAZEL_LEAVES = registerBlock("hazel_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {

                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                public int getFireSpread(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
