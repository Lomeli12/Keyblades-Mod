package keyblades.common.magic;

import keyblades.common.Main;
import java.util.*;

public class MPCounter {
	public static int MP = 200;
	public static int MPMax = 200;
	
	public static void addMP(int e){
		MPCounter.MP = MPCounter.MP + e;
		if(MPCounter.MP > MPCounter.MPMax)
		{
			int diff = MPCounter.MP - MPCounter.MPMax;
			MPCounter.MP = MPCounter.MP - diff;
		}
	}
	
	public static void loseMP(int e){
		MPCounter.MP = MPCounter.MP - e;
		if(MPCounter.MP < 0)
		{
			MPCounter.MP = 0;
		}
	}
	/*
	public boolean regenMP()
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
	}*/
}
