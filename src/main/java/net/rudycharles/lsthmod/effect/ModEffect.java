package net.rudycharles.lsthmod.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rudycharles.lsthmod.LittleSomethingMod;

public class ModEffect {
    public static final DeferredRegister<MobEffect> MOB_EFFECT =
            DeferredRegister.create(Registries.MOB_EFFECT, LittleSomethingMod.MODID);

    public static final Holder<MobEffect> CHARGED_EFFECT =
            MOB_EFFECT.register("charged",
                    () -> new ChargedEffect(MobEffectCategory.HARMFUL, 0xc7e3ff)
            );

    public static void register(IEventBus eventBus) {
        MOB_EFFECT.register(eventBus);
    }
}
