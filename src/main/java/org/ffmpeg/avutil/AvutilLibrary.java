//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;

@Library("avutil")
@Runtime(CRuntime.class)
public class AvutilLibrary {
    public static final int AV_FRAME_CROP_UNALIGNED = 1;
    public static final int AV_OPT_FLAG_IMPLICIT_KEY = 1;
    public static final int AV_HWFRAME_MAP_READ = 1;
    public static final int AV_HWFRAME_MAP_WRITE = 2;
    public static final int AV_HWFRAME_MAP_OVERWRITE = 4;
    public static final int AV_HWFRAME_MAP_DIRECT = 8;
    public static final int AV_UTF8_FLAG_ACCEPT_NON_CHARACTERS = 2;
    public static final int AV_DICT_APPEND = 32;
    public static final int AVERROR_DECODER_NOT_FOUND = -248;
    public static final double M_LOG2_10 = 3.321928094887362D;
    public static final int FF_LOSS_RESOLUTION = 1;
    public static final int AV_UTF8_FLAG_ACCEPT_INVALID_BIG_CODES = 1;
    public static final int FF_QP2LAMBDA = 118;
    public static final int AV_CPU_FLAG_MMX2 = 2;
    public static final int AV_LOG_WARNING = 24;
    public static final int AV_LOG_PANIC = 0;
    public static final int AVERROR_HTTP_UNAUTHORIZED = -248;
    public static final boolean FF_API_VAAPI = true;
    public static final int FF_DECODE_ERROR_INVALID_BITSTREAM = 1;
    public static final int AV_CH_LAYOUT_7POINT1 = 1599;
    public static final int AV_CH_LAYOUT_7POINT0 = 1591;
    public static final int AV_OPT_SERIALIZE_SKIP_DEFAULTS = 1;
    public static final int AV_CPU_FLAG_AVX512 = 1048576;
    public static final int AV_CPU_FLAG_3DNOW = 4;
    public static final int AV_CH_SIDE_RIGHT = 1024;
    public static final int AV_ESCAPE_FLAG_STRICT = 2;
    public static final int AV_OPT_FLAG_ENCODING_PARAM = 1;
    public static final int AVERROR_EXPERIMENTAL = 733130664;
    public static final int AVERROR_HTTP_NOT_FOUND = -248;
    public static final int AV_CH_LAYOUT_7POINT0_FRONT = 1735;
    public static final long AV_CH_SURROUND_DIRECT_RIGHT = 17179869184L;
    public static final int AV_CH_TOP_BACK_CENTER = 65536;
    public static final int AV_CH_LAYOUT_HEXAGONAL = 311;
    public static final int AV_CPU_FLAG_SSSE3 = 128;
    public static final int AV_CH_FRONT_CENTER = 4;
    public static final int AV_OPT_FLAG_DECODING_PARAM = 2;
    public static final int AV_CH_LAYOUT_2POINT1 = 11;
    public static final int AVERROR_STREAM_NOT_FOUND = -248;
    public static final int AV_CPU_FLAG_AESNI = 524288;
    public static final int AV_CH_LAYOUT_SURROUND = 7;
    public static final int FF_LAMBDA_MAX = 32767;
    public static final int AV_PIX_FMT_FLAG_FLOAT = 512;
    public static final int AV_CPU_FLAG_ARMV6 = 2;
    public static final int AV_CPU_FLAG_ARMV8 = 64;
    public static final int AV_HAVE_BIGENDIAN = 0;
    public static final int AVERROR_EXIT = -69;
    public static final int AV_CH_LAYOUT_MONO = 4;
    public static final boolean FF_API_PKT_PTS = true;
    public static final double M_PHI = 1.618033988749895D;
    public static final int AV_PIX_FMT_FLAG_PAL = 2;
    public static final int AVERROR_BUG = -66;
    public static final int AV_CH_BACK_RIGHT = 32;
    public static final int AV_FRAME_FLAG_CORRUPT = 1;
    public static final int AV_CH_BACK_LEFT = 16;
    public static final int AV_DICT_DONT_STRDUP_KEY = 4;
    public static final int AVERROR_MUXER_NOT_FOUND = -248;
    public static final int AV_CPU_FLAG_3DNOWEXT = 32;
    public static final int AVERROR_FILTER_NOT_FOUND = -248;
    public static final int AV_NUM_DATA_POINTERS = 8;
    public static final int AV_TIME_BASE = 1000000;
    public static final int AV_OPT_FLAG_VIDEO_PARAM = 16;
    public static final int AV_CH_LAYOUT_5POINT1_BACK = 63;
    public static final int AV_PIX_FMT_FLAG_PSEUDOPAL = 64;
    public static final int AV_OPT_SEARCH_FAKE_OBJ = 2;
    public static final int AV_BPRINT_SIZE_UNLIMITED = -1;
    public static final int AV_PIX_FMT_FLAG_ALPHA = 128;
    public static final long AV_CH_LAYOUT_HEXADECAGONAL = 6442710839L;
    public static final int AV_CPU_FLAG_AVXSLOW = 134217728;
    public static final int AV_CH_FRONT_RIGHT = 2;
    public static final int AV_LOG_QUIET = -8;
    public static final int AVERROR_PROTOCOL_NOT_FOUND = -248;
    public static final long AV_CH_WIDE_RIGHT = 4294967296L;
    public static final int AV_CPU_FLAG_SSSE3SLOW = 67108864;
    public static final int AV_CH_LOW_FREQUENCY = 8;
    public static final int AVERROR_INPUT_CHANGED = 1668179713;
    public static final int AV_LOG_FATAL = 8;
    public static final int AV_CPU_FLAG_CMOV = 4096;
    public static final int LIBAVUTIL_VERSION_MICRO = 100;
    public static final int AV_CH_TOP_FRONT_CENTER = 8192;
    public static final String LIBAVUTIL_IDENT = "Lavu56.14.100";
    public static final int AV_PIX_FMT_FLAG_HWACCEL = 8;
    public static final int AV_LOG_DEBUG = 48;
    public static final int AV_ERROR_MAX_STRING_SIZE = 64;
    public static final int AV_CPU_FLAG_ARMV6T2 = 4;
    public static final int AV_UTF8_FLAG_ACCEPT_SURROGATES = 4;
    public static final int AV_LOG_INFO = 32;
    public static final int AV_CH_LAYOUT_5POINT1 = 1551;
    public static final int AV_CH_LAYOUT_5POINT0 = 1543;
    public static final int AV_CPU_FLAG_ATOM = 268435456;
    public static final int AV_PIX_FMT_FLAG_BE = 1;
    public static final int AV_CH_LAYOUT_6POINT1_BACK = 319;
    public static final int AVERROR_INVALIDDATA = -73;
    public static final int AV_CH_LAYOUT_4POINT1 = 271;
    public static final int AV_CH_LAYOUT_4POINT0 = 263;
    public static final int AV_CPU_FLAG_SSE2SLOW = 1073741824;
    public static final int AV_CPU_FLAG_XOP = 1024;
    public static final int AV_OPT_FLAG_AUDIO_PARAM = 8;
    public static final long AV_CH_LOW_FREQUENCY_2 = 34359738368L;
    public static final int AVERROR_DEMUXER_NOT_FOUND = -248;
    public static final int FF_LOSS_COLORSPACE = 4;
    public static final int AV_CH_FRONT_LEFT_OF_CENTER = 64;
    public static final int AV_LOG_PRINT_LEVEL = 2;
    public static final int AV_CPU_FLAG_NEON = 32;
    public static final int AV_CPU_FLAG_POWER8 = 4;
    public static final int AV_OPT_FLAG_FILTERING_PARAM = 65536;
    public static final int AV_CH_TOP_BACK_LEFT = 32768;
    public static final int AVERROR_HTTP_OTHER_4XX = -248;
    public static final int AV_CH_TOP_FRONT_RIGHT = 16384;
    public static final long AV_NOPTS_VALUE = -9223372036854775808L;
    public static final int AVERROR_PATCHWELCOME = -80;
    public static final int AV_CH_LAYOUT_STEREO_DOWNMIX = 1610612736;
    public static final int AV_PIX_FMT_FLAG_BITSTREAM = 4;
    public static final int AV_CH_FRONT_LEFT = 1;
    public static final int AV_BPRINT_SIZE_AUTOMATIC = 1;
    public static final int AV_OPT_ALLOW_NULL = 4;
    public static final int AVPALETTE_SIZE = 1024;
    public static final int FF_LOSS_DEPTH = 2;
    public static final long AV_CH_WIDE_LEFT = 2147483648L;
    public static final int AV_BPRINT_SIZE_COUNT_ONLY = 0;
    public static final int AV_CH_LAYOUT_5POINT0_BACK = 55;
    public static final int AV_DICT_MULTIKEY = 64;
    public static final int AV_ESCAPE_FLAG_WHITESPACE = 1;
    public static final int AV_LOG_VERBOSE = 40;
    public static final int AV_FOURCC_MAX_STRING_SIZE = 32;
    public static final int AV_CPU_FLAG_SSE = 8;
    public static final int AVERROR_BSF_NOT_FOUND = -248;
    public static final int LIBAVUTIL_BUILD = 3673700;
    public static final int AV_CH_LAYOUT_QUAD = 51;
    public static final int AV_BUFFER_FLAG_READONLY = 1;
    public static final int AV_OPT_SEARCH_CHILDREN = 1;
    public static final int AV_CH_LAYOUT_STEREO = 3;
    public static final int AV_CH_LAYOUT_6POINT0_FRONT = 1731;
    public static final int AV_CH_TOP_FRONT_LEFT = 4096;
    public static final int AV_CH_LAYOUT_6POINT1 = 1807;
    public static final int AV_CH_LAYOUT_6POINT0 = 1799;
    public static final long AV_CH_SURROUND_DIRECT_LEFT = 8589934592L;
    public static final boolean FF_API_FRAME_GET_SET = true;
    public static final int AV_LOG_ERROR = 16;
    public static final int AV_CPU_FLAG_ARMV5TE = 1;
    public static final int AV_CPU_FLAG_VFP_VM = 128;
    public static final int AV_LOG_TRACE = 56;
    public static final int AV_UTF8_FLAG_EXCLUDE_XML_INVALID_CONTROL_CODES = 8;
    public static final int AV_DICT_DONT_OVERWRITE = 16;
    public static final boolean FF_API_FRAME_QP = true;
    public static final int AV_CH_LAYOUT_2_1 = 259;
    public static final int AV_CH_LAYOUT_2_2 = 1539;
    public static final int FF_LAMBDA_SHIFT = 7;
    public static final int AV_DICT_DONT_STRDUP_VAL = 8;
    public static final int AV_LOG_SKIP_REPEATED = 1;
    public static final int FF_LOSS_CHROMA = 32;
    public static final int AV_LOG_MAX_OFFSET = 64;
    public static final int FF_QUALITY_SCALE = 128;
    public static final int AV_PIX_FMT_FLAG_BAYER = 256;
    public static final int AV_CH_LAYOUT_3POINT1 = 15;
    public static final int AV_PIX_FMT_FLAG_RGB = 32;
    public static final int AVERROR_EXTERNAL = -69;
    public static final int AV_CH_LAYOUT_7POINT1_WIDE_BACK = 255;
    public static final int AVERROR_OPTION_NOT_FOUND = -248;
    public static final int AV_OPT_MULTI_COMPONENT_RANGE = 4096;
    public static final int AV_CPU_FLAG_VFPV3 = 16;
    public static final int AV_CH_SIDE_LEFT = 512;
    public static final int AV_OPT_SERIALIZE_OPT_FLAGS_EXACT = 2;
    public static final boolean FF_API_PLUS1_MINUS1 = true;
    public static final int AVERROR_HTTP_FORBIDDEN = -248;
    public static final int AVERROR_BUG2 = -66;
    public static final int AV_PIX_FMT_FLAG_PLANAR = 16;
    public static final int AVERROR_OUTPUT_CHANGED = 1668179714;
    public static final int AV_CPU_FLAG_AVX = 16384;
    public static final long AV_CH_LAYOUT_NATIVE = -9223372036854775808L;
    public static final int AVERROR_ENCODER_NOT_FOUND = -248;
    public static final int AV_CH_STEREO_LEFT = 536870912;
    public static final int AV_CH_LAYOUT_7POINT1_WIDE = 1743;
    public static final int AV_UTF8_FLAG_ACCEPT_ALL = 7;
    public static final int AV_CPU_FLAG_SETEND = 65536;
    public static final int AV_CH_STEREO_RIGHT = 1073741824;
    public static final int AV_CPU_FLAG_VSX = 2;
    public static final int AV_CPU_FLAG_SSE3SLOW = 536870912;
    public static final int FF_LAMBDA_SCALE = 128;
    public static final int AV_CPU_FLAG_ALTIVEC = 1;
    public static final int AV_OPT_FLAG_BSF_PARAM = 256;
    public static final int AV_CH_TOP_CENTER = 2048;
    public static final int AV_CH_LAYOUT_6POINT1_FRONT = 1739;
    public static final int AV_OPT_FLAG_SUBTITLE_PARAM = 32;
    public static final int AV_CPU_FLAG_FORCE = -2147483648;
    public static final int AV_HAVE_FAST_UNALIGNED = 1;
    public static final int AVERROR_BUFFER_TOO_SMALL = -66;
    public static final int AVPALETTE_COUNT = 256;
    public static final int LIBAVUTIL_VERSION_MAJOR = 56;
    public static final String FFMPEG_VERSION = "4.0.2";
    public static final boolean FF_API_CRYPTO_SIZE_T = true;
    public static final int AVERROR_EOF = -69;
    public static final int AV_CH_TOP_BACK_RIGHT = 131072;
    public static final int FF_LOSS_COLORQUANT = 16;
    public static final int AV_CPU_FLAG_SSE42 = 512;
    public static final boolean FF_API_PSEUDOPAL = true;
    public static final int AV_CH_BACK_CENTER = 256;
    public static final int AV_DICT_MATCH_CASE = 1;
    public static final int AVERROR_HTTP_SERVER_ERROR = -248;
    public static final int FF_LOSS_ALPHA = 8;
    public static final int AV_OPT_FLAG_EXPORT = 64;
    public static final boolean FF_API_ERROR_FRAME = true;
    public static final int AV_CPU_FLAG_AVX2 = 32768;
    public static final int AV_CPU_FLAG_FMA4 = 2048;
    public static final int AVERROR_UNKNOWN = -85;
    public static final int AV_CPU_FLAG_FMA3 = 65536;
    public static final int AV_DICT_IGNORE_SUFFIX = 2;
    public static final int FF_DECODE_ERROR_MISSING_REFERENCE = 2;
    public static final int AV_OPT_FLAG_READONLY = 128;
    public static final int AV_CH_LAYOUT_OCTAGONAL = 1847;
    public static final int AV_CPU_FLAG_VFP = 8;
    public static final int AV_CPU_FLAG_MMX = 1;
    public static final int AV_CPU_FLAG_BMI2 = 262144;
    public static final int AV_CPU_FLAG_BMI1 = 131072;
    public static final int AV_FRAME_FLAG_DISCARD = 4;
    public static final int AVERROR_HTTP_BAD_REQUEST = -248;
    public static final int LIBAVUTIL_VERSION_MINOR = 14;
    public static final int AV_CPU_FLAG_SSE2 = 16;
    public static final int AV_CH_FRONT_RIGHT_OF_CENTER = 128;
    public static final int LIBAVUTIL_VERSION_INT = 3673700;
    public static final int AV_CPU_FLAG_MMXEXT = 2;
    public static final int AV_CPU_FLAG_SSE3 = 64;
    public static final int AV_CPU_FLAG_SSE4 = 256;

    static {
        BridJ.register();
    }

    public AvutilLibrary() {
    }

    public static native int avutil_version();

    public static Pointer<Byte> av__version_info() {
        return Pointer.pointerToAddress(av_version_info(), Byte.class);
    }

    @Ptr
    protected static native long av_version_info();

    public static Pointer<Byte> avutil__configuration() {
        return Pointer.pointerToAddress(avutil_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avutil_configuration();

    public static Pointer<Byte> avutil__license() {
        return Pointer.pointerToAddress(avutil_license(), Byte.class);
    }

    @Ptr
    protected static native long avutil_license();

    public static Pointer<Byte> av_get_media_type_string(IntValuedEnum<AvutilLibrary.AVMediaType> media_type) {
        return Pointer.pointerToAddress(av_get_media_type_string((int)media_type.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_media_type_string(int var0);

    public static byte av_get_picture_type_char(IntValuedEnum<AvutilLibrary.AVPictureType> pict_type) {
        return av_get_picture_type_char((int)pict_type.value());
    }

    protected static native byte av_get_picture_type_char(int var0);

    public static native int av_log2(int var0);

    public static native int av_log2_16bit(int var0);

    public static int av_strerror(int errnum, Pointer<Byte> errbuf, @Ptr long errbuf_size) {
        return av_strerror(errnum, Pointer.getPeer(errbuf), errbuf_size);
    }

    protected static native int av_strerror(int var0, @Ptr long var1, @Ptr long var3);

    public static Pointer<?> malloc(@Ptr long size) {
        return Pointer.pointerToAddress(av_malloc(size));
    }

    @Ptr
    protected static native long av_malloc(@Ptr long var0);

    public static Pointer<?> av__mallocz(@Ptr long size) {
        return Pointer.pointerToAddress(av_mallocz(size));
    }

    @Ptr
    protected static native long av_mallocz(@Ptr long var0);

    public static Pointer<?> av__malloc_array(@Ptr long nmemb, @Ptr long size) {
        return Pointer.pointerToAddress(av_malloc_array(nmemb, size));
    }

    @Ptr
    protected static native long av_malloc_array(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av__mallocz_array(@Ptr long nmemb, @Ptr long size) {
        return Pointer.pointerToAddress(av_mallocz_array(nmemb, size));
    }

    @Ptr
    protected static native long av_mallocz_array(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av__calloc(@Ptr long nmemb, @Ptr long size) {
        return Pointer.pointerToAddress(av_calloc(nmemb, size));
    }

    @Ptr
    protected static native long av_calloc(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av_realloc(Pointer<?> ptr, @Ptr long size) {
        return Pointer.pointerToAddress(av_realloc(Pointer.getPeer(ptr), size));
    }

    @Ptr
    protected static native long av_realloc(@Ptr long var0, @Ptr long var2);

    public static int av_reallocp(Pointer<?> ptr, @Ptr long size) {
        return av_reallocp(Pointer.getPeer(ptr), size);
    }

    protected static native int av_reallocp(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av_realloc_f(Pointer<?> ptr, @Ptr long nelem, @Ptr long elsize) {
        return Pointer.pointerToAddress(av_realloc_f(Pointer.getPeer(ptr), nelem, elsize));
    }

    @Ptr
    protected static native long av_realloc_f(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<?> av_realloc_array(Pointer<?> ptr, @Ptr long nmemb, @Ptr long size) {
        return Pointer.pointerToAddress(av_realloc_array(Pointer.getPeer(ptr), nmemb, size));
    }

    @Ptr
    protected static native long av_realloc_array(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_reallocp_array(Pointer<?> ptr, @Ptr long nmemb, @Ptr long size) {
        return av_reallocp_array(Pointer.getPeer(ptr), nmemb, size);
    }

    protected static native int av_reallocp_array(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<?> av_fast_realloc(Pointer<?> ptr, Pointer<Integer> size, @Ptr long min_size) {
        return Pointer.pointerToAddress(av_fast_realloc(Pointer.getPeer(ptr), Pointer.getPeer(size), min_size));
    }

    @Ptr
    protected static native long av_fast_realloc(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_fast_malloc(Pointer<?> ptr, Pointer<Integer> size, @Ptr long min_size) {
        av_fast_malloc(Pointer.getPeer(ptr), Pointer.getPeer(size), min_size);
    }

    protected static native void av_fast_malloc(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_fast_mallocz(Pointer<?> ptr, Pointer<Integer> size, @Ptr long min_size) {
        av_fast_mallocz(Pointer.getPeer(ptr), Pointer.getPeer(size), min_size);
    }

    protected static native void av_fast_mallocz(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_free(Pointer<?> ptr) {
        av_free(Pointer.getPeer(ptr));
    }

    protected static native void av_free(@Ptr long var0);

    public static void av_freep(Pointer<?> ptr) {
        av_freep(Pointer.getPeer(ptr));
    }

    protected static native void av_freep(@Ptr long var0);

    public static Pointer<Byte> av_strdup(Pointer<Byte> s) {
        return Pointer.pointerToAddress(av_strdup(Pointer.getPeer(s)), Byte.class);
    }

    @Ptr
    protected static native long av_strdup(@Ptr long var0);

    public static Pointer<Byte> av_strndup(Pointer<Byte> s, @Ptr long len) {
        return Pointer.pointerToAddress(av_strndup(Pointer.getPeer(s), len), Byte.class);
    }

    @Ptr
    protected static native long av_strndup(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av_memdup(Pointer<?> p, @Ptr long size) {
        return Pointer.pointerToAddress(av_memdup(Pointer.getPeer(p), size));
    }

    @Ptr
    protected static native long av_memdup(@Ptr long var0, @Ptr long var2);

    public static void av_memcpy_backptr(Pointer<Byte> dst, int back, int cnt) {
        av_memcpy_backptr(Pointer.getPeer(dst), back, cnt);
    }

    protected static native void av_memcpy_backptr(@Ptr long var0, int var2, int var3);

    public static void av_dynarray_add(Pointer<?> tab_ptr, Pointer<Integer> nb_ptr, Pointer<?> elem) {
        av_dynarray_add(Pointer.getPeer(tab_ptr), Pointer.getPeer(nb_ptr), Pointer.getPeer(elem));
    }

    protected static native void av_dynarray_add(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_dynarray_add_nofree(Pointer<?> tab_ptr, Pointer<Integer> nb_ptr, Pointer<?> elem) {
        return av_dynarray_add_nofree(Pointer.getPeer(tab_ptr), Pointer.getPeer(nb_ptr), Pointer.getPeer(elem));
    }

    protected static native int av_dynarray_add_nofree(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<?> av_dynarray2_add(Pointer<Pointer<?>> tab_ptr, Pointer<Integer> nb_ptr, @Ptr long elem_size, Pointer<Byte> elem_data) {
        return Pointer.pointerToAddress(av_dynarray2_add(Pointer.getPeer(tab_ptr), Pointer.getPeer(nb_ptr), elem_size, Pointer.getPeer(elem_data)));
    }

    @Ptr
    protected static native long av_dynarray2_add(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static native void av_max_alloc(@Ptr long var0);

    public static int av_reduce(Pointer<Integer> dst_num, Pointer<Integer> dst_den, long num, long den, long max) {
        return av_reduce(Pointer.getPeer(dst_num), Pointer.getPeer(dst_den), num, den, max);
    }

    protected static native int av_reduce(@Ptr long var0, @Ptr long var2, long var4, long var6, long var8);

    public static native AVRational av_mul_q(AVRational var0, AVRational var1);

    public static native AVRational av_div_q(AVRational var0, AVRational var1);

    public static native AVRational av_add_q(AVRational var0, AVRational var1);

    public static native AVRational av_sub_q(AVRational var0, AVRational var1);

    public static native AVRational av_d2q(double var0, int var2);

    public static native int av_nearer_q(AVRational var0, AVRational var1, AVRational var2);

    public static int av_find_nearest_q_idx(AVRational q, Pointer<AVRational> q_list) {
        return av_find_nearest_q_idx(q, Pointer.getPeer(q_list));
    }

    protected static native int av_find_nearest_q_idx(AVRational var0, @Ptr long var1);

    public static native int av_q2intfloat(AVRational var0);

    public static native long av_gcd(long var0, long var2);

    public static native long av_rescale(long var0, long var2, long var4);

    public static long av_rescale_rnd(long a, long b, long c, IntValuedEnum<AvutilLibrary.AVRounding> rnd) {
        return av_rescale_rnd(a, b, c, (int)rnd.value());
    }

    protected static native long av_rescale_rnd(long var0, long var2, long var4, int var6);

    public static native long av_rescale_q(long var0, AVRational var2, AVRational var3);

    public static long av_rescale_q_rnd(long a, AVRational bq, AVRational cq, IntValuedEnum<AvutilLibrary.AVRounding> rnd) {
        return av_rescale_q_rnd(a, bq, cq, (int)rnd.value());
    }

    protected static native long av_rescale_q_rnd(long var0, AVRational var2, AVRational var3, int var4);

    public static native int av_compare_ts(long var0, AVRational var2, long var3, AVRational var5);

    public static native long av_compare_mod(long var0, long var2, long var4);

    public static long av_rescale_delta(AVRational in_tb, long in_ts, AVRational fs_tb, int duration, Pointer<Long> last, AVRational out_tb) {
        return av_rescale_delta(in_tb, in_ts, fs_tb, duration, Pointer.getPeer(last), out_tb);
    }

    protected static native long av_rescale_delta(AVRational var0, long var1, AVRational var3, int var4, @Ptr long var5, AVRational var7);

    public static native long av_add_stable(AVRational var0, long var1, AVRational var3, long var4);

    public static void av_log(Pointer<?> avcl, int level, Pointer<Byte> fmt, Object... varArgs1) {
        av_log(Pointer.getPeer(avcl), level, Pointer.getPeer(fmt), varArgs1);
    }

    protected static native void av_log(@Ptr long var0, int var2, @Ptr long var3, Object... var5);

    public static void av_vlog(Pointer<?> avcl, int level, Pointer<Byte> fmt, Object... vl) {
        av_vlog(Pointer.getPeer(avcl), level, Pointer.getPeer(fmt), vl);
    }

    protected static native void av_vlog(@Ptr long var0, int var2, @Ptr long var3, Object... var5);

    public static native int av_log_get_level();

    public static native void av_log_set_level(int var0);

    public static void av_log_set_callback(Pointer<AvutilLibrary.av_log_set_callback_callback_callback> callback) {
        av_log_set_callback(Pointer.getPeer(callback));
    }

    protected static native void av_log_set_callback(@Ptr long var0);

    public static void av_log_default_callback(Pointer<?> avcl, int level, Pointer<Byte> fmt, Object... vl) {
        av_log_default_callback(Pointer.getPeer(avcl), level, Pointer.getPeer(fmt), vl);
    }

    protected static native void av_log_default_callback(@Ptr long var0, int var2, @Ptr long var3, Object... var5);

    public static Pointer<Byte> av_default_item_name(Pointer<?> ctx) {
        return Pointer.pointerToAddress(av_default_item_name(Pointer.getPeer(ctx)), Byte.class);
    }

    @Ptr
    protected static native long av_default_item_name(@Ptr long var0);

    public static IntValuedEnum<AvutilLibrary.AVClassCategory> av_default_get_category(Pointer<?> ptr) {
        return FlagSet.fromValue(av_default_get_category(Pointer.getPeer(ptr)), AvutilLibrary.AVClassCategory.class);
    }

    protected static native int av_default_get_category(@Ptr long var0);

    public static void av_log_format_line(Pointer<?> ptr, int level, Pointer<Byte> fmt, Pointer<Byte> vl, int line, Pointer<Integer> line_size, Pointer<Integer> print_prefix) {
        av_log_format_line(Pointer.getPeer(ptr), level, Pointer.getPeer(fmt), Pointer.getPeer(vl), line, Pointer.getPeer(line_size), Pointer.getPeer(print_prefix));
    }

    protected static native void av_log_format_line(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7, @Ptr long var8, @Ptr long var10);

    public static int av_log_format_line2(Pointer<?> ptr, int level, Pointer<Byte> fmt, Pointer<Byte> vl, int line, Pointer<Integer> line_size, Pointer<Integer> print_prefix) {
        return av_log_format_line2(Pointer.getPeer(ptr), level, Pointer.getPeer(fmt), Pointer.getPeer(vl), line, Pointer.getPeer(line_size), Pointer.getPeer(print_prefix));
    }

    protected static native int av_log_format_line2(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7, @Ptr long var8, @Ptr long var10);

    public static native void av_log_set_flags(int var0);

    public static native int av_log_get_flags();

    public static int av_int_list_length_for_size(int elsize, Pointer<?> list, long term) {
        return av_int_list_length_for_size(elsize, Pointer.getPeer(list), term);
    }

    protected static native int av_int_list_length_for_size(int var0, @Ptr long var1, long var3);

    public static Pointer av_fopen_utf8(Pointer<Byte> path, Pointer<Byte> mode) {
        return Pointer.pointerToAddress(av_fopen_utf8(Pointer.getPeer(path), Pointer.getPeer(mode)));
    }

    @Ptr
    protected static native long av_fopen_utf8(@Ptr long var0, @Ptr long var2);

    public static native AVRational av_get_time_base_q();

    public static Pointer<Byte> av_fourcc_make_string(Pointer<Byte> buf, int fourcc) {
        return Pointer.pointerToAddress(av_fourcc_make_string(Pointer.getPeer(buf), fourcc), Byte.class);
    }

    @Ptr
    protected static native long av_fourcc_make_string(@Ptr long var0, int var2);

    public static Pointer<AVDictionaryEntry> av_dict_get(Pointer<AVDictionary> m, Pointer<Byte> key, Pointer<AVDictionaryEntry> prev, int flags) {
        return Pointer.pointerToAddress(av_dict_get(Pointer.getPeer(m), Pointer.getPeer(key), Pointer.getPeer(prev), flags), AVDictionaryEntry.class);
    }

    @Ptr
    protected static native long av_dict_get(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_dict_count(Pointer<AVDictionary> m) {
        return av_dict_count(Pointer.getPeer(m));
    }

    protected static native int av_dict_count(@Ptr long var0);

    public static int av_dict_set(Pointer<Pointer<AVDictionary>> pm, Pointer<Byte> key, Pointer<Byte> value, int flags) {
        return av_dict_set(Pointer.getPeer(pm), Pointer.getPeer(key), Pointer.getPeer(value), flags);
    }

    protected static native int av_dict_set(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_dict_set_int(Pointer<Pointer<AVDictionary>> pm, Pointer<Byte> key, long value, int flags) {
        return av_dict_set_int(Pointer.getPeer(pm), Pointer.getPeer(key), value, flags);
    }

    protected static native int av_dict_set_int(@Ptr long var0, @Ptr long var2, long var4, int var6);

    public static int av_dict_parse_string(Pointer<Pointer<AVDictionary>> pm, Pointer<Byte> str, Pointer<Byte> key_val_sep, Pointer<Byte> pairs_sep, int flags) {
        return av_dict_parse_string(Pointer.getPeer(pm), Pointer.getPeer(str), Pointer.getPeer(key_val_sep), Pointer.getPeer(pairs_sep), flags);
    }

    protected static native int av_dict_parse_string(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8);

    public static int av_dict_copy(Pointer<Pointer<AVDictionary>> dst, Pointer<AVDictionary> src, int flags) {
        return av_dict_copy(Pointer.getPeer(dst), Pointer.getPeer(src), flags);
    }

    protected static native int av_dict_copy(@Ptr long var0, @Ptr long var2, int var4);

    public static void av_dict_free(Pointer<Pointer<AVDictionary>> m) {
        av_dict_free(Pointer.getPeer(m));
    }

    protected static native void av_dict_free(@Ptr long var0);

    public static int av_dict_get_string(Pointer<AVDictionary> m, Pointer<Pointer<Byte>> buffer, byte key_val_sep, byte pairs_sep) {
        return av_dict_get_string(Pointer.getPeer(m), Pointer.getPeer(buffer), key_val_sep, pairs_sep);
    }

    protected static native int av_dict_get_string(@Ptr long var0, @Ptr long var2, byte var4, byte var5);

    public static Pointer<AVBufferRef> av__buffer_alloc(int size) {
        return Pointer.pointerToAddress(av_buffer_alloc(size), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffer_alloc(int var0);

    public static Pointer<AVBufferRef> av__buffer_allocz(int size) {
        return Pointer.pointerToAddress(av_buffer_allocz(size), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffer_allocz(int var0);

    public static Pointer<AVBufferRef> av_buffer_create(Pointer<Byte> data, int size, Pointer<AvutilLibrary.av_buffer_create_free_callback> free, Pointer<?> opaque, int flags) {
        return Pointer.pointerToAddress(av_buffer_create(Pointer.getPeer(data), size, Pointer.getPeer(free), Pointer.getPeer(opaque), flags), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffer_create(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7);

    public static void av_buffer_default_free(Pointer<?> opaque, Pointer<Byte> data) {
        av_buffer_default_free(Pointer.getPeer(opaque), Pointer.getPeer(data));
    }

    protected static native void av_buffer_default_free(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVBufferRef> av_buffer_ref(Pointer<AVBufferRef> buf) {
        return Pointer.pointerToAddress(av_buffer_ref(Pointer.getPeer(buf)), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffer_ref(@Ptr long var0);

    public static void av_buffer_unref(Pointer<Pointer<AVBufferRef>> buf) {
        av_buffer_unref(Pointer.getPeer(buf));
    }

    protected static native void av_buffer_unref(@Ptr long var0);

    public static int av_buffer_is_writable(Pointer<AVBufferRef> buf) {
        return av_buffer_is_writable(Pointer.getPeer(buf));
    }

    protected static native int av_buffer_is_writable(@Ptr long var0);

    public static Pointer<?> av_buffer_get_opaque(Pointer<AVBufferRef> buf) {
        return Pointer.pointerToAddress(av_buffer_get_opaque(Pointer.getPeer(buf)));
    }

    @Ptr
    protected static native long av_buffer_get_opaque(@Ptr long var0);

    public static int av_buffer_get_ref_count(Pointer<AVBufferRef> buf) {
        return av_buffer_get_ref_count(Pointer.getPeer(buf));
    }

    protected static native int av_buffer_get_ref_count(@Ptr long var0);

    public static int av_buffer_make_writable(Pointer<Pointer<AVBufferRef>> buf) {
        return av_buffer_make_writable(Pointer.getPeer(buf));
    }

    protected static native int av_buffer_make_writable(@Ptr long var0);

    public static int av_buffer_realloc(Pointer<Pointer<AVBufferRef>> buf, int size) {
        return av_buffer_realloc(Pointer.getPeer(buf), size);
    }

    protected static native int av_buffer_realloc(@Ptr long var0, int var2);

    public static Pointer<AVBufferPool> av_buffer_pool_init(int size, Pointer<AvutilLibrary.av_buffer_pool_init_alloc_callback> alloc) {
        return Pointer.pointerToAddress(av_buffer_pool_init(size, Pointer.getPeer(alloc)), AVBufferPool.class);
    }

    @Ptr
    protected static native long av_buffer_pool_init(int var0, @Ptr long var1);

    public static Pointer<AVBufferPool> av_buffer_pool_init2(int size, Pointer<?> opaque, Pointer<AvutilLibrary.av_buffer_pool_init2_alloc_callback> alloc, Pointer<AvutilLibrary.av_buffer_pool_init2_pool_free_callback> pool_free) {
        return Pointer.pointerToAddress(av_buffer_pool_init2(size, Pointer.getPeer(opaque), Pointer.getPeer(alloc), Pointer.getPeer(pool_free)), AVBufferPool.class);
    }

    @Ptr
    protected static native long av_buffer_pool_init2(int var0, @Ptr long var1, @Ptr long var3, @Ptr long var5);

    public static void av_buffer_pool_uninit(Pointer<Pointer<AVBufferPool>> pool) {
        av_buffer_pool_uninit(Pointer.getPeer(pool));
    }

    protected static native void av_buffer_pool_uninit(@Ptr long var0);

    public static Pointer<AVBufferRef> av_buffer_pool_get(Pointer<AVBufferPool> pool) {
        return Pointer.pointerToAddress(av_buffer_pool_get(Pointer.getPeer(pool)), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffer_pool_get(@Ptr long var0);

    public static Pointer<Byte> av_get_sample_fmt_name(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return Pointer.pointerToAddress(av_get_sample_fmt_name((int)sample_fmt.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_sample_fmt_name(int var0);

    public static IntValuedEnum<AvutilLibrary.AVSampleFormat> av_get_sample_fmt(Pointer<Byte> name) {
        return FlagSet.fromValue(av_get_sample_fmt(Pointer.getPeer(name)), AvutilLibrary.AVSampleFormat.class);
    }

    protected static native int av_get_sample_fmt(@Ptr long var0);

    public static IntValuedEnum<AvutilLibrary.AVSampleFormat> av_get_alt_sample_fmt(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt, int planar) {
        return FlagSet.fromValue(av_get_alt_sample_fmt((int)sample_fmt.value(), planar), AvutilLibrary.AVSampleFormat.class);
    }

    protected static native int av_get_alt_sample_fmt(int var0, int var1);

    public static IntValuedEnum<AvutilLibrary.AVSampleFormat> av_get_packed_sample_fmt(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return FlagSet.fromValue(av_get_packed_sample_fmt((int)sample_fmt.value()), AvutilLibrary.AVSampleFormat.class);
    }

    protected static native int av_get_packed_sample_fmt(int var0);

    public static IntValuedEnum<AvutilLibrary.AVSampleFormat> av_get_planar_sample_fmt(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return FlagSet.fromValue(av_get_planar_sample_fmt((int)sample_fmt.value()), AvutilLibrary.AVSampleFormat.class);
    }

    protected static native int av_get_planar_sample_fmt(int var0);

    public static Pointer<Byte> av_get_sample_fmt_string(Pointer<Byte> buf, int buf_size, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return Pointer.pointerToAddress(av_get_sample_fmt_string(Pointer.getPeer(buf), buf_size, (int)sample_fmt.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_sample_fmt_string(@Ptr long var0, int var2, int var3);

    public static int av_get_bytes_per_sample(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return av_get_bytes_per_sample((int)sample_fmt.value());
    }

    protected static native int av_get_bytes_per_sample(int var0);

    public static int av_sample_fmt_is_planar(IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return av_sample_fmt_is_planar((int)sample_fmt.value());
    }

    protected static native int av_sample_fmt_is_planar(int var0);

    public static int av_samples_get_buffer_size(Pointer<Integer> linesize, int nb_channels, int nb_samples, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt, int align) {
        return av_samples_get_buffer_size(Pointer.getPeer(linesize), nb_channels, nb_samples, (int)sample_fmt.value(), align);
    }

    protected static native int av_samples_get_buffer_size(@Ptr long var0, int var2, int var3, int var4, int var5);

    public static int av_samples_fill_arrays(Pointer<Pointer<Byte>> audio_data, Pointer<Integer> linesize, Pointer<Byte> buf, int nb_channels, int nb_samples, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt, int align) {
        return av_samples_fill_arrays(Pointer.getPeer(audio_data), Pointer.getPeer(linesize), Pointer.getPeer(buf), nb_channels, nb_samples, (int)sample_fmt.value(), align);
    }

    protected static native int av_samples_fill_arrays(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7, int var8, int var9);

    public static int av_samples_alloc(Pointer<Pointer<Byte>> audio_data, Pointer<Integer> linesize, int nb_channels, int nb_samples, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt, int align) {
        return av_samples_alloc(Pointer.getPeer(audio_data), Pointer.getPeer(linesize), nb_channels, nb_samples, (int)sample_fmt.value(), align);
    }

    protected static native int av_samples_alloc(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7);

    public static int av_samples_alloc_array_and_samples(Pointer<Pointer<Pointer<Byte>>> audio_data, Pointer<Integer> linesize, int nb_channels, int nb_samples, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt, int align) {
        return av_samples_alloc_array_and_samples(Pointer.getPeer(audio_data), Pointer.getPeer(linesize), nb_channels, nb_samples, (int)sample_fmt.value(), align);
    }

    protected static native int av_samples_alloc_array_and_samples(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7);

    public static int av_samples_copy(Pointer<Pointer<Byte>> dst, Pointer<Pointer<Byte>> src, int dst_offset, int src_offset, int nb_samples, int nb_channels, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return av_samples_copy(Pointer.getPeer(dst), Pointer.getPeer(src), dst_offset, src_offset, nb_samples, nb_channels, (int)sample_fmt.value());
    }

    protected static native int av_samples_copy(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7, int var8);

    public static int av_samples_set_silence(Pointer<Pointer<Byte>> audio_data, int offset, int nb_samples, int nb_channels, IntValuedEnum<AvutilLibrary.AVSampleFormat> sample_fmt) {
        return av_samples_set_silence(Pointer.getPeer(audio_data), offset, nb_samples, nb_channels, (int)sample_fmt.value());
    }

    protected static native int av_samples_set_silence(@Ptr long var0, int var2, int var3, int var4, int var5);

    public static long av_frame_get_best_effort_timestamp(Pointer<AVFrame> frame) {
        return av_frame_get_best_effort_timestamp(Pointer.getPeer(frame));
    }

    protected static native long av_frame_get_best_effort_timestamp(@Ptr long var0);

    public static void av_frame_set_best_effort_timestamp(Pointer<AVFrame> frame, long val) {
        av_frame_set_best_effort_timestamp(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_best_effort_timestamp(@Ptr long var0, long var2);

    public static long av_frame_get_pkt_duration(Pointer<AVFrame> frame) {
        return av_frame_get_pkt_duration(Pointer.getPeer(frame));
    }

    protected static native long av_frame_get_pkt_duration(@Ptr long var0);

    public static void av_frame_set_pkt_duration(Pointer<AVFrame> frame, long val) {
        av_frame_set_pkt_duration(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_pkt_duration(@Ptr long var0, long var2);

    public static long av_frame_get_pkt_pos(Pointer<AVFrame> frame) {
        return av_frame_get_pkt_pos(Pointer.getPeer(frame));
    }

    protected static native long av_frame_get_pkt_pos(@Ptr long var0);

    public static void av_frame_set_pkt_pos(Pointer<AVFrame> frame, long val) {
        av_frame_set_pkt_pos(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_pkt_pos(@Ptr long var0, long var2);

    public static long av_frame_get_channel_layout(Pointer<AVFrame> frame) {
        return av_frame_get_channel_layout(Pointer.getPeer(frame));
    }

    protected static native long av_frame_get_channel_layout(@Ptr long var0);

    public static void av_frame_set_channel_layout(Pointer<AVFrame> frame, long val) {
        av_frame_set_channel_layout(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_channel_layout(@Ptr long var0, long var2);

    public static int av_frame_get_channels(Pointer<AVFrame> frame) {
        return av_frame_get_channels(Pointer.getPeer(frame));
    }

    protected static native int av_frame_get_channels(@Ptr long var0);

    public static void av_frame_set_channels(Pointer<AVFrame> frame, int val) {
        av_frame_set_channels(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_channels(@Ptr long var0, int var2);

    public static int av_frame_get_sample_rate(Pointer<AVFrame> frame) {
        return av_frame_get_sample_rate(Pointer.getPeer(frame));
    }

    protected static native int av_frame_get_sample_rate(@Ptr long var0);

    public static void av_frame_set_sample_rate(Pointer<AVFrame> frame, int val) {
        av_frame_set_sample_rate(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_sample_rate(@Ptr long var0, int var2);

    public static Pointer<AVDictionary> av_frame_get_metadata(Pointer<AVFrame> frame) {
        return Pointer.pointerToAddress(av_frame_get_metadata(Pointer.getPeer(frame)), AVDictionary.class);
    }

    @Ptr
    protected static native long av_frame_get_metadata(@Ptr long var0);

    public static void av_frame_set_metadata(Pointer<AVFrame> frame, Pointer<AVDictionary> val) {
        av_frame_set_metadata(Pointer.getPeer(frame), Pointer.getPeer(val));
    }

    protected static native void av_frame_set_metadata(@Ptr long var0, @Ptr long var2);

    public static int av_frame_get_decode_error_flags(Pointer<AVFrame> frame) {
        return av_frame_get_decode_error_flags(Pointer.getPeer(frame));
    }

    protected static native int av_frame_get_decode_error_flags(@Ptr long var0);

    public static void av_frame_set_decode_error_flags(Pointer<AVFrame> frame, int val) {
        av_frame_set_decode_error_flags(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_decode_error_flags(@Ptr long var0, int var2);

    public static int av_frame_get_pkt_size(Pointer<AVFrame> frame) {
        return av_frame_get_pkt_size(Pointer.getPeer(frame));
    }

    protected static native int av_frame_get_pkt_size(@Ptr long var0);

    public static void av_frame_set_pkt_size(Pointer<AVFrame> frame, int val) {
        av_frame_set_pkt_size(Pointer.getPeer(frame), val);
    }

    protected static native void av_frame_set_pkt_size(@Ptr long var0, int var2);

    public static Pointer<Byte> av_frame_get_qp_table(Pointer<AVFrame> f, Pointer<Integer> stride, Pointer<Integer> type) {
        return Pointer.pointerToAddress(av_frame_get_qp_table(Pointer.getPeer(f), Pointer.getPeer(stride), Pointer.getPeer(type)), Byte.class);
    }

    @Ptr
    protected static native long av_frame_get_qp_table(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_frame_set_qp_table(Pointer<AVFrame> f, Pointer<AVBufferRef> buf, int stride, int type) {
        return av_frame_set_qp_table(Pointer.getPeer(f), Pointer.getPeer(buf), stride, type);
    }

    protected static native int av_frame_set_qp_table(@Ptr long var0, @Ptr long var2, int var4, int var5);

    public static IntValuedEnum<AvutilLibrary.AVColorSpace> av_frame_get_colorspace(Pointer<AVFrame> frame) {
        return FlagSet.fromValue(av_frame_get_colorspace(Pointer.getPeer(frame)), AvutilLibrary.AVColorSpace.class);
    }

    protected static native int av_frame_get_colorspace(@Ptr long var0);

    public static void av_frame_set_colorspace(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVColorSpace> val) {
        av_frame_set_colorspace(Pointer.getPeer(frame), (int)val.value());
    }

    protected static native void av_frame_set_colorspace(@Ptr long var0, int var2);

    public static IntValuedEnum<AvutilLibrary.AVColorRange> av_frame_get_color_range(Pointer<AVFrame> frame) {
        return FlagSet.fromValue(av_frame_get_color_range(Pointer.getPeer(frame)), AvutilLibrary.AVColorRange.class);
    }

    protected static native int av_frame_get_color_range(@Ptr long var0);

    public static void av_frame_set_color_range(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVColorRange> val) {
        av_frame_set_color_range(Pointer.getPeer(frame), (int)val.value());
    }

    protected static native void av_frame_set_color_range(@Ptr long var0, int var2);

    public static Pointer<Byte> av_get_colorspace_name(IntValuedEnum<AvutilLibrary.AVColorSpace> val) {
        return Pointer.pointerToAddress(av_get_colorspace_name((int)val.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_colorspace_name(int var0);

    public static Pointer<AVFrame> av__frame_alloc() {
        return Pointer.pointerToAddress(av_frame_alloc(), AVFrame.class);
    }

    @Ptr
    protected static native long av_frame_alloc();

    public static void av_frame_free(Pointer<Pointer<AVFrame>> frame) {
        av_frame_free(Pointer.getPeer(frame));
    }

    protected static native void av_frame_free(@Ptr long var0);

    public static int av_frame_ref(Pointer<AVFrame> dst, Pointer<AVFrame> src) {
        return av_frame_ref(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_frame_ref(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVFrame> av_frame_clone(Pointer<AVFrame> src) {
        return Pointer.pointerToAddress(av_frame_clone(Pointer.getPeer(src)), AVFrame.class);
    }

    @Ptr
    protected static native long av_frame_clone(@Ptr long var0);

    public static void av_frame_unref(Pointer<AVFrame> frame) {
        av_frame_unref(Pointer.getPeer(frame));
    }

    protected static native void av_frame_unref(@Ptr long var0);

    public static void av_frame_move_ref(Pointer<AVFrame> dst, Pointer<AVFrame> src) {
        av_frame_move_ref(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native void av_frame_move_ref(@Ptr long var0, @Ptr long var2);

    public static int av_frame_get_buffer(Pointer<AVFrame> frame, int align) {
        return av_frame_get_buffer(Pointer.getPeer(frame), align);
    }

    protected static native int av_frame_get_buffer(@Ptr long var0, int var2);

    public static int av_frame_is_writable(Pointer<AVFrame> frame) {
        return av_frame_is_writable(Pointer.getPeer(frame));
    }

    protected static native int av_frame_is_writable(@Ptr long var0);

    public static int av_frame_make_writable(Pointer<AVFrame> frame) {
        return av_frame_make_writable(Pointer.getPeer(frame));
    }

    protected static native int av_frame_make_writable(@Ptr long var0);

    public static int av_frame_copy(Pointer<AVFrame> dst, Pointer<AVFrame> src) {
        return av_frame_copy(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_frame_copy(@Ptr long var0, @Ptr long var2);

    public static int av_frame_copy_props(Pointer<AVFrame> dst, Pointer<AVFrame> src) {
        return av_frame_copy_props(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_frame_copy_props(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVBufferRef> av_frame_get_plane_buffer(Pointer<AVFrame> frame, int plane) {
        return Pointer.pointerToAddress(av_frame_get_plane_buffer(Pointer.getPeer(frame), plane), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_frame_get_plane_buffer(@Ptr long var0, int var2);

    public static Pointer<AVFrameSideData> av_frame_new_side_data(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVFrameSideDataType> type, int size) {
        return Pointer.pointerToAddress(av_frame_new_side_data(Pointer.getPeer(frame), (int)type.value(), size), AVFrameSideData.class);
    }

    @Ptr
    protected static native long av_frame_new_side_data(@Ptr long var0, int var2, int var3);

    public static Pointer<AVFrameSideData> av_frame_new_side_data_from_buf(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVFrameSideDataType> type, Pointer<AVBufferRef> buf) {
        return Pointer.pointerToAddress(av_frame_new_side_data_from_buf(Pointer.getPeer(frame), (int)type.value(), Pointer.getPeer(buf)), AVFrameSideData.class);
    }

    @Ptr
    protected static native long av_frame_new_side_data_from_buf(@Ptr long var0, int var2, @Ptr long var3);

    public static Pointer<AVFrameSideData> av_frame_get_side_data(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVFrameSideDataType> type) {
        return Pointer.pointerToAddress(av_frame_get_side_data(Pointer.getPeer(frame), (int)type.value()), AVFrameSideData.class);
    }

    @Ptr
    protected static native long av_frame_get_side_data(@Ptr long var0, int var2);

    public static void av_frame_remove_side_data(Pointer<AVFrame> frame, IntValuedEnum<AvutilLibrary.AVFrameSideDataType> type) {
        av_frame_remove_side_data(Pointer.getPeer(frame), (int)type.value());
    }

    protected static native void av_frame_remove_side_data(@Ptr long var0, int var2);

    public static int av_frame_apply_cropping(Pointer<AVFrame> frame, int flags) {
        return av_frame_apply_cropping(Pointer.getPeer(frame), flags);
    }

    protected static native int av_frame_apply_cropping(@Ptr long var0, int var2);

    public static Pointer<Byte> av_frame_side_data_name(IntValuedEnum<AvutilLibrary.AVFrameSideDataType> type) {
        return Pointer.pointerToAddress(av_frame_side_data_name((int)type.value()), Byte.class);
    }

    @Ptr
    protected static native long av_frame_side_data_name(int var0);

    public static int av_opt_show2(Pointer<?> obj, Pointer<?> av_log_obj, int req_flags, int rej_flags) {
        return av_opt_show2(Pointer.getPeer(obj), Pointer.getPeer(av_log_obj), req_flags, rej_flags);
    }

    protected static native int av_opt_show2(@Ptr long var0, @Ptr long var2, int var4, int var5);

    public static void av_opt_set_defaults(Pointer<?> s) {
        av_opt_set_defaults(Pointer.getPeer(s));
    }

    protected static native void av_opt_set_defaults(@Ptr long var0);

    public static void av_opt_set_defaults2(Pointer<?> s, int mask, int flags) {
        av_opt_set_defaults2(Pointer.getPeer(s), mask, flags);
    }

    protected static native void av_opt_set_defaults2(@Ptr long var0, int var2, int var3);

    public static int av_set_options_string(Pointer<?> ctx, Pointer<Byte> opts, Pointer<Byte> key_val_sep, Pointer<Byte> pairs_sep) {
        return av_set_options_string(Pointer.getPeer(ctx), Pointer.getPeer(opts), Pointer.getPeer(key_val_sep), Pointer.getPeer(pairs_sep));
    }

    protected static native int av_set_options_string(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_set_from_string(Pointer<?> ctx, Pointer<Byte> opts, Pointer<Pointer<Byte>> shorthand, Pointer<Byte> key_val_sep, Pointer<Byte> pairs_sep) {
        return av_opt_set_from_string(Pointer.getPeer(ctx), Pointer.getPeer(opts), Pointer.getPeer(shorthand), Pointer.getPeer(key_val_sep), Pointer.getPeer(pairs_sep));
    }

    protected static native int av_opt_set_from_string(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8);

    public static void av_opt_free(Pointer<?> obj) {
        av_opt_free(Pointer.getPeer(obj));
    }

    protected static native void av_opt_free(@Ptr long var0);

    public static int av_opt_flag_is_set(Pointer<?> obj, Pointer<Byte> field_name, Pointer<Byte> flag_name) {
        return av_opt_flag_is_set(Pointer.getPeer(obj), Pointer.getPeer(field_name), Pointer.getPeer(flag_name));
    }

    protected static native int av_opt_flag_is_set(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_opt_set_dict(Pointer<?> obj, Pointer<Pointer<AVDictionary>> options) {
        return av_opt_set_dict(Pointer.getPeer(obj), Pointer.getPeer(options));
    }

    protected static native int av_opt_set_dict(@Ptr long var0, @Ptr long var2);

    public static int av_opt_set_dict2(Pointer<?> obj, Pointer<Pointer<AVDictionary>> options, int search_flags) {
        return av_opt_set_dict2(Pointer.getPeer(obj), Pointer.getPeer(options), search_flags);
    }

    protected static native int av_opt_set_dict2(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_opt_get_key_value(Pointer<Pointer<Byte>> ropts, Pointer<Byte> key_val_sep, Pointer<Byte> pairs_sep, int flags, Pointer<Pointer<Byte>> rkey, Pointer<Pointer<Byte>> rval) {
        return av_opt_get_key_value(Pointer.getPeer(ropts), Pointer.getPeer(key_val_sep), Pointer.getPeer(pairs_sep), flags, Pointer.getPeer(rkey), Pointer.getPeer(rval));
    }

    protected static native int av_opt_get_key_value(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, @Ptr long var7, @Ptr long var9);

    public static int av_opt_eval_flags(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<Integer> flags_out) {
        return av_opt_eval_flags(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(flags_out));
    }

    protected static native int av_opt_eval_flags(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_eval_int(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<Integer> int_out) {
        return av_opt_eval_int(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(int_out));
    }

    protected static native int av_opt_eval_int(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_eval_int64(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<Long> int64_out) {
        return av_opt_eval_int64(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(int64_out));
    }

    protected static native int av_opt_eval_int64(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_eval_float(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<Float> float_out) {
        return av_opt_eval_float(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(float_out));
    }

    protected static native int av_opt_eval_float(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_eval_double(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<Double> double_out) {
        return av_opt_eval_double(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(double_out));
    }

    protected static native int av_opt_eval_double(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_opt_eval_q(Pointer<?> obj, Pointer<AVOption> o, Pointer<Byte> val, Pointer<AVRational> q_out) {
        return av_opt_eval_q(Pointer.getPeer(obj), Pointer.getPeer(o), Pointer.getPeer(val), Pointer.getPeer(q_out));
    }

    protected static native int av_opt_eval_q(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static Pointer<AVOption> av_opt_find(Pointer<?> obj, Pointer<Byte> name, Pointer<Byte> unit, int opt_flags, int search_flags) {
        return Pointer.pointerToAddress(av_opt_find(Pointer.getPeer(obj), Pointer.getPeer(name), Pointer.getPeer(unit), opt_flags, search_flags), AVOption.class);
    }

    @Ptr
    protected static native long av_opt_find(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7);

    public static Pointer<AVOption> av_opt_find2(Pointer<?> obj, Pointer<Byte> name, Pointer<Byte> unit, int opt_flags, int search_flags, Pointer<Pointer<?>> target_obj) {
        return Pointer.pointerToAddress(av_opt_find2(Pointer.getPeer(obj), Pointer.getPeer(name), Pointer.getPeer(unit), opt_flags, search_flags, Pointer.getPeer(target_obj)), AVOption.class);
    }

    @Ptr
    protected static native long av_opt_find2(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7, @Ptr long var8);

    public static Pointer<AVOption> av_opt_next(Pointer<?> obj, Pointer<AVOption> prev) {
        return Pointer.pointerToAddress(av_opt_next(Pointer.getPeer(obj), Pointer.getPeer(prev)), AVOption.class);
    }

    @Ptr
    protected static native long av_opt_next(@Ptr long var0, @Ptr long var2);

    public static Pointer<?> av_opt_child_next(Pointer<?> obj, Pointer<?> prev) {
        return Pointer.pointerToAddress(av_opt_child_next(Pointer.getPeer(obj), Pointer.getPeer(prev)));
    }

    @Ptr
    protected static native long av_opt_child_next(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVClass> av_opt_child_class_next(Pointer<AVClass> parent, Pointer<AVClass> prev) {
        return Pointer.pointerToAddress(av_opt_child_class_next(Pointer.getPeer(parent), Pointer.getPeer(prev)), AVClass.class);
    }

    @Ptr
    protected static native long av_opt_child_class_next(@Ptr long var0, @Ptr long var2);

    public static int av_opt_set(Pointer<?> obj, Pointer<Byte> name, Pointer<Byte> val, int search_flags) {
        return av_opt_set(Pointer.getPeer(obj), Pointer.getPeer(name), Pointer.getPeer(val), search_flags);
    }

    protected static native int av_opt_set(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_opt_set_int(Pointer<?> obj, Pointer<Byte> name, long val, int search_flags) {
        return av_opt_set_int(Pointer.getPeer(obj), Pointer.getPeer(name), val, search_flags);
    }

    protected static native int av_opt_set_int(@Ptr long var0, @Ptr long var2, long var4, int var6);

    public static int av_opt_set_double(Pointer<?> obj, Pointer<Byte> name, double val, int search_flags) {
        return av_opt_set_double(Pointer.getPeer(obj), Pointer.getPeer(name), val, search_flags);
    }

    protected static native int av_opt_set_double(@Ptr long var0, @Ptr long var2, double var4, int var6);

    public static int av_opt_set_q(Pointer<?> obj, Pointer<Byte> name, AVRational val, int search_flags) {
        return av_opt_set_q(Pointer.getPeer(obj), Pointer.getPeer(name), val, search_flags);
    }

    protected static native int av_opt_set_q(@Ptr long var0, @Ptr long var2, AVRational var4, int var5);

    public static int av_opt_set_bin(Pointer<?> obj, Pointer<Byte> name, Pointer<Byte> val, int size, int search_flags) {
        return av_opt_set_bin(Pointer.getPeer(obj), Pointer.getPeer(name), Pointer.getPeer(val), size, search_flags);
    }

    protected static native int av_opt_set_bin(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7);

    public static int av_opt_set_image_size(Pointer<?> obj, Pointer<Byte> name, int w, int h, int search_flags) {
        return av_opt_set_image_size(Pointer.getPeer(obj), Pointer.getPeer(name), w, h, search_flags);
    }

    protected static native int av_opt_set_image_size(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6);

    public static int av_opt_set_pixel_fmt(Pointer<?> obj, Pointer<Byte> name, IntValuedEnum<AvutilLibrary.AVPixelFormat> fmt, int search_flags) {
        return av_opt_set_pixel_fmt(Pointer.getPeer(obj), Pointer.getPeer(name), (int)fmt.value(), search_flags);
    }

    protected static native int av_opt_set_pixel_fmt(@Ptr long var0, @Ptr long var2, int var4, int var5);

    public static int av_opt_set_sample_fmt(Pointer<?> obj, Pointer<Byte> name, IntValuedEnum<AvutilLibrary.AVSampleFormat> fmt, int search_flags) {
        return av_opt_set_sample_fmt(Pointer.getPeer(obj), Pointer.getPeer(name), (int)fmt.value(), search_flags);
    }

    protected static native int av_opt_set_sample_fmt(@Ptr long var0, @Ptr long var2, int var4, int var5);

    public static int av_opt_set_video_rate(Pointer<?> obj, Pointer<Byte> name, AVRational val, int search_flags) {
        return av_opt_set_video_rate(Pointer.getPeer(obj), Pointer.getPeer(name), val, search_flags);
    }

    protected static native int av_opt_set_video_rate(@Ptr long var0, @Ptr long var2, AVRational var4, int var5);

    public static int av_opt_set_channel_layout(Pointer<?> obj, Pointer<Byte> name, long ch_layout, int search_flags) {
        return av_opt_set_channel_layout(Pointer.getPeer(obj), Pointer.getPeer(name), ch_layout, search_flags);
    }

    protected static native int av_opt_set_channel_layout(@Ptr long var0, @Ptr long var2, long var4, int var6);

    public static int av_opt_set_dict_val(Pointer<?> obj, Pointer<Byte> name, Pointer<AVDictionary> val, int search_flags) {
        return av_opt_set_dict_val(Pointer.getPeer(obj), Pointer.getPeer(name), Pointer.getPeer(val), search_flags);
    }

    protected static native int av_opt_set_dict_val(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_opt_get(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Pointer<Byte>> out_val) {
        return av_opt_get(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_int(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Long> out_val) {
        return av_opt_get_int(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get_int(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_double(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Double> out_val) {
        return av_opt_get_double(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get_double(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_q(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<AVRational> out_val) {
        return av_opt_get_q(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get_q(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_image_size(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Integer> w_out, Pointer<Integer> h_out) {
        return av_opt_get_image_size(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(w_out), Pointer.getPeer(h_out));
    }

    protected static native int av_opt_get_image_size(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5, @Ptr long var7);

    public static int av_opt_get_pixel_fmt(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<IntValuedEnum<AvutilLibrary.AVPixelFormat>> out_fmt) {
        return av_opt_get_pixel_fmt(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_fmt));
    }

    protected static native int av_opt_get_pixel_fmt(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_sample_fmt(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<IntValuedEnum<AvutilLibrary.AVSampleFormat>> out_fmt) {
        return av_opt_get_sample_fmt(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_fmt));
    }

    protected static native int av_opt_get_sample_fmt(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_video_rate(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<AVRational> out_val) {
        return av_opt_get_video_rate(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get_video_rate(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_channel_layout(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Long> ch_layout) {
        return av_opt_get_channel_layout(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(ch_layout));
    }

    protected static native int av_opt_get_channel_layout(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static int av_opt_get_dict_val(Pointer<?> obj, Pointer<Byte> name, int search_flags, Pointer<Pointer<AVDictionary>> out_val) {
        return av_opt_get_dict_val(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags, Pointer.getPeer(out_val));
    }

    protected static native int av_opt_get_dict_val(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static Pointer<?> av_opt_ptr(Pointer<AVClass> avclass, Pointer<?> obj, Pointer<Byte> name) {
        return Pointer.pointerToAddress(av_opt_ptr(Pointer.getPeer(avclass), Pointer.getPeer(obj), Pointer.getPeer(name)));
    }

    @Ptr
    protected static native long av_opt_ptr(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_opt_freep_ranges(Pointer<Pointer<AVOptionRanges>> ranges) {
        av_opt_freep_ranges(Pointer.getPeer(ranges));
    }

    protected static native void av_opt_freep_ranges(@Ptr long var0);

    public static int av_opt_query_ranges(Pointer<Pointer<AVOptionRanges>> AVOptionRangesPtrPtr1, Pointer<?> obj, Pointer<Byte> key, int flags) {
        return av_opt_query_ranges(Pointer.getPeer(AVOptionRangesPtrPtr1), Pointer.getPeer(obj), Pointer.getPeer(key), flags);
    }

    protected static native int av_opt_query_ranges(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_opt_copy(Pointer<?> dest, Pointer<?> src) {
        return av_opt_copy(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native int av_opt_copy(@Ptr long var0, @Ptr long var2);

    public static int av_opt_query_ranges_default(Pointer<Pointer<AVOptionRanges>> AVOptionRangesPtrPtr1, Pointer<?> obj, Pointer<Byte> key, int flags) {
        return av_opt_query_ranges_default(Pointer.getPeer(AVOptionRangesPtrPtr1), Pointer.getPeer(obj), Pointer.getPeer(key), flags);
    }

    protected static native int av_opt_query_ranges_default(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_opt_is_set_to_default(Pointer<?> obj, Pointer<AVOption> o) {
        return av_opt_is_set_to_default(Pointer.getPeer(obj), Pointer.getPeer(o));
    }

    protected static native int av_opt_is_set_to_default(@Ptr long var0, @Ptr long var2);

    public static int av_opt_is_set_to_default_by_name(Pointer<?> obj, Pointer<Byte> name, int search_flags) {
        return av_opt_is_set_to_default_by_name(Pointer.getPeer(obj), Pointer.getPeer(name), search_flags);
    }

    protected static native int av_opt_is_set_to_default_by_name(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_opt_serialize(Pointer<?> obj, int opt_flags, int flags, Pointer<Pointer<Byte>> buffer, byte key_val_sep, byte pairs_sep) {
        return av_opt_serialize(Pointer.getPeer(obj), opt_flags, flags, Pointer.getPeer(buffer), key_val_sep, pairs_sep);
    }

    protected static native int av_opt_serialize(@Ptr long var0, int var2, int var3, @Ptr long var4, byte var6, byte var7);

    public static int av_get_bits_per_pixel(Pointer<AVPixFmtDescriptor> pixdesc) {
        return av_get_bits_per_pixel(Pointer.getPeer(pixdesc));
    }

    protected static native int av_get_bits_per_pixel(@Ptr long var0);

    public static int av_get_padded_bits_per_pixel(Pointer<AVPixFmtDescriptor> pixdesc) {
        return av_get_padded_bits_per_pixel(Pointer.getPeer(pixdesc));
    }

    protected static native int av_get_padded_bits_per_pixel(@Ptr long var0);

    public static Pointer<AVPixFmtDescriptor> av_pix_fmt_desc_get(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt) {
        return Pointer.pointerToAddress(av_pix_fmt_desc_get((int)pix_fmt.value()), AVPixFmtDescriptor.class);
    }

    @Ptr
    protected static native long av_pix_fmt_desc_get(int var0);

    public static Pointer<AVPixFmtDescriptor> av_pix_fmt_desc_next(Pointer<AVPixFmtDescriptor> prev) {
        return Pointer.pointerToAddress(av_pix_fmt_desc_next(Pointer.getPeer(prev)), AVPixFmtDescriptor.class);
    }

    @Ptr
    protected static native long av_pix_fmt_desc_next(@Ptr long var0);

    public static IntValuedEnum<AvutilLibrary.AVPixelFormat> av_pix_fmt_desc_get_id(Pointer<AVPixFmtDescriptor> desc) {
        return FlagSet.fromValue(av_pix_fmt_desc_get_id(Pointer.getPeer(desc)), AvutilLibrary.AVPixelFormat.class);
    }

    protected static native int av_pix_fmt_desc_get_id(@Ptr long var0);

    public static int av_pix_fmt_get_chroma_sub_sample(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, Pointer<Integer> h_shift, Pointer<Integer> v_shift) {
        return av_pix_fmt_get_chroma_sub_sample((int)pix_fmt.value(), Pointer.getPeer(h_shift), Pointer.getPeer(v_shift));
    }

    protected static native int av_pix_fmt_get_chroma_sub_sample(int var0, @Ptr long var1, @Ptr long var3);

    public static int av_pix_fmt_count_planes(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt) {
        return av_pix_fmt_count_planes((int)pix_fmt.value());
    }

    protected static native int av_pix_fmt_count_planes(int var0);

    public static Pointer<Byte> av_color_range_name(IntValuedEnum<AvutilLibrary.AVColorRange> range) {
        return Pointer.pointerToAddress(av_color_range_name((int)range.value()), Byte.class);
    }

    @Ptr
    protected static native long av_color_range_name(int var0);

    public static int av_color_range_from_name(Pointer<Byte> name) {
        return av_color_range_from_name(Pointer.getPeer(name));
    }

    protected static native int av_color_range_from_name(@Ptr long var0);

    public static Pointer<Byte> av_color_primaries_name(IntValuedEnum<AvutilLibrary.AVColorPrimaries> primaries) {
        return Pointer.pointerToAddress(av_color_primaries_name((int)primaries.value()), Byte.class);
    }

    @Ptr
    protected static native long av_color_primaries_name(int var0);

    public static int av_color_primaries_from_name(Pointer<Byte> name) {
        return av_color_primaries_from_name(Pointer.getPeer(name));
    }

    protected static native int av_color_primaries_from_name(@Ptr long var0);

    public static Pointer<Byte> av_color_transfer_name(IntValuedEnum<AvutilLibrary.AVColorTransferCharacteristic> transfer) {
        return Pointer.pointerToAddress(av_color_transfer_name((int)transfer.value()), Byte.class);
    }

    @Ptr
    protected static native long av_color_transfer_name(int var0);

    public static int av_color_transfer_from_name(Pointer<Byte> name) {
        return av_color_transfer_from_name(Pointer.getPeer(name));
    }

    protected static native int av_color_transfer_from_name(@Ptr long var0);

    public static Pointer<Byte> av_color_space_name(IntValuedEnum<AvutilLibrary.AVColorSpace> space) {
        return Pointer.pointerToAddress(av_color_space_name((int)space.value()), Byte.class);
    }

    @Ptr
    protected static native long av_color_space_name(int var0);

    public static int av_color_space_from_name(Pointer<Byte> name) {
        return av_color_space_from_name(Pointer.getPeer(name));
    }

    protected static native int av_color_space_from_name(@Ptr long var0);

    public static Pointer<Byte> av_chroma_location_name(IntValuedEnum<AvutilLibrary.AVChromaLocation> location) {
        return Pointer.pointerToAddress(av_chroma_location_name((int)location.value()), Byte.class);
    }

    @Ptr
    protected static native long av_chroma_location_name(int var0);

    public static int av_chroma_location_from_name(Pointer<Byte> name) {
        return av_chroma_location_from_name(Pointer.getPeer(name));
    }

    protected static native int av_chroma_location_from_name(@Ptr long var0);

    public static IntValuedEnum<AvutilLibrary.AVPixelFormat> av_get_pix_fmt(Pointer<Byte> name) {
        return FlagSet.fromValue(av_get_pix_fmt(Pointer.getPeer(name)), AvutilLibrary.AVPixelFormat.class);
    }

    protected static native int av_get_pix_fmt(@Ptr long var0);

    public static Pointer<Byte> av_get_pix_fmt_name(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt) {
        return Pointer.pointerToAddress(av_get_pix_fmt_name((int)pix_fmt.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_pix_fmt_name(int var0);

    public static Pointer<Byte> av_get_pix_fmt_string(Pointer<Byte> buf, int buf_size, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt) {
        return Pointer.pointerToAddress(av_get_pix_fmt_string(Pointer.getPeer(buf), buf_size, (int)pix_fmt.value()), Byte.class);
    }

    @Ptr
    protected static native long av_get_pix_fmt_string(@Ptr long var0, int var2, int var3);

    public static void av_read_image_line(Pointer<Short> dst, Pointer<Pointer<Byte>> data, Pointer<Integer> linesize, Pointer<AVPixFmtDescriptor> desc, int x, int y, int c, int w, int read_pal_component) {
        av_read_image_line(Pointer.getPeer(dst), Pointer.getPeer(data), Pointer.getPeer(linesize), Pointer.getPeer(desc), x, y, c, w, read_pal_component);
    }

    protected static native void av_read_image_line(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9, int var10, int var11, int var12);

    public static void av_write_image_line(Pointer<Short> src, Pointer<Pointer<Byte>> data, Pointer<Integer> linesize, Pointer<AVPixFmtDescriptor> desc, int x, int y, int c, int w) {
        av_write_image_line(Pointer.getPeer(src), Pointer.getPeer(data), Pointer.getPeer(linesize), Pointer.getPeer(desc), x, y, c, w);
    }

    protected static native void av_write_image_line(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9, int var10, int var11);

    public static IntValuedEnum<AvutilLibrary.AVPixelFormat> av_pix_fmt_swap_endianness(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt) {
        return FlagSet.fromValue(av_pix_fmt_swap_endianness((int)pix_fmt.value()), AvutilLibrary.AVPixelFormat.class);
    }

    protected static native int av_pix_fmt_swap_endianness(int var0);

    public static int av_get_pix_fmt_loss(IntValuedEnum<AvutilLibrary.AVPixelFormat> dst_pix_fmt, IntValuedEnum<AvutilLibrary.AVPixelFormat> src_pix_fmt, int has_alpha) {
        return av_get_pix_fmt_loss((int)dst_pix_fmt.value(), (int)src_pix_fmt.value(), has_alpha);
    }

    protected static native int av_get_pix_fmt_loss(int var0, int var1, int var2);

    public static IntValuedEnum<AvutilLibrary.AVPixelFormat> av_find_best_pix_fmt_of_2(IntValuedEnum<AvutilLibrary.AVPixelFormat> dst_pix_fmt1, IntValuedEnum<AvutilLibrary.AVPixelFormat> dst_pix_fmt2, IntValuedEnum<AvutilLibrary.AVPixelFormat> src_pix_fmt, int has_alpha, Pointer<Integer> loss_ptr) {
        return FlagSet.fromValue(av_find_best_pix_fmt_of_2((int)dst_pix_fmt1.value(), (int)dst_pix_fmt2.value(), (int)src_pix_fmt.value(), has_alpha, Pointer.getPeer(loss_ptr)), AvutilLibrary.AVPixelFormat.class);
    }

    protected static native int av_find_best_pix_fmt_of_2(int var0, int var1, int var2, int var3, @Ptr long var4);

    public static void av_image_fill_max_pixsteps(Pointer<Integer> max_pixsteps, Pointer<Integer> max_pixstep_comps, Pointer<AVPixFmtDescriptor> pixdesc) {
        av_image_fill_max_pixsteps(Pointer.getPeer(max_pixsteps), Pointer.getPeer(max_pixstep_comps), Pointer.getPeer(pixdesc));
    }

    protected static native void av_image_fill_max_pixsteps(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_image_get_linesize(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int plane) {
        return av_image_get_linesize((int)pix_fmt.value(), width, plane);
    }

    protected static native int av_image_get_linesize(int var0, int var1, int var2);

    public static int av_image_fill_linesizes(Pointer<Integer> linesizes, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width) {
        return av_image_fill_linesizes(Pointer.getPeer(linesizes), (int)pix_fmt.value(), width);
    }

    protected static native int av_image_fill_linesizes(@Ptr long var0, int var2, int var3);

    public static int av_image_fill_pointers(Pointer<Pointer<Byte>> data, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int height, Pointer<Byte> ptr, Pointer<Integer> linesizes) {
        return av_image_fill_pointers(Pointer.getPeer(data), (int)pix_fmt.value(), height, Pointer.getPeer(ptr), Pointer.getPeer(linesizes));
    }

    protected static native int av_image_fill_pointers(@Ptr long var0, int var2, int var3, @Ptr long var4, @Ptr long var6);

    public static int av_image_alloc(Pointer<Pointer<Byte>> pointers, Pointer<Integer> linesizes, int w, int h, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int align) {
        return av_image_alloc(Pointer.getPeer(pointers), Pointer.getPeer(linesizes), w, h, (int)pix_fmt.value(), align);
    }

    protected static native int av_image_alloc(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7);

    public static void av_image_copy_plane(Pointer<Byte> dst, int dst_linesize, Pointer<Byte> src, int src_linesize, int bytewidth, int height) {
        av_image_copy_plane(Pointer.getPeer(dst), dst_linesize, Pointer.getPeer(src), src_linesize, bytewidth, height);
    }

    protected static native void av_image_copy_plane(@Ptr long var0, int var2, @Ptr long var3, int var5, int var6, int var7);

    public static void av_image_copy(Pointer<Pointer<Byte>> dst_data, Pointer<Integer> dst_linesizes, Pointer<Pointer<Byte>> src_data, Pointer<Integer> src_linesizes, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int height) {
        av_image_copy(Pointer.getPeer(dst_data), Pointer.getPeer(dst_linesizes), Pointer.getPeer(src_data), Pointer.getPeer(src_linesizes), (int)pix_fmt.value(), width, height);
    }

    protected static native void av_image_copy(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9, int var10);

    public static void av_image_copy_uc_from(Pointer<Pointer<Byte>> dst_data, Pointer<SizeT> dst_linesizes, Pointer<Pointer<Byte>> src_data, Pointer<SizeT> src_linesizes, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int height) {
        av_image_copy_uc_from(Pointer.getPeer(dst_data), Pointer.getPeer(dst_linesizes), Pointer.getPeer(src_data), Pointer.getPeer(src_linesizes), (int)pix_fmt.value(), width, height);
    }

    protected static native void av_image_copy_uc_from(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9, int var10);

    public static int av_image_fill_arrays(Pointer<Pointer<Byte>> dst_data, Pointer<Integer> dst_linesize, Pointer<Byte> src, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int height, int align) {
        return av_image_fill_arrays(Pointer.getPeer(dst_data), Pointer.getPeer(dst_linesize), Pointer.getPeer(src), (int)pix_fmt.value(), width, height, align);
    }

    protected static native int av_image_fill_arrays(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7, int var8, int var9);

    public static int av_image_get_buffer_size(IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int height, int align) {
        return av_image_get_buffer_size((int)pix_fmt.value(), width, height, align);
    }

    protected static native int av_image_get_buffer_size(int var0, int var1, int var2, int var3);

    public static int av_image_copy_to_buffer(Pointer<Byte> dst, int dst_size, Pointer<Pointer<Byte>> src_data, Pointer<Integer> src_linesize, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int width, int height, int align) {
        return av_image_copy_to_buffer(Pointer.getPeer(dst), dst_size, Pointer.getPeer(src_data), Pointer.getPeer(src_linesize), (int)pix_fmt.value(), width, height, align);
    }

    protected static native int av_image_copy_to_buffer(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7, int var8, int var9, int var10);

    public static int av_image_check_size(int w, int h, int log_offset, Pointer<?> log_ctx) {
        return av_image_check_size(w, h, log_offset, Pointer.getPeer(log_ctx));
    }

    protected static native int av_image_check_size(int var0, int var1, int var2, @Ptr long var3);

    public static int av_image_check_size2(int w, int h, long max_pixels, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, int log_offset, Pointer<?> log_ctx) {
        return av_image_check_size2(w, h, max_pixels, (int)pix_fmt.value(), log_offset, Pointer.getPeer(log_ctx));
    }

    protected static native int av_image_check_size2(int var0, int var1, long var2, int var4, int var5, @Ptr long var6);

    public static native int av_image_check_sar(int var0, int var1, AVRational var2);

    public static int av_image_fill_black(Pointer<Pointer<Byte>> dst_data, Pointer<SizeT> dst_linesize, IntValuedEnum<AvutilLibrary.AVPixelFormat> pix_fmt, IntValuedEnum<AvutilLibrary.AVColorRange> range, int width, int height) {
        return av_image_fill_black(Pointer.getPeer(dst_data), Pointer.getPeer(dst_linesize), (int)pix_fmt.value(), (int)range.value(), width, height);
    }

    protected static native int av_image_fill_black(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7);

    public static Pointer<AVSphericalMapping> av_spherical_alloc(Pointer<SizeT> size) {
        return Pointer.pointerToAddress(av_spherical_alloc(Pointer.getPeer(size)), AVSphericalMapping.class);
    }

    @Ptr
    protected static native long av_spherical_alloc(@Ptr long var0);

    public static void av_spherical_tile_bounds(Pointer<AVSphericalMapping> map, @Ptr long width, @Ptr long height, Pointer<SizeT> left, Pointer<SizeT> top, Pointer<SizeT> right, Pointer<SizeT> bottom) {
        av_spherical_tile_bounds(Pointer.getPeer(map), width, height, Pointer.getPeer(left), Pointer.getPeer(top), Pointer.getPeer(right), Pointer.getPeer(bottom));
    }

    protected static native void av_spherical_tile_bounds(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, @Ptr long var10, @Ptr long var12);

    public static Pointer<Byte> av_spherical_projection_name(IntValuedEnum<AvutilLibrary.AVSphericalProjection> projection) {
        return Pointer.pointerToAddress(av_spherical_projection_name((int)projection.value()), Byte.class);
    }

    @Ptr
    protected static native long av_spherical_projection_name(int var0);

    public static int av_spherical_from_name(Pointer<Byte> name) {
        return av_spherical_from_name(Pointer.getPeer(name));
    }

    protected static native int av_spherical_from_name(@Ptr long var0);

    public static int av_strstart(Pointer<Byte> str, Pointer<Byte> pfx, Pointer<Pointer<Byte>> ptr) {
        return av_strstart(Pointer.getPeer(str), Pointer.getPeer(pfx), Pointer.getPeer(ptr));
    }

    protected static native int av_strstart(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_stristart(Pointer<Byte> str, Pointer<Byte> pfx, Pointer<Pointer<Byte>> ptr) {
        return av_stristart(Pointer.getPeer(str), Pointer.getPeer(pfx), Pointer.getPeer(ptr));
    }

    protected static native int av_stristart(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<Byte> av_stristr(Pointer<Byte> haystack, Pointer<Byte> needle) {
        return Pointer.pointerToAddress(av_stristr(Pointer.getPeer(haystack), Pointer.getPeer(needle)), Byte.class);
    }

    @Ptr
    protected static native long av_stristr(@Ptr long var0, @Ptr long var2);

    public static Pointer<Byte> av_strnstr(Pointer<Byte> haystack, Pointer<Byte> needle, @Ptr long hay_length) {
        return Pointer.pointerToAddress(av_strnstr(Pointer.getPeer(haystack), Pointer.getPeer(needle), hay_length), Byte.class);
    }

    @Ptr
    protected static native long av_strnstr(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    @Ptr
    public static long av_strlcpy(Pointer<Byte> dst, Pointer<Byte> src, @Ptr long size) {
        return av_strlcpy(Pointer.getPeer(dst), Pointer.getPeer(src), size);
    }

    @Ptr
    protected static native long av_strlcpy(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    @Ptr
    public static long av_strlcat(Pointer<Byte> dst, Pointer<Byte> src, @Ptr long size) {
        return av_strlcat(Pointer.getPeer(dst), Pointer.getPeer(src), size);
    }

    @Ptr
    protected static native long av_strlcat(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    @Ptr
    public static long av_strlcatf(Pointer<Byte> dst, @Ptr long size, Pointer<Byte> fmt, Object... varArgs1) {
        return av_strlcatf(Pointer.getPeer(dst), size, Pointer.getPeer(fmt), varArgs1);
    }

    @Ptr
    protected static native long av_strlcatf(@Ptr long var0, @Ptr long var2, @Ptr long var4, Object... var6);

    public static Pointer<Byte> av_asprintf(Pointer<Byte> fmt, Object... varArgs1) {
        return Pointer.pointerToAddress(av_asprintf(Pointer.getPeer(fmt), varArgs1), Byte.class);
    }

    @Ptr
    protected static native long av_asprintf(@Ptr long var0, Object... var2);

    public static Pointer<Byte> av__d2str(double d) {
        return Pointer.pointerToAddress(av_d2str(d), Byte.class);
    }

    @Ptr
    protected static native long av_d2str(double var0);

    public static Pointer<Byte> av_get_token(Pointer<Pointer<Byte>> buf, Pointer<Byte> term) {
        return Pointer.pointerToAddress(av_get_token(Pointer.getPeer(buf), Pointer.getPeer(term)), Byte.class);
    }

    @Ptr
    protected static native long av_get_token(@Ptr long var0, @Ptr long var2);

    public static Pointer<Byte> av_strtok(Pointer<Byte> s, Pointer<Byte> delim, Pointer<Pointer<Byte>> saveptr) {
        return Pointer.pointerToAddress(av_strtok(Pointer.getPeer(s), Pointer.getPeer(delim), Pointer.getPeer(saveptr)), Byte.class);
    }

    @Ptr
    protected static native long av_strtok(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_strcasecmp(Pointer<Byte> a, Pointer<Byte> b) {
        return av_strcasecmp(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native int av_strcasecmp(@Ptr long var0, @Ptr long var2);

    public static int av_strncasecmp(Pointer<Byte> a, Pointer<Byte> b, @Ptr long n) {
        return av_strncasecmp(Pointer.getPeer(a), Pointer.getPeer(b), n);
    }

    protected static native int av_strncasecmp(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<Byte> av_strireplace(Pointer<Byte> str, Pointer<Byte> from, Pointer<Byte> to) {
        return Pointer.pointerToAddress(av_strireplace(Pointer.getPeer(str), Pointer.getPeer(from), Pointer.getPeer(to)), Byte.class);
    }

    @Ptr
    protected static native long av_strireplace(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<Byte> av_basename(Pointer<Byte> path) {
        return Pointer.pointerToAddress(av_basename(Pointer.getPeer(path)), Byte.class);
    }

    @Ptr
    protected static native long av_basename(@Ptr long var0);

    public static Pointer<Byte> av_dirname(Pointer<Byte> path) {
        return Pointer.pointerToAddress(av_dirname(Pointer.getPeer(path)), Byte.class);
    }

    @Ptr
    protected static native long av_dirname(@Ptr long var0);

    public static int av_match_name(Pointer<Byte> name, Pointer<Byte> names) {
        return av_match_name(Pointer.getPeer(name), Pointer.getPeer(names));
    }

    protected static native int av_match_name(@Ptr long var0, @Ptr long var2);

    public static Pointer<Byte> av_append_path_component(Pointer<Byte> path, Pointer<Byte> component) {
        return Pointer.pointerToAddress(av_append_path_component(Pointer.getPeer(path), Pointer.getPeer(component)), Byte.class);
    }

    @Ptr
    protected static native long av_append_path_component(@Ptr long var0, @Ptr long var2);

    public static int av_escape(Pointer<Pointer<Byte>> dst, Pointer<Byte> src, Pointer<Byte> special_chars, IntValuedEnum<AvutilLibrary.AVEscapeMode> mode, int flags) {
        return av_escape(Pointer.getPeer(dst), Pointer.getPeer(src), Pointer.getPeer(special_chars), (int)mode.value(), flags);
    }

    protected static native int av_escape(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7);

    public static int av_utf8_decode(Pointer<Integer> codep, Pointer<Pointer<Byte>> bufp, Pointer<Byte> buf_end, int flags) {
        return av_utf8_decode(Pointer.getPeer(codep), Pointer.getPeer(bufp), Pointer.getPeer(buf_end), flags);
    }

    protected static native int av_utf8_decode(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static int av_match_list(Pointer<Byte> name, Pointer<Byte> list, byte separator) {
        return av_match_list(Pointer.getPeer(name), Pointer.getPeer(list), separator);
    }

    protected static native int av_match_list(@Ptr long var0, @Ptr long var2, byte var4);

    public static void av_bprint_init(Pointer<AVBPrint> buf, int size_init, int size_max) {
        av_bprint_init(Pointer.getPeer(buf), size_init, size_max);
    }

    protected static native void av_bprint_init(@Ptr long var0, int var2, int var3);

    public static void av_bprint_init_for_buffer(Pointer<AVBPrint> buf, Pointer<Byte> buffer, int size) {
        av_bprint_init_for_buffer(Pointer.getPeer(buf), Pointer.getPeer(buffer), size);
    }

    protected static native void av_bprint_init_for_buffer(@Ptr long var0, @Ptr long var2, int var4);

    public static void av_bprintf(Pointer<AVBPrint> buf, Pointer<Byte> fmt, Object... varArgs1) {
        av_bprintf(Pointer.getPeer(buf), Pointer.getPeer(fmt), varArgs1);
    }

    protected static native void av_bprintf(@Ptr long var0, @Ptr long var2, Object... var4);

    public static void av_vbprintf(Pointer<AVBPrint> buf, Pointer<Byte> fmt, Object... vl_arg) {
        av_vbprintf(Pointer.getPeer(buf), Pointer.getPeer(fmt), vl_arg);
    }

    protected static native void av_vbprintf(@Ptr long var0, @Ptr long var2, Object... var4);

    public static void av_bprint_chars(Pointer<AVBPrint> buf, byte c, int n) {
        av_bprint_chars(Pointer.getPeer(buf), c, n);
    }

    protected static native void av_bprint_chars(@Ptr long var0, byte var2, int var3);

    public static void av_bprint_append_data(Pointer<AVBPrint> buf, Pointer<Byte> data, int size) {
        av_bprint_append_data(Pointer.getPeer(buf), Pointer.getPeer(data), size);
    }

    protected static native void av_bprint_append_data(@Ptr long var0, @Ptr long var2, int var4);

    public static void av_bprint_strftime(Pointer<AVBPrint> buf, Pointer<Byte> fmt, Pointer tm) {
        av_bprint_strftime(Pointer.getPeer(buf), Pointer.getPeer(fmt), Pointer.getPeer(tm));
    }

    protected static native void av_bprint_strftime(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_bprint_get_buffer(Pointer<AVBPrint> buf, int size, Pointer<Pointer<Byte>> mem, Pointer<Integer> actual_size) {
        av_bprint_get_buffer(Pointer.getPeer(buf), size, Pointer.getPeer(mem), Pointer.getPeer(actual_size));
    }

    protected static native void av_bprint_get_buffer(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static void av_bprint_clear(Pointer<AVBPrint> buf) {
        av_bprint_clear(Pointer.getPeer(buf));
    }

    protected static native void av_bprint_clear(@Ptr long var0);

    public static int av_bprint_finalize(Pointer<AVBPrint> buf, Pointer<Pointer<Byte>> ret_str) {
        return av_bprint_finalize(Pointer.getPeer(buf), Pointer.getPeer(ret_str));
    }

    protected static native int av_bprint_finalize(@Ptr long var0, @Ptr long var2);

    public static void av_bprint_escape(Pointer<AVBPrint> dstbuf, Pointer<Byte> src, Pointer<Byte> special_chars, IntValuedEnum<AvutilLibrary.AVEscapeMode> mode, int flags) {
        av_bprint_escape(Pointer.getPeer(dstbuf), Pointer.getPeer(src), Pointer.getPeer(special_chars), (int)mode.value(), flags);
    }

    protected static native void av_bprint_escape(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7);

    public static native int av_get_cpu_flags();

    public static native void av_force_cpu_flags(int var0);

    public static native void av_set_cpu_flags_mask(int var0);

    public static int av_parse_cpu_flags(Pointer<Byte> s) {
        return av_parse_cpu_flags(Pointer.getPeer(s));
    }

    protected static native int av_parse_cpu_flags(@Ptr long var0);

    public static int av_parse_cpu_caps(Pointer<Integer> flags, Pointer<Byte> s) {
        return av_parse_cpu_caps(Pointer.getPeer(flags), Pointer.getPeer(s));
    }

    protected static native int av_parse_cpu_caps(@Ptr long var0, @Ptr long var2);

    public static native int av_cpu_count();

    @Ptr
    public static native long av_cpu_max_align();

    public static long av_get_channel_layout(Pointer<Byte> name) {
        return av_get_channel_layout(Pointer.getPeer(name));
    }

    protected static native long av_get_channel_layout(@Ptr long var0);

    public static int av_get_extended_channel_layout(Pointer<Byte> name, Pointer<Long> channel_layout, Pointer<Integer> nb_channels) {
        return av_get_extended_channel_layout(Pointer.getPeer(name), Pointer.getPeer(channel_layout), Pointer.getPeer(nb_channels));
    }

    protected static native int av_get_extended_channel_layout(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_get_channel_layout_string(Pointer<Byte> buf, int buf_size, int nb_channels, long channel_layout) {
        av_get_channel_layout_string(Pointer.getPeer(buf), buf_size, nb_channels, channel_layout);
    }

    protected static native void av_get_channel_layout_string(@Ptr long var0, int var2, int var3, long var4);

    public static void av_bprint_channel_layout(Pointer<AVBPrint> bp, int nb_channels, long channel_layout) {
        av_bprint_channel_layout(Pointer.getPeer(bp), nb_channels, channel_layout);
    }

    protected static native void av_bprint_channel_layout(@Ptr long var0, int var2, long var3);

    public static native int av_get_channel_layout_nb_channels(long var0);

    public static native long av_get_default_channel_layout(int var0);

    public static native int av_get_channel_layout_channel_index(long var0, long var2);

    public static native long av_channel_layout_extract_channel(long var0, int var2);

    public static Pointer<Byte> av__get_channel_name(long channel) {
        return Pointer.pointerToAddress(av_get_channel_name(channel), Byte.class);
    }

    @Ptr
    protected static native long av_get_channel_name(long var0);

    public static Pointer<Byte> av__get_channel_description(long channel) {
        return Pointer.pointerToAddress(av_get_channel_description(channel), Byte.class);
    }

    @Ptr
    protected static native long av_get_channel_description(long var0);

    public static int av_get_standard_channel_layout(int index, Pointer<Long> layout, Pointer<Pointer<Byte>> name) {
        return av_get_standard_channel_layout(index, Pointer.getPeer(layout), Pointer.getPeer(name));
    }

    protected static native int av_get_standard_channel_layout(int var0, @Ptr long var1, @Ptr long var3);

    public static IntValuedEnum<AvutilLibrary.AVHWDeviceType> av_hwdevice_find_type_by_name(Pointer<Byte> name) {
        return FlagSet.fromValue(av_hwdevice_find_type_by_name(Pointer.getPeer(name)), AvutilLibrary.AVHWDeviceType.class);
    }

    protected static native int av_hwdevice_find_type_by_name(@Ptr long var0);

    public static Pointer<Byte> av_hwdevice_get_type_name(IntValuedEnum<AvutilLibrary.AVHWDeviceType> type) {
        return Pointer.pointerToAddress(av_hwdevice_get_type_name((int)type.value()), Byte.class);
    }

    @Ptr
    protected static native long av_hwdevice_get_type_name(int var0);

    public static IntValuedEnum<AvutilLibrary.AVHWDeviceType> av_hwdevice_iterate_types(IntValuedEnum<AvutilLibrary.AVHWDeviceType> prev) {
        return FlagSet.fromValue(av_hwdevice_iterate_types((int)prev.value()), AvutilLibrary.AVHWDeviceType.class);
    }

    protected static native int av_hwdevice_iterate_types(int var0);

    public static Pointer<AVBufferRef> av_hwdevice_ctx_alloc(IntValuedEnum<AvutilLibrary.AVHWDeviceType> type) {
        return Pointer.pointerToAddress(av_hwdevice_ctx_alloc((int)type.value()), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_hwdevice_ctx_alloc(int var0);

    public static int av_hwdevice_ctx_init(Pointer<AVBufferRef> ref) {
        return av_hwdevice_ctx_init(Pointer.getPeer(ref));
    }

    protected static native int av_hwdevice_ctx_init(@Ptr long var0);

    public static int av_hwdevice_ctx_create(Pointer<Pointer<AVBufferRef>> device_ctx, IntValuedEnum<AvutilLibrary.AVHWDeviceType> type, Pointer<Byte> device, Pointer<AVDictionary> opts, int flags) {
        return av_hwdevice_ctx_create(Pointer.getPeer(device_ctx), (int)type.value(), Pointer.getPeer(device), Pointer.getPeer(opts), flags);
    }

    protected static native int av_hwdevice_ctx_create(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7);

    public static int av_hwdevice_ctx_create_derived(Pointer<Pointer<AVBufferRef>> dst_ctx, IntValuedEnum<AvutilLibrary.AVHWDeviceType> type, Pointer<AVBufferRef> src_ctx, int flags) {
        return av_hwdevice_ctx_create_derived(Pointer.getPeer(dst_ctx), (int)type.value(), Pointer.getPeer(src_ctx), flags);
    }

    protected static native int av_hwdevice_ctx_create_derived(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static Pointer<AVBufferRef> av_hwframe_ctx_alloc(Pointer<AVBufferRef> device_ctx) {
        return Pointer.pointerToAddress(av_hwframe_ctx_alloc(Pointer.getPeer(device_ctx)), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_hwframe_ctx_alloc(@Ptr long var0);

    public static int av_hwframe_ctx_init(Pointer<AVBufferRef> ref) {
        return av_hwframe_ctx_init(Pointer.getPeer(ref));
    }

    protected static native int av_hwframe_ctx_init(@Ptr long var0);

    public static int av_hwframe_get_buffer(Pointer<AVBufferRef> hwframe_ctx, Pointer<AVFrame> frame, int flags) {
        return av_hwframe_get_buffer(Pointer.getPeer(hwframe_ctx), Pointer.getPeer(frame), flags);
    }

    protected static native int av_hwframe_get_buffer(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_hwframe_transfer_data(Pointer<AVFrame> dst, Pointer<AVFrame> src, int flags) {
        return av_hwframe_transfer_data(Pointer.getPeer(dst), Pointer.getPeer(src), flags);
    }

    protected static native int av_hwframe_transfer_data(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_hwframe_transfer_get_formats(Pointer<AVBufferRef> hwframe_ctx, IntValuedEnum<AvutilLibrary.AVHWFrameTransferDirection> dir, Pointer<Pointer<IntValuedEnum<AvutilLibrary.AVPixelFormat>>> formats, int flags) {
        return av_hwframe_transfer_get_formats(Pointer.getPeer(hwframe_ctx), (int)dir.value(), Pointer.getPeer(formats), flags);
    }

    protected static native int av_hwframe_transfer_get_formats(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static Pointer<?> av_hwdevice_hwconfig_alloc(Pointer<AVBufferRef> device_ctx) {
        return Pointer.pointerToAddress(av_hwdevice_hwconfig_alloc(Pointer.getPeer(device_ctx)));
    }

    @Ptr
    protected static native long av_hwdevice_hwconfig_alloc(@Ptr long var0);

    public static Pointer<AVHWFramesConstraints> av_hwdevice_get_hwframe_constraints(Pointer<AVBufferRef> ref, Pointer<?> hwconfig) {
        return Pointer.pointerToAddress(av_hwdevice_get_hwframe_constraints(Pointer.getPeer(ref), Pointer.getPeer(hwconfig)), AVHWFramesConstraints.class);
    }

    @Ptr
    protected static native long av_hwdevice_get_hwframe_constraints(@Ptr long var0, @Ptr long var2);

    public static void av_hwframe_constraints_free(Pointer<Pointer<AVHWFramesConstraints>> constraints) {
        av_hwframe_constraints_free(Pointer.getPeer(constraints));
    }

    protected static native void av_hwframe_constraints_free(@Ptr long var0);

    public static int av_hwframe_map(Pointer<AVFrame> dst, Pointer<AVFrame> src, int flags) {
        return av_hwframe_map(Pointer.getPeer(dst), Pointer.getPeer(src), flags);
    }

    protected static native int av_hwframe_map(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_hwframe_ctx_create_derived(Pointer<Pointer<AVBufferRef>> derived_frame_ctx, IntValuedEnum<AvutilLibrary.AVPixelFormat> format, Pointer<AVBufferRef> derived_device_ctx, Pointer<AVBufferRef> source_frame_ctx, int flags) {
        return av_hwframe_ctx_create_derived(Pointer.getPeer(derived_frame_ctx), (int)format.value(), Pointer.getPeer(derived_device_ctx), Pointer.getPeer(source_frame_ctx), flags);
    }

    protected static native int av_hwframe_ctx_create_derived(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5, int var7);

    public static enum AVActiveFormatDescription implements IntValuedEnum<AvutilLibrary.AVActiveFormatDescription> {
        AV_AFD_SAME(8L),
        AV_AFD_4_3(9L),
        AV_AFD_16_9(10L),
        AV_AFD_14_9(11L),
        AV_AFD_4_3_SP_14_9(13L),
        AV_AFD_16_9_SP_14_9(14L),
        AV_AFD_SP_4_3(15L);

        public final long value;

        private AVActiveFormatDescription(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVActiveFormatDescription> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVActiveFormatDescription> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVChromaLocation implements IntValuedEnum<AvutilLibrary.AVChromaLocation> {
        AVCHROMA_LOC_UNSPECIFIED(0L),
        AVCHROMA_LOC_LEFT(1L),
        AVCHROMA_LOC_CENTER(2L),
        AVCHROMA_LOC_TOPLEFT(3L),
        AVCHROMA_LOC_TOP(4L),
        AVCHROMA_LOC_BOTTOMLEFT(5L),
        AVCHROMA_LOC_BOTTOM(6L),
        AVCHROMA_LOC_NB(7L);

        public final long value;

        private AVChromaLocation(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVChromaLocation> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVChromaLocation> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVClassCategory implements IntValuedEnum<AvutilLibrary.AVClassCategory> {
        AV_CLASS_CATEGORY_NA(0L),
        AV_CLASS_CATEGORY_INPUT(1L),
        AV_CLASS_CATEGORY_OUTPUT(2L),
        AV_CLASS_CATEGORY_MUXER(3L),
        AV_CLASS_CATEGORY_DEMUXER(4L),
        AV_CLASS_CATEGORY_ENCODER(5L),
        AV_CLASS_CATEGORY_DECODER(6L),
        AV_CLASS_CATEGORY_FILTER(7L),
        AV_CLASS_CATEGORY_BITSTREAM_FILTER(8L),
        AV_CLASS_CATEGORY_SWSCALER(9L),
        AV_CLASS_CATEGORY_SWRESAMPLER(10L),
        AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT(40L),
        AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT(41L),
        AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT(42L),
        AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT(43L),
        AV_CLASS_CATEGORY_DEVICE_OUTPUT(44L),
        AV_CLASS_CATEGORY_DEVICE_INPUT(45L),
        AV_CLASS_CATEGORY_NB(46L);

        public final long value;

        private AVClassCategory(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVClassCategory> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVClassCategory> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVColorPrimaries implements IntValuedEnum<AvutilLibrary.AVColorPrimaries> {
        AVCOL_PRI_RESERVED0(0L),
        AVCOL_PRI_BT709(1L),
        AVCOL_PRI_UNSPECIFIED(2L),
        AVCOL_PRI_RESERVED(3L),
        AVCOL_PRI_BT470M(4L),
        AVCOL_PRI_BT470BG(5L),
        AVCOL_PRI_SMPTE170M(6L),
        AVCOL_PRI_SMPTE240M(7L),
        AVCOL_PRI_FILM(8L),
        AVCOL_PRI_BT2020(9L),
        AVCOL_PRI_SMPTE428(10L),
        AVCOL_PRI_SMPTEST428_1(10L),
        AVCOL_PRI_SMPTE431(11L),
        AVCOL_PRI_SMPTE432(12L),
        AVCOL_PRI_JEDEC_P22(22L),
        AVCOL_PRI_NB(23L);

        public final long value;

        private AVColorPrimaries(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVColorPrimaries> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVColorPrimaries> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVColorRange implements IntValuedEnum<AvutilLibrary.AVColorRange> {
        AVCOL_RANGE_UNSPECIFIED(0L),
        AVCOL_RANGE_MPEG(1L),
        AVCOL_RANGE_JPEG(2L),
        AVCOL_RANGE_NB(3L);

        public final long value;

        private AVColorRange(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVColorRange> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVColorRange> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVColorSpace implements IntValuedEnum<AvutilLibrary.AVColorSpace> {
        AVCOL_SPC_RGB(0L),
        AVCOL_SPC_BT709(1L),
        AVCOL_SPC_UNSPECIFIED(2L),
        AVCOL_SPC_RESERVED(3L),
        AVCOL_SPC_FCC(4L),
        AVCOL_SPC_BT470BG(5L),
        AVCOL_SPC_SMPTE170M(6L),
        AVCOL_SPC_SMPTE240M(7L),
        AVCOL_SPC_YCGCO(8L),
        AVCOL_SPC_YCOCG(8L),
        AVCOL_SPC_BT2020_NCL(9L),
        AVCOL_SPC_BT2020_CL(10L),
        AVCOL_SPC_SMPTE2085(11L),
        AVCOL_SPC_CHROMA_DERIVED_NCL(12L),
        AVCOL_SPC_CHROMA_DERIVED_CL(13L),
        AVCOL_SPC_ICTCP(14L),
        AVCOL_SPC_NB(15L);

        public final long value;

        private AVColorSpace(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVColorSpace> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVColorSpace> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVColorTransferCharacteristic implements IntValuedEnum<AvutilLibrary.AVColorTransferCharacteristic> {
        AVCOL_TRC_RESERVED0(0L),
        AVCOL_TRC_BT709(1L),
        AVCOL_TRC_UNSPECIFIED(2L),
        AVCOL_TRC_RESERVED(3L),
        AVCOL_TRC_GAMMA22(4L),
        AVCOL_TRC_GAMMA28(5L),
        AVCOL_TRC_SMPTE170M(6L),
        AVCOL_TRC_SMPTE240M(7L),
        AVCOL_TRC_LINEAR(8L),
        AVCOL_TRC_LOG(9L),
        AVCOL_TRC_LOG_SQRT(10L),
        AVCOL_TRC_IEC61966_2_4(11L),
        AVCOL_TRC_BT1361_ECG(12L),
        AVCOL_TRC_IEC61966_2_1(13L),
        AVCOL_TRC_BT2020_10(14L),
        AVCOL_TRC_BT2020_12(15L),
        AVCOL_TRC_SMPTE2084(16L),
        AVCOL_TRC_SMPTEST2084(16L),
        AVCOL_TRC_SMPTE428(17L),
        AVCOL_TRC_SMPTEST428_1(17L),
        AVCOL_TRC_ARIB_STD_B67(18L),
        AVCOL_TRC_NB(19L);

        public final long value;

        private AVColorTransferCharacteristic(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVColorTransferCharacteristic> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVColorTransferCharacteristic> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVEscapeMode implements IntValuedEnum<AvutilLibrary.AVEscapeMode> {
        AV_ESCAPE_MODE_AUTO(0L),
        AV_ESCAPE_MODE_BACKSLASH(1L),
        AV_ESCAPE_MODE_QUOTE(2L);

        public final long value;

        private AVEscapeMode(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVEscapeMode> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVEscapeMode> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVFrameSideDataType implements IntValuedEnum<AvutilLibrary.AVFrameSideDataType> {
        AV_FRAME_DATA_PANSCAN(0L),
        AV_FRAME_DATA_A53_CC(1L),
        AV_FRAME_DATA_STEREO3D(2L),
        AV_FRAME_DATA_MATRIXENCODING(3L),
        AV_FRAME_DATA_DOWNMIX_INFO(4L),
        AV_FRAME_DATA_REPLAYGAIN(5L),
        AV_FRAME_DATA_DISPLAYMATRIX(6L),
        AV_FRAME_DATA_AFD(7L),
        AV_FRAME_DATA_MOTION_VECTORS(8L),
        AV_FRAME_DATA_SKIP_SAMPLES(9L),
        AV_FRAME_DATA_AUDIO_SERVICE_TYPE(10L),
        AV_FRAME_DATA_MASTERING_DISPLAY_METADATA(11L),
        AV_FRAME_DATA_GOP_TIMECODE(12L),
        AV_FRAME_DATA_SPHERICAL(13L),
        AV_FRAME_DATA_CONTENT_LIGHT_LEVEL(14L),
        AV_FRAME_DATA_ICC_PROFILE(15L),
        AV_FRAME_DATA_QP_TABLE_PROPERTIES(16L),
        AV_FRAME_DATA_QP_TABLE_DATA(17L);

        public final long value;

        private AVFrameSideDataType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVFrameSideDataType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVFrameSideDataType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVHWDeviceType implements IntValuedEnum<AvutilLibrary.AVHWDeviceType> {
        AV_HWDEVICE_TYPE_NONE(0L),
        AV_HWDEVICE_TYPE_VDPAU(1L),
        AV_HWDEVICE_TYPE_CUDA(2L),
        AV_HWDEVICE_TYPE_VAAPI(3L),
        AV_HWDEVICE_TYPE_DXVA2(4L),
        AV_HWDEVICE_TYPE_QSV(5L),
        AV_HWDEVICE_TYPE_VIDEOTOOLBOX(6L),
        AV_HWDEVICE_TYPE_D3D11VA(7L),
        AV_HWDEVICE_TYPE_DRM(8L),
        AV_HWDEVICE_TYPE_OPENCL(9L),
        AV_HWDEVICE_TYPE_MEDIACODEC(10L);

        public final long value;

        private AVHWDeviceType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVHWDeviceType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVHWDeviceType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVHWFrameTransferDirection implements IntValuedEnum<AvutilLibrary.AVHWFrameTransferDirection> {
        AV_HWFRAME_TRANSFER_DIRECTION_FROM(0L),
        AV_HWFRAME_TRANSFER_DIRECTION_TO(1L);

        public final long value;

        private AVHWFrameTransferDirection(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVHWFrameTransferDirection> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVHWFrameTransferDirection> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVMatrixEncoding implements IntValuedEnum<AvutilLibrary.AVMatrixEncoding> {
        AV_MATRIX_ENCODING_NONE(0L),
        AV_MATRIX_ENCODING_DOLBY(1L),
        AV_MATRIX_ENCODING_DPLII(2L),
        AV_MATRIX_ENCODING_DPLIIX(3L),
        AV_MATRIX_ENCODING_DPLIIZ(4L),
        AV_MATRIX_ENCODING_DOLBYEX(5L),
        AV_MATRIX_ENCODING_DOLBYHEADPHONE(6L),
        AV_MATRIX_ENCODING_NB(7L);

        public final long value;

        private AVMatrixEncoding(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVMatrixEncoding> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVMatrixEncoding> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVMediaType implements IntValuedEnum<AvutilLibrary.AVMediaType> {
        AVMEDIA_TYPE_UNKNOWN(-1L),
        AVMEDIA_TYPE_VIDEO(0L),
        AVMEDIA_TYPE_AUDIO(1L),
        AVMEDIA_TYPE_DATA(2L),
        AVMEDIA_TYPE_SUBTITLE(3L),
        AVMEDIA_TYPE_ATTACHMENT(4L),
        AVMEDIA_TYPE_NB(5L);

        public final long value;

        private AVMediaType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVMediaType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVMediaType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVOptionType implements IntValuedEnum<AvutilLibrary.AVOptionType> {
        AV_OPT_TYPE_FLAGS(0L),
        AV_OPT_TYPE_INT(1L),
        AV_OPT_TYPE_INT64(2L),
        AV_OPT_TYPE_DOUBLE(3L),
        AV_OPT_TYPE_FLOAT(4L),
        AV_OPT_TYPE_STRING(5L),
        AV_OPT_TYPE_RATIONAL(6L),
        AV_OPT_TYPE_BINARY(7L),
        AV_OPT_TYPE_DICT(8L),
        AV_OPT_TYPE_UINT64(9L),
        AV_OPT_TYPE_CONST(10L),
        AV_OPT_TYPE_IMAGE_SIZE(11L),
        AV_OPT_TYPE_PIXEL_FMT(12L),
        AV_OPT_TYPE_SAMPLE_FMT(13L),
        AV_OPT_TYPE_VIDEO_RATE(14L),
        AV_OPT_TYPE_DURATION(15L),
        AV_OPT_TYPE_COLOR(16L),
        AV_OPT_TYPE_CHANNEL_LAYOUT(17L),
        AV_OPT_TYPE_BOOL(18L);

        public final long value;

        private AVOptionType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVOptionType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVOptionType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVPictureType implements IntValuedEnum<AvutilLibrary.AVPictureType> {
        AV_PICTURE_TYPE_NONE(0L),
        AV_PICTURE_TYPE_I(1L),
        AV_PICTURE_TYPE_P(2L),
        AV_PICTURE_TYPE_B(3L),
        AV_PICTURE_TYPE_S(4L),
        AV_PICTURE_TYPE_SI(5L),
        AV_PICTURE_TYPE_SP(6L),
        AV_PICTURE_TYPE_BI(7L);

        public final long value;

        private AVPictureType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVPictureType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVPictureType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVPixelFormat implements IntValuedEnum<AvutilLibrary.AVPixelFormat> {
        AV_PIX_FMT_NONE(-1L),
        AV_PIX_FMT_YUV420P(0L),
        AV_PIX_FMT_YUYV422(1L),
        AV_PIX_FMT_RGB24(2L),
        AV_PIX_FMT_BGR24(3L),
        AV_PIX_FMT_YUV422P(4L),
        AV_PIX_FMT_YUV444P(5L),
        AV_PIX_FMT_YUV410P(6L),
        AV_PIX_FMT_YUV411P(7L),
        AV_PIX_FMT_GRAY8(8L),
        AV_PIX_FMT_MONOWHITE(9L),
        AV_PIX_FMT_MONOBLACK(10L),
        AV_PIX_FMT_PAL8(11L),
        AV_PIX_FMT_YUVJ420P(12L),
        AV_PIX_FMT_YUVJ422P(13L),
        AV_PIX_FMT_YUVJ444P(14L),
        AV_PIX_FMT_UYVY422(15L),
        AV_PIX_FMT_UYYVYY411(16L),
        AV_PIX_FMT_BGR8(17L),
        AV_PIX_FMT_BGR4(18L),
        AV_PIX_FMT_BGR4_BYTE(19L),
        AV_PIX_FMT_RGB8(20L),
        AV_PIX_FMT_RGB4(21L),
        AV_PIX_FMT_RGB4_BYTE(22L),
        AV_PIX_FMT_NV12(23L),
        AV_PIX_FMT_NV21(24L),
        AV_PIX_FMT_ARGB(25L),
        AV_PIX_FMT_RGBA(26L),
        AV_PIX_FMT_ABGR(27L),
        AV_PIX_FMT_BGRA(28L),
        AV_PIX_FMT_GRAY16BE(29L),
        AV_PIX_FMT_GRAY16LE(30L),
        AV_PIX_FMT_YUV440P(31L),
        AV_PIX_FMT_YUVJ440P(32L),
        AV_PIX_FMT_YUVA420P(33L),
        AV_PIX_FMT_RGB48BE(34L),
        AV_PIX_FMT_RGB48LE(35L),
        AV_PIX_FMT_RGB565BE(36L),
        AV_PIX_FMT_RGB565LE(37L),
        AV_PIX_FMT_RGB555BE(38L),
        AV_PIX_FMT_RGB555LE(39L),
        AV_PIX_FMT_BGR565BE(40L),
        AV_PIX_FMT_BGR565LE(41L),
        AV_PIX_FMT_BGR555BE(42L),
        AV_PIX_FMT_BGR555LE(43L),
        AV_PIX_FMT_VAAPI_MOCO(44L),
        AV_PIX_FMT_VAAPI_IDCT(45L),
        AV_PIX_FMT_VAAPI_VLD(46L),
        AV_PIX_FMT_VAAPI(46L),
        AV_PIX_FMT_YUV420P16LE(47L),
        AV_PIX_FMT_YUV420P16BE(48L),
        AV_PIX_FMT_YUV422P16LE(49L),
        AV_PIX_FMT_YUV422P16BE(50L),
        AV_PIX_FMT_YUV444P16LE(51L),
        AV_PIX_FMT_YUV444P16BE(52L),
        AV_PIX_FMT_DXVA2_VLD(53L),
        AV_PIX_FMT_RGB444LE(54L),
        AV_PIX_FMT_RGB444BE(55L),
        AV_PIX_FMT_BGR444LE(56L),
        AV_PIX_FMT_BGR444BE(57L),
        AV_PIX_FMT_YA8(58L),
        AV_PIX_FMT_Y400A(58L),
        AV_PIX_FMT_GRAY8A(58L),
        AV_PIX_FMT_BGR48BE(59L),
        AV_PIX_FMT_BGR48LE(60L),
        AV_PIX_FMT_YUV420P9BE(61L),
        AV_PIX_FMT_YUV420P9LE(62L),
        AV_PIX_FMT_YUV420P10BE(63L),
        AV_PIX_FMT_YUV420P10LE(64L),
        AV_PIX_FMT_YUV422P10BE(65L),
        AV_PIX_FMT_YUV422P10LE(66L),
        AV_PIX_FMT_YUV444P9BE(67L),
        AV_PIX_FMT_YUV444P9LE(68L),
        AV_PIX_FMT_YUV444P10BE(69L),
        AV_PIX_FMT_YUV444P10LE(70L),
        AV_PIX_FMT_YUV422P9BE(71L),
        AV_PIX_FMT_YUV422P9LE(72L),
        AV_PIX_FMT_GBRP(73L),
        AV_PIX_FMT_GBR24P(73L),
        AV_PIX_FMT_GBRP9BE(74L),
        AV_PIX_FMT_GBRP9LE(75L),
        AV_PIX_FMT_GBRP10BE(76L),
        AV_PIX_FMT_GBRP10LE(77L),
        AV_PIX_FMT_GBRP16BE(78L),
        AV_PIX_FMT_GBRP16LE(79L),
        AV_PIX_FMT_YUVA422P(80L),
        AV_PIX_FMT_YUVA444P(81L),
        AV_PIX_FMT_YUVA420P9BE(82L),
        AV_PIX_FMT_YUVA420P9LE(83L),
        AV_PIX_FMT_YUVA422P9BE(84L),
        AV_PIX_FMT_YUVA422P9LE(85L),
        AV_PIX_FMT_YUVA444P9BE(86L),
        AV_PIX_FMT_YUVA444P9LE(87L),
        AV_PIX_FMT_YUVA420P10BE(88L),
        AV_PIX_FMT_YUVA420P10LE(89L),
        AV_PIX_FMT_YUVA422P10BE(90L),
        AV_PIX_FMT_YUVA422P10LE(91L),
        AV_PIX_FMT_YUVA444P10BE(92L),
        AV_PIX_FMT_YUVA444P10LE(93L),
        AV_PIX_FMT_YUVA420P16BE(94L),
        AV_PIX_FMT_YUVA420P16LE(95L),
        AV_PIX_FMT_YUVA422P16BE(96L),
        AV_PIX_FMT_YUVA422P16LE(97L),
        AV_PIX_FMT_YUVA444P16BE(98L),
        AV_PIX_FMT_YUVA444P16LE(99L),
        AV_PIX_FMT_VDPAU(100L),
        AV_PIX_FMT_XYZ12LE(101L),
        AV_PIX_FMT_XYZ12BE(102L),
        AV_PIX_FMT_NV16(103L),
        AV_PIX_FMT_NV20LE(104L),
        AV_PIX_FMT_NV20BE(105L),
        AV_PIX_FMT_RGBA64BE(106L),
        AV_PIX_FMT_RGBA64LE(107L),
        AV_PIX_FMT_BGRA64BE(108L),
        AV_PIX_FMT_BGRA64LE(109L),
        AV_PIX_FMT_YVYU422(110L),
        AV_PIX_FMT_YA16BE(111L),
        AV_PIX_FMT_YA16LE(112L),
        AV_PIX_FMT_GBRAP(113L),
        AV_PIX_FMT_GBRAP16BE(114L),
        AV_PIX_FMT_GBRAP16LE(115L),
        AV_PIX_FMT_QSV(116L),
        AV_PIX_FMT_MMAL(117L),
        AV_PIX_FMT_D3D11VA_VLD(118L),
        AV_PIX_FMT_CUDA(119L),
        AV_PIX_FMT_0RGB(120L),
        AV_PIX_FMT_RGB0(121L),
        AV_PIX_FMT_0BGR(122L),
        AV_PIX_FMT_BGR0(123L),
        AV_PIX_FMT_YUV420P12BE(124L),
        AV_PIX_FMT_YUV420P12LE(125L),
        AV_PIX_FMT_YUV420P14BE(126L),
        AV_PIX_FMT_YUV420P14LE(127L),
        AV_PIX_FMT_YUV422P12BE(128L),
        AV_PIX_FMT_YUV422P12LE(129L),
        AV_PIX_FMT_YUV422P14BE(130L),
        AV_PIX_FMT_YUV422P14LE(131L),
        AV_PIX_FMT_YUV444P12BE(132L),
        AV_PIX_FMT_YUV444P12LE(133L),
        AV_PIX_FMT_YUV444P14BE(134L),
        AV_PIX_FMT_YUV444P14LE(135L),
        AV_PIX_FMT_GBRP12BE(136L),
        AV_PIX_FMT_GBRP12LE(137L),
        AV_PIX_FMT_GBRP14BE(138L),
        AV_PIX_FMT_GBRP14LE(139L),
        AV_PIX_FMT_YUVJ411P(140L),
        AV_PIX_FMT_BAYER_BGGR8(141L),
        AV_PIX_FMT_BAYER_RGGB8(142L),
        AV_PIX_FMT_BAYER_GBRG8(143L),
        AV_PIX_FMT_BAYER_GRBG8(144L),
        AV_PIX_FMT_BAYER_BGGR16LE(145L),
        AV_PIX_FMT_BAYER_BGGR16BE(146L),
        AV_PIX_FMT_BAYER_RGGB16LE(147L),
        AV_PIX_FMT_BAYER_RGGB16BE(148L),
        AV_PIX_FMT_BAYER_GBRG16LE(149L),
        AV_PIX_FMT_BAYER_GBRG16BE(150L),
        AV_PIX_FMT_BAYER_GRBG16LE(151L),
        AV_PIX_FMT_BAYER_GRBG16BE(152L),
        AV_PIX_FMT_XVMC(153L),
        AV_PIX_FMT_YUV440P10LE(154L),
        AV_PIX_FMT_YUV440P10BE(155L),
        AV_PIX_FMT_YUV440P12LE(156L),
        AV_PIX_FMT_YUV440P12BE(157L),
        AV_PIX_FMT_AYUV64LE(158L),
        AV_PIX_FMT_AYUV64BE(159L),
        AV_PIX_FMT_VIDEOTOOLBOX(160L),
        AV_PIX_FMT_P010LE(161L),
        AV_PIX_FMT_P010BE(162L),
        AV_PIX_FMT_GBRAP12BE(163L),
        AV_PIX_FMT_GBRAP12LE(164L),
        AV_PIX_FMT_GBRAP10BE(165L),
        AV_PIX_FMT_GBRAP10LE(166L),
        AV_PIX_FMT_MEDIACODEC(167L),
        AV_PIX_FMT_GRAY12BE(168L),
        AV_PIX_FMT_GRAY12LE(169L),
        AV_PIX_FMT_GRAY10BE(170L),
        AV_PIX_FMT_GRAY10LE(171L),
        AV_PIX_FMT_P016LE(172L),
        AV_PIX_FMT_P016BE(173L),
        AV_PIX_FMT_D3D11(174L),
        AV_PIX_FMT_GRAY9BE(175L),
        AV_PIX_FMT_GRAY9LE(176L),
        AV_PIX_FMT_GBRPF32BE(177L),
        AV_PIX_FMT_GBRPF32LE(178L),
        AV_PIX_FMT_GBRAPF32BE(179L),
        AV_PIX_FMT_GBRAPF32LE(180L),
        AV_PIX_FMT_DRM_PRIME(181L),
        AV_PIX_FMT_OPENCL(182L),
        AV_PIX_FMT_NB(183L);

        public final long value;

        private AVPixelFormat(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVPixelFormat> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVPixelFormat> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVRounding implements IntValuedEnum<AvutilLibrary.AVRounding> {
        AV_ROUND_ZERO(0L),
        AV_ROUND_INF(1L),
        AV_ROUND_DOWN(2L),
        AV_ROUND_UP(3L),
        AV_ROUND_NEAR_INF(5L),
        AV_ROUND_PASS_MINMAX(8192L);

        public final long value;

        private AVRounding(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVRounding> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVRounding> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVSampleFormat implements IntValuedEnum<AvutilLibrary.AVSampleFormat> {
        AV_SAMPLE_FMT_NONE(-1L),
        AV_SAMPLE_FMT_U8(0L),
        AV_SAMPLE_FMT_S16(1L),
        AV_SAMPLE_FMT_S32(2L),
        AV_SAMPLE_FMT_FLT(3L),
        AV_SAMPLE_FMT_DBL(4L),
        AV_SAMPLE_FMT_U8P(5L),
        AV_SAMPLE_FMT_S16P(6L),
        AV_SAMPLE_FMT_S32P(7L),
        AV_SAMPLE_FMT_FLTP(8L),
        AV_SAMPLE_FMT_DBLP(9L),
        AV_SAMPLE_FMT_S64(10L),
        AV_SAMPLE_FMT_S64P(11L),
        AV_SAMPLE_FMT_NB(12L);

        public final long value;

        private AVSampleFormat(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVSampleFormat> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVSampleFormat> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVSphericalProjection implements IntValuedEnum<AvutilLibrary.AVSphericalProjection> {
        AV_SPHERICAL_EQUIRECTANGULAR(0L),
        AV_SPHERICAL_CUBEMAP(1L),
        AV_SPHERICAL_EQUIRECTANGULAR_TILE(2L);

        public final long value;

        private AVSphericalProjection(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvutilLibrary.AVSphericalProjection> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvutilLibrary.AVSphericalProjection> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public abstract static class av_buffer_create_free_callback extends Callback<AvutilLibrary.av_buffer_create_free_callback> {
        public av_buffer_create_free_callback() {
        }

        public void apply(Pointer<?> opaque, Pointer<Byte> data) {
            this.apply(Pointer.getPeer(opaque), Pointer.getPeer(data));
        }

        public void apply(@Ptr long opaque, @Ptr long data) {
            this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(data, Byte.class));
        }
    }

    public abstract static class av_buffer_pool_init2_alloc_callback extends Callback<AvutilLibrary.av_buffer_pool_init2_alloc_callback> {
        public av_buffer_pool_init2_alloc_callback() {
        }

        public Pointer<AVBufferRef> apply(Pointer<?> opaque, int size) {
            return Pointer.pointerToAddress(this.apply(Pointer.getPeer(opaque), size), AVBufferRef.class);
        }

        @Ptr
        public long apply(@Ptr long opaque, int size) {
            return Pointer.getPeer(this.apply(Pointer.pointerToAddress(opaque), size));
        }
    }

    public abstract static class av_buffer_pool_init2_pool_free_callback extends Callback<AvutilLibrary.av_buffer_pool_init2_pool_free_callback> {
        public av_buffer_pool_init2_pool_free_callback() {
        }

        public void apply(Pointer<?> opaque) {
            this.apply(Pointer.getPeer(opaque));
        }

        public void apply(@Ptr long opaque) {
            this.apply(Pointer.pointerToAddress(opaque));
        }
    }

    public abstract static class av_buffer_pool_init_alloc_callback extends Callback<AvutilLibrary.av_buffer_pool_init_alloc_callback> {
        public av_buffer_pool_init_alloc_callback() {
        }

        public Pointer<AVBufferRef> _apply(int size) {
            return Pointer.pointerToAddress(this.apply(size), AVBufferRef.class);
        }

        @Ptr
        public long apply(int size) {
            return Pointer.getPeer(this._apply(size));
        }
    }

    public abstract static class av_log_set_callback_callback_callback extends Callback<AvutilLibrary.av_log_set_callback_callback_callback> {
        public av_log_set_callback_callback_callback() {
        }

        public void apply(Pointer<?> voidPtr1, int int1, Pointer<Byte> charPtr1, Object... va_list1) {
            this.apply(Pointer.getPeer(voidPtr1), int1, Pointer.getPeer(charPtr1), va_list1);
        }

        public void apply(@Ptr long voidPtr1, int int1, @Ptr long charPtr1, Object... va_list1) {
            this.apply(Pointer.pointerToAddress(voidPtr1), int1, Pointer.pointerToAddress(charPtr1, Byte.class), va_list1);
        }
    }
}
