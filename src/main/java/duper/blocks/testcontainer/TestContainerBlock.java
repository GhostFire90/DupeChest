package duper.blocks.testcontainer;

import duper.main;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TestContainerBlock extends Block implements ITileEntityProvider {
	public EntityPlayer player;
	public boolean active;
	public static final int GUI_ID = 1;
	public TestContainerBlock() {
		super(Material.ROCK);
		
		setUnlocalizedName("testcontainerblock");
		setRegistryName("testcontainerblock");
		setHardness((float) 1.5);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TestContainerTileEntity();
	}
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(world.isRemote) {
			System.out.println("BAILING EARLY!");
			return true;
		}
		TileEntity te = world.getTileEntity(pos);
		if(!(te instanceof TestContainerTileEntity)) {
			System.out.println("NOT MY TILEENTITY!");
			return false;
			
		}
		TestContainerTileEntity myFoundTE = (TestContainerTileEntity) te;
		myFoundTE.GetInventory(player, 0);
		System.out.println("HEY,  THE GUI SHOULD OPEN!");
		player.openGui(main.instance, GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
	

}
