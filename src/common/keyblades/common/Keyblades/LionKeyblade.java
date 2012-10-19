package keyblades.common.Keyblades;

import keyblades.common.Magic.*;
import keyblades.common.Network.ClientMessager;

import net.minecraft.src.*;

public class LionKeyblade extends ItemSword
{
	public float teep;
	public LionKeyblade(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
	}
	public String getTextureFile()
	{
		return "/keyblades/art/keyblades.png";
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		teep = itemRand.nextFloat();
		FireMagic.useFireMagic(20, itemstack, world, entityplayer, teep);
		return itemstack;
    }
	public boolean hitEntity(ItemStack items, EntityLiving Living1, EntityLiving Living2)
	{
		Living1.setFire(5);
		return true;
	}
}
