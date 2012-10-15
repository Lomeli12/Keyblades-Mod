package keyblades.common;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.BlockLeaves;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemBucket;
import net.minecraft.src.ItemCloth;
import net.minecraft.src.ItemDye;
import net.minecraft.src.ItemStack;
import net.minecraft.src.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.awt.event.KeyEvent;
import java.util.Random;

import keyblades.client.CommonProxykeyblades;
import keyblades.common.Items.*;
import keyblades.common.Keyblades.*;
import keyblades.common.network.*;

@Mod(modid="mod_KeybladesMod",name="KeybladesMod",version="0.5.8")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class Main {
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
	
	//Ores
	public static Block gummiOreO;
	public static Block DullCrystalore;
	public static Block gummiBlockO;
	public static Block Orichalcumore;
	
	//Materials
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
	
	//Keyblades
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
	
	//Other weapons
	public static Item Soul_Eater;
	
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
	
	@SidedProxy(clientSide="keyblades.client.ClientProxykeyblades",serverSide="keyblades.client.CommonProxykeyblades")
	public static CommonProxykeyblades proxy;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		//Register Blocks
		gummiOreO = new Blockores(1551, 1).setStepSound(Block.soundStoneFootstep).setHardness(5F).setResistance(1.0F).setBlockName("OGummiOre");
		GameRegistry.registerBlock(gummiOreO);
		LanguageRegistry.addName(gummiOreO, "Gummi Ore");
		DullCrystalore = new Blockores(1552, 0).setStepSound(Block.soundStoneFootstep).setHardness(5F).setResistance(5.0F).setBlockName("ECrystal");
		GameRegistry.registerBlock(DullCrystalore);
		LanguageRegistry.addName(DullCrystalore, "Embedded Crystal");
		gummiBlockO = new Blockores(1553, 2).setStepSound(Block.soundStoneFootstep).setHardness(6F).setResistance(2.0F).setBlockName("OGummiBlock");
		GameRegistry.registerBlock(gummiBlockO);
		LanguageRegistry.addName(gummiBlockO, "Gummi Block");
		Orichalcumore = new Orichalcumore(1579, 3).setStepSound(Block.soundStoneFootstep).setHardness(25F).setResistance(10.0F).setBlockName("OrichalOre");
		GameRegistry.registerBlock(Orichalcumore);
		LanguageRegistry.addName(Orichalcumore, "Orichalcum Ore");
		
		//Register Items
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
		
		//Register Keyblades
		KingdomKey  = new Keyblades(1569, Kingdom_key).setIconIndex(0).setItemName("Keyblade-Kingdom");
		LanguageRegistry.addName(KingdomKey, "Keyblade: Kingdom Key");
		xblade  = new Keyblades(1570, x_blades).setIconIndex(16).setItemName("Keyblade-X");
		LanguageRegistry.addName(xblade, "X-blade");
		KingdomKeyD  = new Keyblades(1574, Kingdom_key).setIconIndex(17).setItemName("Keyblade-KingdomD");
		LanguageRegistry.addName(KingdomKeyD, "Keyblade: Kingdom Key D");
		Olympia  = new Keyblades(1577, olympiainfo).setIconIndex(1).setItemName("Keyblade-Olympia");
		LanguageRegistry.addName(Olympia, "Keyblade: Olympia");
		Ladyluck = new Keyblades(1582, Lady_Luck).setIconIndex(3).setItemName("Keyblade-Ladyluck");
		LanguageRegistry.addName(Ladyluck, "Keyblade: Lady Luck");
		MetalChocobo = new Keyblades(1583, MetalChoco).setIconIndex(4).setItemName("Keyblade-Metal");
		LanguageRegistry.addName(MetalChocobo, "Keyblade: Metal Chocobo");
		Oblivion  = new Keyblades(1578, obliv).setIconIndex(2).setItemName("Keyblade-Obliv");
		LanguageRegistry.addName(Oblivion, "Keyblade: Oblivion");
		DivineRose = new Keyblades(1585, rose).setIconIndex(5).setItemName("DRose");
		LanguageRegistry.addName(DivineRose, "Keyblade: Divine Rose");
		Crabclaw = new Keyblades(1586, crab).setIconIndex(6).setItemName("Crab");
		LanguageRegistry.addName(Crabclaw, "Keyblade: CrabClaw");
		KeybladeHOP = new KeybladeHeartsofPeople(1587, hop).setIconIndex(254).setItemName("KeyHOP");
		LanguageRegistry.addName(KeybladeHOP, "Keyblade of People's Hearts");
		LionHeart = new LionKeyblade(1591,lion).setIconIndex(7).setItemName("LionHeart");
		LanguageRegistry.addName(LionHeart, "Keyblade: Lionheart");
		OneWingAngel = new OneWingedAngel(1593, wingedangel).setIconIndex(8).setItemName("Angel");
		LanguageRegistry.addName(OneWingAngel, "Keyblade: One-Winged Angel");
		
		
		Soul_Eater = new SoulEater(1584, soul).setIconIndex(255).setItemName("Soul-Eater");
		LanguageRegistry.addName(Soul_Eater, "Soul Eater");
		
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
		
		proxy.registerRenderThings();
		
		//Recipies
		GameRegistry.addRecipe(new ItemStack(OneWingAngel, 1), new Object[]
				{
					"CK", 'C',onewingchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(onewingchain, 1), new Object[]
				{
					"C","W","F", 'C',chains, 'W',Item.feather, 'F',blazingcrystal
				});
		GameRegistry.addRecipe(new ItemStack(LionHeart, 1), new Object[]
				{
					"CK", 'C',lionchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(lionchain, 1),new Object[]
				{
					" C ","IFI"," I ", 'C',chains, 'I',Item.ingotIron, 'F',blazingcrystal
				});
		GameRegistry.addRecipe(new ItemStack(Crabclaw, 1), new Object[]
				{
					"CK", 'C',crabchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(KeybladeHOP, 1), new Object[]
				{
					"CK", 'C',corrupt, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(DivineRose, 1), new Object[]
				{
					"CK", 'C',rosechain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(corrupt, 1), new Object[]
				{
					"CEC","EHE","CEC", 'E',Item.eyeOfEnder, 'H',hearts, 'C',chains
				});
		GameRegistry.addRecipe(new ItemStack(rosechain, 1), new Object[]
				{
					" C ", " R ", "GRG", 'C',chains, 'R',BlockFlower.plantRed, 'G',BlockLeaves.leaves
				});
		GameRegistry.addRecipe(new ItemStack(crabchain, 1), new Object[]
				{
					" C ", "WSW", "SLS", 'C',chains, 'W',ItemBucket.bucketWater, 'S',Block.sand, 'L',Block.sandStone
				});
		GameRegistry.addRecipe(new ItemStack(Soul_Eater, 1), new Object[]
				{
					"E","D","O", 'E',Item.eyeOfEnder, 'D',darkorb, 'O',Block.obsidian
				});
		GameRegistry.addRecipe(new ItemStack(Ladyluck, 1), new Object[]
				{
					"CK", 'C',Ladyluckchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(MetalChocobo, 1), new Object[]
				{
					"CK", 'C',MetalChocochain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(Ladyluckchain, 1), new Object[]
				{
					" C "," R "," P ", 'C',chains, 'P',Item.paper, 'R',BlockFlower.plantRed
				});
		GameRegistry.addRecipe(new ItemStack(MetalChocochain, 1), new Object[]
				{
					" C ","II "," II", 'C',chains, 'I',Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(Orichalcumplus,1), new Object[]
				{
					"ROR","RDR","RIR", 'R',Item.redstone, 'O',Orichalcum, 'D',Item.diamond, 'I',Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(Olympia, 1), new Object[]
				{
					"CK", 'C',Olympiachain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(Oblivion, 1), new Object[]
				{
					"CK", 'C',Oblivionchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(Oblivionchain, 1), new Object[]
				{
					" C ","D D","DDD", 'C',chains, 'D',darkorb
				});
		GameRegistry.addRecipe(new ItemStack(Olympiachain, 1), new Object[]
				{
					" C ","GDG"," G ", 'C',chains, 'G', Item.ingotGold, 'D',gummidropO
				});
		GameRegistry.addRecipe(new ItemStack(KingdomKeyD, 1), new Object[]
				{
					"CK", 'C',KingKeyDchain, 'K',KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(KingKeyDchain, 1), new Object[]
				{
					" C ","GCG"," D ", 'D',darkorb, 'C',chains, 'G',Item.ingotGold
				});
		GameRegistry.addRecipe(new ItemStack(KingdomKey, 1), new Object[]
				{
					"DI "," I ","GHG", 'D',Item.diamond, 'I',Item.ingotIron, 'G',gummiBlockO, 'H',hearts
				});
		GameRegistry.addRecipe(new ItemStack(KingdomKey, 1), new Object[]
				{
					" ID"," I ","GHG", 'D',Item.diamond, 'I',Item.ingotIron, 'G',gummiBlockO, 'H',hearts
				});
		GameRegistry.addRecipe(new ItemStack(gummiBlockO, 1), new Object[]
				{
					"DDD","DDD","DDD", 'D',gummidropO
				});
		GameRegistry.addRecipe(new ItemStack(hearts, 3), new Object[]
				{
					"GRG","BDB","RGR", 'R', Item.redstone, 'G',Item.lightStoneDust, 'B',gummiBlockO, 'D',Item.diamond
				});
		GameRegistry.addRecipe(new ItemStack(serenitycrystal,1),new Object[]
				{
					"RGW","BFL","WGR", 'R',Item.redstone, 'G',Item.lightStoneDust, 'W',ItemBucket.bucketWater, 'B',blazingcrystal, 'F',frostcrystal, 'L',lightningcrystal
				});
		GameRegistry.addRecipe(new ItemStack(twilightcrystal,1),new Object[]
				{
					"SGS","GCG","SGS", 'S',Item.gunpowder, 'G',Item.lightStoneDust, 'C',dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(densecrystal,1),new Object[]
				{
					"FOF","OCO","FOF", 'F',Item.flint, 'O',Item.coal, 'C',dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(lightningcrystal,1), new Object[]
				{
					" G ","GCG","G G", 'G',Item.lightStoneDust, 'C',dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(frostcrystal,1),new Object[]
				{
					" W ","WCW","W W", 'W',ItemBucket.bucketWater, 'C',dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(blazingcrystal,1), new Object[]
				{
					" B ","BCB","B B", 'B',Item.blazePowder, 'C',dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(chains, 6), new Object[]
				{
					"I I"," I ","I I", 'I',Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(darkorb, 1), new Object[]
				{
					" E ","E E"," E ", 'E', Item.enderPearl
				});
		
		//Smelting
		GameRegistry.addSmelting(DullCrystalore.blockID, new ItemStack(dullcrystal,1), 0.1F);
		GameRegistry.addSmelting(gummiOreO.blockID, new ItemStack(gummidropO,2), 0.1F);
		GameRegistry.addSmelting(Orichalcumore.blockID, new ItemStack(Orichalcum,1), 0.1F);
		
		GameRegistry.registerWorldGenerator(new OreGenerationK());
	}
}
