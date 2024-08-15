package net.firck.electricraft.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {

    public static void registerCustomMeshesAndStates(ResourceLocation registryName, Block b) {

        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(b), stack -> new ModelResourceLocation(registryName, "fluid"));

        ModelLoader.setCustomStateMapper(b, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {

                return new ModelResourceLocation(registryName, "fluid");
            }
        });
    }

}