package xyz.diabolicatrixlab.mcliferpg;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.diabolicatrixlab.mcliferpg.proxies.MinecraftLifeRPGCommon;

@Mod(modid = MinecraftLifeRPG.MODID, name = "Minecraft Life RPG", version = MinecraftLifeRPG.VERSION)
public class MinecraftLifeRPG
{
    public static final String MODID = "mcliferpg";
    public static final String VERSION = "0.1";
    
    @Instance(MinecraftLifeRPG.MODID)
    public static MinecraftLifeRPG instance;
    
    @SidedProxy(clientSide = "xyz.diabolicatrixlab.mcliferpg.proxies.MinecraftLifeRPGClient", serverSide = "xyz.diabolicatrixlab.mcliferpg.proxies.MinecraftLifeRPGServer")
    public static MinecraftLifeRPGCommon proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
