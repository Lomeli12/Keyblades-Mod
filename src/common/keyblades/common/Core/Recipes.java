package keyblades.common.Core;

import keyblades.common.*;
import keyblades.common.Blocks.*;
import keyblades.common.Items.*;
import keyblades.common.Keyblades.*;
import keyblades.common.Network.*;
import keyblades.common.Magic.*;

import net.minecraft.src.*;
import cpw.mods.fml.common.registry.*;

public class Recipes 
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.xblade, 1), new Object[]{
			" D "," L ","XOX", 'D',RegisterItems.puredarknessorb, 'L',RegisterItems.purelightorb, 'X',RegisterKeyblades.xBladefrag, 'O',RegisterItems.Orichalcumplus
		});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.xblade, 1), new Object[]{
			" L "," D ","XOX", 'D',RegisterItems.puredarknessorb, 'L',RegisterItems.purelightorb, 'X',RegisterKeyblades.xBladefrag, 'O',RegisterItems.Orichalcumplus
		});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.xBladefrag, 1), new Object[]{
			"DDD","PKP","DDD", 'D',Item.diamond, 'P',RegisterItems.poweredDust, 'K',RegisterKeyblades.KingdomKey
		});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.purelightorb, 1), new Object[]{
			"HHH","OHO","HHH", 'O',RegisterItems.Orichalcum, 'H',RegisterItems.hearts
		});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.darkheart9, 1), new Object[]{
			"DDD","DDD","DDD", 'D',RegisterItems.darkorb
		});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.darkheart4, 1), new Object[]{
			" D ","DHD"," D ", 'D',RegisterItems.darkorb, 'H',RegisterItems.hearts
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.puredarknessorb, 1),new Object[]{
			RegisterItems.darkheart4, RegisterItems.darkheart9, RegisterItems.Orichalcum
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.poweredDust, 3), new Object[]
				{
					Item.flint, Item.redstone, Item.lightStoneDust, RegisterItems.dullcrystal
				});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.enrichedSlime, 3), new Object[]
				{
					RegisterItems.poweredDust, Item.slimeBall, Item.diamond
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.OneWingAngel, 1), new Object[]
				{
					"CK", 'C',RegisterItems.onewingchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.onewingchain, 1), new Object[]
				{
					"C","W","F", 'C',RegisterItems.chains, 'W',Item.feather, 'F',RegisterItems.blazingcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.LionHeart, 1), new Object[]
				{
					"CK", 'C',RegisterItems.lionchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.lionchain, 1),new Object[]
				{
					" C ","IFI"," I ", 'C',RegisterItems.chains, 'I',Item.ingotIron, 'F',RegisterItems.blazingcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.Crabclaw, 1), new Object[]
				{
					"CK", 'C',RegisterItems.crabchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.KeybladeHOP, 1), new Object[]
				{
					"CK", 'C',RegisterItems.corrupt, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.DivineRose, 1), new Object[]
				{
					"CK", 'C',RegisterItems.rosechain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.corrupt, 1), new Object[]
				{
					"CEC","EHE","CEC", 'E',Item.eyeOfEnder, 'H',RegisterItems.hearts, 'C',RegisterItems.chains
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.rosechain, 1), new Object[]
				{
					" C ", " R ", "GRG", 'C',RegisterItems.chains, 'R',BlockFlower.plantRed, 'G',BlockLeaves.leaves
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.crabchain, 1), new Object[]
				{
					" C ", "WSW", "SLS", 'C',RegisterItems.chains, 'W',ItemBucket.bucketWater, 'S',Block.sand, 'L',Block.sandStone
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.Soul_Eater, 1), new Object[]
				{
					"E","D","O", 'E',Item.eyeOfEnder, 'D',RegisterItems.darkorb, 'O',Block.obsidian
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.Ladyluck, 1), new Object[]
				{
					"CK", 'C',RegisterItems.Ladyluckchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.MetalChocobo, 1), new Object[]
				{
					"CK", 'C',RegisterItems.MetalChocochain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.Ladyluckchain, 1), new Object[]
				{
					" C "," R "," P ", 'C',RegisterItems.chains, 'P',Item.paper, 'R',BlockFlower.plantRed
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.MetalChocochain, 1), new Object[]
				{
					" C ","II "," II", 'C',RegisterItems.chains, 'I',Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.Orichalcumplus,1), new Object[]
				{
					"FDF","ROR","FIF", 'R',Item.emerald, 'O',RegisterItems.Orichalcum, 'D',Block.blockDiamond, 'I',Block.blockSteel, 'F',Item.flint
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.Olympia, 1), new Object[]
				{
					"CK", 'C',RegisterItems.Olympiachain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.Oblivion, 1), new Object[]
				{
					"CK", 'C',RegisterItems.Oblivionchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.Oblivionchain, 1), new Object[]
				{
					" C ","D D","DDD", 'C',RegisterItems.chains, 'D',RegisterItems.darkorb
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.Olympiachain, 1), new Object[]
				{
					" C ","GDG"," G ", 'C',RegisterItems.chains, 'G', Item.ingotGold, 'D',RegisterItems.gummidropO
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.KingdomKeyD, 1), new Object[]
				{
					"CK", 'C',RegisterItems.KingKeyDchain, 'K',RegisterKeyblades.KingdomKey
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.KingKeyDchain, 1), new Object[]
				{
					" C ","GCG"," D ", 'D',RegisterItems.darkorb, 'C',RegisterItems.chains, 'G',Item.ingotGold
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.KingdomKey, 1), new Object[]
				{
					"DI "," I ","GHG", 'D',Item.diamond, 'I',Item.ingotIron, 'G',RegisterBlocks.gummiBlockO, 'H',RegisterItems.hearts
				});
		GameRegistry.addRecipe(new ItemStack(RegisterKeyblades.KingdomKey, 1), new Object[]
				{
					" ID"," I ","GHG", 'D',Item.diamond, 'I',Item.ingotIron, 'G',RegisterBlocks.gummiBlockO, 'H',RegisterItems.hearts
				});
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.gummiBlockO, 1), new Object[]
				{
					"DDD","DDD","DDD", 'D',RegisterItems.gummidropO
				});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.eitherPotion, 1), new Object[]
				{
					Item.glassBottle, Item.redstone, Item.slimeBall, ItemBucket.bucketWater
				});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.hiEither, 1), new Object[]
				{
					Item.glassBottle, RegisterItems.poweredDust, ItemBucket.bucketWater
				});
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.megaEither, 1), new Object[]
				{
					Item.glassBottle, RegisterItems.poweredDust, RegisterItems.enrichedSlime, ItemBucket.bucketWater
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.hearts, 3), new Object[]
				{
					"GRG","BDB","RGR", 'R', Item.redstone, 'G',Item.lightStoneDust, 'B',RegisterBlocks.gummiBlockO, 'D',Item.diamond
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.serenitycrystal,1),new Object[]
				{
					"RGW","BFL","WGR", 'R',Item.redstone, 'G',Item.lightStoneDust, 'W',ItemBucket.bucketWater, 'B',RegisterItems.blazingcrystal, 'F',RegisterItems.frostcrystal, 'L',RegisterItems.lightningcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.twilightcrystal,1),new Object[]
				{
					"SGS","GCG","SGS", 'S',Item.gunpowder, 'G',Item.lightStoneDust, 'C',RegisterItems.dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.densecrystal,1),new Object[]
				{
					"FOF","OCO","FOF", 'F',Item.flint, 'O',Item.coal, 'C',RegisterItems.dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.lightningcrystal,1), new Object[]
				{
					" G ","GCG","G G", 'G',Item.lightStoneDust, 'C',RegisterItems.dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.frostcrystal,1),new Object[]
				{
					" W ","WCW","W W", 'W',ItemBucket.bucketWater, 'C',RegisterItems.dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.blazingcrystal,1), new Object[]
				{
					" B ","BCB","B B", 'B',Item.blazePowder, 'C',RegisterItems.dullcrystal
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.chains, 6), new Object[]
				{
					"I I"," I ","I I", 'I',Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(RegisterItems.darkorb, 1), new Object[]
				{
					" E ","E E"," E ", 'E', Item.enderPearl
				});
		
		//Smelting
		GameRegistry.addSmelting(RegisterBlocks.dullCrystalOreID, new ItemStack(RegisterItems.dullcrystal,1), 0.1F);
		GameRegistry.addSmelting(RegisterBlocks.gummiOreID, new ItemStack(RegisterItems.gummidropO,3), 0.1F);
		GameRegistry.addSmelting(RegisterBlocks.OrichalcumoreID, new ItemStack(RegisterItems.Orichalcum,1), 0.1F);
	}
}
