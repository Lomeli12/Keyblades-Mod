package keyblades.common;

import net.minecraft.src.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

import keyblades.client.CommonProxykeyblades;
import keyblades.common.Blocks.*;
import keyblades.common.Core.*;
import keyblades.common.Items.*;
import keyblades.common.Keyblades.*;
import keyblades.common.Network.*;
import keyblades.common.Magic.*;

@Mod(modid="KeybladesMod",name="KeybladesMod",version="0.6.8")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class Main 
{	
	@SidedProxy(clientSide="keyblades.client.ClientProxykeyblades",serverSide="keyblades.client.CommonProxykeyblades")
	public static CommonProxykeyblades proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.configure(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		RegisterItems.registerItems();
		RegisterBlocks.registerBlocks();
		RegisterKeyblades.registerKeyblades();
		
		Recipes.registerRecipes();
		
		proxy.registerRenderThings();
		
		GameRegistry.registerWorldGenerator(new OreGenerationK());
	}
}