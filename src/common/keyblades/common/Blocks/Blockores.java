package keyblades.common.Blocks;

import keyblades.common.Main;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Blockores extends Block {
	public Blockores(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
	public String getTextureFile()
	{
		return "/keyblades/art/blocks.png";
	}
}
