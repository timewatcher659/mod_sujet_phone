package com.timewatcher.modsujet.registry;

import com.timewatcher.modsujet.SwordMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, SwordMod.MOD_ID);

    // --- Ваш Меч ---
    public static final RegistryObject<Item> EPIC_SWORD = ITEMS.register("epic_sword", 
        () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F, 
            new Item.Properties()));
    // --------------

    public static void register() {
        ITEMS.register(net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus());
    }
}
