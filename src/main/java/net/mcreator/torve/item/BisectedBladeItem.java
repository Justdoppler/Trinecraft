
package net.mcreator.torve.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.torve.itemgroup.TroveIconItemGroup;
import net.mcreator.torve.TorveElements;

@TorveElements.ModElement.Tag
public class BisectedBladeItem extends TorveElements.ModElement {
	@ObjectHolder("torve:bisectedblade")
	public static final Item block = null;
	public BisectedBladeItem(TorveElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6454;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 43f;
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
		}, 3, 13f, new Item.Properties().group(TroveIconItemGroup.tab)) {
		}.setRegistryName("bisectedblade"));
	}
}
