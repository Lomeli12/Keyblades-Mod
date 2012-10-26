package keyblades.common.Magic;

import keyblades.common.Magic.MPCounter;
import keyblades.common.Network.ClientMessager;
import net.minecraft.src.*;

import cpw.mods.fml.common.Side;

public class FireMagic 
{
	public static void useFireMagic(int cost, ItemStack itemstack, World world, EntityPlayer entityplayer, float teep)
	{
		if(MPCounter.MP >= cost)
		{
			itemstack.damageItem(1, entityplayer);
			world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (teep * 0.4F + 0.8F));
			if (!world.isRemote)
			{
				Vec3 look = entityplayer.getLookVec();
				EntitySmallFireball fireball = new EntitySmallFireball(world, entityplayer, 0, 0, 0);
				fireball.setPosition(entityplayer.posX + look.xCoord * 2, entityplayer.posY + look.yCoord + 1, entityplayer.posZ + look.zCoord * 2);
				fireball.accelerationX = look.xCoord * 0.1;
				fireball.accelerationY = look.yCoord * 0.1;
				fireball.accelerationZ = look.zCoord * 0.1;
				world.spawnEntityInWorld(fireball);
				itemstack.damageItem(1, entityplayer);
				MPCounter.loseMP(cost, entityplayer);
            }
		}
		else{
			ClientMessager.displayInChat("Not Enought MP!");
		}
	}
	
	public static void placeFireBlock(int cost, ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10, float teep)
	{
		if(MPCounter.MP >= cost)
		{
			if (par7 == 0)
	        {
	            --par5;
	        }

	        if (par7 == 1)
	        {
	            ++par5;
	        }

	        if (par7 == 2)
	        {
	            --par6;
	        }

	        if (par7 == 3)
	        {
	            ++par6;
	        }

	        if (par7 == 4)
	        {
	            --par4;
	        }

	        if (par7 == 5)
	        {
	            ++par4;
	        }

	        if (!par2EntityPlayer.func_82247_a(par4, par5, par6, par7, par1ItemStack))
	        {
	        }
	        else
	        {
	            int var11 = par3World.getBlockId(par4, par5, par6);

	            if (var11 == 0)
	            {
	                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, teep * 0.4F + 0.8F);
	                par3World.setBlockWithNotify(par4, par5, par6, Block.fire.blockID);
	            }
				MPCounter.loseMP(cost, par2EntityPlayer);
	            par1ItemStack.damageItem(1, par2EntityPlayer);
	        }
		}else
		{
			ClientMessager.displayInChat("Not Enought MP!");
		}
	}
}