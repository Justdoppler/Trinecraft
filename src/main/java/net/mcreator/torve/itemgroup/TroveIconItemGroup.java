
package net.mcreator.torve.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class TroveIconItemGroup extends TorveElements.ModElement {
	public TroveIconItemGroup(TorveElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtroveicon") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.GOLD_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
