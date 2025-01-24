package org.outliertech.outliereconomy.block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.OutlierEconomy;
import org.outliertech.outliereconomy.block.custom.ATM;

// Centralized Registry For All Mod Blocks

public final class ModBlocks {
    public static final Block DYSANIUM_BLOCK = register("dysanium_block",
            new Block(AbstractBlock.Settings.create()
            .strength(1.5f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DYSANIUM_ORE = register("dysanium_ore",
            new Block(AbstractBlock.Settings.create()
            .strength(1.5f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DEEPSLATE_DYSANIUM_ORE = register("deepslate_dysanium_ore",
            new Block(AbstractBlock.Settings.create()
            .strength(1.5f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final ATM ATM = register("atm",
            new ATM(AbstractBlock.Settings.create()
            .strength(1.5f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("outliereconomy", path), block);
        Registry.register(Registries.ITEM, Identifier.of("outliereconomy", path),
                new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void registerModBlocks(){
        OutlierEconomy.LOGGER.info("Registering Mod Blocks for " + OutlierEconomy.MOD_ID);
    }
}

