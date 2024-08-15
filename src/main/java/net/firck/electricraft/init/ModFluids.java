package net.firck.electricraft.init;

import net.firck.electricraft.Electricraft;
import net.firck.electricraft.fluids.FluidGasBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModFluids {

    public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();

    public static final Fluid HYDROGEN = new FluidGasBase("hydrogen",
            new ResourceLocation(Electricraft.MODID, "blocks/hydrogen_still"),
            new ResourceLocation(Electricraft.MODID, "blocks/hydrogen_flow"),
            new Color(192, 192, 224, 64))
            .setTemperature(20).setDensity(-1400).setUnlocalizedName("hydrogen");

}
