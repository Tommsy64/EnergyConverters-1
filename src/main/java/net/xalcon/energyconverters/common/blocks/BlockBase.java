package net.xalcon.energyconverters.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.xalcon.energyconverters.EnergyConverters;

public class BlockBase extends Block
{
    protected String internalName;

    public BlockBase(Material material, String name)
    {
        super(material);
        this.internalName = name;
        setUnlocalizedName(this.internalName);
        setRegistryName(this.internalName);
        this.setHardness(2);
        this.setResistance(5);
    }

    public void registerItemModel(ItemBlock itemBlock)
    {
        EnergyConverters.Proxy.registerItemRenderer(itemBlock, 0, this.internalName);
    }
}
