package circlecly.chaosrings3mod;

import circlecly.chaosrings3mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CR3CreativeTabs {

    public static final CreativeTabs CR3_FOOD = new CreativeTabs("cr3_food"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemRefs.get("cr3:chocolate"));
        }
    };
}
