package top.byq.swordofgale.block;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import top.byq.swordofgale.SOGMain;

import javax.annotation.Nonnull;

public class GaleArmrack extends GaleBlock {
    public static final IProperty<EnumFacing> facing = PropertyEnum.create("facing", EnumFacing.class,
            EnumFacing.UP, EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.WEST, EnumFacing.EAST);

    private static final String NAME = "gale_armrack";

    public static final GaleArmrack instance = new GaleArmrack();

    public GaleArmrack() {
        super(Material.WOOD, NAME, CreativeTabs.DECORATIONS);
        setLightLevel(0.8F);

        setDefaultState(this.getBlockState().getBaseState().withProperty(facing, EnumFacing.NORTH));
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {

        System.out.println();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, facing);
    }
}
