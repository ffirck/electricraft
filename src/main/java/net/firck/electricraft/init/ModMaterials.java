package net.firck.electricraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

import java.util.ArrayList;
import java.util.List;

public class ModMaterials {

    public static final List<Material> MATERIALS = new ArrayList<Material>();
    public static final List<MaterialLiquid> MATERIAL_LIQUIDS = new ArrayList<MaterialLiquid>();

    public static final MaterialLiquid GAS_MATERIAL = new MaterialLiquid(MapColor.AIR);

}
