package top.byq.swordofgale;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import top.byq.swordofgale.block.BlockRegister;
import top.byq.swordofgale.item.BaseGaleSword;
import top.byq.swordofgale.item.ItemRegister;
import top.byq.swordofgale.proxy.CommonProxy;

@Mod(modid = SOGMain.MODID, name = SOGMain.NAME, version = SOGMain.VERSION)
public class SOGMain {
    public static final String MODID = "swordofgale";
    public static final String NAME = "Sword of Gale";
    public static final String VERSION = "1.0.0";
    private static final String SERVER_PROXY_CLASS = "top.byq.swordofgale.proxy.ServerProxy";
    private static final String CLIENT_PROXY_CLASS = "top.byq.swordofgale.proxy.ClientProxy";

    @Mod.Instance
    public static SOGMain instance = new SOGMain();

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    public static final CreativeTabs GALE_TAB = new CreativeTabs("Sword of Gale") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BaseGaleSword.instance);
        }
    };
    public static final Item.ToolMaterial BASE_SWORD_MATERIAL = EnumHelper.addToolMaterial("base_sword", 0, 1000, 15f, 15f, 1);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ItemRegister());
        MinecraftForge.EVENT_BUS.register(new BlockRegister());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
