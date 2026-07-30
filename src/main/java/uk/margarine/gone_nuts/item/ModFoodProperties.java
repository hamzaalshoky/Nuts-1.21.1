package uk.margarine.gone_nuts.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import uk.margarine.gone_nuts.effect.FattinessEffect;
import uk.margarine.gone_nuts.effect.ModEffects;

public class ModFoodProperties {
    public static final FoodProperties ALMOND = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodProperties HAZELNUT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodProperties BISCOTTI = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final FoodProperties ALMOND_CROISSANT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties ALMOND_BERRY_TART = new FoodProperties.Builder().nutrition(5).saturationModifier(0.50f).build();
    public static final FoodProperties MARZIPAN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.52f).build();
    public static final FoodProperties CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).fast().build();
    public static final FoodProperties HAZELNUT_TOAST = new FoodProperties.Builder().nutrition(4).saturationModifier(0.45f).build();
    public static final FoodProperties NOUGAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.50f).build();
    public static final FoodProperties DACQUOISE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.54f).build();
    public static final FoodProperties ROASTED_PEANUTS = new FoodProperties.Builder().nutrition(1).saturationModifier(1f).fast().build();
    public static final FoodProperties PEANUT_BUTTER = new FoodProperties.Builder().nutrition(5).saturationModifier(0.52f).effect(new MobEffectInstance(ModEffects.FATTINESS_EFFECT,100, 0), 1).build();
    public static final FoodProperties PEANUT_BUTTER_COOKIE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties PBNJ_SANDWICH = new FoodProperties.Builder().nutrition(7).saturationModifier(0.58f).effect(new MobEffectInstance(ModEffects.FATTINESS_EFFECT,200, 0), 1).build();
}
