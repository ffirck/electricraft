package net.firck.electricraft.blocks;

import net.firck.electricraft.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class MagnesiteOre extends BlockBase{
    public MagnesiteOre(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);
        setSoundType(SoundType.STONE);
        setHardness(3f);
        setResistance(3f);
        setHarvestLevel("pickaxe", 2);

    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.MAGNESITE;
    }

    @Override
    public int quantityDropped(Random rand){
        return rand.nextInt(3) + 1;
    }

}
