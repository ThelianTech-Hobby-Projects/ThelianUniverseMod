package thelianuniverse.main.core.base.baseBlock;


import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import thelianuniverse.main.util.ModData;

public abstract class baseFluidBlock extends BlockFluidClassic  {

    public baseFluidBlock(Fluid fluid, Material material) {

        super(fluid, material);
        ModData.BLOCKS.add(this);
    }


    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        return FULL_BLOCK_AABB;

    }



}
