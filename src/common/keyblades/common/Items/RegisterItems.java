package keyblades.common.Items;

import keyblades.common.Main;
import keyblades.common.Blocks.RegisterBlocks;
import net.minecraft.src.*;
import cpw.mods.fml.common.registry.*;

public class RegisterItems {
	//Potions
	public static Item eitherPotion;
	public static Item hiEither;
	public static Item megaEither;
	
	//Potion materials
	public static Item poweredDust;
	public static Item enrichedSlime;
	
	//Crafting Materials
	public static Item chains;
	public static Item gummidropO;
	public static Item hearts;
	public static Item purelightorb;
	public static Item darkorb;
	public static Item darkheart4;
	public static Item darkheart9;
	public static Item puredarknessorb;
	public static Item dullcrystal;
	public static Item densecrystal;
	public static Item twilightcrystal;
	public static Item mythrilcrystal;
	public static Item blazingcrystal;
	public static Item frostcrystal;
	public static Item lightningcrystal;
	public static Item powercrystal;
	public static Item lucidcrystal;
	public static Item mysterygoo;
	public static Item mysterypowder;
	public static Item serenitycrystal;
	public static Item Orichalcum;
	public static Item Orichalcumplus;
	
	//keychains
	public static Item KingKeyDchain;
	public static Item Olympiachain;
	public static Item Oblivionchain;
	public static Item Ladyluckchain;
	public static Item MetalChocochain;
	public static Item crabchain;
	public static Item rosechain;
	public static Item corrupt;
	public static Item lionchain;
	public static Item onewingchain;
	
	public static void registerItems()
	{
		chains = new ItemsK(1554).setIconIndex(7).setItemName("Chaink");
		LanguageRegistry.addName(chains, "Iron Chain");
		gummidropO = new ItemsK(1555).setIconIndex(0).setItemName("OGummiDrop");
		LanguageRegistry.addName(gummidropO, "Gummi Drop");
		hearts = new ItemsK(1556).setIconIndex(1).setItemName("HeartK");
		LanguageRegistry.addName(hearts, "Heart");
		purelightorb = new ItemsK(1557).setIconIndex(6).setItemName("PHeartK");
		LanguageRegistry.addName(purelightorb, "Heart of Pure Light");
		darkorb = new ItemsK(1558).setIconIndex(2).setItemName("DarkK");
		LanguageRegistry.addName(darkorb, "Essence of Darkness");
		darkheart4 = new ItemsK(1559).setIconIndex(3).setItemName("Darkh4");
		LanguageRegistry.addName(darkheart4, "Darkness; lvl 4");
		darkheart9 = new ItemsK(1560).setIconIndex(4).setItemName("Darkh9");
		LanguageRegistry.addName(darkheart9, "Darkness: lvl 9");
		puredarknessorb = new ItemsK(1561).setIconIndex(5).setItemName("Pdarkh");
		LanguageRegistry.addName(puredarknessorb, "Heart of Pure Darkness");
		dullcrystal = new ItemsK(1562).setIconIndex(10).setItemName("DCry");
		LanguageRegistry.addName(dullcrystal, "Dull Crystal");
		blazingcrystal = new FireCrystal(1563).setIconIndex(16).setItemName("Firecry");
		LanguageRegistry.addName(blazingcrystal, "Blazing Crystal");
		frostcrystal = new IceCrystal(1564).setIconIndex(15).setItemName("FrostCry");
		LanguageRegistry.addName(frostcrystal, "Frost Crystal");
		lightningcrystal = new LightningCrystal(1565).setIconIndex(17).setItemName("Lightcry");
		LanguageRegistry.addName(lightningcrystal, "Lightning Crystal");
		densecrystal = new ItemsK(1566).setIconIndex(13).setItemName("dcru");
		LanguageRegistry.addName(densecrystal, "Dense Crystal");
		twilightcrystal = new ItemsK(1567).setIconIndex(12).setItemName("Tcry");
		LanguageRegistry.addName(twilightcrystal, "Twilight Crystal");
		serenitycrystal = new ItemsK(1568).setIconIndex(11).setItemName("sercry");
		LanguageRegistry.addName(serenitycrystal, "Serenity Crystal");
		Orichalcum = new ItemsK(1571).setIconIndex(8).setItemName("OrichalcumI");
		LanguageRegistry.addName(Orichalcum, "Orichalcum");
		Orichalcumplus = new ItemsK(1572).setIconIndex(9).setItemName("OrichalcumI+");
		LanguageRegistry.addName(Orichalcumplus, "Orichalcum+");
		eitherPotion = new Either(1595, 25).setIconIndex(22).setItemName("eitherP");
		LanguageRegistry.addName(eitherPotion, "Either");
		hiEither = new Either(1596, 50).setIconIndex(23).setItemName("HiEitherP");
		LanguageRegistry.addName(hiEither, "Hi-Either");
		megaEither = new Either(1599, 150).setIconIndex(24).setItemName("MegEither");
		LanguageRegistry.addName(megaEither, "Mega-Either");
		poweredDust = new ItemsK(1597).setIconIndex(20).setItemName("pDust");
		LanguageRegistry.addName(poweredDust, "Powered Dust");
		enrichedSlime = new ItemsK(1598).setIconIndex(21).setItemName("eSlime");
		LanguageRegistry.addName(enrichedSlime, "Enriched Slime");
		
		//Keychains
		KingKeyDchain = new Keychains(1573).setIconIndex(0).setItemName("KingdomKeyDchain");
		LanguageRegistry.addName(KingKeyDchain, "Keychain: Kingdom Key D");
		Olympiachain = new Keychains(1575).setIconIndex(1).setItemName("Olympiachain");
		LanguageRegistry.addName(Olympiachain, "Keychain: Olympia");
		Oblivionchain = new Keychains(1576).setIconIndex(16).setItemName("Oblivionchain");
		LanguageRegistry.addName(Oblivionchain, "Keychain: Oblivion");
		MetalChocochain = new Keychains(1580).setIconIndex(2).setItemName("MetalChain");
		LanguageRegistry.addName(MetalChocochain, "Keychain: Metal Chocobo");
		Ladyluckchain = new Keychains(1581).setIconIndex(3).setItemName("LLuckChain");
		LanguageRegistry.addName(Ladyluckchain, "Keychain: Lady Luck");
		crabchain = new Keychains(1588).setIconIndex(4).setItemName("CCchain");
		LanguageRegistry.addName(crabchain, "Keychain: CrabClaw");
		rosechain = new Keychains(1589).setIconIndex(5).setItemName("Rosechain");
		LanguageRegistry.addName(rosechain, "Keychain: Divine Rose");
		corrupt = new Keychains(1590).setIconIndex(255).setItemName("Corruptchain");
		LanguageRegistry.addName(corrupt, "Corrupt Heart");
		lionchain = new Keychains(1592).setIconIndex(6).setItemName("Lionchain");
		LanguageRegistry.addName(lionchain, "Keychain: Lionheart");
		onewingchain = new Keychains(1594).setIconIndex(7).setItemName("WingChain");
		LanguageRegistry.addName(onewingchain, "Keychain: One-Winged Angel");
	}
}
