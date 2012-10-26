package keyblades.common.Keyblades;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;

public class xBladeFragment extends ItemSword{
	public xBladeFragment(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
	}
	public String getTextureFile()
	{
		return "/keyblades/art/keyblades.png";
	}
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
}
