package net.rudycharles.lsthmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.rudycharles.lsthmod.LittleSomethingMod;
import net.rudycharles.lsthmod.util.ModTag;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagGenerator extends EntityTypeTagsProvider {
    public ModEntityTypeTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, LittleSomethingMod.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTag.EntityTypes.BOSS)
                .add(EntityType.ELDER_GUARDIAN,
                        EntityType.ILLUSIONER,
                        EntityType.WARDEN)
                .addTag(Tags.EntityTypes.BOSSES);
    }

    @Override
    public String getName() {
        return "Entity Types Tags";
    }
}