package net.rudycharles.lsthmod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.rudycharles.lsthmod.LittleSomethingMod;
import net.rudycharles.lsthmod.block.ModBlock;
import net.rudycharles.lsthmod.item.ModItem;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LittleSomethingMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlock.OPAL_ORE.get());
    }
    private void blockWithItem(Block blockHolder) {
        simpleBlockWithItem(blockHolder, cubeAll(blockHolder));
    }

}
