package top.byq.swordofgale.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class CommonProxy {

    public void registerModel(Item item, int metadata, String variantIn) {
        ModelLoader.setCustomModelResourceLocation(
                item,
                metadata,
                new ModelResourceLocation(item.getRegistryName(), variantIn)
        );
    }
}
