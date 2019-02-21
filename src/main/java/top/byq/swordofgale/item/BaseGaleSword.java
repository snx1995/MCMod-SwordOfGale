package top.byq.swordofgale.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import top.byq.swordofgale.SOGMain;

public class BaseGaleSword extends ItemSword {
    private static final String NAME = "base_sword";
    public static final BaseGaleSword instance = new BaseGaleSword();

    public BaseGaleSword() {
        super(ToolMaterial.DIAMOND);
        setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName(SOGMain.MODID, NAME);
        setUnlocalizedName(NAME);

        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(SOGMain.MODID + ":" + NAME, "inventory");
        ModelLoader.setCustomModelResourceLocation(this, 0, modelResourceLocation);
    }
}
