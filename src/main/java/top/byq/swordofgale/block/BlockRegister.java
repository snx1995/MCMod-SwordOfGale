package top.byq.swordofgale.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockRegister {
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(GaleArmrack.instance, GaleStoneBlock.instance, SwordGale.instance);
    }
}
