package net.firck.electricraft.blocks;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.init.ModBlocks;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.firck.electricraft.util.handlers.RenderHandler;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidBase extends BlockFluidClassic {
    public BlockFluidBase(Fluid fluid, Material material, String name, CreativeTabs tab) {
        super(fluid, material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {

        return EnumBlockRenderType.MODEL;
    }

}
