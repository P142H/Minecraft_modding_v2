package p142h.modLearnOne.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import p142h.modLearnOne.CheatersBagsMod;

public class BlockLamp extends Block {

    protected BlockLamp(Material material) {
        super(material);
    }

    public BlockLamp(Material material, String name, int size, String brightness) {
        super(material);
        if (size == 1) {
            if ("high".equals(brightness)) {
                // SingleHigh
                this.setUnlocalizedName(name);
                this.setTextureName(CheatersBagsMod.MODID+ ":blockLampSingle");
                this.setLightLevel(1);
                this.setLightOpacity(1);
            } else if ("medium".equals(brightness)) {
                // SingleMedium
            } else{
                //SingleLow
            }
        } else if (size == 2) {
            if ("high".equals(brightness)) {
                // SingleHigh
            } else if ("medium".equals(brightness)) {
                // SingleMedium
            } else{
                //SingleLow
            }
        } else {
            if ("high".equals(brightness)) {
                // SingleHigh
            } else if ("medium".equals(brightness)) {
                // SingleMedium
            } else{
                //SingleLow
            }
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 2;
    }
}
