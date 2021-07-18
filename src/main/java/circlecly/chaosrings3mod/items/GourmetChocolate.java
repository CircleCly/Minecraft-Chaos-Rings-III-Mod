package circlecly.chaosrings3mod.items;

import circlecly.chaosrings3mod.CR3CreativeTabs;
import circlecly.chaosrings3mod.util.RegistryUtil;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class GourmetChocolate extends ItemFood {

    static final int HUNGER = 1;
    static final float SATURATION = 0.0f;

    public GourmetChocolate() {
        super(HUNGER, SATURATION, false);
        RegistryUtil.setItemName(this, "gourmet_chocolate")
                .setCreativeTab(CR3CreativeTabs.CR3_FOOD);
        this.setAlwaysEdible();
        this.setPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH,1, 2),1.0F);
    }

}
