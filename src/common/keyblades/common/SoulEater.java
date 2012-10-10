package keyblades.common;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;

public class SoulEater extends ItemSword{
	protected SoulEater(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
	}
	public String getTextureFile()
	{
		return "/Keyblademod/keyblades.png";
	}
	public boolean hitEntity(ItemStack items, EntityLiving Living1, EntityLiving Living2)
	{
		Living1.addPotionEffect(new PotionEffect(19, 40, 2));
		return true;
	}
}
