package org.outliertech.outliereconomy.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.OutlierEconomy;

public class ModItems {
    public static final Item BANK_NOTE = registerItem("bank_note", new Item(new Item.Settings()));
    public static final Item CREDIT_CARD = registerItem("credit_card", new Item(new Item.Settings()));
    public static final Item DEBIT_CARD = registerItem("debit_card", new Item(new Item.Settings()));
    public static final Item DYSANIUM_INGOT = registerItem("dysanium_ingot", new Item(new Item.Settings()));
    public static final Item DYSANIUM_BLOCK = registerItem("dysanium_block", new Item(new Item.Settings()));
    public static final Item RAW_DYSANIUM = registerItem("raw_dysanium", new Item(new Item.Settings()));
    public static final Item DYSANIUM_ORE = registerItem("dysanium_ore", new Item(new Item.Settings()));
    public static final Item DEEPSLATE_DYSANIUM_ORE = registerItem("deepslate_dysanium_ore", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(OutlierEconomy.MOD_ID, name), item);
    }

    public static void registeredModItems(){
        OutlierEconomy.LOGGER.info("Registering Mod Items for " + OutlierEconomy.MOD_ID);
    }
}
