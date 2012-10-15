package keyblades.common.network;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.TickType;

public class ClientMessager {
	
	public static void showInChat(String e)
	{	
		if(FMLClientHandler.instance().getClient().currentScreen == null)
		{
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(e);
		}
	}
}
