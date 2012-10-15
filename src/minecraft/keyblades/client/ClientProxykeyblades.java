package keyblades.client;

import keyblades.client.CommonProxykeyblades;
import keyblades.common.network.KeyBindings;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
public class ClientProxykeyblades extends CommonProxykeyblades{
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/Keyblademod/blocks.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/items.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/keyblades.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/keychains.png");
		KeyBindingRegistry.registerKeyBinding(new KeyBindings());
	}
}
