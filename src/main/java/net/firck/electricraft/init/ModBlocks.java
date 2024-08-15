package net.firck.electricraft.init;

import net.firck.electricraft.blocks.BlockFluidBase;
import net.firck.electricraft.blocks.SilicaSand;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.BlockFluidClassic;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SILICA_SAND = new SilicaSand("silica_sand", Material.SAND, CreativeTabs.BUILDING_BLOCKS);
    public static final Block HYDROGEN_BLOCK = new BlockFluidBase(ModFluids.HYDROGEN, ModMaterials.GAS_MATERIAL, "hydrogen", CreativeTabs.MISC);

}
