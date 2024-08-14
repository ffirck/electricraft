package net.firck.electricraft.items;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs tab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Electricraft.clientProxy.registerItemRenderer(this, 0, "inventory");

    }
}
