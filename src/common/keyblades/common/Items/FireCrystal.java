package keyblades.common.Items;

import keyblades.common.Magic.*;
import keyblades.common.Network.ClientMessager;
import net.minecraft.src.*;

public class FireCrystal extends Item {
	public FireCrystal(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getTextureFile()
	{
		return "/keyblades/art/items.png";
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, float teep)
	{
		FireMagic.useFireMagic(20, itemstack, world, entityplayer, teep);
		return itemstack;
	}
	public boolean hitEntity(ItemStack items, EntityLiving Living1, EntityLiving Living2)
	{
		Living1.setFire(5);
		return true;
	}
}
