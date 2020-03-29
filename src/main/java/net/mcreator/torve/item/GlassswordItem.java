
package net.mcreator.torve.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.torve.itemgroup.TroveIconItemGroup;
import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class GlassswordItem extends TorveElements.ModElement {
	@ObjectHolder("torve:glasssword")
	public static final Item block = null;
	public GlassswordItem(TorveElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2342;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 8f, new Item.Properties().group(TroveIconItemGroup.tab)) {
		}.setRegistryName("glasssword"));
	}
}
