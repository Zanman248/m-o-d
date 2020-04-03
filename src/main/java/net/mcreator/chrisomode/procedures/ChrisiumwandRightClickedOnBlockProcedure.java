package net.mcreator.chrisomode.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.chrisomode.block.CerealBlockBlock;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class ChrisiumwandRightClickedOnBlockProcedure extends ChrisomodeElements.ModElement {
	public ChrisiumwandRightClickedOnBlockProcedure(ChrisomodeElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ChrisiumwandRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ChrisiumwandRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ChrisiumwandRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChrisiumwandRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((!(world.isDaytime()))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRANITE.getDefaultState().getBlock()))) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), CerealBlockBlock.block.getDefaultState(), 3);
			}
		}
	}
}
