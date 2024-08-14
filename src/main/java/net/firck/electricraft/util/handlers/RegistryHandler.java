package net.firck.electricraft.util.handlers;

import net.firck.electricraft.init.ModBlocks;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> e){

        e.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> e){

        e.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));

    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent e){

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
