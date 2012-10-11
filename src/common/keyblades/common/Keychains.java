package keyblades.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class Keychains extends Item {
	public Keychains(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getTextureFile()
	{
		return "/Keyblademod/keychains.png";
	}
}