package top.lingcar4870.nnefabric.block;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.NoteBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import top.lingcar4870.nnefabric.sound.NNESounds;

import java.util.Map;

public class NoteBlockBase extends NoteBlock {
    public static final Map<Instrument, SoundEvent> MM_SOUNDS = Maps.newEnumMap(Instrument.class);
    public static final Map<Instrument, SoundEvent> PP_SOUNDS = Maps.newEnumMap(Instrument.class);
    //public static final Map<Instrument, SoundEvent> P4_SOUNDS = Maps.newEnumMap(Instrument.class);
    
    static {
        // MM_SOUNDS
        MM_SOUNDS.put(Instrument.HARP, NNESounds.MM_HARP);
        MM_SOUNDS.put(Instrument.BASEDRUM, NNESounds.MM_BASEDRUM);
        MM_SOUNDS.put(Instrument.SNARE, NNESounds.MM_SNARE);
        MM_SOUNDS.put(Instrument.HAT, NNESounds.MM_HAT);
        MM_SOUNDS.put(Instrument.BASS, NNESounds.MM_BASS);
        MM_SOUNDS.put(Instrument.FLUTE, NNESounds.MM_FLUTE);
        MM_SOUNDS.put(Instrument.BELL, NNESounds.MM_BELL);
        MM_SOUNDS.put(Instrument.GUITAR, NNESounds.MM_GUITAR);
        MM_SOUNDS.put(Instrument.CHIME, NNESounds.MM_CHIME);
        MM_SOUNDS.put(Instrument.XYLOPHONE, NNESounds.MM_XYLOPHONE);
        MM_SOUNDS.put(Instrument.IRON_XYLOPHONE, NNESounds.MM_IRON_XYLOPHONE);
        MM_SOUNDS.put(Instrument.COW_BELL, NNESounds.MM_COW_BELL);
        MM_SOUNDS.put(Instrument.DIDGERIDOO, NNESounds.MM_DIDGERIDOO);
        MM_SOUNDS.put(Instrument.BIT, NNESounds.MM_BIT);
        MM_SOUNDS.put(Instrument.BANJO, NNESounds.MM_BANJO);
        MM_SOUNDS.put(Instrument.PLING, NNESounds.MM_PLING);
    
        // PP_SOUNDS
        PP_SOUNDS.put(Instrument.HARP, NNESounds.PP_HARP);
        PP_SOUNDS.put(Instrument.BASEDRUM, NNESounds.PP_BASEDRUM);
        PP_SOUNDS.put(Instrument.SNARE, NNESounds.PP_SNARE);
        PP_SOUNDS.put(Instrument.HAT, NNESounds.PP_HAT);
        PP_SOUNDS.put(Instrument.BASS, NNESounds.PP_BASS);
        PP_SOUNDS.put(Instrument.FLUTE, NNESounds.PP_FLUTE);
        PP_SOUNDS.put(Instrument.BELL, NNESounds.PP_BELL);
        PP_SOUNDS.put(Instrument.GUITAR, NNESounds.PP_GUITAR);
        PP_SOUNDS.put(Instrument.CHIME, NNESounds.PP_CHIME);
        PP_SOUNDS.put(Instrument.XYLOPHONE, NNESounds.PP_XYLOPHONE);
        PP_SOUNDS.put(Instrument.IRON_XYLOPHONE, NNESounds.PP_IRON_XYLOPHONE);
        PP_SOUNDS.put(Instrument.COW_BELL, NNESounds.PP_COW_BELL);
        PP_SOUNDS.put(Instrument.DIDGERIDOO, NNESounds.PP_DIDGERIDOO);
        PP_SOUNDS.put(Instrument.BIT, NNESounds.PP_BIT);
        PP_SOUNDS.put(Instrument.BANJO, NNESounds.PP_BANJO);
        PP_SOUNDS.put(Instrument.PLING, NNESounds.PP_PLING);
//
//        // P4_SOUNDS
//        P4_SOUNDS.put(Instrument.HARP, NNESounds.P4_HARP);
//        P4_SOUNDS.put(Instrument.BASEDRUM, NNESounds.P4_BASEDRUM);
//        P4_SOUNDS.put(Instrument.SNARE, NNESounds.P4_SNARE);
//        P4_SOUNDS.put(Instrument.HAT, NNESounds.P4_HAT);
//        P4_SOUNDS.put(Instrument.BASS, NNESounds.P4_BASS);
//        P4_SOUNDS.put(Instrument.FLUTE, NNESounds.P4_FLUTE);
//        P4_SOUNDS.put(Instrument.BELL, NNESounds.P4_BELL);
//        P4_SOUNDS.put(Instrument.GUITAR, NNESounds.P4_GUITAR);
//        P4_SOUNDS.put(Instrument.CHIME, NNESounds.P4_CHIME);
//        P4_SOUNDS.put(Instrument.XYLOPHONE, NNESounds.P4_XYLOPHONE);
//        P4_SOUNDS.put(Instrument.IRON_XYLOPHONE, NNESounds.P4_IRON_XYLOPHONE);
//        P4_SOUNDS.put(Instrument.COW_BELL, NNESounds.P4_COW_BELL);
//        P4_SOUNDS.put(Instrument.DIDGERIDOO, NNESounds.P4_DIDGERIDOO);
//        P4_SOUNDS.put(Instrument.BIT, NNESounds.P4_BIT);
//        P4_SOUNDS.put(Instrument.BANJO, NNESounds.P4_BANJO);
//        P4_SOUNDS.put(Instrument.PLING, NNESounds.P4_PLING);
        
    }
    
    // 1 for mm, 2 for pp, 3 for p4
    private final int type;
    
    public NoteBlockBase(Settings settings, int type) {
        super(settings);
        this.type = type;
    }
    
    @Override
    public boolean onSyncedBlockEvent(BlockState state, World world, BlockPos pos, int type, int data) {
        int i = state.get(NOTE);
        float f = (float)Math.pow(2.0D, (double)(i - 12) / 12.0D);
        world.playSound(null, pos, getSound(state.get(INSTRUMENT), this.type), SoundCategory.RECORDS, 3.0F, f);
        world.addParticle(ParticleTypes.NOTE, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.2D, (double)pos.getZ() + 0.5D, (double)i / 24.0D, 0.0D, 0.0D);
        return true;
    }
    
    public static SoundEvent getSound(Instrument instrument, int type) {
        SoundEvent sound;
        switch (type) {
            case 1:
                sound = MM_SOUNDS.get(instrument);
                break;
            default:
                sound = PP_SOUNDS.get(instrument);
                break;
        }
        return sound;
    }
}
