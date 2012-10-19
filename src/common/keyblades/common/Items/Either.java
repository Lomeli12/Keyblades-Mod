package keyblades.common.Items;

import keyblades.common.*;
import keyblades.common.Magic.*;

import net.minecraft.src.*;

public class Either extends ItemBucketMilk
{
	public double MPadd;
	public Either(int par1, double par) {
		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabBrewing);
		MPadd = par / 2;
	}
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	public String getTextureFile()
	{
		return "/keyblades/art/items.png";
	}
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		MPCounter.addMP(MPadd);
		ItemStack l;
		if (par3EntityPlayer.capabilities.isCreativeMode)
        {
			l = par1ItemStack;
        }else
        {
        	l = new ItemStack(Item.glassBottle, 1);
        }
		return l;
	}
}
