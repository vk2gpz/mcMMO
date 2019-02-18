package com.gmail.nossr50.core.runnables.skills;


import com.gmail.nossr50.core.mcmmo.block.BlockState;

public class HerbalismBlockUpdaterTask extends BukkitRunnable {
    private BlockState blockState;

    public HerbalismBlockUpdaterTask(BlockState blockState) {
        this.blockState = blockState;
    }

    @Override
    public void run() {
        blockState.update(true);
    }
}