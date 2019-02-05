package duper.blocks;
import duper.blocks.testcontainer.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class Modblocks {
	

	@GameRegistry.ObjectHolder("duper:testcontainerblock")
    public static TestContainerBlock testContainerBlock;

	@GameRegistry.ObjectHolder("duper:thing")
	public static BlockBase thing = new BlockBase(Material.IRON, "thing", 2);
	@GameRegistry.ObjectHolder("duper:special_ore")
	public static BlockBase special_ore = new BlockBase(Material.ROCK, "special_ore", (float) 1.5);
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        

        testContainerBlock.initModel();
    }
		
}
