package net.mcreator.chrisomode.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chrisomode.item.ChrisiumbowlItem;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class CeralandmilkFoodEatenProcedure extends ChrisomodeElements.ModElement {
	public CeralandmilkFoodEatenProcedure(ChrisomodeElements instance) {
		super(instance, 28);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CeralandmilkFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1); index0++) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ChrisiumbowlItem.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
