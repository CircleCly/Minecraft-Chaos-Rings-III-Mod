package circlecly.chaosrings3mod.init;

import circlecly.chaosrings3mod.ChaosRings3Mod;
import circlecly.chaosrings3mod.items.Chocolate;
import circlecly.chaosrings3mod.items.GourmetChocolate;
import circlecly.chaosrings3mod.items.WhiteChocolate;
import net.minecraft.item.Item;
import java.util.*;

/**
 *  Class that holds all the item references.
 */
public class ModItems {

    public static Hashtable<String, Item> itemRefs = new Hashtable<String, Item>();

    /**
     * Preferred way of adding a new Item to itemRefs.
     * Use this method instead of directly calling itemRefs.put(str, item)
     * because it gets the registry name as specified in that specific item.
     * @param item Item to be added to refs
     */
    private static void addToRefs(Item item)
    {
        itemRefs.put(item.getRegistryName().toString(), item);
    }

    /**
     * Fills in the itemRefs array of the class so that it can be ref
     */
    public static void fillInItemRefs()
    {
        addToRefs(new Chocolate());
        addToRefs(new WhiteChocolate());
        addToRefs(new GourmetChocolate());
    }

}
