package keyblades.client;

import keyblades.client.CommonProxykeyblades;
import net.minecraftforge.client.MinecraftForgeClient;
public class ClientProxykeyblades extends CommonProxykeyblades{
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/Keyblademod/blocks.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/items.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/keyblades.png");
		MinecraftForgeClient.preloadTexture("/Keyblademod/keychains.png");
	}
}
