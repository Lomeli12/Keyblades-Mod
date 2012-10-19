package keyblades.common.Keyblades;

import net.minecraft.src.*;
//import net.minecraft.src.Block;
//import net.minecraft.src.EntityLiving;
//import net.minecraft.src.EntityPlayer;
//import net.minecraft.src.PotionEffect;
//import net.minecraft.src.EnumToolMaterial;
//import net.minecraft.src.ItemStack;
//import net.minecraft.src.ItemSword;
//import net.minecraft.src.World;

import keyblades.common.Magic.*;

public class OneWingedAngel extends ItemSword
{
	public float teep;
	public OneWingedAngel(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
	}
	public String getTextureFile()
	{
		return "/keyblades/art/keyblades.png";
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
	    FireMagic.placeFireBlock(2, par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, teep);
		return true;
	}
	
	public boolean hitEntity(ItemStack items, EntityLiving Living1, EntityLiving Living2)
	{
		Living1.setFire(2);
		return true;
	}
}
