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
	public static int eitherPotionID;
	public static int hiEitherID;
	public static int megaEitherID;
	
	//Potion materials
	public static Item poweredDust;
	public static Item enrichedSlime;
	public static int poweredDustID;
	public static int enrichedSlimeID;
	
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
	public static int chainsID;
	public static int gummidropOID;
	public static int heartsID;
	public static int purelightorbID;
	public static int darkorbID;
	public static int darkheart4ID;
	public static int darkheart9ID;
	public static int puredarknessorbID;
	public static int dullcrystalID;
	public static int densecrystalID;
	public static int twilightcrystalID;
	public static int mythrilcrystalID;
	public static int blazingcrystalID;
	public static int frostcrystalID;
	public static int lightningcrystalID;
	public static int powercrystalID;
	public static int lucidcrystalID;
	public static int mysterygooID;
	public static int mysterypowderID;
	public static int serenitycrystalID;
	public static int OrichalcumID;
	public static int OrichalcumplusID;
	
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
	public static int KingKeyDchainID;
	public static int OlympiachainID;
	public static int OblivionchainID;
	public static int LadyluckchainID;
	public static int MetalChocochainID;
	public static int crabchainID;
	public static int rosechainID;
	public static int corruptID;
	public static int lionchainID;
	public static int onewingchainID;
	
	public static void registerItems()
	{
		chains = new ItemsK(chainsID).setIconIndex(7).setItemName("Chaink");
		LanguageRegistry.addName(chains, "Iron Chain");
		gummidropO = new ItemsK(gummidropOID).setIconIndex(0).setItemName("OGummiDrop");
		LanguageRegistry.addName(gummidropO, "Gummi Drop");
		hearts = new ItemsK(heartsID).setIconIndex(1).setItemName("HeartK");
		LanguageRegistry.addName(hearts, "Heart");
		purelightorb = new ItemsK(purelightorbID).setIconIndex(6).setItemName("PHeartK");
		LanguageRegistry.addName(purelightorb, "Heart of Pure Light");
		darkorb = new ItemsK(darkorbID).setIconIndex(2).setItemName("DarkK");
		LanguageRegistry.addName(darkorb, "Essence of Darkness");
		darkheart4 = new ItemsK(darkheart4ID).setIconIndex(3).setItemName("Darkh4");
		LanguageRegistry.addName(darkheart4, "Darkness; lvl 4");
		darkheart9 = new ItemsK(darkheart9ID).setIconIndex(4).setItemName("Darkh9");
		LanguageRegistry.addName(darkheart9, "Darkness: lvl 9");
		puredarknessorb = new ItemsK(puredarknessorbID).setIconIndex(5).setItemName("Pdarkh");
		LanguageRegistry.addName(puredarknessorb, "Heart of Pure Darkness");
		dullcrystal = new ItemsK(dullcrystalID).setIconIndex(10).setItemName("DCry");
		LanguageRegistry.addName(dullcrystal, "Dull Crystal");
		blazingcrystal = new FireCrystal(blazingcrystalID).setIconIndex(16).setItemName("Firecry");
		LanguageRegistry.addName(blazingcrystal, "Blazing Crystal");
		frostcrystal = new IceCrystal(frostcrystalID).setIconIndex(15).setItemName("FrostCry");
		LanguageRegistry.addName(frostcrystal, "Frost Crystal");
		lightningcrystal = new LightningCrystal(lightningcrystalID).setIconIndex(17).setItemName("Lightcry");
		LanguageRegistry.addName(lightningcrystal, "Lightning Crystal");
		densecrystal = new ItemsK(densecrystalID).setIconIndex(13).setItemName("dcru");
		LanguageRegistry.addName(densecrystal, "Dense Crystal");
		twilightcrystal = new ItemsK(twilightcrystalID).setIconIndex(12).setItemName("Tcry");
		LanguageRegistry.addName(twilightcrystal, "Twilight Crystal");
		serenitycrystal = new ItemsK(serenitycrystalID).setIconIndex(11).setItemName("sercry");
		LanguageRegistry.addName(serenitycrystal, "Serenity Crystal");
		Orichalcum = new ItemsK(OrichalcumID).setIconIndex(8).setItemName("OrichalcumI");
		LanguageRegistry.addName(Orichalcum, "Orichalcum");
		Orichalcumplus = new ItemsK(OrichalcumplusID).setIconIndex(9).setItemName("OrichalcumI+");
		LanguageRegistry.addName(Orichalcumplus, "Orichalcum+");
		
		//potion stuff
		eitherPotion = new Either(eitherPotionID, 25).setIconIndex(22).setItemName("eitherP");
		LanguageRegistry.addName(eitherPotion, "Either");
		hiEither = new Either(hiEitherID, 50).setIconIndex(23).setItemName("HiEitherP");
		LanguageRegistry.addName(hiEither, "Hi-Either");
		megaEither = new Either(megaEitherID, 150).setIconIndex(24).setItemName("MegEither");
		LanguageRegistry.addName(megaEither, "Mega-Either");
		poweredDust = new ItemsK(poweredDustID).setIconIndex(20).setItemName("pDust");
		LanguageRegistry.addName(poweredDust, "Powered Dust");
		enrichedSlime = new ItemsK(enrichedSlimeID).setIconIndex(21).setItemName("eSlime");
		LanguageRegistry.addName(enrichedSlime, "Enriched Slime");
		
		//Keychains
		KingKeyDchain = new Keychains(KingKeyDchainID).setIconIndex(0).setItemName("KingdomKeyDchain");
		LanguageRegistry.addName(KingKeyDchain, "Keychain: Kingdom Key D");
		Olympiachain = new Keychains(OlympiachainID).setIconIndex(1).setItemName("Olympiachain");
		LanguageRegistry.addName(Olympiachain, "Keychain: Olympia");
		Oblivionchain = new Keychains(OblivionchainID).setIconIndex(16).setItemName("Oblivionchain");
		LanguageRegistry.addName(Oblivionchain, "Keychain: Oblivion");
		MetalChocochain = new Keychains(MetalChocochainID).setIconIndex(2).setItemName("MetalChain");
		LanguageRegistry.addName(MetalChocochain, "Keychain: Metal Chocobo");
		Ladyluckchain = new Keychains(LadyluckchainID).setIconIndex(3).setItemName("LLuckChain");
		LanguageRegistry.addName(Ladyluckchain, "Keychain: Lady Luck");
		crabchain = new Keychains(crabchainID).setIconIndex(4).setItemName("CCchain");
		LanguageRegistry.addName(crabchain, "Keychain: CrabClaw");
		rosechain = new Keychains(rosechainID).setIconIndex(5).setItemName("Rosechain");
		LanguageRegistry.addName(rosechain, "Keychain: Divine Rose");
		corrupt = new Keychains(corruptID).setIconIndex(255).setItemName("Corruptchain");
		LanguageRegistry.addName(corrupt, "Corrupt Heart");
		lionchain = new Keychains(lionchainID).setIconIndex(6).setItemName("Lionchain");
		LanguageRegistry.addName(lionchain, "Keychain: Lionheart");
		onewingchain = new Keychains(onewingchainID).setIconIndex(7).setItemName("WingChain");
		LanguageRegistry.addName(onewingchain, "Keychain: One-Winged Angel");
	}
}
