package duper.proxy;

import duper.blocks.Modblocks;
import duper.items.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy{
    public void preInit(FMLPreInitializationEvent e) {
        
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Modblocks.special_ore), 0, new ModelResourceLocation(Modblocks.special_ore.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Modblocks.testContainerBlock), 0, new ModelResourceLocation(Modblocks.testContainerBlock.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Modblocks.thing), 0, new ModelResourceLocation(Modblocks.thing.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(ModItems.thing_ingot, 0, new ModelResourceLocation(ModItems.thing_ingot.getRegistryName(), "inventory"));
    }
}
