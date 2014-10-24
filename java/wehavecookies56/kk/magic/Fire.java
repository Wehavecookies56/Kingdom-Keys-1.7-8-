package wehavecookies56.kk.magic;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Fire extends MagicAttack{
	
	public Fire(String name, int magiccost, Item unlockItem) 
	{
		super(name, magiccost, unlockItem);
	}
	
	public static void shoot(EntityPlayer par1EntityPlayer, World par2World){
		EntityPlayer player = (EntityPlayer) par1EntityPlayer;
		//Magic execution
		System.out.println(currMagic);
		MagicAttack.currMagic = 100;
		if(MagicAttack.currMagic >= fireCost && KeyBind.submenu == 1)
		{
			EntitySmallFireball entitysmallfireball = new EntitySmallFireball(par2World);
	        par2World.spawnEntityInWorld(new EntitySmallFireball(par2World, player, player.posX, player.posY, player.posZ));
	        KeyBind.shootFire = false;
			System.out.println("Boom");
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.fireCost;
			
		}
	}
}