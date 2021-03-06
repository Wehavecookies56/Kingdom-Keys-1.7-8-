package wehavecookies56.kk.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySharpshooterBullet extends EntityThrowable{
	public EntitySharpshooterBullet(World world) {
		super(world);
	}

	public EntitySharpshooterBullet(World world, EntityLivingBase entity) {
		super(world, entity);
	}

	public EntitySharpshooterBullet(World world, double x, double y, double z) {
		super(world, x, y, z);
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.0F;
	}
		
	@Override
	public void onUpdate() {
		if(ticksExisted > 40){
			setDead();
		}
		super.onUpdate();
	}
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		if (mop.entityHit != null) {
			
			float shotDamage = 10;
			mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), shotDamage);
		}

		if (!worldObj.isRemote) {
			setDead();
		}
		
	}
}
