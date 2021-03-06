package keyblades.common.Blocks;

import java.util.Random;

import keyblades.common.Items.*;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class OrichalcumOre extends Block {
	public OrichalcumOre(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
	public String getTextureFile()
	{
		return "/keyblades/art/blocks.png";
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return RegisterItems.Orichalcum.shiftedIndex;
	}
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}
