package top.byq.swordofgale.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import top.byq.swordofgale.SOGMain;

public class BaseGaleSword extends ItemSword {
    public static final String NAME = "base_sword";
    public static final BaseGaleSword instance = new BaseGaleSword();

    public BaseGaleSword() {
        super(ToolMaterial.DIAMOND);
        setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName("swordofgale", "base_sword");
        setUnlocalizedName("base_sword");
    }


}
