package dk.philiphansen.srpmod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class SRPWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		/*for (int i = 1; i <= 16; i++) {
			for (int j = 1; j <= 16; j++) {
				int coordinateX = chunkX*16 + i;
				int coordinateZ = chunkZ*16 + j;
				int coordinateY = (int)Math.round((Math.cos(Math.pow(0.01 * coordinateX, 2)) + Math.sin(Math.pow(0.01 * coordinateZ, 2))) * 32) + 64;
				world.setBlock(coordinateX, coordinateY, coordinateZ, 5);
			}
		}*/
		world.setBlock(chunkX*16 + random.nextInt(16), 100, chunkZ*16 + random.nextInt(16), 5);
	}

}
