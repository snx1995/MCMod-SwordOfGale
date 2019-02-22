package top.byq.swordofgale.block;

import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockRegister {
    static {
        System.out.println("going to register block");
    }

    private static final GaleBlock[] blocks = new GaleBlock[]{
            new GaleArmrack(),
            new GaleStoneBlock(),
            new SwordGale()
    };

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public void registerBlockModels(ModelRegistryEvent event) {
        System.out.println("register block models");
        for (GaleBlock block : blocks) {
            block.registerModel();
        }
    }
}
