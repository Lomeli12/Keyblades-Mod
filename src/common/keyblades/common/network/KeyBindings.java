package keyblades.common.Network;

import java.util.EnumSet;

import net.minecraft.src.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.*;

import keyblades.common.Magic.MPCounter;
import keyblades.common.Network.ClientMessager;

public class KeyBindings extends KeyHandler 
{
	 static KeyBinding magicCheck = new KeyBinding("MP", Keyboard.KEY_M);
	 
	 public KeyBindings()
	 {
	 	 super(new KeyBinding[]{magicCheck}, new boolean[]{false});
	 }
	 
	 @Override
	 public String getLabel()
	 {
		 return "keybladeKeyBindings";
	 }

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,
			boolean tickEnd, boolean isRepeat) {
		
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		ClientMessager.displayInChat("MP: " + MPCounter.MP + "/" + MPCounter.MPMax);
	}

	@Override
	public EnumSet<TickType> ticks() {
		// TODO Auto-generated method stub
		return EnumSet.of(TickType.CLIENT);
	}
}
