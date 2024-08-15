package net.firck.electricraft.util.handlers;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.blocks.BlockFallingBase;
import net.firck.electricraft.blocks.BlockFluidBase;
import net.firck.electricraft.init.ModFluids;
import net.firck.electricraft.init.ModBlocks;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> i){

        i.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> b){

        b.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent e){

        RenderHandler.registerCustomMeshesAndStates(new ResourceLocation(Electricraft.MODID, "hydrogen"), ModBlocks.HYDROGEN_BLOCK);


        for(Item i : ModItems.ITEMS){
            if(i instanceof IHasModel)
                ((IHasModel)i).registerModels();
        }

        for(Block b : ModBlocks.BLOCKS){
            if(b instanceof IHasModel)
                ((IHasModel)b).registerModels();
        }

    }

}
