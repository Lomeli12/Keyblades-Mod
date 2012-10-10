package keyblades.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemsK extends Item {
	public ItemsK(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	public String getTextureFile()
	{
		return "/Keyblademod/items.png";
	}
}
