
package net.mcreator.torve.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.torve.itemgroup.TroveIconItemGroup;
import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class InfiniumOreItem extends TorveElements.ModElement {
	@ObjectHolder("torve:infiniumore")
	public static final Item block = null;
	public InfiniumOreItem(TorveElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TroveIconItemGroup.tab).maxStackSize(64));
			setRegistryName("infiniumore");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
