package wehavecookies56.kk.magic;

import net.minecraft.item.Item;

public class MagicAttack {
	
	String name;
	int magiccost;
	Item unlockItem;
	
	public static int currMagic = 100;
	public static int maxMagic = 100;
	
	public static final int fireCost = 10;
	
	public static final int thunderCost = 30;
	public static final int cureCost = 100;

	
	public MagicAttack(String name, int magiccost, Item unlockItem) 
	{
		this.name = name;
		this.magiccost = magiccost;
		this.unlockItem = unlockItem;
	}
}
