package net.firck.electricraft.fluids;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.init.ModBlocks;
import net.firck.electricraft.init.ModFluids;
import net.firck.electricraft.init.ModItems;
import net.firck.electricraft.util.IHasModel;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;

public class FluidGasBase extends Fluid {

    public FluidGasBase(String fluidName, ResourceLocation still, ResourceLocation flowing, Color color) {
        super(fluidName, still, flowing, color);

        setGaseous(true);

        ModFluids.FLUIDS.add(this);
    }

}
