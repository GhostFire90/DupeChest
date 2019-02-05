package duper.items;

import duper.blocks.Modblocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(Modblocks.special_ore, ModItems.thing_ingot2, 0);
	}
}
