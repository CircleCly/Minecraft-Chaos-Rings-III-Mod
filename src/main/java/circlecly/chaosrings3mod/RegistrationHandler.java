package circlecly.chaosrings3mod;

import circlecly.chaosrings3mod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ChaosRings3Mod.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        ModItems.fillInItemRefs();
        for (Item i : ModItems.itemRefs.values()) event.getRegistry().register(i);
    }
}
