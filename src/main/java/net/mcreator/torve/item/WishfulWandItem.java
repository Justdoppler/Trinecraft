
package net.mcreator.torve.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.torve.itemgroup.TroveIconItemGroup;
import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class WishfulWandItem extends TorveElements.ModElement {
	@ObjectHolder("torve:wishfulwand")
	public static final Item block = null;
	public WishfulWandItem(TorveElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2355;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 21f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 29f, new Item.Properties().group(TroveIconItemGroup.tab)) {
		}.setRegistryName("wishfulwand"));
	}
}
