package p142h.modLearnOne;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import p142h.modLearnOne.blocks.BlockLamp;
import p142h.modLearnOne.items.ItemMinerBag;

import static p142h.modLearnOne.CheatersBagsMod.MODID;

@Mod(modid = MODID, name = "Bags with big interface", version = "1.0")
public class CheatersBagsMod {

    public static final String MODID = "cbm";

    public static Item itemBagMiners;
    public static Block blockLampHighBrightnessSingle;
    public static Block blockLampHighBrightnessDouble;
    public static Block blockLampHighBrightnessTriple;
    public static Block blockLampMediumBrightnessSingle;
    public static Block blockLampMediumBrightnessDouble;
    public static Block blockLampMediumBrightnessTriple;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        itemBagMiners = new ItemMinerBag().setCreativeTab(cheatersBagsMod);
        blockLampHighBrightnessSingle = new BlockLamp(Material.iron, "blockLampHighBrightnessSingle",1, "high").setCreativeTab(cheatersBagsMod);;

        GameRegistry.registerItem(itemBagMiners, itemBagMiners.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockLampHighBrightnessSingle, blockLampHighBrightnessSingle.getUnlocalizedName().substring(5));
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        GameRegistry.addRecipe(new ItemStack(itemBagMiners), "S S","WWW","WWW", 'S', Items.string, 'W', Blocks.wool);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs cheatersBagsMod = new CreativeTabs("cheatersBagsMod") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(itemBagMiners).getItem();
        }
    };
}
