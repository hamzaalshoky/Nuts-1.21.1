package uk.margarine.gone_nuts.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class FattinessEffect extends MobEffect {
    public FattinessEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        Vec3 velocity = entity.getDeltaMovement();
        entity.setDeltaMovement(velocity.x(), Math.min(0, velocity.y()), velocity.z());
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
