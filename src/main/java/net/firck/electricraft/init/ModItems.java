package net.firck.electricraft.init;

import net.firck.electricraft.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item SILICON_DUST = new ItemBase("silicon_dust", CreativeTabs.MATERIALS);
    public static final Item SILICA_DUST = new ItemBase("silica_dust", CreativeTabs.MATERIALS);
    public static final Item MAGNESIUM_DUST = new ItemBase("magnesium_dust", CreativeTabs.MATERIALS);
    public static final Item MAGNESIA_DUST = new ItemBase("magnesia_dust", CreativeTabs.MATERIALS);

}
