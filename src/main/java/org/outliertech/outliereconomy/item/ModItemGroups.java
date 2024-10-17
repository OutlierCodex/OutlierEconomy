package org.outliertech.outliereconomy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.OutlierEconomy;

public class ModItemGroups {
    public static final ItemGroup OUTLIER_ECONOMY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OutlierEconomy.MOD_ID, "outliereconomy"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CREDIT_CARD))
                    .displayName(Text.translatable("itemgroup.outliereconomy.outliereconomy"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.DYSANIUM_ORE);
                        entries.add(ModItems.DEEPSLATE_DYSANIUM_ORE);
                        entries.add(ModItems.RAW_DYSANIUM);
                        entries.add(ModItems.DYSANIUM_INGOT);
                        entries.add(ModItems.DYSANIUM_BLOCK);
                        entries.add(ModItems.BANK_NOTE);
                        entries.add(ModItems.CREDIT_CARD);
                        entries.add(ModItems.DEBIT_CARD);
                        entries.add(ModItems.ATM);
                    })).build());


    public static void registerItemGroups(){
        OutlierEconomy.LOGGER.info("Registering Item Groups for " + OutlierEconomy.MOD_ID);
    }
}
