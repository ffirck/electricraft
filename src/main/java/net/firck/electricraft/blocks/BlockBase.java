package net.firck.electricraft.blocks;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.init.ModBlocks;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material, CreativeTabs tab){

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels() {
        Electricraft.clientProxy.registerItemRenderer(ItemBlock.getItemFromBlock(this), 0, "inventory");
    }
}
