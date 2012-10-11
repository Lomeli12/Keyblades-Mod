package keyblades.common.Items;

import java.util.Random;

import keyblades.common.Main;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Orichalcumore extends Block {
	public Orichalcumore(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
	public String getTextureFile()
	{
		return "/Keyblademod/blocks.png";
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Main.Orichalcum.shiftedIndex;
	}
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}
