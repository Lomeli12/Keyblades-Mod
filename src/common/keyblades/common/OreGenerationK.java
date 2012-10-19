package keyblades.common;

import java.util.Random;

import keyblades.common.Blocks.*;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerationK  implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch(world.provider.dimensionId)
		{
		case -1:generateNether(world, random, chunkX*16, chunkZ*16);
		case 0:generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}
	private void generateSurface(World world, Random random, int blockX, int blockZ)
	{
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(80);
		int Ycoordcry = random.nextInt(30);
		int YcoordOric = random.nextInt(15);
		int Zcoord = blockZ + random.nextInt(16);
		(new WorldGenMinable(RegisterBlocks.gummiOreO.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RegisterBlocks.DullCrystalore.blockID, 7)).generate(world, random, Xcoord, Ycoordcry, Zcoord);
		(new WorldGenMinable(RegisterBlocks.Orichalcumore.blockID, 3)).generate(world, random, Xcoord, YcoordOric, Zcoord);
	}
	private void generateNether(World world, Random random, int blockX, int blockY)
	{
		
	}
}
