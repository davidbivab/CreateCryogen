package net.davids.createcryogen.items;
import com.momosoftworks.coldsweat.api.temperature.block_temp.BlockTemp;
import com.momosoftworks.coldsweat.util.math.CSMath;
import com.simibubi.create.AllBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

public class SomeBlock extends BlockTemp {
    public SomeBlock(){
        super(AllBlocks.FLUID_PIPE.getDefaultState().getBlock());
    }

    @Override
    public Set<Block> getAffectedBlocks() {
        return super.getAffectedBlocks();
    }

    @Override
    public double getTemperature(Level level, LivingEntity livingEntity, BlockState blockState, BlockPos blockPos, double v) {
        return CSMath.blend(10, 100, v, 0.5, 7);
    }

}
