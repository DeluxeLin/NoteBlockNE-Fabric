package top.lingcar4870.nnefabric.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class NNEBlocks {
    public static final Block NOTEBLOCK_MM = new NoteBlockBase(AbstractBlock.Settings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.8F),1);
    public static final Block NOTEBLOCK_PP = new NoteBlockBase(AbstractBlock.Settings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.8F),2);
    // public static final Block NOTEBLOCK_P4 = new NoteBlockBase(AbstractBlock.Settings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.8F),3);
}
