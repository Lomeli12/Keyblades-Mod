package keyblades.common.Magic;

import keyblades.common.Main;
import java.util.*;

import net.minecraft.src.EntityPlayer;

public class MPCounter {
	public static double MP = 200;
	public static double MPMax = 200;
	
	public static void addMP(double e){
		MPCounter.MP = MPCounter.MP + e;
		if(MPCounter.MP > MPCounter.MPMax)
		{
			double diff = MPCounter.MP - MPCounter.MPMax;
			MPCounter.MP = MPCounter.MP - diff;
		}
	}
	
	public static void loseMP(double e, EntityPlayer player1){
		if (player1.capabilities.isCreativeMode)
        {
			
        }
		else
		{
			MPCounter.MP = MPCounter.MP - e;
		}
		if(MPCounter.MP < 0)
		{
			MPCounter.MP = 0;
		}
	}
	
	public static boolean regenMP()
	{
		new Timer().schedule(
			new TimerTask(){
				@Override
				public void run() {
					MPCounter.addMP(2);
				}
			}, 5
		);
		return true;
	}
}
