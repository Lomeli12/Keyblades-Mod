package keyblades.common.Core;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.*;

import keyblades.common.Blocks.*;
import keyblades.common.Items.*;
import keyblades.common.Keyblades.*;

public class ConfigurationHandler {
	
	public static void configure(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
        config.load();
        //Rather messy, but it works.
        
        //Configure ORE IDs
        RegisterBlocks.OrichalcumoreID = config.getBlock("OrichalcumOre_ID", 1579).getInt();
        RegisterBlocks.gummiOreID = config.getBlock("gummiOre_ID", 1551).getInt();
        RegisterBlocks.gummiBlockID = config.getBlock("gummiBlock_ID", 1553).getInt();
        RegisterBlocks.dullCrystalOreID = config.getBlock("dullCrystalOre_ID", 1552).getInt();
        
        //Configure Keyblade IDs
        RegisterKeyblades.KingdomKeyID = config.getItem("Keyblade-Kingdom", 1569).getInt();
        RegisterKeyblades.xbladeID = config.getItem("Keyblade-xblade", 1570).getInt();
        RegisterKeyblades.KingdomKeyDID = config.getItem("Keyblade-KingdomD", 1574).getInt();
        RegisterKeyblades.OlympiaID = config.getItem("Keyblade-Olympia", 1577).getInt();
        RegisterKeyblades.OblivionID = config.getItem("Keyblade-Oblivion", 1578).getInt();
        RegisterKeyblades.LadyluckID = config.getItem("Keyblade-LadyLuck", 1582).getInt();
        RegisterKeyblades.MetalChocoboID = config.getItem("Keyblade-MetalChocobo", 1583).getInt();
        RegisterKeyblades.DivineRoseID = config.getItem("Keyblade-DivineRose", 1585).getInt();
        RegisterKeyblades.CrabclawID = config.getItem("Keyblade-CrabClaw", 1586).getInt();
        RegisterKeyblades.KeybladeHOPID = config.getItem("Keyblade-KeyHOP", 1587).getInt();
        RegisterKeyblades.LionHeartID = config.getItem("Keyblade-LionHeart", 1591).getInt();
        RegisterKeyblades.OneWingAngelID = config.getItem("Keyblade-One-Winged-Angel", 1593).getInt();
        
        //Configure Items
        RegisterItems.chainsID = config.getItem("Item-Chains", 1554).getInt();
        RegisterItems.gummidropOID = config.getItem("Items-GummiDrops", 1555).getInt();
        RegisterItems.heartsID = config.getItem("Item-Heart", 1556).getInt();
        RegisterItems.purelightorbID = config.getItem("Item-PureHeart", 1557).getInt();
        RegisterItems.darkorbID = config.getItem("Item-darkorb", 1558).getInt();
        RegisterItems.darkheart4ID = config.getItem("Item-darkorb4", 1559).getInt();
        RegisterItems.darkheart9ID = config.getItem("Item-darkorb9", 1560).getInt();
        RegisterItems.puredarknessorbID = config.getItem("Item-darkHeart", 1561).getInt();
        RegisterItems.dullcrystalID = config.getItem("Item-DullCrystal", 1562).getInt();
        RegisterItems.blazingcrystalID = config.getItem("Item-BlazeCrystal", 1563).getInt();
        RegisterItems.frostcrystalID = config.getItem("Item-FrostCrystal", 1564).getInt();
        RegisterItems.lightningcrystalID = config.getItem("Item-LightningCrystal", 1565).getInt();
        RegisterItems.densecrystalID = config.getItem("Item-DenseCrystal", 1566).getInt();
        RegisterItems.twilightcrystalID = config.getItem("Item-TwilightCrystal", 1567).getInt();
        RegisterItems.serenitycrystalID = config.getItem("Item-SerenityCrystal", 1568).getInt();
        RegisterItems.OrichalcumID = config.getItem("Item-Orichalcum", 1571).getInt();
        RegisterItems.OrichalcumplusID = config.getItem("Item-OrichalcumPlus", 1572).getInt();
        
        //Configure potions
        RegisterItems.eitherPotionID = config.getItem("Potion-either", 1595).getInt();
        RegisterItems.hiEitherID = config.getItem("Potion-HiEither", 1596).getInt();
        RegisterItems.poweredDustID = config.getItem("Potion-Pdust", 1596).getInt();
        RegisterItems.enrichedSlimeID = config.getItem("Potion-enrichedslime", 1598).getInt();
        RegisterItems.megaEitherID = config.getItem("Potion-MegaEither", 1599).getInt();
        
        //configure keychains
        RegisterItems.KingKeyDchainID = config.getItem("Keychain-KingdomD", 1573).getInt();
        RegisterItems.OlympiachainID = config.getItem("Keychain-Olympia", 1575).getInt();
        RegisterItems.OblivionchainID = config.getItem("Keychain-Oblivion", 1576).getInt();
        RegisterItems.MetalChocochainID = config.getItem("Keychain-MetalChocobo", 1580).getInt();
        RegisterItems.LadyluckchainID = config.getItem("Keychain-Ladyluck", 1581).getInt();
        RegisterItems.crabchainID = config.getItem("Keychain-Crabclaw", 1588).getInt();
        RegisterItems.rosechainID = config.getItem("Keychain-CrabClaw", 1589).getInt();
        RegisterItems.corruptID = config.getItem("Keychain-HOP", 1590).getInt();
        RegisterItems.lionchainID = config.getItem("Keychain-LionHeart", 1592).getInt();
        RegisterItems.onewingchainID = config.getItem("Keychains-One-Winged-Angel", 1594).getInt();
        
        //Configure Other
        RegisterKeyblades.Soul_EaterID = config.getItem("Soul-Eater", 1584).getInt();
        RegisterKeyblades.xBladefragID = config.getItem("xFrag", 1600).getInt();
        
        config.save();
	}
}
