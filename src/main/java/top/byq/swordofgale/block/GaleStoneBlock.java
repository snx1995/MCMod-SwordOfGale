package top.byq.swordofgale.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import top.byq.swordofgale.SOGMain;

public class GaleStoneBlock extends GaleBlock {
    public static final GaleStoneBlock instance = new GaleStoneBlock();
    private static final String NAME = "gale_stone";

    public GaleStoneBlock() {
        super(Material.IRON, NAME, CreativeTabs.DECORATIONS);
        setLightLevel(0.6F);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        playerIn.sendMessage(new TextComponentString("Gale stone at (" + pos.getX() + "," + pos.getY() + "," + pos.getZ()));
    }




}
