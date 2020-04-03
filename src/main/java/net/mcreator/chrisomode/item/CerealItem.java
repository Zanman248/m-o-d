
package net.mcreator.chrisomode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.chrisomode.itemgroup.ChrisoModeItemGroup;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class CerealItem extends ChrisomodeElements.ModElement {
	@ObjectHolder("chrisomode:cereal")
	public static final Item block = null;
	public CerealItem(ChrisomodeElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ChrisoModeItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(2).saturation(0.4f).setAlwaysEdible().build()));
			setRegistryName("cereal");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 40;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
