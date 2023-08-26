package top.lingcar4870.nnefabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import top.lingcar4870.nnefabric.block.NNEBlocks;
import top.lingcar4870.nnefabric.sound.NNESounds;

public class NoteblockNE implements ModInitializer {
    public static final Logger logger = LogManager.getLogger();
    public static final String MODID = "noteblockne";
    
    @Override
    public void onInitialize() {
        logger.info("Initializing mod...");
        logger.info("Registering mod blocks...");
        Registry.register(Registry.BLOCK, new Identifier(MODID, "note_mm"), NNEBlocks.NOTEBLOCK_MM);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "note_pp"), NNEBlocks.NOTEBLOCK_PP);
        //Registry.register(Registry.BLOCK, new Identifier(MODID, "note_p4"), NNEBlocks.NOTEBLOCK_P4);
        logger.info("Registered mod blocks");
        logger.info("Registering mod items...");
        Registry.register(Registry.ITEM, new Identifier(MODID, "note_mm"), new BlockItem(NNEBlocks.NOTEBLOCK_MM, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "note_pp"), new BlockItem(NNEBlocks.NOTEBLOCK_PP, new Item.Settings().group(ItemGroup.REDSTONE)));
        //Registry.register(Registry.ITEM, new Identifier(MODID, "note_p4"), new BlockItem(NNEBlocks.NOTEBLOCK_P4, new Item.Settings().group(ItemGroup.REDSTONE)));
        logger.info("Registered mod items");
        logger.info("Registering mod sounds...");
        NNESounds.registerAllSounds();
        logger.info("Registered mod sounds");
    }
}
