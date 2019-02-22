package top.byq.swordofgale.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import top.byq.swordofgale.SOGMain;

public class SwordGale extends GaleBlock {
    private static final String NAME ="sword_gale";

    public static final SwordGale instance = new SwordGale();

    public SwordGale() {
        super(Material.WOOD, NAME, SOGMain.GALE_TAB);
        setLightLevel(0.8f);
    }
}
