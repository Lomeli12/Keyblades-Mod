package keyblades.common;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;

public class Keyblades extends ItemSword{
	protected Keyblades(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
	}
	public String getTextureFile()
	{
		return "/Keyblademod/keyblades.png";
	}
}
