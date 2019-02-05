package duper.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Itembase extends Item{
	
	public Itembase(String name, CreativeTabs tab) {
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(tab);
	}

}
