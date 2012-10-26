package keyblades.common.Keyblades;

import keyblades.common.Main;
import net.minecraft.src.*;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.*;

public class RegisterKeyblades {
	static EnumToolMaterial Kingdom_key = EnumHelper.addToolMaterial("Kingdom Key", 2, 500, 7F, 3, 14);
	static EnumToolMaterial Lady_Luck = EnumHelper.addToolMaterial("LadyLuckenu", 2, 510, 7F, 6, 14);
	static EnumToolMaterial MetalChoco = EnumHelper.addToolMaterial("Metal Chobo", 2, 560, 7F, 8, 14);
	static EnumToolMaterial olympiainfo = EnumHelper.addToolMaterial("OlympiaInfo", 2, 515, 7F, 5, 14);
	static EnumToolMaterial obliv = EnumHelper.addToolMaterial("Oblivion_", 2, 600, 7F, 15, 14);
	static EnumToolMaterial crab = EnumHelper.addToolMaterial("Crabclaw", 2, 520, 7F, 4, 14);
	static EnumToolMaterial rose = EnumHelper.addToolMaterial("DivineRose", 2, 550, 7F, 4, 14);
	static EnumToolMaterial lion = EnumHelper.addToolMaterial("LionH", 2, 545, 7F, 10, 14);
	static EnumToolMaterial hop = EnumHelper.addToolMaterial("KeybladeHOP", 2, 610, 7F, 6, 14);
	static EnumToolMaterial x_blades = EnumHelper.addToolMaterial("X blade", 2, 2500, 7F, 40, 14);
	static EnumToolMaterial wingedangel = EnumHelper.addToolMaterial("OneWing", 2, 525, 7F, 5, 14);
	static EnumToolMaterial junglestar = EnumHelper.addToolMaterial("JunStar", 2, 510, 7F, 5, 14);
	static EnumToolMaterial harp = EnumHelper.addToolMaterial("Harp", 2, 525, 7F, 8, 14);
	static EnumToolMaterial spellb = EnumHelper.addToolMaterial("Binder", 2, 505, 7F, 4, 14);
	static EnumToolMaterial pumpkhead = EnumHelper.addToolMaterial("Phead", 2, 520, 7F, 7, 14);
	static EnumToolMaterial wishing = EnumHelper.addToolMaterial("3Wish", 2, 515, 7F, 6, 14);
	static EnumToolMaterial soul = EnumHelper.addToolMaterial("Soul_eater", 2, 300, 7F, 6, 14);
	
	public static Item Soul_Eater;
	public static Item KingdomKey;
	public static Item xblade;
	public static Item KingdomKeyD;
	public static Item Olympia;
	public static Item Ladyluck;
	public static Item MetalChocobo;
	public static Item Oblivion;
	public static Item DivineRose;
	public static Item Crabclaw;
	public static Item KeybladeHOP;
	public static Item LionHeart;
	public static Item OneWingAngel;
	
	public static Item xBladefrag;
	public static int xBladefragID;
	
	public static int Soul_EaterID;
	public static int KingdomKeyID;
	public static int xbladeID;
	public static int KingdomKeyDID;
	public static int OlympiaID;
	public static int LadyluckID;
	public static int MetalChocoboID;
	public static int OblivionID;
	public static int DivineRoseID;
	public static int CrabclawID;
	public static int KeybladeHOPID;
	public static int LionHeartID;
	public static int OneWingAngelID;
	public static void registerKeyblades()
	{
		//Register Keyblades
		KingdomKey  = new Keyblades(KingdomKeyID, Kingdom_key).setIconIndex(0).setItemName("Keyblade-Kingdom");
		LanguageRegistry.addName(KingdomKey, "Keyblade: Kingdom Key");
		xblade  = new Keyblades(xbladeID, x_blades).setIconIndex(16).setItemName("Keyblade-X");
		LanguageRegistry.addName(xblade, "X-blade");
		KingdomKeyD  = new Keyblades(KingdomKeyDID, Kingdom_key).setIconIndex(17).setItemName("Keyblade-KingdomD");
		LanguageRegistry.addName(KingdomKeyD, "Keyblade: Kingdom Key D");
		Olympia  = new Keyblades(OlympiaID, olympiainfo).setIconIndex(1).setItemName("Keyblade-Olympia");
		LanguageRegistry.addName(Olympia, "Keyblade: Olympia");
		Ladyluck = new Keyblades(LadyluckID, Lady_Luck).setIconIndex(3).setItemName("Keyblade-Ladyluck");
		LanguageRegistry.addName(Ladyluck, "Keyblade: Lady Luck");
		MetalChocobo = new Keyblades(MetalChocoboID, MetalChoco).setIconIndex(4).setItemName("Keyblade-Metal");
		LanguageRegistry.addName(MetalChocobo, "Keyblade: Metal Chocobo");
		Oblivion  = new Keyblades(OblivionID, obliv).setIconIndex(2).setItemName("Keyblade-Obliv");
		LanguageRegistry.addName(Oblivion, "Keyblade: Oblivion");
		DivineRose = new Keyblades(DivineRoseID, rose).setIconIndex(5).setItemName("Keyblade-DRose");
		LanguageRegistry.addName(DivineRose, "Keyblade: Divine Rose");
		Crabclaw = new Keyblades(CrabclawID, crab).setIconIndex(6).setItemName("Keyblade-Crab");
		LanguageRegistry.addName(Crabclaw, "Keyblade: CrabClaw");
		KeybladeHOP = new KeybladeHeartsofPeople(KeybladeHOPID, hop).setIconIndex(254).setItemName("Keyblade-KeyHOP");
		LanguageRegistry.addName(KeybladeHOP, "Keyblade of People's Hearts");
		LionHeart = new LionKeyblade(LionHeartID,lion).setIconIndex(7).setItemName("LionHeart");
		LanguageRegistry.addName(LionHeart, "Keyblade: Lionheart");
		OneWingAngel = new OneWingedAngel(OneWingAngelID, wingedangel).setIconIndex(8).setItemName("Keyblade-Angel");
		LanguageRegistry.addName(OneWingAngel, "Keyblade: One-Winged Angel");
		
		xBladefrag = new xBladeFragment(xBladefragID, soul).setIconIndex(0).setItemName("PieceX");
		LanguageRegistry.addName(xBladefrag, "Piece of X");

		Soul_Eater = new SoulEater(Soul_EaterID, soul).setIconIndex(255).setItemName("Soul-Eater");
		LanguageRegistry.addName(Soul_Eater, "Soul Eater");
	}
}
