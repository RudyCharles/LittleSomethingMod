package net.rudycharles.lsthmod.entity.attribute;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rudycharles.lsthmod.LittleSomethingMod;

public class ModAttribute {

    public static final DeferredRegister<Attribute> ATTRIBUTE =
            DeferredRegister.create(Registries.ATTRIBUTE, LittleSomethingMod.MODID);

    public static final Holder<Attribute> POTION_SPLASH =
            ATTRIBUTE.register("splash_radius", () ->
                    new RangedAttribute("lsthmod.splash_radius",4.0f,0f,Double.MAX_VALUE).setSyncable(true));

    public static void register(IEventBus eventBus) {
        ATTRIBUTE.register(eventBus);
    }
}
