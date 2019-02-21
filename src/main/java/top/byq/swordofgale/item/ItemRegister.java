package top.byq.swordofgale.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import top.byq.swordofgale.block.GaleArmrack;
import top.byq.swordofgale.block.GaleStoneBlock;
import top.byq.swordofgale.block.SwordGale;

public class ItemRegister {

    @SubscribeEvent
    public void reigsterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                BaseGaleSword.instance,
                GaleArmrack.instance.getItemBlock(),
                GaleStoneBlock.instance.getItemBlock(),
                SwordGale.instance.getItemBlock()
        );
    }
}
