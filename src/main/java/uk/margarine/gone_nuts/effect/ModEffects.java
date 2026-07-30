package uk.margarine.gone_nuts.effect;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.margarine.gone_nuts.Nuts;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, Nuts.MODID);

    public static final Holder<MobEffect> FATTINESS_EFFECT = MOB_EFFECTS.register("fattiness",
            () -> new FattinessEffect(MobEffectCategory.HARMFUL, 0xc9771d)
                    .addAttributeModifier(Attributes.GRAVITY,
                            ResourceLocation.fromNamespaceAndPath(Nuts.MODID, "fattiness"), -0.4f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
