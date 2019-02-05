package duper;

import duper.items.ModRecipes;
import duper.proxy.ClientProxy;
import duper.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = main.MODID, name = main.MODNAME, version = main.MODVERSION, dependencies = "", useMetadata = true)
public class main {
	public static final String MODID = "duper";
    public static final String MODNAME = "DupeChest";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "duper.proxy.ClientProxy", serverSide = "duper.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static main instance;

    public static org.apache.logging.log4j.Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        ModRecipes.init();
       
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}

