package keyblades.common.Blocks;

import keyblades.common.Main;
import net.minecraft.src.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.registry.*;

public class RegisterBlocks {
	//Ores
	public static Block gummiOreO;
	public static Block DullCrystalore;
	public static Block gummiBlockO;
	public static Block OrichalcumoreB;
	
	public static int gummiOreID;
	public static int gummiBlockID;
	public static int OrichalcumoreID;
	public static int dullCrystalOreID;
	public static void internalBlockRegistry(Block par0, String name2)
	{
		GameRegistry.registerBlock(par0);
		LanguageRegistry.addName(par0, name2);
	}
	public static void registerBlocks()
	{
		StepSound stone = Block.soundStoneFootstep;
		//Register Blocks
		gummiOreO = new Blockores(gummiOreID, 1).setStepSound(stone).setHardness(5F).setResistance(1.0F).setBlockName("OGummiOre");
		internalBlockRegistry(gummiOreO, "Gummi Ore");
		DullCrystalore = new Blockores(dullCrystalOreID, 0).setStepSound(stone).setHardness(5F).setResistance(5.0F).setBlockName("ECrystal");
		internalBlockRegistry(DullCrystalore,"Embedded Crystal");
		gummiBlockO = new Blockores(gummiBlockID, 2).setStepSound(stone).setHardness(5F).setResistance(5.0F).setBlockName("OGummiBlock");
		internalBlockRegistry(gummiBlockO, "Gummi Block");
		OrichalcumoreB = new OrichalcumOre(OrichalcumoreID, 0).setStepSound(stone).setHardness(5F).setResistance(5.0F).setBlockName("Orichalcumore");
		internalBlockRegistry(OrichalcumoreB, "Orichalcum Ore");
	}
	
}
