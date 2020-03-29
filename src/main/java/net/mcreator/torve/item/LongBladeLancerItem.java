
package net.mcreator.torve.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.torve.itemgroup.TroveIconItemGroup;
import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class LongBladeLancerItem extends TorveElements.ModElement {
	@ObjectHolder("torve:longbladelancer")
	public static final Item block = null;
	public LongBladeLancerItem(TorveElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4355;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 31f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 15f, new Item.Properties().group(TroveIconItemGroup.tab)) {
		}.setRegistryName("longbladelancer"));
	}
}
