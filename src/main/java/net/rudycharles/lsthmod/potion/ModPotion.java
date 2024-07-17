package net.rudycharles.lsthmod.potion;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rudycharles.lsthmod.LittleSomethingMod;
import net.rudycharles.lsthmod.effect.ModEffect;

public class ModPotion {
    public static final DeferredRegister<Potion> POTION =
            DeferredRegister.create(Registries.POTION, LittleSomethingMod.MODID);

    public static final Holder<Potion> LIGHTNING_POTION =
            POTION.register("lightning_potion", () -> new Potion(new MobEffectInstance(ModEffect.CHARGED_EFFECT, 200, 1)));

    public static void register(IEventBus eventBus) {
        POTION.register(eventBus);
    }
}