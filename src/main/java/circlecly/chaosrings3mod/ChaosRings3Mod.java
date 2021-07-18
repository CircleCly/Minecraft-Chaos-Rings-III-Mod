package circlecly.chaosrings3mod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ChaosRings3Mod.MODID, name = ChaosRings3Mod.NAME,
        version = ChaosRings3Mod.VERSION, acceptedMinecraftVersions = ChaosRings3Mod.MC_VERSION)
public class ChaosRings3Mod {

    public static final String MODID = "cr3";
    public static final String NAME = "Chaos Rings 3 Mod";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(ChaosRings3Mod.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(ChaosRings3Mod.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
