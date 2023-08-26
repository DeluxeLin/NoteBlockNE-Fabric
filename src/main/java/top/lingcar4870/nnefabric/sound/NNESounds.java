package top.lingcar4870.nnefabric.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;

import static top.lingcar4870.nnefabric.NoteblockNE.MODID;

public class NNESounds {
    public static final SoundEvent MM_HARP = new SoundEvent(new Identifier(MODID, "harp_mm"));
    public static final SoundEvent MM_BASEDRUM = new SoundEvent(new Identifier(MODID, "bd_mm"));
    public static final SoundEvent MM_SNARE = new SoundEvent(new Identifier(MODID, "snare_mm"));
    public static final SoundEvent MM_HAT = new SoundEvent(new Identifier(MODID, "hat_mm"));
    public static final SoundEvent MM_BASS = new SoundEvent(new Identifier(MODID, "bass_mm"));
    public static final SoundEvent MM_FLUTE = new SoundEvent(new Identifier(MODID, "flute_mm"));
    public static final SoundEvent MM_BELL = new SoundEvent(new Identifier(MODID, "bell_mm"));
    public static final SoundEvent MM_GUITAR = new SoundEvent(new Identifier(MODID, "guitar_mm"));
    public static final SoundEvent MM_CHIME = new SoundEvent(new Identifier(MODID, "icechime_mm"));
    public static final SoundEvent MM_XYLOPHONE = new SoundEvent(new Identifier(MODID, "xylophone_mm"));
    public static final SoundEvent MM_IRON_XYLOPHONE = new SoundEvent(new Identifier(MODID, "iron_xylophone_mm"));
    public static final SoundEvent MM_COW_BELL = new SoundEvent(new Identifier(MODID, "cow_bell_mm"));
    public static final SoundEvent MM_DIDGERIDOO = new SoundEvent(new Identifier(MODID, "didgeridoo_mm"));
    public static final SoundEvent MM_BIT = new SoundEvent(new Identifier(MODID, "bit_mm"));
    public static final SoundEvent MM_BANJO = new SoundEvent(new Identifier(MODID, "banjo_mm"));
    public static final SoundEvent MM_PLING = new SoundEvent(new Identifier(MODID, "pling_mm"));
    
    public static final SoundEvent PP_HARP = new SoundEvent(new Identifier(MODID, "harp_pp"));
    public static final SoundEvent PP_BASEDRUM = new SoundEvent(new Identifier(MODID, "bd_pp"));
    public static final SoundEvent PP_SNARE = new SoundEvent(new Identifier(MODID, "snare_pp"));
    public static final SoundEvent PP_HAT = new SoundEvent(new Identifier(MODID, "hat_pp"));
    public static final SoundEvent PP_BASS = new SoundEvent(new Identifier(MODID, "bass_pp"));
    public static final SoundEvent PP_FLUTE = new SoundEvent(new Identifier(MODID, "flute_pp"));
    public static final SoundEvent PP_BELL = new SoundEvent(new Identifier(MODID, "bell_pp"));
    public static final SoundEvent PP_GUITAR = new SoundEvent(new Identifier(MODID, "guitar_pp"));
    public static final SoundEvent PP_CHIME = new SoundEvent(new Identifier(MODID, "icechime_pp"));
    public static final SoundEvent PP_XYLOPHONE = new SoundEvent(new Identifier(MODID, "xylophone_pp"));
    public static final SoundEvent PP_IRON_XYLOPHONE = new SoundEvent(new Identifier(MODID, "iron_xylophone_pp"));
    public static final SoundEvent PP_COW_BELL = new SoundEvent(new Identifier(MODID, "cow_bell_pp"));
    public static final SoundEvent PP_DIDGERIDOO = new SoundEvent(new Identifier(MODID, "didgeridoo_pp"));
    public static final SoundEvent PP_BIT = new SoundEvent(new Identifier(MODID, "bit_pp"));
    public static final SoundEvent PP_BANJO = new SoundEvent(new Identifier(MODID, "banjo_pp"));
    public static final SoundEvent PP_PLING = new SoundEvent(new Identifier(MODID, "pling_pp"));
    
//    public static final SoundEvent P4_HARP = new SoundEvent(new Identifier(MODID, "harp_p4"));
//    public static final SoundEvent P4_BASEDRUM = new SoundEvent(new Identifier(MODID, "bd_p4"));
//    public static final SoundEvent P4_SNARE = new SoundEvent(new Identifier(MODID, "snare_p4"));
//    public static final SoundEvent P4_HAT = new SoundEvent(new Identifier(MODID, "hat_p4"));
//    public static final SoundEvent P4_BASS = new SoundEvent(new Identifier(MODID, "bass_p4"));
//    public static final SoundEvent P4_FLUTE = new SoundEvent(new Identifier(MODID, "flute_p4"));
//    public static final SoundEvent P4_BELL = new SoundEvent(new Identifier(MODID, "bell_p4"));
//    public static final SoundEvent P4_GUITAR = new SoundEvent(new Identifier(MODID, "guitar_p4"));
//    public static final SoundEvent P4_CHIME = new SoundEvent(new Identifier(MODID, "icechime_p4"));
//    public static final SoundEvent P4_XYLOPHONE = new SoundEvent(new Identifier(MODID, "xylophone_p4"));
//    public static final SoundEvent P4_IRON_XYLOPHONE = new SoundEvent(new Identifier(MODID, "iron_xylophone_p4"));
//    public static final SoundEvent P4_COW_BELL = new SoundEvent(new Identifier(MODID, "cow_bell_p4"));
//    public static final SoundEvent P4_DIDGERIDOO = new SoundEvent(new Identifier(MODID, "didgeridoo_p4"));
//    public static final SoundEvent P4_BIT = new SoundEvent(new Identifier(MODID, "bit_p4"));
//    public static final SoundEvent P4_BANJO = new SoundEvent(new Identifier(MODID, "banjo_p4"));
//    public static final SoundEvent P4_PLING = new SoundEvent(new Identifier(MODID, "pling_p4"));
//
    public static void registerAllSounds() {
        for (Field f : NNESounds.class.getDeclaredFields()) {
            try {
                Object o = f.get(null);
                if (o instanceof SoundEvent) {
                    Registry.register(Registry.SOUND_EVENT, ((SoundEvent) o).getId(), (SoundEvent) o);
                }
            } catch (IllegalAccessException e) {
                // NO-OP
            }
        }
    }
}
