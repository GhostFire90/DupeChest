package duper.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block{
	public BlockBase(Material mat, String name, float x) {
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(x);
		
	}


}
