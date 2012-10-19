package keyblades.common.Network;

import java.util.EnumSet;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientMessager 
{
	public static void displayInChat(String e)
	{
		FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("KeybladeMod: " + e);
	}
}