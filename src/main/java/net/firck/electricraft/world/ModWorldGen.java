package net.firck.electricraft.world;

import net.firck.electricraft.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    private WorldGenerator silica_sand;

    public ModWorldGen(){

        silica_sand = new WorldGenMinable(ModBlocks.SILICA_SAND.getDefaultState(), 32, BlockMatcher.forBlock(Blocks.SAND));

    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension()){
            case -1:
                break;
            case 0:
                generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            case 1:
                break;
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){

        generateBlock(silica_sand, world, random, chunkX, chunkZ, 50, 80, 2);

    }

    private void generateBlock(WorldGenerator gen, World world, Random random, int chunkX, int chunkZ, int minY, int maxY, int chance){

        if(minY>maxY || minY<0 || maxY>256)
            throw new IllegalArgumentException("An ore attempted to generate out of bounds.");

        int deltaY = maxY - minY + 1;

        for(int i = 0; i<chance; i++){
            int x = chunkX * 16 + random.nextInt(16);
            int y = minY + random.nextInt(deltaY);
            int z = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(x, y, z));
        }

    }

}
