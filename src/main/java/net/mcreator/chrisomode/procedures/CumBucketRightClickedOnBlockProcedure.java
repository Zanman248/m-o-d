package net.mcreator.chrisomode.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chrisomode.item.CumBucketItem;
import net.mcreator.chrisomode.block.CumBlock;
import net.mcreator.chrisomode.ChrisomodeElements;

@ChrisomodeElements.ModElement.Tag
public class CumBucketRightClickedOnBlockProcedure extends ChrisomodeElements.ModElement {
	public CumBucketRightClickedOnBlockProcedure(ChrisomodeElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CumBucketRightClickedOnBlock!");
			return;
		}
		Direction direction = (Direction) dependencies.get("direction");
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((direction == Direction.UP) || (direction == Direction.DOWN)) || ((direction == Direction.NORTH) || (direction == Direction.SOUTH)))) {
			if (((direction == Direction.UP) || (direction == Direction.DOWN))) {
				if ((direction == Direction.UP)) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), CumBlock.block.getDefaultState(), 3);
				} else if ((direction == Direction.DOWN)) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), CumBlock.block.getDefaultState(), 3);
				}
			} else if (((direction == Direction.NORTH) || (direction == Direction.SOUTH))) {
				if ((direction == Direction.NORTH)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), CumBlock.block.getDefaultState(), 3);
				} else if ((direction == Direction.SOUTH)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), CumBlock.block.getDefaultState(), 3);
				}
			}
		} else if (((direction == Direction.EAST) || (direction == Direction.WEST))) {
			if ((direction == Direction.EAST)) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), CumBlock.block.getDefaultState(), 3);
			} else if ((direction == Direction.WEST)) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), CumBlock.block.getDefaultState(), 3);
			}
		}
		if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(CumBucketItem.block, (int) (1)).getItem() == p.getItem(),
						(int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
