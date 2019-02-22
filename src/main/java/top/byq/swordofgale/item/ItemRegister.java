package top.byq.swordofgale.item;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import top.byq.swordofgale.SOGMain;

public class ItemRegister {
    private static final Item[] items = new Item[]{
            new BaseGaleSword()
    };

    @SubscribeEvent
    public void reigsterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(items);
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        for (Item item : items) {
            SOGMain.proxy.registerModel(item, 0, "inventory");
        }
    }
}
