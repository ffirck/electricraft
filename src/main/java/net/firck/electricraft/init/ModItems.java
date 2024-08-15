package net.firck.electricraft.init;

import net.firck.electricraft.items.*;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item SILICON_DUST = new SiliconDust("silicon_dust", CreativeTabs.MATERIALS);
    public static final Item SILICA_DUST = new SilicaDust("silica_dust", CreativeTabs.MATERIALS);
    public static final Item MAGNESIUM_DUST = new MagnesiumDust("magnesium_dust", CreativeTabs.MATERIALS);
    public static final Item MAGNESIA_DUST = new MagnesiaDust("magnesia_dust", CreativeTabs.MATERIALS);

}
