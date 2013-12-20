package dk.philiphansen.srpmod;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SRPMod.MODID, version = SRPMod.VERSION)
public class SRPMod
{
    public static final String MODID = "SRPmod";
    public static final String VERSION = "1.0";
    public static SRPWorldGenerator worldGen = new SRPWorldGenerator();
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		GameRegistry.registerWorldGenerator(worldGen);
    }
}
