package net.firck.electricraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Magnesite extends ItemBase{
    public Magnesite(String name, CreativeTabs tab) {
        super(name, tab);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add("MgCO3");
    }

}
