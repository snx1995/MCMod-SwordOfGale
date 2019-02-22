package top.byq.swordofgale.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import top.byq.swordofgale.SOGMain;

public class GaleBlock extends Block {
    private String name;
    private ItemBlock itemBlock;

    public GaleBlock(Material materialIn) {
        super(materialIn);
        this.name = "gale_block";
    }

    public GaleBlock(Material materialIn, String name, CreativeTabs tab) {
        super(materialIn);
        this.name = name;
        setRegistryName(SOGMain.MODID, name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        this.itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(SOGMain.MODID, name);
    }

    public String getName() {
        return name;
    }

    public ItemBlock getItemBlock() {
        return itemBlock;
    }

    public void registerModel() {
        SOGMain.proxy.registerModel(itemBlock, 0, "inventory");
    }
}
