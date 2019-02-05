package duper.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	@GameRegistry.ObjectHolder("duper:thing_ingot")
	public static Itembase thing_ingot = new Itembase("thing_ingot", CreativeTabs.MATERIALS);
	
	public static ItemStack thing_ingot2 = new ItemStack(thing_ingot);
	
}
	
