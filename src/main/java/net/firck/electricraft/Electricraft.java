package net.firck.electricraft;

import net.firck.electricraft.proxy.ClientProxy;
import net.firck.electricraft.proxy.CommonProxy;
import net.firck.electricraft.world.ModWorldGen;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.XmlTransient;

@Mod(modid = Electricraft.MODID, name = Electricraft.NAME, version = Electricraft.VERSION)
public class Electricraft
{
    @Instance
    public static Electricraft instance;

    public static CommonProxy commonProxy = new CommonProxy();
    public static ClientProxy clientProxy = new ClientProxy();


    public static final String MODID = "electricraft";
    public static final String NAME = "Electricraft";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "net.firck.electricraft.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "net.firck.electricraft.proxy.CommonProxy";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        GameRegistry.registerWorldGenerator(new ModWorldGen(), 69);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
