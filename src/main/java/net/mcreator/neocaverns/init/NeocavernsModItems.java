
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neocaverns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.neocaverns.item.BombItem;
import net.mcreator.neocaverns.NeocavernsMod;

public class NeocavernsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeocavernsMod.MODID);
	public static final RegistryObject<Item> ROPE_MIDDLE = block(NeocavernsModBlocks.ROPE_MIDDLE, null);
	public static final RegistryObject<Item> BOMB = REGISTRY.register("bomb", () -> new BombItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
