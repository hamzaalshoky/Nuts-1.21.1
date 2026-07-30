package uk.margarine.gone_nuts.item;

import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.margarine.gone_nuts.Nuts;
import uk.margarine.gone_nuts.block.ModBlocks;
import uk.margarine.gone_nuts.item.custom.PeanutButterItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Nuts.MODID);

    public static final DeferredItem<Item> ALMOND = ITEMS.register("almond",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ALMOND)));
    public static final DeferredItem<Item> BISCOTTI = ITEMS.register("biscotti",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BISCOTTI)));
    public static final DeferredItem<Item> ALMOND_CROISSANT = ITEMS.register("almond_croissant",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ALMOND_CROISSANT)));
    public static final DeferredItem<Item> ALMOND_BERRY_TART = ITEMS.register("almond_berry_tart",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ALMOND_BERRY_TART)));
    public static final DeferredItem<Item> MARZIPAN = ITEMS.register("marzipan",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MARZIPAN)));
    public static final DeferredItem<Item> HAZELNUT = ITEMS.register("hazelnut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HAZELNUT)));
    public static final DeferredItem<Item> CHOCOLATE_TRUFFLE = ITEMS.register("chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HAZELNUT_TOAST = ITEMS.register("hazelnut_toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HAZELNUT_TOAST)));
    public static final DeferredItem<Item> NOUGAT = ITEMS.register("nougat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.NOUGAT)));
    public static final DeferredItem<Item> DACQUOISE = ITEMS.register("dacquoise",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DACQUOISE)));
    public static final DeferredItem<Item> PEANUT = ITEMS.register("peanut",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEANUT_SEEDS = ITEMS.register("peanut_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PEANUTS.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROASTED_PEANUTS = ITEMS.register("roasted_peanuts",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROASTED_PEANUTS)));
    public static final DeferredItem<Item> PEANUT_BUTTER = ITEMS.register("peanut_butter",
            () -> new PeanutButterItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(ModFoodProperties.PEANUT_BUTTER)));
    public static final DeferredItem<Item> PEANUT_BUTTER_JAR = ITEMS.register("peanut_butter_jar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEANUT_BUTTER_COOKIE = ITEMS.register("peanut_butter_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEANUT_BUTTER_COOKIE)));
    public static final DeferredItem<Item> PBNJ_SANDWICH = ITEMS.register("pbnj_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PBNJ_SANDWICH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
