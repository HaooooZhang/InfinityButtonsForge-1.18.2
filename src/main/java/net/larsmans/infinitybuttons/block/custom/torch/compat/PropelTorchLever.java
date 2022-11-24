package net.larsmans.infinitybuttons.block.custom.torch.compat;

import net.larsmans.infinitybuttons.block.custom.torch.TorchLever;
import net.larsmans.infinitybuttons.item.InfinityButtonsItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;
import java.util.Random;

public class PropelTorchLever extends TorchLever {
    public PropelTorchLever(Properties properties) {
        super(properties, ParticleTypes.FLAME);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return List.of(new ItemStack(InfinityButtonsItems.PROPELPLANT_TORCH_LEVER.get()));
    }
}