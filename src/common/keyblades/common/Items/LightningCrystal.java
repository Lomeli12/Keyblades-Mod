package keyblades.common.Items;

import net.minecraft.src.*;
import keyblades.common.Magic.*;

public class LightningCrystal extends Item {
	public LightningCrystal(int i)
	{
		super(i);
		maxStackSize = 1;
		this.setMaxDamage(10);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getTextureFile()
	{
		return "/keyblades/art/items.png";
	}
	
	 public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	 {
		 ThunderMagic.useThunder(itemstack, world, entityplayer, 15);
		 return itemstack;
	 }
}
