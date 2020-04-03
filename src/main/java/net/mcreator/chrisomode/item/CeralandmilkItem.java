
package net.mcreator.chrisomode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.chrisomode.procedures.CeralandmilkFoodEatenProcedure;
import net.mcreator.chrisomode.itemgroup.ChrisoModeItemGroup;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class CeralandmilkItem extends ChrisomodeElements.ModElement {
	@ObjectHolder("chrisomode:ceralandmilk")
	public static final Item block = null;
	public CeralandmilkItem(ChrisomodeElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ChrisoModeItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("ceralandmilk");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				CeralandmilkFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
