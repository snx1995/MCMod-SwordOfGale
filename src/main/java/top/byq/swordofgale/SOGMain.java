package top.byq.swordofgale;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import top.byq.swordofgale.block.BlockRegister;
import top.byq.swordofgale.block.GaleStoneBlock;
import top.byq.swordofgale.item.ItemRegister;

@Mod(modid = SOGMain.MODID, name = SOGMain.NAME, version = SOGMain.VERSION)
public class SOGMain {
    public static final String MODID = "swordofgale";
    public static final String NAME = "Sword of Gale";
    public static final String VERSION = "1.0.0";



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ItemRegister());
        MinecraftForge.EVENT_BUS.register(new BlockRegister());
//        initBlocks();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    private void initBlocks() {
        GaleStoneBlock stoneBlock = new GaleStoneBlock();
        ForgeRegistries.BLOCKS.register(stoneBlock);
        ItemBlock itemBlock = new ItemBlock(stoneBlock);
        itemBlock.setRegistryName(stoneBlock.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);
    }
}
