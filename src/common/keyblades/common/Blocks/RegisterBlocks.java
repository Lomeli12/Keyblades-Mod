package keyblades.common.Blocks;

import keyblades.common.Main;
import net.minecraft.src.*;
import cpw.mods.fml.common.registry.*;

public class RegisterBlocks {
	//Ores
	public static Block gummiOreO;
	public static Block DullCrystalore;
	public static Block gummiBlockO;
	public static Block Orichalcumore;
	public static void registerBlocks()
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
	}
}
