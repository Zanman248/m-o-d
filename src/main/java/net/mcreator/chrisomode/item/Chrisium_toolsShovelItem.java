
package net.mcreator.chrisomode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.chrisomode.itemgroup.ChrisoModeItemGroup;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class Chrisium_toolsShovelItem extends ChrisomodeElements.ModElement {
	@ObjectHolder("chrisomode:chrisium_toolsshovel")
	public static final Item block = null;
	public Chrisium_toolsShovelItem(ChrisomodeElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 361;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ChrisoModeItemGroup.tab)) {
		}.setRegistryName("chrisium_toolsshovel"));
	}
}
