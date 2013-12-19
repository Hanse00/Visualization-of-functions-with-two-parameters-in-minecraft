package dk.philiphansen.srpmod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class SRPWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		for (int i = 1; i <= 16; i++) {
			for (int j = 1; j <= 16; j++) {
				world.setBlock(chunkX*16 + i, 64, chunkZ*16 + j, 5);
			}
		}
	}

}
