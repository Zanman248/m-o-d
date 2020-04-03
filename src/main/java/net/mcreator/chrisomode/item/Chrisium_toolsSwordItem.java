
package net.mcreator.chrisomode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.chrisomode.itemgroup.ChrisoModeItemGroup;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class Chrisium_toolsSwordItem extends ChrisomodeElements.ModElement {
	@ObjectHolder("chrisomode:chrisium_toolssword")
	public static final Item block = null;
	public Chrisium_toolsSwordItem(ChrisomodeElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ChrisoModeItemGroup.tab)) {
		}.setRegistryName("chrisium_toolssword"));
	}
}
