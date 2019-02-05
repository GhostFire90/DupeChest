package duper.proxy;


import duper.main;
import duper.blocks.Modblocks;
import duper.blocks.testcontainer.TestContainerBlock;
import duper.blocks.testcontainer.TestContainerTileEntity;
import duper.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }



    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	GameRegistry.registerTileEntity(TestContainerTileEntity.class, new ResourceLocation(main.MODID, "testc"));
    	event.getRegistry().register(new TestContainerBlock());
    	event.getRegistry().register(Modblocks.thing);
    	event.getRegistry().register(Modblocks.special_ore);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new ItemBlock(Modblocks.special_ore).setRegistryName(Modblocks.special_ore.getRegistryName()));
    	event.getRegistry().register(ModItems.thing_ingot);
    	event.getRegistry().register(new ItemBlock(Modblocks.testContainerBlock).setRegistryName(Modblocks.testContainerBlock.getRegistryName()));
    	event.getRegistry().register(new ItemBlock(Modblocks.thing).setRegistryName(Modblocks.thing.getRegistryName()));
    }
    public void init(FMLInitializationEvent e) {
        NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new GuiProxy());
    }
}



		



