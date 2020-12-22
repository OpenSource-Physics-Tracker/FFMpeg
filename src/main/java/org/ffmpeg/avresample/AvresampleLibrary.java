//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avresample;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AvutilLibrary.AVMatrixEncoding;

@Library("avresample")
@Runtime(CRuntime.class)
public class AvresampleLibrary {
    public static final int LIBAVRESAMPLE_VERSION_MICRO = 0;
    public static final int LIBAVRESAMPLE_VERSION_INT = 262144;
    public static final String LIBAVRESAMPLE_IDENT = "Lavr4.0.0";
    public static final int LIBAVRESAMPLE_BUILD = 262144;
    public static final int LIBAVRESAMPLE_VERSION_MINOR = 0;
    public static final int LIBAVRESAMPLE_VERSION_MAJOR = 4;
    public static final int AVRESAMPLE_MAX_CHANNELS = 32;

    static {
        BridJ.register();
    }

    public AvresampleLibrary() {
    }

    public static native int avresample_version();

    public static Pointer<Byte> avresample__configuration() {
        return Pointer.pointerToAddress(avresample_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avresample_configuration();

    public static Pointer<Byte> avresample__license() {
        return Pointer.pointerToAddress(avresample_license(), Byte.class);
    }

    @Ptr
    protected static native long avresample_license();

    public static Pointer<AVClass> avresample__get_class() {
        return Pointer.pointerToAddress(avresample_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long avresample_get_class();

    public static Pointer<AVAudioResampleContext> avresample__alloc_context() {
        return Pointer.pointerToAddress(avresample_alloc_context(), AVAudioResampleContext.class);
    }

    @Ptr
    protected static native long avresample_alloc_context();

    public static int avresample_open(Pointer<AVAudioResampleContext> avr) {
        return avresample_open(Pointer.getPeer(avr));
    }

    protected static native int avresample_open(@Ptr long var0);

    public static int avresample_is_open(Pointer<AVAudioResampleContext> avr) {
        return avresample_is_open(Pointer.getPeer(avr));
    }

    protected static native int avresample_is_open(@Ptr long var0);

    public static void avresample_close(Pointer<AVAudioResampleContext> avr) {
        avresample_close(Pointer.getPeer(avr));
    }

    protected static native void avresample_close(@Ptr long var0);

    public static void avresample_free(Pointer<Pointer<AVAudioResampleContext>> avr) {
        avresample_free(Pointer.getPeer(avr));
    }

    protected static native void avresample_free(@Ptr long var0);

    public static int avresample_build_matrix(long in_layout, long out_layout, double center_mix_level, double surround_mix_level, double lfe_mix_level, int normalize, Pointer<Double> matrix, int stride, IntValuedEnum<AVMatrixEncoding> matrix_encoding) {
        return avresample_build_matrix(in_layout, out_layout, center_mix_level, surround_mix_level, lfe_mix_level, normalize, Pointer.getPeer(matrix), stride, (int)matrix_encoding.value());
    }

    protected static native int avresample_build_matrix(long var0, long var2, double var4, double var6, double var8, int var10, @Ptr long var11, int var13, int var14);

    public static int avresample_get_matrix(Pointer<AVAudioResampleContext> avr, Pointer<Double> matrix, int stride) {
        return avresample_get_matrix(Pointer.getPeer(avr), Pointer.getPeer(matrix), stride);
    }

    protected static native int avresample_get_matrix(@Ptr long var0, @Ptr long var2, int var4);

    public static int avresample_set_matrix(Pointer<AVAudioResampleContext> avr, Pointer<Double> matrix, int stride) {
        return avresample_set_matrix(Pointer.getPeer(avr), Pointer.getPeer(matrix), stride);
    }

    protected static native int avresample_set_matrix(@Ptr long var0, @Ptr long var2, int var4);

    public static int avresample_set_channel_mapping(Pointer<AVAudioResampleContext> avr, Pointer<Integer> channel_map) {
        return avresample_set_channel_mapping(Pointer.getPeer(avr), Pointer.getPeer(channel_map));
    }

    protected static native int avresample_set_channel_mapping(@Ptr long var0, @Ptr long var2);

    public static int avresample_set_compensation(Pointer<AVAudioResampleContext> avr, int sample_delta, int compensation_distance) {
        return avresample_set_compensation(Pointer.getPeer(avr), sample_delta, compensation_distance);
    }

    protected static native int avresample_set_compensation(@Ptr long var0, int var2, int var3);

    public static int avresample_get_out_samples(Pointer<AVAudioResampleContext> avr, int in_nb_samples) {
        return avresample_get_out_samples(Pointer.getPeer(avr), in_nb_samples);
    }

    protected static native int avresample_get_out_samples(@Ptr long var0, int var2);

    public static int avresample_convert(Pointer<AVAudioResampleContext> avr, Pointer<Pointer<Byte>> output, int out_plane_size, int out_samples, Pointer<Pointer<Byte>> input, int in_plane_size, int in_samples) {
        return avresample_convert(Pointer.getPeer(avr), Pointer.getPeer(output), out_plane_size, out_samples, Pointer.getPeer(input), in_plane_size, in_samples);
    }

    protected static native int avresample_convert(@Ptr long var0, @Ptr long var2, int var4, int var5, @Ptr long var6, int var8, int var9);

    public static int avresample_get_delay(Pointer<AVAudioResampleContext> avr) {
        return avresample_get_delay(Pointer.getPeer(avr));
    }

    protected static native int avresample_get_delay(@Ptr long var0);

    public static int avresample_available(Pointer<AVAudioResampleContext> avr) {
        return avresample_available(Pointer.getPeer(avr));
    }

    protected static native int avresample_available(@Ptr long var0);

    public static int avresample_read(Pointer<AVAudioResampleContext> avr, Pointer<Pointer<Byte>> output, int nb_samples) {
        return avresample_read(Pointer.getPeer(avr), Pointer.getPeer(output), nb_samples);
    }

    protected static native int avresample_read(@Ptr long var0, @Ptr long var2, int var4);

    public static int avresample_convert_frame(Pointer<AVAudioResampleContext> avr, Pointer<AVFrame> output, Pointer<AVFrame> input) {
        return avresample_convert_frame(Pointer.getPeer(avr), Pointer.getPeer(output), Pointer.getPeer(input));
    }

    protected static native int avresample_convert_frame(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avresample_config(Pointer<AVAudioResampleContext> avr, Pointer<AVFrame> out, Pointer<AVFrame> in) {
        return avresample_config(Pointer.getPeer(avr), Pointer.getPeer(out), Pointer.getPeer(in));
    }

    protected static native int avresample_config(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    /** @deprecated */
    public static enum AVMixCoeffType implements IntValuedEnum<AvresampleLibrary.AVMixCoeffType> {
        AV_MIX_COEFF_TYPE_Q8(0L),
        AV_MIX_COEFF_TYPE_Q15(1L),
        AV_MIX_COEFF_TYPE_FLT(2L),
        AV_MIX_COEFF_TYPE_NB(3L);

        public final long value;

        private AVMixCoeffType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvresampleLibrary.AVMixCoeffType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvresampleLibrary.AVMixCoeffType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    /** @deprecated */
    public static enum AVResampleDitherMethod implements IntValuedEnum<AvresampleLibrary.AVResampleDitherMethod> {
        AV_RESAMPLE_DITHER_NONE(0L),
        AV_RESAMPLE_DITHER_RECTANGULAR(1L),
        AV_RESAMPLE_DITHER_TRIANGULAR(2L),
        AV_RESAMPLE_DITHER_TRIANGULAR_HP(3L),
        AV_RESAMPLE_DITHER_TRIANGULAR_NS(4L),
        AV_RESAMPLE_DITHER_NB(5L);

        public final long value;

        private AVResampleDitherMethod(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvresampleLibrary.AVResampleDitherMethod> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvresampleLibrary.AVResampleDitherMethod> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    /** @deprecated */
    public static enum AVResampleFilterType implements IntValuedEnum<AvresampleLibrary.AVResampleFilterType> {
        AV_RESAMPLE_FILTER_TYPE_CUBIC(0L),
        AV_RESAMPLE_FILTER_TYPE_BLACKMAN_NUTTALL(1L),
        AV_RESAMPLE_FILTER_TYPE_KAISER(2L);

        public final long value;

        private AVResampleFilterType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvresampleLibrary.AVResampleFilterType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvresampleLibrary.AVResampleFilterType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }
}
