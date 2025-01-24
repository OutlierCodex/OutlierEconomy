package org.outliertech.outliereconomy.item;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.OutlierEconomy;

// Centralized Registry For All Mod Items

public class ModItems {
    // Items
    public static final Item BANK_NOTE = registerItem("bank_note", new Item(new Item.Settings()));
    public static final Item CREDIT_CARD = registerItem("credit_card", new Item(new Item.Settings()));
    public static final Item DEBIT_CARD = registerItem("debit_card", new Item(new Item.Settings()));
    public static final Item RAW_DYSANIUM = registerItem("raw_dysanium", new Item(new Item.Settings()));
    public static final Item DYSANIUM_INGOT = registerItem("dysanium_ingot", new Item(new Item.Settings()));
    // Block Items
    public static final Block DYSANIUM_BLOCK = registerBlock("dysanium_block", new Block(AbstractBlock.Settings.create()));
    public static final Block DYSANIUM_ORE = registerBlock("dysanium_ore", new Block(AbstractBlock.Settings.create()));
    public static final Block DEEPSLATE_DYSANIUM_ORE = registerBlock("deepslate_dysanium_ore", new Block(AbstractBlock.Settings.create()));
    public static final Block ATM = registerBlock("atm", new Block(AbstractBlock.Settings.create()));

    private static Item registerItem(String name, Item item){
        // Register the item
        return Registry.register(Registries.ITEM, Identifier.of(OutlierEconomy.MOD_ID, name), item);
    }

    private static Block registerBlock(String name, Block block){
        // Register the block
        return Registry.register(Registries.BLOCK, Identifier.of(OutlierEconomy.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block){
        // Register the block's item
        return Registry.register(Registries.ITEM, Identifier.of(OutlierEconomy.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModItems(){
        OutlierEconomy.LOGGER.info("Registering Mod Items for " + OutlierEconomy.MOD_ID);
    }
}
