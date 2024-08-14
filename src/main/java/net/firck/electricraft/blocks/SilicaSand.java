package net.firck.electricraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilicaSand extends BlockFallingBase{
    public SilicaSand(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);
        setSoundType(SoundType.SAND);
        setHardness(0.5f);
        setResistance(0.6f);
        setHarvestLevel("shovel", 0);

    }



}
