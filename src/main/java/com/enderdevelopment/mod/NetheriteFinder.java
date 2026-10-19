package com.enderdevelopment.mod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class NetheriteFinder {
    public static void findNetherite(Level level, BlockPos pos) {
        BlockState blockState = level.getBlockState(pos);
        if (blockState.is(Blocks.ANCIENT_DEBRIS)) {
            // Logic to handle Netherite detection
        }
    }
}