package dev.sebastianb.wackyvessels.entity.vessels;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashSet;

public class SubmarineVesselEntity extends AbstractVesselEntity {

    public SubmarineVesselEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }


}