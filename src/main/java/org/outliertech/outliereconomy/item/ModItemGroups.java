package org.outliertech.outliereconomy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.block.ModBlocks;

// Defines Custom Creative Tabs

public final class ModItemGroups {
    public static final ItemGroup OUTLIER_ECONOMY = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CREDIT_CARD))
            .displayName(Text.translatable("itemgroup.outliereconomy.outlier_economy"))
            .entries((context, entries) -> {
                // Add items
                entries.add(ModItems.BANK_NOTE);
                entries.add(ModItems.CREDIT_CARD);
                entries.add(ModItems.DEBIT_CARD);
                entries.add(ModItems.RAW_DYSANIUM);
                entries.add(ModItems.DYSANIUM_INGOT);
                // Add blocks
                entries.add(ModBlocks.DYSANIUM_BLOCK);
                entries.add(ModBlocks.DYSANIUM_ORE);
                entries.add(ModBlocks.DEEPSLATE_DYSANIUM_ORE);
                entries.add(ModBlocks.ATM);
            })
            .build();

    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP, Identifier.of("outliereconomy", "outlier_economy"), OUTLIER_ECONOMY);
    }
}
