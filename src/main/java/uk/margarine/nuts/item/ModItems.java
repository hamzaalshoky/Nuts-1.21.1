package uk.margarine.nuts.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.margarine.nuts.Nuts;

import static uk.margarine.nuts.Nuts.ITEMS;

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
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROASTED_PEANUTS = ITEMS.register("roasted_peanuts",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROASTED_PEANUTS)));
    public static final DeferredItem<Item> PEANUT_BUTTER_COOKIE = ITEMS.register("peanut_butter_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEANUT_BUTTER_COOKIE)));
    public static final DeferredItem<Item> PBNJ_SANDWICH = ITEMS.register("pbnj_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PBNJ_SANDWICH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
