//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.swresample;

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
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;

@Library("swresample")
@Runtime(CRuntime.class)
public class SwresampleLibrary {
    public static final int LIBSWRESAMPLE_VERSION_INT = 196964;
    public static final int LIBSWRESAMPLE_BUILD = 196964;
    public static final int LIBSWRESAMPLE_VERSION_MICRO = 100;
    public static final int SWR_FLAG_RESAMPLE = 1;
    public static final int LIBSWRESAMPLE_VERSION_MAJOR = 3;
    public static final int LIBSWRESAMPLE_VERSION_MINOR = 1;
    public static final String LIBSWRESAMPLE_IDENT = "SwR3.1.100";

    static {
        BridJ.register();
    }

    public SwresampleLibrary() {
    }

    public static Pointer<AVClass> swr__get_class() {
        return Pointer.pointerToAddress(swr_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long swr_get_class();

    public static Pointer<SwrContext> swr__alloc() {
        return Pointer.pointerToAddress(swr_alloc(), SwrContext.class);
    }

    @Ptr
    protected static native long swr_alloc();

    public static int swr_init(Pointer<SwrContext> s) {
        return swr_init(Pointer.getPeer(s));
    }

    protected static native int swr_init(@Ptr long var0);

    public static int swr_is_initialized(Pointer<SwrContext> s) {
        return swr_is_initialized(Pointer.getPeer(s));
    }

    protected static native int swr_is_initialized(@Ptr long var0);

    public static Pointer<SwrContext> swr_alloc_set_opts(Pointer<SwrContext> s, long out_ch_layout, IntValuedEnum<AVSampleFormat> out_sample_fmt, int out_sample_rate, long in_ch_layout, IntValuedEnum<AVSampleFormat> in_sample_fmt, int in_sample_rate, int log_offset, Pointer<?> log_ctx) {
        return Pointer.pointerToAddress(swr_alloc_set_opts(Pointer.getPeer(s), out_ch_layout, (int)out_sample_fmt.value(), out_sample_rate, in_ch_layout, (int)in_sample_fmt.value(), in_sample_rate, log_offset, Pointer.getPeer(log_ctx)), SwrContext.class);
    }

    @Ptr
    protected static native long swr_alloc_set_opts(@Ptr long var0, long var2, int var4, int var5, long var6, int var8, int var9, int var10, @Ptr long var11);

    public static void swr_free(Pointer<Pointer<SwrContext>> s) {
        swr_free(Pointer.getPeer(s));
    }

    protected static native void swr_free(@Ptr long var0);

    public static void swr_close(Pointer<SwrContext> s) {
        swr_close(Pointer.getPeer(s));
    }

    protected static native void swr_close(@Ptr long var0);

    public static int swr_convert(Pointer<SwrContext> s, Pointer<Pointer<Byte>> out, int out_count, Pointer<Pointer<Byte>> in, int in_count) {
        return swr_convert(Pointer.getPeer(s), Pointer.getPeer(out), out_count, Pointer.getPeer(in), in_count);
    }

    protected static native int swr_convert(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5, int var7);

    public static long swr_next_pts(Pointer<SwrContext> s, long pts) {
        return swr_next_pts(Pointer.getPeer(s), pts);
    }

    protected static native long swr_next_pts(@Ptr long var0, long var2);

    public static int swr_set_compensation(Pointer<SwrContext> s, int sample_delta, int compensation_distance) {
        return swr_set_compensation(Pointer.getPeer(s), sample_delta, compensation_distance);
    }

    protected static native int swr_set_compensation(@Ptr long var0, int var2, int var3);

    public static int swr_set_channel_mapping(Pointer<SwrContext> s, Pointer<Integer> channel_map) {
        return swr_set_channel_mapping(Pointer.getPeer(s), Pointer.getPeer(channel_map));
    }

    protected static native int swr_set_channel_mapping(@Ptr long var0, @Ptr long var2);

    public static int swr_build_matrix(long in_layout, long out_layout, double center_mix_level, double surround_mix_level, double lfe_mix_level, double rematrix_maxval, double rematrix_volume, Pointer<Double> matrix, int stride, IntValuedEnum<AVMatrixEncoding> matrix_encoding, Pointer<?> log_ctx) {
        return swr_build_matrix(in_layout, out_layout, center_mix_level, surround_mix_level, lfe_mix_level, rematrix_maxval, rematrix_volume, Pointer.getPeer(matrix), stride, (int)matrix_encoding.value(), Pointer.getPeer(log_ctx));
    }

    protected static native int swr_build_matrix(long var0, long var2, double var4, double var6, double var8, double var10, double var12, @Ptr long var14, int var16, int var17, @Ptr long var18);

    public static int swr_set_matrix(Pointer<SwrContext> s, Pointer<Double> matrix, int stride) {
        return swr_set_matrix(Pointer.getPeer(s), Pointer.getPeer(matrix), stride);
    }

    protected static native int swr_set_matrix(@Ptr long var0, @Ptr long var2, int var4);

    public static int swr_drop_output(Pointer<SwrContext> s, int count) {
        return swr_drop_output(Pointer.getPeer(s), count);
    }

    protected static native int swr_drop_output(@Ptr long var0, int var2);

    public static int swr_inject_silence(Pointer<SwrContext> s, int count) {
        return swr_inject_silence(Pointer.getPeer(s), count);
    }

    protected static native int swr_inject_silence(@Ptr long var0, int var2);

    public static long swr_get_delay(Pointer<SwrContext> s, long base) {
        return swr_get_delay(Pointer.getPeer(s), base);
    }

    protected static native long swr_get_delay(@Ptr long var0, long var2);

    public static int swr_get_out_samples(Pointer<SwrContext> s, int in_samples) {
        return swr_get_out_samples(Pointer.getPeer(s), in_samples);
    }

    protected static native int swr_get_out_samples(@Ptr long var0, int var2);

    public static native int swresample_version();

    public static Pointer<Byte> swresample__configuration() {
        return Pointer.pointerToAddress(swresample_configuration(), Byte.class);
    }

    @Ptr
    protected static native long swresample_configuration();

    public static Pointer<Byte> swresample__license() {
        return Pointer.pointerToAddress(swresample_license(), Byte.class);
    }

    @Ptr
    protected static native long swresample_license();

    public static int swr_convert_frame(Pointer<SwrContext> swr, Pointer<AVFrame> output, Pointer<AVFrame> input) {
        return swr_convert_frame(Pointer.getPeer(swr), Pointer.getPeer(output), Pointer.getPeer(input));
    }

    protected static native int swr_convert_frame(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int swr_config_frame(Pointer<SwrContext> swr, Pointer<AVFrame> out, Pointer<AVFrame> in) {
        return swr_config_frame(Pointer.getPeer(swr), Pointer.getPeer(out), Pointer.getPeer(in));
    }

    protected static native int swr_config_frame(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static enum SwrDitherType implements IntValuedEnum<SwresampleLibrary.SwrDitherType> {
        SWR_DITHER_NONE(0L),
        SWR_DITHER_RECTANGULAR(1L),
        SWR_DITHER_TRIANGULAR(2L),
        SWR_DITHER_TRIANGULAR_HIGHPASS(3L),
        SWR_DITHER_NS(64L),
        SWR_DITHER_NS_LIPSHITZ(65L),
        SWR_DITHER_NS_F_WEIGHTED(66L),
        SWR_DITHER_NS_MODIFIED_E_WEIGHTED(67L),
        SWR_DITHER_NS_IMPROVED_E_WEIGHTED(68L),
        SWR_DITHER_NS_SHIBATA(69L),
        SWR_DITHER_NS_LOW_SHIBATA(70L),
        SWR_DITHER_NS_HIGH_SHIBATA(71L),
        SWR_DITHER_NB(72L);

        public final long value;

        private SwrDitherType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<SwresampleLibrary.SwrDitherType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<SwresampleLibrary.SwrDitherType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum SwrEngine implements IntValuedEnum<SwresampleLibrary.SwrEngine> {
        SWR_ENGINE_SWR(0L),
        SWR_ENGINE_SOXR(1L),
        SWR_ENGINE_NB(2L);

        public final long value;

        private SwrEngine(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<SwresampleLibrary.SwrEngine> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<SwresampleLibrary.SwrEngine> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum SwrFilterType implements IntValuedEnum<SwresampleLibrary.SwrFilterType> {
        SWR_FILTER_TYPE_CUBIC(0L),
        SWR_FILTER_TYPE_BLACKMAN_NUTTALL(1L),
        SWR_FILTER_TYPE_KAISER(2L);

        public final long value;

        private SwrFilterType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<SwresampleLibrary.SwrFilterType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<SwresampleLibrary.SwrFilterType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }
}
