
package net.mcreator.unoforminecraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.unoforminecraft.item.CardBaseItem;
import net.mcreator.unoforminecraft.UnoForMinecraftModElements;

@UnoForMinecraftModElements.ModElement.Tag
public class UnoforMinecraftItemGroup extends UnoForMinecraftModElements.ModElement {
	public UnoforMinecraftItemGroup(UnoForMinecraftModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabunofor_minecraft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CardBaseItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
