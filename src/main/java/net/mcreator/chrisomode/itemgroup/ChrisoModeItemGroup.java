
package net.mcreator.chrisomode.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chrisomode.block.ChrisiumblockBlock;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class ChrisoModeItemGroup extends ChrisomodeElements.ModElement {
	public ChrisoModeItemGroup(ChrisomodeElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchrisomode") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChrisiumblockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
