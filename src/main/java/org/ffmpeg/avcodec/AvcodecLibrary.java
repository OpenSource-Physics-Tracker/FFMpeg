//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

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
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVChromaLocation;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;

@Library("avcodec")
@Runtime(CRuntime.class)
public class AvcodecLibrary {
    public static final int AV_CODEC_HW_CONFIG_METHOD_HW_DEVICE_CTX = 1;
    public static final int AV_CODEC_HW_CONFIG_METHOD_HW_FRAMES_CTX = 2;
    public static final int AV_CODEC_HW_CONFIG_METHOD_INTERNAL = 4;
    public static final int AV_CODEC_HW_CONFIG_METHOD_AD_HOC = 8;
    public static final int FF_PROFILE_H264_CONSTRAINED_BASELINE = 578;
    public static final int FF_PROFILE_MPEG4_HYBRID = 8;
    public static final int AV_EF_IGNORE_ERR = 32768;
    public static final int FF_PRED_MEDIAN = 2;
    public static final int FF_DCT_FASTINT = 1;
    public static final int FF_IDCT_SIMPLE = 2;
    public static final int AV_CODEC_FLAG_LOOP_FILTER = 2048;
    public static final int FF_COMPLIANCE_NORMAL = 0;
    public static final int FF_DEBUG_SKIP = 128;
    public static final int AV_CODEC_FLAG_OUTPUT_CORRUPT = 8;
    public static final boolean FF_API_PRIVATE_OPT = true;
    public static final int FF_BUG_NO_PADDING = 16;
    public static final int FF_COMPLIANCE_UNOFFICIAL = -1;
    public static final int FF_PROFILE_AAC_SSR = 2;
    public static final int AV_HWACCEL_FLAG_ALLOW_HIGH_DEPTH = 2;
    public static final int AV_CODEC_FLAG_AC_PRED = 16777216;
    public static final int FF_CMP_SSE = 1;
    public static final int FF_DEBUG_MB_TYPE = 8;
    public static final boolean FF_API_STAT_BITS = true;
    public static final int FF_SUB_TEXT_FMT_ASS_WITH_TIMINGS = 1;
    public static final int AV_PKT_FLAG_DISPOSABLE = 16;
    public static final int LIBAVCODEC_VERSION_MINOR = 18;
    public static final int FF_DEBUG_VIS_MV_P_FOR = 1;
    public static final int AV_CODEC_FLAG_PASS2 = 1024;
    public static final int AV_CODEC_FLAG_PASS1 = 512;
    public static final int FF_PROFILE_H264_CONSTRAINED = 512;
    public static final int AV_EF_CAREFUL = 65536;
    public static final int FF_EC_FAVOR_INTER = 256;
    public static final boolean FF_API_USER_VISIBLE_AVHWACCEL = true;
    public static final int FF_CMP_BIT = 5;
    public static final int AV_HWACCEL_FLAG_ALLOW_PROFILE_MISMATCH = 4;
    public static final int AV_CODEC_CAP_DELAY = 32;
    public static final int FF_CMP_DCT264 = 14;
    public static final int AV_CODEC_FLAG_4MV = 4;
    public static final int LIBAVCODEC_BUILD = 3805796;
    public static final int FF_PROFILE_DTS_EXPRESS = 70;
    public static final int AV_EF_AGGRESSIVE = 262144;
    public static final int AV_PARSER_PTS_NB = 4;
    public static final int AV_CODEC_PROP_LOSSY = 2;
    public static final boolean FF_API_CODER_TYPE = true;
    public static final int FF_BUG_IEDGE = 32768;
    public static final int FF_CMP_SAD = 0;
    public static final int AV_CODEC_CAP_FRAME_THREADS = 4096;
    public static final int FF_PROFILE_MPEG4_ADVANCED_SCALABLE_TEXTURE = 13;
    public static final int FF_LEVEL_UNKNOWN = -99;
    public static final int FF_PROFILE_MPEG4_BASIC_ANIMATED_TEXTURE = 7;
    public static final int AV_PKT_FLAG_CORRUPT = 2;
    public static final int FF_PROFILE_MPEG2_SIMPLE = 5;
    public static final int SLICE_FLAG_ALLOW_PLANE = 4;
    public static final int FF_CODER_TYPE_AC = 1;
    public static final int FF_BUG_AUTODETECT = 1;
    public static final int FF_THREAD_SLICE = 2;
    public static final int AV_HWACCEL_CODEC_CAP_EXPERIMENTAL = 512;
    public static final int AV_CODEC_CAP_AUTO_THREADS = 32768;
    public static final int FF_PROFILE_MPEG2_SS = 2;
    public static final int FF_CMP_PSNR = 4;
    public static final int FF_PROFILE_AAC_HE = 4;
    public static final int AV_CODEC_PROP_TEXT_SUB = 131072;
    public static final int FF_PROFILE_MPEG4_SIMPLE_FACE_ANIMATION = 6;
    public static final int FF_PROFILE_UNKNOWN = -99;
    public static final int AV_CODEC_FLAG_TRUNCATED = 65536;
    public static final int AV_CODEC_FLAG2_NO_OUTPUT = 4;
    public static final int AV_CODEC_CAP_SUBFRAMES = 256;
    public static final int FF_PROFILE_H264_HIGH_10 = 110;
    public static final int AV_CODEC_FLAG_BITEXACT = 8388608;
    public static final int FF_PROFILE_DTS_HD_HRA = 50;
    public static final int FF_PROFILE_H264_HIGH = 100;
    public static final boolean FF_API_DEBUG_MV = false;
    public static final int FF_PROFILE_AAC_LD = 22;
    public static final int AV_CODEC_FLAG_CLOSED_GOP = -2147483648;
    public static final int AV_CODEC_FLAG_PSNR = 32768;
    public static final int FF_PROFILE_MPEG4_CORE = 2;
    public static final boolean FF_API_CONVERGENCE_DURATION = true;
    public static final int AV_CODEC_CAP_PARAM_CHANGE = 16384;
    public static final boolean FF_API_MERGE_SD_API = true;
    public static final int FF_COMPLIANCE_VERY_STRICT = 2;
    public static final int PARSER_FLAG_COMPLETE_FRAMES = 1;
    public static final int FF_PROFILE_AV1_HIGH = 1;
    public static final int FF_BUG_UMP4 = 8;
    public static final int FF_PROFILE_MPEG2_MAIN = 4;
    public static final int FF_IDCT_SIMPLEAUTO = 128;
    public static final boolean FF_API_CODEC_GET_SET = true;
    public static final int FF_DCT_ALTIVEC = 5;
    public static final int FF_CMP_DCTMAX = 13;
    public static final int FF_DEBUG_MMCO = 2048;
    public static final int SLICE_FLAG_ALLOW_FIELD = 2;
    public static final int FF_IDCT_ARM = 7;
    public static final int FF_IDCT_SIMPLEARMV5TE = 16;
    public static final int FF_PROFILE_AAC_ELD = 38;
    public static final int AV_CODEC_CAP_SLICE_THREADS = 8192;
    public static final int AV_PKT_FLAG_DISCARD = 4;
    public static final int FF_COMPLIANCE_EXPERIMENTAL = -2;
    public static final int FF_CODER_TYPE_RAW = 2;
    public static final int FF_IDCT_XVID = 14;
    public static final int AV_CODEC_PROP_BITMAP_SUB = 65536;
    public static final int FF_BUG_STD_QPEL = 128;
    public static final int FF_DCT_FAAN = 6;
    public static final int FF_CMP_CHROMA = 256;
    public static final int FF_DEBUG_BITSTREAM = 4;
    public static final int FF_BUG_XVID_ILACE = 4;
    public static final int FF_CMP_RD = 6;
    public static final int FF_CODER_TYPE_VLC = 0;
    public static final int FF_PROFILE_VC1_COMPLEX = 2;
    public static final int FF_PROFILE_MJPEG_JPEG_LS = 247;
    public static final int FF_IDCT_FAAN = 20;
    public static final int FF_PROFILE_HEVC_MAIN = 1;
    public static final int FF_EC_GUESS_MVS = 1;
    public static final int AV_CODEC_FLAG2_FAST = 1;
    public static final int FF_PROFILE_H264_HIGH_422_INTRA = 2170;
    public static final int FF_PROFILE_VC1_SIMPLE = 0;
    public static final int FF_DEBUG_VIS_MV_B_BACK = 4;
    public static final int AV_CODEC_FLAG2_LOCAL_HEADER = 8;
    public static final int FF_BUG_QPEL_CHROMA2 = 256;
    public static final int AV_CODEC_FLAG2_EXPORT_MVS = 268435456;
    public static final int AV_EF_BITSTREAM = 2;
    public static final int FF_DEBUG_RC = 2;
    public static final int FF_PROFILE_H264_BASELINE = 66;
    public static final int FF_SUB_TEXT_FMT_ASS = 0;
    public static final int FF_DEBUG_QP = 16;
    public static final int FF_COMPRESSION_DEFAULT = -1;
    public static final int FF_PROFILE_MPEG4_SCALABLE_TEXTURE = 5;
    public static final boolean FF_API_COPY_CONTEXT = true;
    public static final int FF_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT = 194;
    public static final int FF_PROFILE_DNXHR_SQ = 2;
    public static final int AV_CODEC_PROP_INTRA_ONLY = 1;
    public static final int FF_CODER_TYPE_RLE = 3;
    public static final int FF_PROFILE_MJPEG_HUFFMAN_LOSSLESS = 195;
    public static final int FF_PROFILE_JPEG2000_DCINEMA_2K = 3;
    public static final int FF_SUB_CHARENC_MODE_AUTOMATIC = 0;
    public static final int PARSER_FLAG_USE_CODEC_TS = 4096;
    public static final int FF_PROFILE_DNXHR_LB = 1;
    public static final int FF_PROFILE_JPEG2000_DCINEMA_4K = 4;
    public static final boolean FF_API_LOCKMGR = true;
    public static final int FF_PROFILE_H264_EXTENDED = 88;
    public static final int FF_IDCT_SIMPLEARM = 10;
    public static final int FF_IDCT_INT = 1;
    public static final int FF_PROFILE_DNXHR_HQ = 3;
    public static final int FF_PROFILE_H264_HIGH_444 = 144;
    public static final int AV_CODEC_FLAG_GRAY = 8192;
    public static final int FF_PROFILE_H264_HIGH_422 = 122;
    public static final int FF_DCT_INT = 2;
    public static final int AV_CODEC_CAP_DR1 = 2;
    public static final int AV_CODEC_CAP_DRAW_HORIZ_BAND = 1;
    public static final int FF_BUG_HPEL_CHROMA = 2048;
    public static final int AV_CODEC_CAP_EXPERIMENTAL = 512;
    public static final int LIBAVCODEC_VERSION_MICRO = 100;
    public static final int FF_IDCT_NONE = 24;
    public static final boolean FF_API_NEXT = true;
    public static final int AV_PKT_FLAG_KEY = 1;
    public static final int FF_THREAD_FRAME = 1;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_RESTRICTION_0 = 1;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_RESTRICTION_1 = 2;
    public static final int FF_SUB_CHARENC_MODE_PRE_DECODER = 1;
    public static final int FF_PROFILE_MJPEG_HUFFMAN_BASELINE_DCT = 192;
    public static final int AV_CODEC_CAP_HYBRID = 524288;
    public static final int FF_PROFILE_MPEG2_SNR_SCALABLE = 3;
    public static final int FF_DEBUG_THREADS = 65536;
    public static final int FF_DCT_MMX = 3;
    public static final int FF_PROFILE_DNXHD = 0;
    public static final int AV_CODEC_FLAG2_CHUNKS = 32768;
    public static final int FF_IDCT_SIMPLENEON = 22;
    public static final int FF_SUB_CHARENC_MODE_DO_NOTHING = -1;
    public static final int FF_PROFILE_DTS = 20;
    public static final int FF_CODEC_PROPERTY_LOSSLESS = 1;
    public static final int FF_PROFILE_H264_INTRA = 2048;
    public static final int FF_PROFILE_MPEG4_ADVANCED_CODING = 11;
    public static final int FF_DEBUG_ER = 1024;
    public static final int FF_PROFILE_MJPEG_HUFFMAN_EXTENDED_SEQUENTIAL_DCT = 193;
    public static final boolean FF_API_VDPAU_PROFILE = true;
    public static final int FF_COMPLIANCE_STRICT = 1;
    public static final int FF_DEBUG_PICT_INFO = 1;
    public static final int FF_MB_DECISION_RD = 2;
    public static final int FF_PROFILE_MPEG2_AAC_LOW = 128;
    public static final boolean FF_API_LOWRES = true;
    public static final int FF_PROFILE_MPEG2_AAC_HE = 131;
    public static final int FF_PROFILE_DNXHR_HQX = 4;
    public static final int AV_EF_COMPLIANT = 131072;
    public static final int FF_PRED_LEFT = 0;
    public static final int AV_CODEC_FLAG_INTERLACED_DCT = 262144;
    public static final int FF_PROFILE_DNXHR_444 = 5;
    public static final int AV_CODEC_PROP_REORDER = 8;
    public static final boolean FF_API_AVPICTURE = true;
    public static final int FF_PROFILE_VP9_0 = 0;
    public static final int FF_PROFILE_VP9_2 = 2;
    public static final int FF_PROFILE_VP9_1 = 1;
    public static final int FF_PROFILE_VP9_3 = 3;
    public static final int FF_BUG_DC_CLIP = 4096;
    public static final int FF_CMP_SATD = 2;
    public static final boolean FF_API_NVENC_OLD_NAME = true;
    public static final int FF_PROFILE_AAC_MAIN = 0;
    public static final int FF_IDCT_SIMPLEMMX = 3;
    public static final int LIBAVCODEC_VERSION_INT = 3805796;
    public static final int AV_CODEC_CAP_TRUNCATED = 8;
    public static final int AV_CODEC_FLAG_INTERLACED_ME = 536870912;
    public static final int FF_IDCT_ALTIVEC = 8;
    public static final int FF_PROFILE_MPEG4_MAIN = 3;
    public static final int FF_PROFILE_MPEG2_422 = 0;
    public static final int FF_DEBUG_NOMC = 16777216;
    public static final boolean FF_API_SIDEDATA_ONLY_PKT = true;
    public static final int FF_DEBUG_DCT_COEFF = 64;
    public static final int AV_CODEC_FLAG_QSCALE = 2;
    public static final int AV_CODEC_FLAG2_DROP_FRAME_TIMECODE = 8192;
    public static final int AV_CODEC_FLAG_UNALIGNED = 1;
    public static final int FF_CMP_VSSE = 9;
    public static final int FF_DEBUG_GREEN_MD = 8388608;
    public static final int FF_CMP_DCT = 3;
    public static final int AV_PKT_FLAG_TRUSTED = 8;
    public static final int FF_IDCT_SIMPLEARMV6 = 17;
    public static final int FF_DEBUG_VIS_MV_B_FOR = 2;
    public static final int AV_CODEC_CAP_SMALL_LAST_FRAME = 64;
    public static final int FF_PROFILE_RESERVED = -100;
    public static final int AV_CODEC_CAP_AVOID_PROBING = 131072;
    public static final int FF_BUG_TRUNCATED = 16384;
    public static final int AV_EF_CRCCHECK = 1;
    public static final int FF_PROFILE_H264_STEREO_HIGH = 128;
    public static final int FF_DEBUG_BUGS = 4096;
    public static final int FF_PROFILE_MPEG4_ADVANCED_CORE = 12;
    public static final boolean FF_API_VBV_DELAY = true;
    public static final int AV_CODEC_FLAG_LOW_DELAY = 524288;
    public static final int FF_CODEC_PROPERTY_CLOSED_CAPTIONS = 2;
    public static final int AV_CODEC_FLAG2_RO_FLUSH_NOOP = 1073741824;
    public static final int FF_PROFILE_AAC_HE_V2 = 28;
    public static final boolean FF_API_GET_CONTEXT_DEFAULTS = true;
    public static final int FF_PROFILE_AV1_PROFESSIONAL = 2;
    public static final int SLICE_FLAG_CODED_ORDER = 1;
    public static final int FF_DCT_AUTO = 0;
    public static final int FF_PROFILE_H264_MAIN = 77;
    public static final int FF_MB_DECISION_SIMPLE = 0;
    public static final int FF_BUG_QPEL_CHROMA = 64;
    public static final int FF_DEBUG_STARTCODE = 256;
    public static final int AV_CODEC_FLAG_QPEL = 16;
    public static final int FF_CMP_VSAD = 8;
    public static final int AV_HWACCEL_FLAG_IGNORE_LEVEL = 1;
    public static final int AV_EF_EXPLODE = 8;
    public static final int AV_SUBTITLE_FLAG_FORCED = 1;
    public static final int FF_PRED_PLANE = 1;
    public static final int AV_INPUT_BUFFER_MIN_SIZE = 16384;
    public static final int FF_PROFILE_DTS_ES = 30;
    public static final int FF_PROFILE_MPEG4_SIMPLE_STUDIO = 14;
    public static final int PARSER_FLAG_FETCHED_OFFSET = 4;
    public static final int FF_PROFILE_AV1_MAIN = 0;
    public static final int AV_CODEC_FLAG2_SHOW_ALL = 4194304;
    public static final boolean FF_API_AVCTX_TIMEBASE = true;
    public static final int FF_PROFILE_DTS_96_24 = 40;
    public static final int FF_CMP_W97 = 12;
    public static final int FF_PROFILE_H264_CAVLC_444 = 44;
    public static final int FF_PROFILE_H264_HIGH_444_PREDICTIVE = 244;
    public static final int FF_PROFILE_MPEG2_HIGH = 1;
    public static final boolean FF_API_AVPACKET_OLD_API = true;
    public static final boolean FF_API_RTP_CALLBACK = true;
    public static final int FF_CMP_W53 = 11;
    public static final int FF_BUG_DIRECT_BLOCKSIZE = 512;
    public static final boolean FF_API_STRUCT_VAAPI_CONTEXT = true;
    public static final boolean FF_API_CODED_FRAME = true;
    public static final int AV_CODEC_CAP_CHANNEL_CONF = 1024;
    public static final int FF_CMP_ZERO = 7;
    public static final int FF_CMP_MEDIAN_SAD = 15;
    public static final int FF_PROFILE_SBC_MSBC = 1;
    public static final int FF_CMP_NSSE = 10;
    public static final boolean FF_API_ASS_TIMING = true;
    public static final int FF_PROFILE_MPEG4_SIMPLE = 0;
    public static final int FF_PROFILE_H264_MULTIVIEW_HIGH = 118;
    public static final int AV_CODEC_CAP_VARIABLE_FRAME_SIZE = 65536;
    public static final int FF_IDCT_AUTO = 0;
    public static final int AV_CODEC_PROP_LOSSLESS = 4;
    public static final int FF_PROFILE_AAC_LTP = 3;
    public static final int AV_CODEC_FLAG2_SKIP_MANUAL = 536870912;
    public static final int FF_SUB_CHARENC_MODE_IGNORE = 2;
    public static final int FF_MB_DECISION_BITS = 1;
    public static final int FF_BUG_EDGE = 1024;
    public static final int AV_INPUT_BUFFER_PADDING_SIZE = 64;
    public static final int FF_PROFILE_MPEG4_N_BIT = 4;
    public static final int FF_PROFILE_HEVC_MAIN_STILL_PICTURE = 3;
    public static final int PARSER_FLAG_ONCE = 2;
    public static final int FF_PROFILE_VC1_ADVANCED = 3;
    public static final boolean FF_API_OLD_BSF = true;
    public static final int FF_PROFILE_H264_HIGH_10_INTRA = 2158;
    public static final int FF_DEBUG_BUFFERS = 32768;
    public static final boolean FF_API_GETCHROMA = true;
    public static final int FF_BUG_MS = 8192;
    public static final int FF_EC_DEBLOCK = 2;
    public static final int AV_EF_BUFFER = 4;
    public static final int FF_PROFILE_HEVC_REXT = 4;
    public static final int FF_BUG_AMV = 32;
    public static final int FF_PROFILE_HEVC_MAIN_10 = 2;
    public static final int FF_PROFILE_MPEG4_SIMPLE_SCALABLE = 1;
    public static final int AV_CODEC_FLAG2_IGNORE_CROP = 65536;
    public static final int AV_CODEC_CAP_INTRA_ONLY = 1073741824;
    public static final int FF_PROFILE_MPEG4_ADVANCED_SIMPLE = 15;
    public static final int FF_PROFILE_MPEG4_ADVANCED_REAL_TIME = 9;
    public static final String LIBAVCODEC_IDENT = "Lavc58.18.100";
    public static final int FF_PROFILE_DTS_HD_MA = 60;
    public static final int FF_PROFILE_H264_HIGH_444_INTRA = 2292;
    public static final int FF_PROFILE_MPEG4_CORE_SCALABLE = 10;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_NO_RESTRICTION = 32768;
    public static final boolean FF_API_TAG_STRING = true;
    public static final int LIBAVCODEC_VERSION_MAJOR = 58;
    public static final int AV_CODEC_CAP_LOSSLESS = -2147483648;
    public static final int FF_PROFILE_AAC_LOW = 1;
    public static final int AV_GET_BUFFER_FLAG_REF = 1;
    public static final int FF_PROFILE_VC1_MAIN = 1;
    public static final int AV_CODEC_FLAG_GLOBAL_HEADER = 4194304;
    public static final int AV_CODEC_CAP_HARDWARE = 262144;

    static {
        BridJ.register();
    }

    public AvcodecLibrary() {
    }

    public static AVRational av_codec_get_pkt_timebase(Pointer<AVCodecContext> avctx) {
        return av_codec_get_pkt_timebase(Pointer.getPeer(avctx));
    }

    protected static native AVRational av_codec_get_pkt_timebase(@Ptr long var0);

    public static void av_codec_set_pkt_timebase(Pointer<AVCodecContext> avctx, AVRational val) {
        av_codec_set_pkt_timebase(Pointer.getPeer(avctx), val);
    }

    protected static native void av_codec_set_pkt_timebase(@Ptr long var0, AVRational var2);

    public static Pointer<AVCodecDescriptor> av_codec_get_codec_descriptor(Pointer<AVCodecContext> avctx) {
        return Pointer.pointerToAddress(av_codec_get_codec_descriptor(Pointer.getPeer(avctx)), AVCodecDescriptor.class);
    }

    @Ptr
    protected static native long av_codec_get_codec_descriptor(@Ptr long var0);

    public static void av_codec_set_codec_descriptor(Pointer<AVCodecContext> avctx, Pointer<AVCodecDescriptor> desc) {
        av_codec_set_codec_descriptor(Pointer.getPeer(avctx), Pointer.getPeer(desc));
    }

    protected static native void av_codec_set_codec_descriptor(@Ptr long var0, @Ptr long var2);

    public static int av_codec_get_codec_properties(Pointer<AVCodecContext> avctx) {
        return av_codec_get_codec_properties(Pointer.getPeer(avctx));
    }

    protected static native int av_codec_get_codec_properties(@Ptr long var0);

    public static int av_codec_get_lowres(Pointer<AVCodecContext> avctx) {
        return av_codec_get_lowres(Pointer.getPeer(avctx));
    }

    protected static native int av_codec_get_lowres(@Ptr long var0);

    public static void av_codec_set_lowres(Pointer<AVCodecContext> avctx, int val) {
        av_codec_set_lowres(Pointer.getPeer(avctx), val);
    }

    protected static native void av_codec_set_lowres(@Ptr long var0, int var2);

    public static int av_codec_get_seek_preroll(Pointer<AVCodecContext> avctx) {
        return av_codec_get_seek_preroll(Pointer.getPeer(avctx));
    }

    protected static native int av_codec_get_seek_preroll(@Ptr long var0);

    public static void av_codec_set_seek_preroll(Pointer<AVCodecContext> avctx, int val) {
        av_codec_set_seek_preroll(Pointer.getPeer(avctx), val);
    }

    protected static native void av_codec_set_seek_preroll(@Ptr long var0, int var2);

    public static Pointer<Short> av_codec_get_chroma_intra_matrix(Pointer<AVCodecContext> avctx) {
        return Pointer.pointerToAddress(av_codec_get_chroma_intra_matrix(Pointer.getPeer(avctx)), Short.class);
    }

    @Ptr
    protected static native long av_codec_get_chroma_intra_matrix(@Ptr long var0);

    public static void av_codec_set_chroma_intra_matrix(Pointer<AVCodecContext> avctx, Pointer<Short> val) {
        av_codec_set_chroma_intra_matrix(Pointer.getPeer(avctx), Pointer.getPeer(val));
    }

    protected static native void av_codec_set_chroma_intra_matrix(@Ptr long var0, @Ptr long var2);

    public static int av_codec_get_max_lowres(Pointer<AVCodec> codec) {
        return av_codec_get_max_lowres(Pointer.getPeer(codec));
    }

    protected static native int av_codec_get_max_lowres(@Ptr long var0);

    public static Pointer<AVCodecHWConfig> avcodec_get_hw_config(Pointer<AVCodec> codec, int index) {
        return Pointer.pointerToAddress(avcodec_get_hw_config(Pointer.getPeer(codec), index), AVCodecHWConfig.class);
    }

    @Ptr
    protected static native long avcodec_get_hw_config(@Ptr long var0, int var2);

    public static Pointer<AVCodec> av_codec_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_codec_iterate(Pointer.getPeer(opaque)), AVCodec.class);
    }

    @Ptr
    protected static native long av_codec_iterate(@Ptr long var0);

    public static Pointer<AVCodec> av_codec_next(Pointer<AVCodec> c) {
        return Pointer.pointerToAddress(av_codec_next(Pointer.getPeer(c)), AVCodec.class);
    }

    @Ptr
    protected static native long av_codec_next(@Ptr long var0);

    public static native int avcodec_version();

    public static Pointer<Byte> avcodec__configuration() {
        return Pointer.pointerToAddress(avcodec_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avcodec_configuration();

    public static Pointer<Byte> avcodec__license() {
        return Pointer.pointerToAddress(avcodec_license(), Byte.class);
    }

    @Ptr
    protected static native long avcodec_license();

    public static void avcodec_register(Pointer<AVCodec> codec) {
        avcodec_register(Pointer.getPeer(codec));
    }

    protected static native void avcodec_register(@Ptr long var0);

    public static native void avcodec_register_all();

    public static Pointer<AVCodecContext> avcodec_alloc_context3(Pointer<AVCodec> codec) {
        return Pointer.pointerToAddress(avcodec_alloc_context3(Pointer.getPeer(codec)), AVCodecContext.class);
    }

    @Ptr
    protected static native long avcodec_alloc_context3(@Ptr long var0);

    public static void avcodec_free_context(Pointer<Pointer<AVCodecContext>> avctx) {
        avcodec_free_context(Pointer.getPeer(avctx));
    }

    protected static native void avcodec_free_context(@Ptr long var0);

    /** @deprecated */
    public static int avcodec_get_context_defaults3(Pointer<AVCodecContext> s, Pointer<AVCodec> codec) {
        return avcodec_get_context_defaults3(Pointer.getPeer(s), Pointer.getPeer(codec));
    }

    protected static native int avcodec_get_context_defaults3(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVClass> avcodec__get_class() {
        return Pointer.pointerToAddress(avcodec_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long avcodec_get_class();

    public static Pointer<AVClass> avcodec__get_frame_class() {
        return Pointer.pointerToAddress(avcodec_get_frame_class(), AVClass.class);
    }

    @Ptr
    protected static native long avcodec_get_frame_class();

    public static Pointer<AVClass> avcodec__get_subtitle_rect_class() {
        return Pointer.pointerToAddress(avcodec_get_subtitle_rect_class(), AVClass.class);
    }

    @Ptr
    protected static native long avcodec_get_subtitle_rect_class();

    /** @deprecated */
    public static int avcodec_copy_context(Pointer<AVCodecContext> dest, Pointer<AVCodecContext> src) {
        return avcodec_copy_context(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native int avcodec_copy_context(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVCodecParameters> avcodec__parameters_alloc() {
        return Pointer.pointerToAddress(avcodec_parameters_alloc(), AVCodecParameters.class);
    }

    @Ptr
    protected static native long avcodec_parameters_alloc();

    public static void avcodec_parameters_free(Pointer<Pointer<AVCodecParameters>> par) {
        avcodec_parameters_free(Pointer.getPeer(par));
    }

    protected static native void avcodec_parameters_free(@Ptr long var0);

    public static int avcodec_parameters_copy(Pointer<AVCodecParameters> dst, Pointer<AVCodecParameters> src) {
        return avcodec_parameters_copy(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int avcodec_parameters_copy(@Ptr long var0, @Ptr long var2);

    public static int avcodec_parameters_from_context(Pointer<AVCodecParameters> par, Pointer<AVCodecContext> codec) {
        return avcodec_parameters_from_context(Pointer.getPeer(par), Pointer.getPeer(codec));
    }

    protected static native int avcodec_parameters_from_context(@Ptr long var0, @Ptr long var2);

    public static int avcodec_parameters_to_context(Pointer<AVCodecContext> codec, Pointer<AVCodecParameters> par) {
        return avcodec_parameters_to_context(Pointer.getPeer(codec), Pointer.getPeer(par));
    }

    protected static native int avcodec_parameters_to_context(@Ptr long var0, @Ptr long var2);

    public static int avcodec_open2(Pointer<AVCodecContext> avctx, Pointer<AVCodec> codec, Pointer<Pointer<AVDictionary>> options) {
        return avcodec_open2(Pointer.getPeer(avctx), Pointer.getPeer(codec), Pointer.getPeer(options));
    }

    protected static native int avcodec_open2(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avcodec_close(Pointer<AVCodecContext> avctx) {
        return avcodec_close(Pointer.getPeer(avctx));
    }

    protected static native int avcodec_close(@Ptr long var0);

    public static void avsubtitle_free(Pointer<AVSubtitle> sub) {
        avsubtitle_free(Pointer.getPeer(sub));
    }

    protected static native void avsubtitle_free(@Ptr long var0);

    public static Pointer<AVPacket> av_packet__alloc() {
        return Pointer.pointerToAddress(av_packet_alloc(), AVPacket.class);
    }

    @Ptr
    protected static native long av_packet_alloc();

    public static Pointer<AVPacket> av_packet_clone(Pointer<AVPacket> src) {
        return Pointer.pointerToAddress(av_packet_clone(Pointer.getPeer(src)), AVPacket.class);
    }

    @Ptr
    protected static native long av_packet_clone(@Ptr long var0);

    public static void av_packet_free(Pointer<Pointer<AVPacket>> pkt) {
        av_packet_free(Pointer.getPeer(pkt));
    }

    protected static native void av_packet_free(@Ptr long var0);

    public static void av_init_packet(Pointer<AVPacket> pkt) {
        av_init_packet(Pointer.getPeer(pkt));
    }

    protected static native void av_init_packet(@Ptr long var0);

    public static int av_new_packet(Pointer<AVPacket> pkt, int size) {
        return av_new_packet(Pointer.getPeer(pkt), size);
    }

    protected static native int av_new_packet(@Ptr long var0, int var2);

    public static void av_shrink_packet(Pointer<AVPacket> pkt, int size) {
        av_shrink_packet(Pointer.getPeer(pkt), size);
    }

    protected static native void av_shrink_packet(@Ptr long var0, int var2);

    public static int av_grow_packet(Pointer<AVPacket> pkt, int grow_by) {
        return av_grow_packet(Pointer.getPeer(pkt), grow_by);
    }

    protected static native int av_grow_packet(@Ptr long var0, int var2);

    public static int av_packet_from_data(Pointer<AVPacket> pkt, Pointer<Byte> data, int size) {
        return av_packet_from_data(Pointer.getPeer(pkt), Pointer.getPeer(data), size);
    }

    protected static native int av_packet_from_data(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_dup_packet(Pointer<AVPacket> pkt) {
        return av_dup_packet(Pointer.getPeer(pkt));
    }

    protected static native int av_dup_packet(@Ptr long var0);

    /** @deprecated */
    public static int av_copy_packet(Pointer<AVPacket> dst, Pointer<AVPacket> src) {
        return av_copy_packet(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_copy_packet(@Ptr long var0, @Ptr long var2);

    /** @deprecated */
    public static int av_copy_packet_side_data(Pointer<AVPacket> dst, Pointer<AVPacket> src) {
        return av_copy_packet_side_data(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_copy_packet_side_data(@Ptr long var0, @Ptr long var2);

    /** @deprecated */
    public static void av_free_packet(Pointer<AVPacket> pkt) {
        av_free_packet(Pointer.getPeer(pkt));
    }

    protected static native void av_free_packet(@Ptr long var0);

    public static Pointer<Byte> av_packet_new_side_data(Pointer<AVPacket> pkt, IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> type, int size) {
        return Pointer.pointerToAddress(av_packet_new_side_data(Pointer.getPeer(pkt), (int)type.value(), size), Byte.class);
    }

    @Ptr
    protected static native long av_packet_new_side_data(@Ptr long var0, int var2, int var3);

    public static int av_packet_add_side_data(Pointer<AVPacket> pkt, IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> type, Pointer<Byte> data, @Ptr long size) {
        return av_packet_add_side_data(Pointer.getPeer(pkt), (int)type.value(), Pointer.getPeer(data), size);
    }

    protected static native int av_packet_add_side_data(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static int av_packet_shrink_side_data(Pointer<AVPacket> pkt, IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> type, int size) {
        return av_packet_shrink_side_data(Pointer.getPeer(pkt), (int)type.value(), size);
    }

    protected static native int av_packet_shrink_side_data(@Ptr long var0, int var2, int var3);

    public static Pointer<Byte> av_packet_get_side_data(Pointer<AVPacket> pkt, IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> type, Pointer<Integer> size) {
        return Pointer.pointerToAddress(av_packet_get_side_data(Pointer.getPeer(pkt), (int)type.value(), Pointer.getPeer(size)), Byte.class);
    }

    @Ptr
    protected static native long av_packet_get_side_data(@Ptr long var0, int var2, @Ptr long var3);

    public static int av_packet_merge_side_data(Pointer<AVPacket> pkt) {
        return av_packet_merge_side_data(Pointer.getPeer(pkt));
    }

    protected static native int av_packet_merge_side_data(@Ptr long var0);

    public static int av_packet_split_side_data(Pointer<AVPacket> pkt) {
        return av_packet_split_side_data(Pointer.getPeer(pkt));
    }

    protected static native int av_packet_split_side_data(@Ptr long var0);

    public static Pointer<Byte> av_packet_side_data_name(IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> type) {
        return Pointer.pointerToAddress(av_packet_side_data_name((int)type.value()), Byte.class);
    }

    @Ptr
    protected static native long av_packet_side_data_name(int var0);

    public static Pointer<Byte> av_packet_pack_dictionary(Pointer<AVDictionary> dict, Pointer<Integer> size) {
        return Pointer.pointerToAddress(av_packet_pack_dictionary(Pointer.getPeer(dict), Pointer.getPeer(size)), Byte.class);
    }

    @Ptr
    protected static native long av_packet_pack_dictionary(@Ptr long var0, @Ptr long var2);

    public static int av_packet_unpack_dictionary(Pointer<Byte> data, int size, Pointer<Pointer<AVDictionary>> dict) {
        return av_packet_unpack_dictionary(Pointer.getPeer(data), size, Pointer.getPeer(dict));
    }

    protected static native int av_packet_unpack_dictionary(@Ptr long var0, int var2, @Ptr long var3);

    public static void av_packet_free_side_data(Pointer<AVPacket> pkt) {
        av_packet_free_side_data(Pointer.getPeer(pkt));
    }

    protected static native void av_packet_free_side_data(@Ptr long var0);

    public static int av_packet_ref(Pointer<AVPacket> dst, Pointer<AVPacket> src) {
        return av_packet_ref(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_packet_ref(@Ptr long var0, @Ptr long var2);

    public static void av_packet_unref(Pointer<AVPacket> pkt) {
        av_packet_unref(Pointer.getPeer(pkt));
    }

    protected static native void av_packet_unref(@Ptr long var0);

    public static void av_packet_move_ref(Pointer<AVPacket> dst, Pointer<AVPacket> src) {
        av_packet_move_ref(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native void av_packet_move_ref(@Ptr long var0, @Ptr long var2);

    public static int av_packet_copy_props(Pointer<AVPacket> dst, Pointer<AVPacket> src) {
        return av_packet_copy_props(Pointer.getPeer(dst), Pointer.getPeer(src));
    }

    protected static native int av_packet_copy_props(@Ptr long var0, @Ptr long var2);

    public static int av_packet_make_refcounted(Pointer<AVPacket> pkt) {
        return av_packet_make_refcounted(Pointer.getPeer(pkt));
    }

    protected static native int av_packet_make_refcounted(@Ptr long var0);

    public static int av_packet_make_writable(Pointer<AVPacket> pkt) {
        return av_packet_make_writable(Pointer.getPeer(pkt));
    }

    protected static native int av_packet_make_writable(@Ptr long var0);

    public static void av_packet_rescale_ts(Pointer<AVPacket> pkt, AVRational tb_src, AVRational tb_dst) {
        av_packet_rescale_ts(Pointer.getPeer(pkt), tb_src, tb_dst);
    }

    protected static native void av_packet_rescale_ts(@Ptr long var0, AVRational var2, AVRational var3);

    public static Pointer<AVCodec> avcodec_find_decoder(IntValuedEnum<AvcodecLibrary.AVCodecID> id) {
        return Pointer.pointerToAddress(avcodec_find_decoder((int)id.value()), AVCodec.class);
    }

    @Ptr
    protected static native long avcodec_find_decoder(int var0);

    public static Pointer<AVCodec> avcodec_find_decoder_by_name(Pointer<Byte> name) {
        return Pointer.pointerToAddress(avcodec_find_decoder_by_name(Pointer.getPeer(name)), AVCodec.class);
    }

    @Ptr
    protected static native long avcodec_find_decoder_by_name(@Ptr long var0);

    public static int avcodec_default_get_buffer2(Pointer<AVCodecContext> s, Pointer<AVFrame> frame, int flags) {
        return avcodec_default_get_buffer2(Pointer.getPeer(s), Pointer.getPeer(frame), flags);
    }

    protected static native int avcodec_default_get_buffer2(@Ptr long var0, @Ptr long var2, int var4);

    public static void avcodec_align_dimensions(Pointer<AVCodecContext> s, Pointer<Integer> width, Pointer<Integer> height) {
        avcodec_align_dimensions(Pointer.getPeer(s), Pointer.getPeer(width), Pointer.getPeer(height));
    }

    protected static native void avcodec_align_dimensions(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void avcodec_align_dimensions2(Pointer<AVCodecContext> s, Pointer<Integer> width, Pointer<Integer> height, Pointer<Integer> linesize_align) {
        avcodec_align_dimensions2(Pointer.getPeer(s), Pointer.getPeer(width), Pointer.getPeer(height), Pointer.getPeer(linesize_align));
    }

    protected static native void avcodec_align_dimensions2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avcodec_enum_to_chroma_pos(Pointer<Integer> xpos, Pointer<Integer> ypos, IntValuedEnum<AVChromaLocation> pos) {
        return avcodec_enum_to_chroma_pos(Pointer.getPeer(xpos), Pointer.getPeer(ypos), (int)pos.value());
    }

    protected static native int avcodec_enum_to_chroma_pos(@Ptr long var0, @Ptr long var2, int var4);

    public static IntValuedEnum<AVChromaLocation> avcodec__chroma_pos_to_enum(int xpos, int ypos) {
        return FlagSet.fromValue(avcodec_chroma_pos_to_enum(xpos, ypos), AVChromaLocation.class);
    }

    protected static native int avcodec_chroma_pos_to_enum(int var0, int var1);

    /** @deprecated */
    public static int avcodec_decode_audio4(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame, Pointer<Integer> got_frame_ptr, Pointer<AVPacket> avpkt) {
        return avcodec_decode_audio4(Pointer.getPeer(avctx), Pointer.getPeer(frame), Pointer.getPeer(got_frame_ptr), Pointer.getPeer(avpkt));
    }

    protected static native int avcodec_decode_audio4(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    /** @deprecated */
    public static int avcodec_decode_video2(Pointer<AVCodecContext> avctx, Pointer<AVFrame> picture, Pointer<Integer> got_picture_ptr, Pointer<AVPacket> avpkt) {
        return avcodec_decode_video2(Pointer.getPeer(avctx), Pointer.getPeer(picture), Pointer.getPeer(got_picture_ptr), Pointer.getPeer(avpkt));
    }

    protected static native int avcodec_decode_video2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avcodec_decode_subtitle2(Pointer<AVCodecContext> avctx, Pointer<AVSubtitle> sub, Pointer<Integer> got_sub_ptr, Pointer<AVPacket> avpkt) {
        return avcodec_decode_subtitle2(Pointer.getPeer(avctx), Pointer.getPeer(sub), Pointer.getPeer(got_sub_ptr), Pointer.getPeer(avpkt));
    }

    protected static native int avcodec_decode_subtitle2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avcodec_send_packet(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt) {
        return avcodec_send_packet(Pointer.getPeer(avctx), Pointer.getPeer(avpkt));
    }

    protected static native int avcodec_send_packet(@Ptr long var0, @Ptr long var2);

    public static int avcodec_receive_frame(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame) {
        return avcodec_receive_frame(Pointer.getPeer(avctx), Pointer.getPeer(frame));
    }

    protected static native int avcodec_receive_frame(@Ptr long var0, @Ptr long var2);

    public static int avcodec_send_frame(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame) {
        return avcodec_send_frame(Pointer.getPeer(avctx), Pointer.getPeer(frame));
    }

    protected static native int avcodec_send_frame(@Ptr long var0, @Ptr long var2);

    public static int avcodec_receive_packet(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt) {
        return avcodec_receive_packet(Pointer.getPeer(avctx), Pointer.getPeer(avpkt));
    }

    protected static native int avcodec_receive_packet(@Ptr long var0, @Ptr long var2);

    public static int avcodec_get_hw_frames_parameters(Pointer<AVCodecContext> avctx, Pointer<AVBufferRef> device_ref, IntValuedEnum<AVPixelFormat> hw_pix_fmt, Pointer<Pointer<AVBufferRef>> out_frames_ref) {
        return avcodec_get_hw_frames_parameters(Pointer.getPeer(avctx), Pointer.getPeer(device_ref), (int)hw_pix_fmt.value(), Pointer.getPeer(out_frames_ref));
    }

    protected static native int avcodec_get_hw_frames_parameters(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static Pointer<AVCodecParser> av_parser_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_parser_iterate(Pointer.getPeer(opaque)), AVCodecParser.class);
    }

    @Ptr
    protected static native long av_parser_iterate(@Ptr long var0);

    public static Pointer<AVCodecParser> av_parser_next(Pointer<AVCodecParser> c) {
        return Pointer.pointerToAddress(av_parser_next(Pointer.getPeer(c)), AVCodecParser.class);
    }

    @Ptr
    protected static native long av_parser_next(@Ptr long var0);

    public static void av_register_codec_parser(Pointer<AVCodecParser> parser) {
        av_register_codec_parser(Pointer.getPeer(parser));
    }

    protected static native void av_register_codec_parser(@Ptr long var0);

    public static Pointer<AVCodecParserContext> av__parser_init(int codec_id) {
        return Pointer.pointerToAddress(av_parser_init(codec_id), AVCodecParserContext.class);
    }

    @Ptr
    protected static native long av_parser_init(int var0);

    public static int av_parser_parse2(Pointer<AVCodecParserContext> s, Pointer<AVCodecContext> avctx, Pointer<Pointer<Byte>> poutbuf, Pointer<Integer> poutbuf_size, Pointer<Byte> buf, int buf_size, long pts, long dts, long pos) {
        return av_parser_parse2(Pointer.getPeer(s), Pointer.getPeer(avctx), Pointer.getPeer(poutbuf), Pointer.getPeer(poutbuf_size), Pointer.getPeer(buf), buf_size, pts, dts, pos);
    }

    protected static native int av_parser_parse2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, int var10, long var11, long var13, long var15);

    /** @deprecated */
    public static int av_parser_change(Pointer<AVCodecParserContext> s, Pointer<AVCodecContext> avctx, Pointer<Pointer<Byte>> poutbuf, Pointer<Integer> poutbuf_size, Pointer<Byte> buf, int buf_size, int keyframe) {
        return av_parser_change(Pointer.getPeer(s), Pointer.getPeer(avctx), Pointer.getPeer(poutbuf), Pointer.getPeer(poutbuf_size), Pointer.getPeer(buf), buf_size, keyframe);
    }

    protected static native int av_parser_change(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, int var10, int var11);

    public static void av_parser_close(Pointer<AVCodecParserContext> s) {
        av_parser_close(Pointer.getPeer(s));
    }

    protected static native void av_parser_close(@Ptr long var0);

    public static Pointer<AVCodec> avcodec_find_encoder(IntValuedEnum<AvcodecLibrary.AVCodecID> id) {
        return Pointer.pointerToAddress(avcodec_find_encoder((int)id.value()), AVCodec.class);
    }

    @Ptr
    protected static native long avcodec_find_encoder(int var0);

    public static Pointer<AVCodec> avcodec_find_encoder_by_name(Pointer<Byte> name) {
        return Pointer.pointerToAddress(avcodec_find_encoder_by_name(Pointer.getPeer(name)), AVCodec.class);
    }

    @Ptr
    protected static native long avcodec_find_encoder_by_name(@Ptr long var0);

    /** @deprecated */
    public static int avcodec_encode_audio2(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt, Pointer<AVFrame> frame, Pointer<Integer> got_packet_ptr) {
        return avcodec_encode_audio2(Pointer.getPeer(avctx), Pointer.getPeer(avpkt), Pointer.getPeer(frame), Pointer.getPeer(got_packet_ptr));
    }

    protected static native int avcodec_encode_audio2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    /** @deprecated */
    public static int avcodec_encode_video2(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt, Pointer<AVFrame> frame, Pointer<Integer> got_packet_ptr) {
        return avcodec_encode_video2(Pointer.getPeer(avctx), Pointer.getPeer(avpkt), Pointer.getPeer(frame), Pointer.getPeer(got_packet_ptr));
    }

    protected static native int avcodec_encode_video2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avcodec_encode_subtitle(Pointer<AVCodecContext> avctx, Pointer<Byte> buf, int buf_size, Pointer<AVSubtitle> sub) {
        return avcodec_encode_subtitle(Pointer.getPeer(avctx), Pointer.getPeer(buf), buf_size, Pointer.getPeer(sub));
    }

    protected static native int avcodec_encode_subtitle(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    /** @deprecated */
    public static int avpicture_alloc(Pointer<AVPicture> picture, IntValuedEnum<AVPixelFormat> pix_fmt, int width, int height) {
        return avpicture_alloc(Pointer.getPeer(picture), (int)pix_fmt.value(), width, height);
    }

    protected static native int avpicture_alloc(@Ptr long var0, int var2, int var3, int var4);

    /** @deprecated */
    public static void avpicture_free(Pointer<AVPicture> picture) {
        avpicture_free(Pointer.getPeer(picture));
    }

    protected static native void avpicture_free(@Ptr long var0);

    /** @deprecated */
    public static int avpicture_fill(Pointer<AVPicture> picture, Pointer<Byte> ptr, IntValuedEnum<AVPixelFormat> pix_fmt, int width, int height) {
        return avpicture_fill(Pointer.getPeer(picture), Pointer.getPeer(ptr), (int)pix_fmt.value(), width, height);
    }

    protected static native int avpicture_fill(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6);

    /** @deprecated */
    public static int avpicture_layout(Pointer<AVPicture> src, IntValuedEnum<AVPixelFormat> pix_fmt, int width, int height, Pointer<Byte> dest, int dest_size) {
        return avpicture_layout(Pointer.getPeer(src), (int)pix_fmt.value(), width, height, Pointer.getPeer(dest), dest_size);
    }

    protected static native int avpicture_layout(@Ptr long var0, int var2, int var3, int var4, @Ptr long var5, int var7);

    public static int avpicture_get_size(IntValuedEnum<AVPixelFormat> pix_fmt, int width, int height) {
        return avpicture_get_size((int)pix_fmt.value(), width, height);
    }

    protected static native int avpicture_get_size(int var0, int var1, int var2);

    public static void av_picture_copy(Pointer<AVPicture> dst, Pointer<AVPicture> src, IntValuedEnum<AVPixelFormat> pix_fmt, int width, int height) {
        av_picture_copy(Pointer.getPeer(dst), Pointer.getPeer(src), (int)pix_fmt.value(), width, height);
    }

    protected static native void av_picture_copy(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6);

    public static int av_picture_crop(Pointer<AVPicture> dst, Pointer<AVPicture> src, IntValuedEnum<AVPixelFormat> pix_fmt, int top_band, int left_band) {
        return av_picture_crop(Pointer.getPeer(dst), Pointer.getPeer(src), (int)pix_fmt.value(), top_band, left_band);
    }

    protected static native int av_picture_crop(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6);

    public static int av_picture_pad(Pointer<AVPicture> dst, Pointer<AVPicture> src, int height, int width, IntValuedEnum<AVPixelFormat> pix_fmt, int padtop, int padbottom, int padleft, int padright, Pointer<Integer> color) {
        return av_picture_pad(Pointer.getPeer(dst), Pointer.getPeer(src), height, width, (int)pix_fmt.value(), padtop, padbottom, padleft, padright, Pointer.getPeer(color));
    }

    protected static native int av_picture_pad(@Ptr long var0, @Ptr long var2, int var4, int var5, int var6, int var7, int var8, int var9, int var10, @Ptr long var11);

    public static void avcodec_get_chroma_sub_sample(IntValuedEnum<AVPixelFormat> pix_fmt, Pointer<Integer> h_shift, Pointer<Integer> v_shift) {
        avcodec_get_chroma_sub_sample((int)pix_fmt.value(), Pointer.getPeer(h_shift), Pointer.getPeer(v_shift));
    }

    protected static native void avcodec_get_chroma_sub_sample(int var0, @Ptr long var1, @Ptr long var3);

    public static int avcodec_pix_fmt_to_codec_tag(IntValuedEnum<AVPixelFormat> pix_fmt) {
        return avcodec_pix_fmt_to_codec_tag((int)pix_fmt.value());
    }

    protected static native int avcodec_pix_fmt_to_codec_tag(int var0);

    /** @deprecated */
    public static int avcodec_get_pix_fmt_loss(IntValuedEnum<AVPixelFormat> dst_pix_fmt, IntValuedEnum<AVPixelFormat> src_pix_fmt, int has_alpha) {
        return avcodec_get_pix_fmt_loss((int)dst_pix_fmt.value(), (int)src_pix_fmt.value(), has_alpha);
    }

    protected static native int avcodec_get_pix_fmt_loss(int var0, int var1, int var2);

    public static IntValuedEnum<AVPixelFormat> avcodec_find_best_pix_fmt_of_list(Pointer<IntValuedEnum<AVPixelFormat>> pix_fmt_list, IntValuedEnum<AVPixelFormat> src_pix_fmt, int has_alpha, Pointer<Integer> loss_ptr) {
        return FlagSet.fromValue(avcodec_find_best_pix_fmt_of_list(Pointer.getPeer(pix_fmt_list), (int)src_pix_fmt.value(), has_alpha, Pointer.getPeer(loss_ptr)), AVPixelFormat.class);
    }

    protected static native int avcodec_find_best_pix_fmt_of_list(@Ptr long var0, int var2, int var3, @Ptr long var4);

    /** @deprecated */
    public static IntValuedEnum<AVPixelFormat> avcodec_find_best_pix_fmt_of_2(IntValuedEnum<AVPixelFormat> dst_pix_fmt1, IntValuedEnum<AVPixelFormat> dst_pix_fmt2, IntValuedEnum<AVPixelFormat> src_pix_fmt, int has_alpha, Pointer<Integer> loss_ptr) {
        return FlagSet.fromValue(avcodec_find_best_pix_fmt_of_2((int)dst_pix_fmt1.value(), (int)dst_pix_fmt2.value(), (int)src_pix_fmt.value(), has_alpha, Pointer.getPeer(loss_ptr)), AVPixelFormat.class);
    }

    protected static native int avcodec_find_best_pix_fmt_of_2(int var0, int var1, int var2, int var3, @Ptr long var4);

    public static IntValuedEnum<AVPixelFormat> avcodec_find_best_pix_fmt2(IntValuedEnum<AVPixelFormat> dst_pix_fmt1, IntValuedEnum<AVPixelFormat> dst_pix_fmt2, IntValuedEnum<AVPixelFormat> src_pix_fmt, int has_alpha, Pointer<Integer> loss_ptr) {
        return FlagSet.fromValue(avcodec_find_best_pix_fmt2((int)dst_pix_fmt1.value(), (int)dst_pix_fmt2.value(), (int)src_pix_fmt.value(), has_alpha, Pointer.getPeer(loss_ptr)), AVPixelFormat.class);
    }

    protected static native int avcodec_find_best_pix_fmt2(int var0, int var1, int var2, int var3, @Ptr long var4);

    public static IntValuedEnum<AVPixelFormat> avcodec_default_get_format(Pointer<AVCodecContext> s, Pointer<IntValuedEnum<AVPixelFormat>> fmt) {
        return FlagSet.fromValue(avcodec_default_get_format(Pointer.getPeer(s), Pointer.getPeer(fmt)), AVPixelFormat.class);
    }

    protected static native int avcodec_default_get_format(@Ptr long var0, @Ptr long var2);

    /** @deprecated */
    @Ptr
    public static long av_get_codec_tag_string(Pointer<Byte> buf, @Ptr long buf_size, int codec_tag) {
        return av_get_codec_tag_string(Pointer.getPeer(buf), buf_size, codec_tag);
    }

    @Ptr
    protected static native long av_get_codec_tag_string(@Ptr long var0, @Ptr long var2, int var4);

    public static void avcodec_string(Pointer<Byte> buf, int buf_size, Pointer<AVCodecContext> enc, int encode) {
        avcodec_string(Pointer.getPeer(buf), buf_size, Pointer.getPeer(enc), encode);
    }

    protected static native void avcodec_string(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static Pointer<Byte> av_get_profile_name(Pointer<AVCodec> codec, int profile) {
        return Pointer.pointerToAddress(av_get_profile_name(Pointer.getPeer(codec), profile), Byte.class);
    }

    @Ptr
    protected static native long av_get_profile_name(@Ptr long var0, int var2);

    public static Pointer<Byte> avcodec_profile_name(IntValuedEnum<AvcodecLibrary.AVCodecID> codec_id, int profile) {
        return Pointer.pointerToAddress(avcodec_profile_name((int)codec_id.value(), profile), Byte.class);
    }

    @Ptr
    protected static native long avcodec_profile_name(int var0, int var1);

    public static int avcodec_default_execute(Pointer<AVCodecContext> c, Pointer<AvcodecLibrary.avcodec_default_execute_func_callback> func, Pointer<?> arg, Pointer<Integer> ret, int count, int size) {
        return avcodec_default_execute(Pointer.getPeer(c), Pointer.getPeer(func), Pointer.getPeer(arg), Pointer.getPeer(ret), count, size);
    }

    protected static native int avcodec_default_execute(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9);

    public static int avcodec_default_execute2(Pointer<AVCodecContext> c, Pointer<AvcodecLibrary.avcodec_default_execute2_func_callback> func, Pointer<?> arg, Pointer<Integer> ret, int count) {
        return avcodec_default_execute2(Pointer.getPeer(c), Pointer.getPeer(func), Pointer.getPeer(arg), Pointer.getPeer(ret), count);
    }

    protected static native int avcodec_default_execute2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8);

    public static int avcodec_fill_audio_frame(Pointer<AVFrame> frame, int nb_channels, IntValuedEnum<AVSampleFormat> sample_fmt, Pointer<Byte> buf, int buf_size, int align) {
        return avcodec_fill_audio_frame(Pointer.getPeer(frame), nb_channels, (int)sample_fmt.value(), Pointer.getPeer(buf), buf_size, align);
    }

    protected static native int avcodec_fill_audio_frame(@Ptr long var0, int var2, int var3, @Ptr long var4, int var6, int var7);

    public static void avcodec_flush_buffers(Pointer<AVCodecContext> avctx) {
        avcodec_flush_buffers(Pointer.getPeer(avctx));
    }

    protected static native void avcodec_flush_buffers(@Ptr long var0);

    public static int av_get_bits_per_sample(IntValuedEnum<AvcodecLibrary.AVCodecID> codec_id) {
        return av_get_bits_per_sample((int)codec_id.value());
    }

    protected static native int av_get_bits_per_sample(int var0);

    public static IntValuedEnum<AvcodecLibrary.AVCodecID> av_get_pcm_codec(IntValuedEnum<AVSampleFormat> fmt, int be) {
        return FlagSet.fromValue(av_get_pcm_codec((int)fmt.value(), be), AvcodecLibrary.AVCodecID.class);
    }

    protected static native int av_get_pcm_codec(int var0, int var1);

    public static int av_get_exact_bits_per_sample(IntValuedEnum<AvcodecLibrary.AVCodecID> codec_id) {
        return av_get_exact_bits_per_sample((int)codec_id.value());
    }

    protected static native int av_get_exact_bits_per_sample(int var0);

    public static int av_get_audio_frame_duration(Pointer<AVCodecContext> avctx, int frame_bytes) {
        return av_get_audio_frame_duration(Pointer.getPeer(avctx), frame_bytes);
    }

    protected static native int av_get_audio_frame_duration(@Ptr long var0, int var2);

    public static int av_get_audio_frame_duration2(Pointer<AVCodecParameters> par, int frame_bytes) {
        return av_get_audio_frame_duration2(Pointer.getPeer(par), frame_bytes);
    }

    protected static native int av_get_audio_frame_duration2(@Ptr long var0, int var2);

    /** @deprecated */
    public static void av_register_bitstream_filter(Pointer<AVBitStreamFilter> bsf) {
        av_register_bitstream_filter(Pointer.getPeer(bsf));
    }

    protected static native void av_register_bitstream_filter(@Ptr long var0);

    /** @deprecated */
    public static Pointer<AVBitStreamFilterContext> av_bitstream_filter_init(Pointer<Byte> name) {
        return Pointer.pointerToAddress(av_bitstream_filter_init(Pointer.getPeer(name)), AVBitStreamFilterContext.class);
    }

    @Ptr
    protected static native long av_bitstream_filter_init(@Ptr long var0);

    /** @deprecated */
    public static int av_bitstream_filter_filter(Pointer<AVBitStreamFilterContext> bsfc, Pointer<AVCodecContext> avctx, Pointer<Byte> args, Pointer<Pointer<Byte>> poutbuf, Pointer<Integer> poutbuf_size, Pointer<Byte> buf, int buf_size, int keyframe) {
        return av_bitstream_filter_filter(Pointer.getPeer(bsfc), Pointer.getPeer(avctx), Pointer.getPeer(args), Pointer.getPeer(poutbuf), Pointer.getPeer(poutbuf_size), Pointer.getPeer(buf), buf_size, keyframe);
    }

    protected static native int av_bitstream_filter_filter(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, @Ptr long var10, int var12, int var13);

    /** @deprecated */
    public static void av_bitstream_filter_close(Pointer<AVBitStreamFilterContext> bsf) {
        av_bitstream_filter_close(Pointer.getPeer(bsf));
    }

    protected static native void av_bitstream_filter_close(@Ptr long var0);

    public static Pointer<AVBitStreamFilter> av_bitstream_filter_next(Pointer<AVBitStreamFilter> f) {
        return Pointer.pointerToAddress(av_bitstream_filter_next(Pointer.getPeer(f)), AVBitStreamFilter.class);
    }

    @Ptr
    protected static native long av_bitstream_filter_next(@Ptr long var0);

    public static Pointer<AVBitStreamFilter> av_bsf_get_by_name(Pointer<Byte> name) {
        return Pointer.pointerToAddress(av_bsf_get_by_name(Pointer.getPeer(name)), AVBitStreamFilter.class);
    }

    @Ptr
    protected static native long av_bsf_get_by_name(@Ptr long var0);

    public static Pointer<AVBitStreamFilter> av_bsf_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_bsf_iterate(Pointer.getPeer(opaque)), AVBitStreamFilter.class);
    }

    @Ptr
    protected static native long av_bsf_iterate(@Ptr long var0);

    public static Pointer<AVBitStreamFilter> av_bsf_next(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_bsf_next(Pointer.getPeer(opaque)), AVBitStreamFilter.class);
    }

    @Ptr
    protected static native long av_bsf_next(@Ptr long var0);

    public static int av_bsf_alloc(Pointer<AVBitStreamFilter> filter, Pointer<Pointer<AVBSFContext>> ctx) {
        return av_bsf_alloc(Pointer.getPeer(filter), Pointer.getPeer(ctx));
    }

    protected static native int av_bsf_alloc(@Ptr long var0, @Ptr long var2);

    public static int av_bsf_init(Pointer<AVBSFContext> ctx) {
        return av_bsf_init(Pointer.getPeer(ctx));
    }

    protected static native int av_bsf_init(@Ptr long var0);

    public static int av_bsf_send_packet(Pointer<AVBSFContext> ctx, Pointer<AVPacket> pkt) {
        return av_bsf_send_packet(Pointer.getPeer(ctx), Pointer.getPeer(pkt));
    }

    protected static native int av_bsf_send_packet(@Ptr long var0, @Ptr long var2);

    public static int av_bsf_receive_packet(Pointer<AVBSFContext> ctx, Pointer<AVPacket> pkt) {
        return av_bsf_receive_packet(Pointer.getPeer(ctx), Pointer.getPeer(pkt));
    }

    protected static native int av_bsf_receive_packet(@Ptr long var0, @Ptr long var2);

    public static void av_bsf_free(Pointer<Pointer<AVBSFContext>> ctx) {
        av_bsf_free(Pointer.getPeer(ctx));
    }

    protected static native void av_bsf_free(@Ptr long var0);

    public static Pointer<AVClass> av_bsf__get_class() {
        return Pointer.pointerToAddress(av_bsf_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long av_bsf_get_class();

    public static Pointer<AVBSFList> av__bsf_list_alloc() {
        return Pointer.pointerToAddress(av_bsf_list_alloc(), AVBSFList.class);
    }

    @Ptr
    protected static native long av_bsf_list_alloc();

    public static void av_bsf_list_free(Pointer<Pointer<AVBSFList>> lst) {
        av_bsf_list_free(Pointer.getPeer(lst));
    }

    protected static native void av_bsf_list_free(@Ptr long var0);

    public static int av_bsf_list_append(Pointer<AVBSFList> lst, Pointer<AVBSFContext> bsf) {
        return av_bsf_list_append(Pointer.getPeer(lst), Pointer.getPeer(bsf));
    }

    protected static native int av_bsf_list_append(@Ptr long var0, @Ptr long var2);

    public static int av_bsf_list_append2(Pointer<AVBSFList> lst, Pointer<Byte> bsf_name, Pointer<Pointer<AVDictionary>> options) {
        return av_bsf_list_append2(Pointer.getPeer(lst), Pointer.getPeer(bsf_name), Pointer.getPeer(options));
    }

    protected static native int av_bsf_list_append2(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_bsf_list_finalize(Pointer<Pointer<AVBSFList>> lst, Pointer<Pointer<AVBSFContext>> bsf) {
        return av_bsf_list_finalize(Pointer.getPeer(lst), Pointer.getPeer(bsf));
    }

    protected static native int av_bsf_list_finalize(@Ptr long var0, @Ptr long var2);

    public static int av_bsf_list_parse_str(Pointer<Byte> str, Pointer<Pointer<AVBSFContext>> bsf) {
        return av_bsf_list_parse_str(Pointer.getPeer(str), Pointer.getPeer(bsf));
    }

    protected static native int av_bsf_list_parse_str(@Ptr long var0, @Ptr long var2);

    public static int av_bsf_get_null_filter(Pointer<Pointer<AVBSFContext>> bsf) {
        return av_bsf_get_null_filter(Pointer.getPeer(bsf));
    }

    protected static native int av_bsf_get_null_filter(@Ptr long var0);

    public static void av_fast_padded_malloc(Pointer<?> ptr, Pointer<Integer> size, @Ptr long min_size) {
        av_fast_padded_malloc(Pointer.getPeer(ptr), Pointer.getPeer(size), min_size);
    }

    protected static native void av_fast_padded_malloc(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void av_fast_padded_mallocz(Pointer<?> ptr, Pointer<Integer> size, @Ptr long min_size) {
        av_fast_padded_mallocz(Pointer.getPeer(ptr), Pointer.getPeer(size), min_size);
    }

    protected static native void av_fast_padded_mallocz(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int av_xiphlacing(Pointer<Byte> s, int v) {
        return av_xiphlacing(Pointer.getPeer(s), v);
    }

    protected static native int av_xiphlacing(@Ptr long var0, int var2);

    public static void av_register_hwaccel(Pointer<AVHWAccel> hwaccel) {
        av_register_hwaccel(Pointer.getPeer(hwaccel));
    }

    protected static native void av_register_hwaccel(@Ptr long var0);

    public static Pointer<AVHWAccel> av_hwaccel_next(Pointer<AVHWAccel> hwaccel) {
        return Pointer.pointerToAddress(av_hwaccel_next(Pointer.getPeer(hwaccel)), AVHWAccel.class);
    }

    @Ptr
    protected static native long av_hwaccel_next(@Ptr long var0);

    public static IntValuedEnum<AVMediaType> avcodec_get_type(IntValuedEnum<AvcodecLibrary.AVCodecID> codec_id) {
        return FlagSet.fromValue(avcodec_get_type((int)codec_id.value()), AVMediaType.class);
    }

    protected static native int avcodec_get_type(int var0);

    public static Pointer<Byte> avcodec_get_name(IntValuedEnum<AvcodecLibrary.AVCodecID> id) {
        return Pointer.pointerToAddress(avcodec_get_name((int)id.value()), Byte.class);
    }

    @Ptr
    protected static native long avcodec_get_name(int var0);

    public static int avcodec_is_open(Pointer<AVCodecContext> s) {
        return avcodec_is_open(Pointer.getPeer(s));
    }

    protected static native int avcodec_is_open(@Ptr long var0);

    public static int av_codec_is_encoder(Pointer<AVCodec> codec) {
        return av_codec_is_encoder(Pointer.getPeer(codec));
    }

    protected static native int av_codec_is_encoder(@Ptr long var0);

    public static int av_codec_is_decoder(Pointer<AVCodec> codec) {
        return av_codec_is_decoder(Pointer.getPeer(codec));
    }

    protected static native int av_codec_is_decoder(@Ptr long var0);

    public static Pointer<AVCodecDescriptor> avcodec_descriptor_get(IntValuedEnum<AvcodecLibrary.AVCodecID> id) {
        return Pointer.pointerToAddress(avcodec_descriptor_get((int)id.value()), AVCodecDescriptor.class);
    }

    @Ptr
    protected static native long avcodec_descriptor_get(int var0);

    public static Pointer<AVCodecDescriptor> avcodec_descriptor_next(Pointer<AVCodecDescriptor> prev) {
        return Pointer.pointerToAddress(avcodec_descriptor_next(Pointer.getPeer(prev)), AVCodecDescriptor.class);
    }

    @Ptr
    protected static native long avcodec_descriptor_next(@Ptr long var0);

    public static Pointer<AVCodecDescriptor> avcodec_descriptor_get_by_name(Pointer<Byte> name) {
        return Pointer.pointerToAddress(avcodec_descriptor_get_by_name(Pointer.getPeer(name)), AVCodecDescriptor.class);
    }

    @Ptr
    protected static native long avcodec_descriptor_get_by_name(@Ptr long var0);

    public static Pointer<AVCPBProperties> av_cpb_properties_alloc(Pointer<SizeT> size) {
        return Pointer.pointerToAddress(av_cpb_properties_alloc(Pointer.getPeer(size)), AVCPBProperties.class);
    }

    @Ptr
    protected static native long av_cpb_properties_alloc(@Ptr long var0);

    public static enum AVAudioServiceType implements IntValuedEnum<AvcodecLibrary.AVAudioServiceType> {
        AV_AUDIO_SERVICE_TYPE_MAIN(0L),
        AV_AUDIO_SERVICE_TYPE_EFFECTS(1L),
        AV_AUDIO_SERVICE_TYPE_VISUALLY_IMPAIRED(2L),
        AV_AUDIO_SERVICE_TYPE_HEARING_IMPAIRED(3L),
        AV_AUDIO_SERVICE_TYPE_DIALOGUE(4L),
        AV_AUDIO_SERVICE_TYPE_COMMENTARY(5L),
        AV_AUDIO_SERVICE_TYPE_EMERGENCY(6L),
        AV_AUDIO_SERVICE_TYPE_VOICE_OVER(7L),
        AV_AUDIO_SERVICE_TYPE_KARAOKE(8L),
        AV_AUDIO_SERVICE_TYPE_NB(9L);

        public final long value;

        private AVAudioServiceType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVAudioServiceType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVAudioServiceType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public interface AVCodecHWConfigInternal {
    }

    public static enum AVCodecID implements IntValuedEnum<AvcodecLibrary.AVCodecID> {
        AV_CODEC_ID_NONE(0L),
        AV_CODEC_ID_MPEG1VIDEO(1L),
        AV_CODEC_ID_MPEG2VIDEO(2L),
        AV_CODEC_ID_H261(3L),
        AV_CODEC_ID_H263(4L),
        AV_CODEC_ID_RV10(5L),
        AV_CODEC_ID_RV20(6L),
        AV_CODEC_ID_MJPEG(7L),
        AV_CODEC_ID_MJPEGB(8L),
        AV_CODEC_ID_LJPEG(9L),
        AV_CODEC_ID_SP5X(10L),
        AV_CODEC_ID_JPEGLS(11L),
        AV_CODEC_ID_MPEG4(12L),
        AV_CODEC_ID_RAWVIDEO(13L),
        AV_CODEC_ID_MSMPEG4V1(14L),
        AV_CODEC_ID_MSMPEG4V2(15L),
        AV_CODEC_ID_MSMPEG4V3(16L),
        AV_CODEC_ID_WMV1(17L),
        AV_CODEC_ID_WMV2(18L),
        AV_CODEC_ID_H263P(19L),
        AV_CODEC_ID_H263I(20L),
        AV_CODEC_ID_FLV1(21L),
        AV_CODEC_ID_SVQ1(22L),
        AV_CODEC_ID_SVQ3(23L),
        AV_CODEC_ID_DVVIDEO(24L),
        AV_CODEC_ID_HUFFYUV(25L),
        AV_CODEC_ID_CYUV(26L),
        AV_CODEC_ID_H264(27L),
        AV_CODEC_ID_INDEO3(28L),
        AV_CODEC_ID_VP3(29L),
        AV_CODEC_ID_THEORA(30L),
        AV_CODEC_ID_ASV1(31L),
        AV_CODEC_ID_ASV2(32L),
        AV_CODEC_ID_FFV1(33L),
        AV_CODEC_ID_4XM(34L),
        AV_CODEC_ID_VCR1(35L),
        AV_CODEC_ID_CLJR(36L),
        AV_CODEC_ID_MDEC(37L),
        AV_CODEC_ID_ROQ(38L),
        AV_CODEC_ID_INTERPLAY_VIDEO(39L),
        AV_CODEC_ID_XAN_WC3(40L),
        AV_CODEC_ID_XAN_WC4(41L),
        AV_CODEC_ID_RPZA(42L),
        AV_CODEC_ID_CINEPAK(43L),
        AV_CODEC_ID_WS_VQA(44L),
        AV_CODEC_ID_MSRLE(45L),
        AV_CODEC_ID_MSVIDEO1(46L),
        AV_CODEC_ID_IDCIN(47L),
        AV_CODEC_ID_8BPS(48L),
        AV_CODEC_ID_SMC(49L),
        AV_CODEC_ID_FLIC(50L),
        AV_CODEC_ID_TRUEMOTION1(51L),
        AV_CODEC_ID_VMDVIDEO(52L),
        AV_CODEC_ID_MSZH(53L),
        AV_CODEC_ID_ZLIB(54L),
        AV_CODEC_ID_QTRLE(55L),
        AV_CODEC_ID_TSCC(56L),
        AV_CODEC_ID_ULTI(57L),
        AV_CODEC_ID_QDRAW(58L),
        AV_CODEC_ID_VIXL(59L),
        AV_CODEC_ID_QPEG(60L),
        AV_CODEC_ID_PNG(61L),
        AV_CODEC_ID_PPM(62L),
        AV_CODEC_ID_PBM(63L),
        AV_CODEC_ID_PGM(64L),
        AV_CODEC_ID_PGMYUV(65L),
        AV_CODEC_ID_PAM(66L),
        AV_CODEC_ID_FFVHUFF(67L),
        AV_CODEC_ID_RV30(68L),
        AV_CODEC_ID_RV40(69L),
        AV_CODEC_ID_VC1(70L),
        AV_CODEC_ID_WMV3(71L),
        AV_CODEC_ID_LOCO(72L),
        AV_CODEC_ID_WNV1(73L),
        AV_CODEC_ID_AASC(74L),
        AV_CODEC_ID_INDEO2(75L),
        AV_CODEC_ID_FRAPS(76L),
        AV_CODEC_ID_TRUEMOTION2(77L),
        AV_CODEC_ID_BMP(78L),
        AV_CODEC_ID_CSCD(79L),
        AV_CODEC_ID_MMVIDEO(80L),
        AV_CODEC_ID_ZMBV(81L),
        AV_CODEC_ID_AVS(82L),
        AV_CODEC_ID_SMACKVIDEO(83L),
        AV_CODEC_ID_NUV(84L),
        AV_CODEC_ID_KMVC(85L),
        AV_CODEC_ID_FLASHSV(86L),
        AV_CODEC_ID_CAVS(87L),
        AV_CODEC_ID_JPEG2000(88L),
        AV_CODEC_ID_VMNC(89L),
        AV_CODEC_ID_VP5(90L),
        AV_CODEC_ID_VP6(91L),
        AV_CODEC_ID_VP6F(92L),
        AV_CODEC_ID_TARGA(93L),
        AV_CODEC_ID_DSICINVIDEO(94L),
        AV_CODEC_ID_TIERTEXSEQVIDEO(95L),
        AV_CODEC_ID_TIFF(96L),
        AV_CODEC_ID_GIF(97L),
        AV_CODEC_ID_DXA(98L),
        AV_CODEC_ID_DNXHD(99L),
        AV_CODEC_ID_THP(100L),
        AV_CODEC_ID_SGI(101L),
        AV_CODEC_ID_C93(102L),
        AV_CODEC_ID_BETHSOFTVID(103L),
        AV_CODEC_ID_PTX(104L),
        AV_CODEC_ID_TXD(105L),
        AV_CODEC_ID_VP6A(106L),
        AV_CODEC_ID_AMV(107L),
        AV_CODEC_ID_VB(108L),
        AV_CODEC_ID_PCX(109L),
        AV_CODEC_ID_SUNRAST(110L),
        AV_CODEC_ID_INDEO4(111L),
        AV_CODEC_ID_INDEO5(112L),
        AV_CODEC_ID_MIMIC(113L),
        AV_CODEC_ID_RL2(114L),
        AV_CODEC_ID_ESCAPE124(115L),
        AV_CODEC_ID_DIRAC(116L),
        AV_CODEC_ID_BFI(117L),
        AV_CODEC_ID_CMV(118L),
        AV_CODEC_ID_MOTIONPIXELS(119L),
        AV_CODEC_ID_TGV(120L),
        AV_CODEC_ID_TGQ(121L),
        AV_CODEC_ID_TQI(122L),
        AV_CODEC_ID_AURA(123L),
        AV_CODEC_ID_AURA2(124L),
        AV_CODEC_ID_V210X(125L),
        AV_CODEC_ID_TMV(126L),
        AV_CODEC_ID_V210(127L),
        AV_CODEC_ID_DPX(128L),
        AV_CODEC_ID_MAD(129L),
        AV_CODEC_ID_FRWU(130L),
        AV_CODEC_ID_FLASHSV2(131L),
        AV_CODEC_ID_CDGRAPHICS(132L),
        AV_CODEC_ID_R210(133L),
        AV_CODEC_ID_ANM(134L),
        AV_CODEC_ID_BINKVIDEO(135L),
        AV_CODEC_ID_IFF_ILBM(136L),
        AV_CODEC_ID_KGV1(137L),
        AV_CODEC_ID_YOP(138L),
        AV_CODEC_ID_VP8(139L),
        AV_CODEC_ID_PICTOR(140L),
        AV_CODEC_ID_ANSI(141L),
        AV_CODEC_ID_A64_MULTI(142L),
        AV_CODEC_ID_A64_MULTI5(143L),
        AV_CODEC_ID_R10K(144L),
        AV_CODEC_ID_MXPEG(145L),
        AV_CODEC_ID_LAGARITH(146L),
        AV_CODEC_ID_PRORES(147L),
        AV_CODEC_ID_JV(148L),
        AV_CODEC_ID_DFA(149L),
        AV_CODEC_ID_WMV3IMAGE(150L),
        AV_CODEC_ID_VC1IMAGE(151L),
        AV_CODEC_ID_UTVIDEO(152L),
        AV_CODEC_ID_BMV_VIDEO(153L),
        AV_CODEC_ID_VBLE(154L),
        AV_CODEC_ID_DXTORY(155L),
        AV_CODEC_ID_V410(156L),
        AV_CODEC_ID_XWD(157L),
        AV_CODEC_ID_CDXL(158L),
        AV_CODEC_ID_XBM(159L),
        AV_CODEC_ID_ZEROCODEC(160L),
        AV_CODEC_ID_MSS1(161L),
        AV_CODEC_ID_MSA1(162L),
        AV_CODEC_ID_TSCC2(163L),
        AV_CODEC_ID_MTS2(164L),
        AV_CODEC_ID_CLLC(165L),
        AV_CODEC_ID_MSS2(166L),
        AV_CODEC_ID_VP9(167L),
        AV_CODEC_ID_AIC(168L),
        AV_CODEC_ID_ESCAPE130(169L),
        AV_CODEC_ID_G2M(170L),
        AV_CODEC_ID_WEBP(171L),
        AV_CODEC_ID_HNM4_VIDEO(172L),
        AV_CODEC_ID_HEVC(173L),
        AV_CODEC_ID_FIC(174L),
        AV_CODEC_ID_ALIAS_PIX(175L),
        AV_CODEC_ID_BRENDER_PIX(176L),
        AV_CODEC_ID_PAF_VIDEO(177L),
        AV_CODEC_ID_EXR(178L),
        AV_CODEC_ID_VP7(179L),
        AV_CODEC_ID_SANM(180L),
        AV_CODEC_ID_SGIRLE(181L),
        AV_CODEC_ID_MVC1(182L),
        AV_CODEC_ID_MVC2(183L),
        AV_CODEC_ID_HQX(184L),
        AV_CODEC_ID_TDSC(185L),
        AV_CODEC_ID_HQ_HQA(186L),
        AV_CODEC_ID_HAP(187L),
        AV_CODEC_ID_DDS(188L),
        AV_CODEC_ID_DXV(189L),
        AV_CODEC_ID_SCREENPRESSO(190L),
        AV_CODEC_ID_RSCC(191L),
        AV_CODEC_ID_Y41P(32768L),
        AV_CODEC_ID_AVRP(32769L),
        AV_CODEC_ID_012V(32770L),
        AV_CODEC_ID_AVUI(32771L),
        AV_CODEC_ID_AYUV(32772L),
        AV_CODEC_ID_TARGA_Y216(32773L),
        AV_CODEC_ID_V308(32774L),
        AV_CODEC_ID_V408(32775L),
        AV_CODEC_ID_YUV4(32776L),
        AV_CODEC_ID_AVRN(32777L),
        AV_CODEC_ID_CPIA(32778L),
        AV_CODEC_ID_XFACE(32779L),
        AV_CODEC_ID_SNOW(32780L),
        AV_CODEC_ID_SMVJPEG(32781L),
        AV_CODEC_ID_APNG(32782L),
        AV_CODEC_ID_DAALA(32783L),
        AV_CODEC_ID_CFHD(32784L),
        AV_CODEC_ID_TRUEMOTION2RT(32785L),
        AV_CODEC_ID_M101(32786L),
        AV_CODEC_ID_MAGICYUV(32787L),
        AV_CODEC_ID_SHEERVIDEO(32788L),
        AV_CODEC_ID_YLC(32789L),
        AV_CODEC_ID_PSD(32790L),
        AV_CODEC_ID_PIXLET(32791L),
        AV_CODEC_ID_SPEEDHQ(32792L),
        AV_CODEC_ID_FMVC(32793L),
        AV_CODEC_ID_SCPR(32794L),
        AV_CODEC_ID_CLEARVIDEO(32795L),
        AV_CODEC_ID_XPM(32796L),
        AV_CODEC_ID_AV1(32797L),
        AV_CODEC_ID_BITPACKED(32798L),
        AV_CODEC_ID_MSCC(32799L),
        AV_CODEC_ID_SRGC(32800L),
        AV_CODEC_ID_SVG(32801L),
        AV_CODEC_ID_GDV(32802L),
        AV_CODEC_ID_FITS(32803L),
        AV_CODEC_ID_FIRST_AUDIO(65536L),
        AV_CODEC_ID_PCM_S16LE(65536L),
        AV_CODEC_ID_PCM_S16BE(65537L),
        AV_CODEC_ID_PCM_U16LE(65538L),
        AV_CODEC_ID_PCM_U16BE(65539L),
        AV_CODEC_ID_PCM_S8(65540L),
        AV_CODEC_ID_PCM_U8(65541L),
        AV_CODEC_ID_PCM_MULAW(65542L),
        AV_CODEC_ID_PCM_ALAW(65543L),
        AV_CODEC_ID_PCM_S32LE(65544L),
        AV_CODEC_ID_PCM_S32BE(65545L),
        AV_CODEC_ID_PCM_U32LE(65546L),
        AV_CODEC_ID_PCM_U32BE(65547L),
        AV_CODEC_ID_PCM_S24LE(65548L),
        AV_CODEC_ID_PCM_S24BE(65549L),
        AV_CODEC_ID_PCM_U24LE(65550L),
        AV_CODEC_ID_PCM_U24BE(65551L),
        AV_CODEC_ID_PCM_S24DAUD(65552L),
        AV_CODEC_ID_PCM_ZORK(65553L),
        AV_CODEC_ID_PCM_S16LE_PLANAR(65554L),
        AV_CODEC_ID_PCM_DVD(65555L),
        AV_CODEC_ID_PCM_F32BE(65556L),
        AV_CODEC_ID_PCM_F32LE(65557L),
        AV_CODEC_ID_PCM_F64BE(65558L),
        AV_CODEC_ID_PCM_F64LE(65559L),
        AV_CODEC_ID_PCM_BLURAY(65560L),
        AV_CODEC_ID_PCM_LXF(65561L),
        AV_CODEC_ID_S302M(65562L),
        AV_CODEC_ID_PCM_S8_PLANAR(65563L),
        AV_CODEC_ID_PCM_S24LE_PLANAR(65564L),
        AV_CODEC_ID_PCM_S32LE_PLANAR(65565L),
        AV_CODEC_ID_PCM_S16BE_PLANAR(65566L),
        AV_CODEC_ID_PCM_S64LE(67584L),
        AV_CODEC_ID_PCM_S64BE(67585L),
        AV_CODEC_ID_PCM_F16LE(67586L),
        AV_CODEC_ID_PCM_F24LE(67587L),
        AV_CODEC_ID_ADPCM_IMA_QT(69632L),
        AV_CODEC_ID_ADPCM_IMA_WAV(69633L),
        AV_CODEC_ID_ADPCM_IMA_DK3(69634L),
        AV_CODEC_ID_ADPCM_IMA_DK4(69635L),
        AV_CODEC_ID_ADPCM_IMA_WS(69636L),
        AV_CODEC_ID_ADPCM_IMA_SMJPEG(69637L),
        AV_CODEC_ID_ADPCM_MS(69638L),
        AV_CODEC_ID_ADPCM_4XM(69639L),
        AV_CODEC_ID_ADPCM_XA(69640L),
        AV_CODEC_ID_ADPCM_ADX(69641L),
        AV_CODEC_ID_ADPCM_EA(69642L),
        AV_CODEC_ID_ADPCM_G726(69643L),
        AV_CODEC_ID_ADPCM_CT(69644L),
        AV_CODEC_ID_ADPCM_SWF(69645L),
        AV_CODEC_ID_ADPCM_YAMAHA(69646L),
        AV_CODEC_ID_ADPCM_SBPRO_4(69647L),
        AV_CODEC_ID_ADPCM_SBPRO_3(69648L),
        AV_CODEC_ID_ADPCM_SBPRO_2(69649L),
        AV_CODEC_ID_ADPCM_THP(69650L),
        AV_CODEC_ID_ADPCM_IMA_AMV(69651L),
        AV_CODEC_ID_ADPCM_EA_R1(69652L),
        AV_CODEC_ID_ADPCM_EA_R3(69653L),
        AV_CODEC_ID_ADPCM_EA_R2(69654L),
        AV_CODEC_ID_ADPCM_IMA_EA_SEAD(69655L),
        AV_CODEC_ID_ADPCM_IMA_EA_EACS(69656L),
        AV_CODEC_ID_ADPCM_EA_XAS(69657L),
        AV_CODEC_ID_ADPCM_EA_MAXIS_XA(69658L),
        AV_CODEC_ID_ADPCM_IMA_ISS(69659L),
        AV_CODEC_ID_ADPCM_G722(69660L),
        AV_CODEC_ID_ADPCM_IMA_APC(69661L),
        AV_CODEC_ID_ADPCM_VIMA(69662L),
        AV_CODEC_ID_ADPCM_AFC(71680L),
        AV_CODEC_ID_ADPCM_IMA_OKI(71681L),
        AV_CODEC_ID_ADPCM_DTK(71682L),
        AV_CODEC_ID_ADPCM_IMA_RAD(71683L),
        AV_CODEC_ID_ADPCM_G726LE(71684L),
        AV_CODEC_ID_ADPCM_THP_LE(71685L),
        AV_CODEC_ID_ADPCM_PSX(71686L),
        AV_CODEC_ID_ADPCM_AICA(71687L),
        AV_CODEC_ID_ADPCM_IMA_DAT4(71688L),
        AV_CODEC_ID_ADPCM_MTAF(71689L),
        AV_CODEC_ID_AMR_NB(73728L),
        AV_CODEC_ID_AMR_WB(73729L),
        AV_CODEC_ID_RA_144(77824L),
        AV_CODEC_ID_RA_288(77825L),
        AV_CODEC_ID_ROQ_DPCM(81920L),
        AV_CODEC_ID_INTERPLAY_DPCM(81921L),
        AV_CODEC_ID_XAN_DPCM(81922L),
        AV_CODEC_ID_SOL_DPCM(81923L),
        AV_CODEC_ID_SDX2_DPCM(83968L),
        AV_CODEC_ID_GREMLIN_DPCM(83969L),
        AV_CODEC_ID_MP2(86016L),
        AV_CODEC_ID_MP3(86017L),
        AV_CODEC_ID_AAC(86018L),
        AV_CODEC_ID_AC3(86019L),
        AV_CODEC_ID_DTS(86020L),
        AV_CODEC_ID_VORBIS(86021L),
        AV_CODEC_ID_DVAUDIO(86022L),
        AV_CODEC_ID_WMAV1(86023L),
        AV_CODEC_ID_WMAV2(86024L),
        AV_CODEC_ID_MACE3(86025L),
        AV_CODEC_ID_MACE6(86026L),
        AV_CODEC_ID_VMDAUDIO(86027L),
        AV_CODEC_ID_FLAC(86028L),
        AV_CODEC_ID_MP3ADU(86029L),
        AV_CODEC_ID_MP3ON4(86030L),
        AV_CODEC_ID_SHORTEN(86031L),
        AV_CODEC_ID_ALAC(86032L),
        AV_CODEC_ID_WESTWOOD_SND1(86033L),
        AV_CODEC_ID_GSM(86034L),
        AV_CODEC_ID_QDM2(86035L),
        AV_CODEC_ID_COOK(86036L),
        AV_CODEC_ID_TRUESPEECH(86037L),
        AV_CODEC_ID_TTA(86038L),
        AV_CODEC_ID_SMACKAUDIO(86039L),
        AV_CODEC_ID_QCELP(86040L),
        AV_CODEC_ID_WAVPACK(86041L),
        AV_CODEC_ID_DSICINAUDIO(86042L),
        AV_CODEC_ID_IMC(86043L),
        AV_CODEC_ID_MUSEPACK7(86044L),
        AV_CODEC_ID_MLP(86045L),
        AV_CODEC_ID_GSM_MS(86046L),
        AV_CODEC_ID_ATRAC3(86047L),
        AV_CODEC_ID_APE(86048L),
        AV_CODEC_ID_NELLYMOSER(86049L),
        AV_CODEC_ID_MUSEPACK8(86050L),
        AV_CODEC_ID_SPEEX(86051L),
        AV_CODEC_ID_WMAVOICE(86052L),
        AV_CODEC_ID_WMAPRO(86053L),
        AV_CODEC_ID_WMALOSSLESS(86054L),
        AV_CODEC_ID_ATRAC3P(86055L),
        AV_CODEC_ID_EAC3(86056L),
        AV_CODEC_ID_SIPR(86057L),
        AV_CODEC_ID_MP1(86058L),
        AV_CODEC_ID_TWINVQ(86059L),
        AV_CODEC_ID_TRUEHD(86060L),
        AV_CODEC_ID_MP4ALS(86061L),
        AV_CODEC_ID_ATRAC1(86062L),
        AV_CODEC_ID_BINKAUDIO_RDFT(86063L),
        AV_CODEC_ID_BINKAUDIO_DCT(86064L),
        AV_CODEC_ID_AAC_LATM(86065L),
        AV_CODEC_ID_QDMC(86066L),
        AV_CODEC_ID_CELT(86067L),
        AV_CODEC_ID_G723_1(86068L),
        AV_CODEC_ID_G729(86069L),
        AV_CODEC_ID_8SVX_EXP(86070L),
        AV_CODEC_ID_8SVX_FIB(86071L),
        AV_CODEC_ID_BMV_AUDIO(86072L),
        AV_CODEC_ID_RALF(86073L),
        AV_CODEC_ID_IAC(86074L),
        AV_CODEC_ID_ILBC(86075L),
        AV_CODEC_ID_OPUS(86076L),
        AV_CODEC_ID_COMFORT_NOISE(86077L),
        AV_CODEC_ID_TAK(86078L),
        AV_CODEC_ID_METASOUND(86079L),
        AV_CODEC_ID_PAF_AUDIO(86080L),
        AV_CODEC_ID_ON2AVC(86081L),
        AV_CODEC_ID_DSS_SP(86082L),
        AV_CODEC_ID_CODEC2(86083L),
        AV_CODEC_ID_FFWAVESYNTH(88064L),
        AV_CODEC_ID_SONIC(88065L),
        AV_CODEC_ID_SONIC_LS(88066L),
        AV_CODEC_ID_EVRC(88067L),
        AV_CODEC_ID_SMV(88068L),
        AV_CODEC_ID_DSD_LSBF(88069L),
        AV_CODEC_ID_DSD_MSBF(88070L),
        AV_CODEC_ID_DSD_LSBF_PLANAR(88071L),
        AV_CODEC_ID_DSD_MSBF_PLANAR(88072L),
        AV_CODEC_ID_4GV(88073L),
        AV_CODEC_ID_INTERPLAY_ACM(88074L),
        AV_CODEC_ID_XMA1(88075L),
        AV_CODEC_ID_XMA2(88076L),
        AV_CODEC_ID_DST(88077L),
        AV_CODEC_ID_ATRAC3AL(88078L),
        AV_CODEC_ID_ATRAC3PAL(88079L),
        AV_CODEC_ID_DOLBY_E(88080L),
        AV_CODEC_ID_APTX(88081L),
        AV_CODEC_ID_APTX_HD(88082L),
        AV_CODEC_ID_SBC(88083L),
        AV_CODEC_ID_FIRST_SUBTITLE(94208L),
        AV_CODEC_ID_DVD_SUBTITLE(94208L),
        AV_CODEC_ID_DVB_SUBTITLE(94209L),
        AV_CODEC_ID_TEXT(94210L),
        AV_CODEC_ID_XSUB(94211L),
        AV_CODEC_ID_SSA(94212L),
        AV_CODEC_ID_MOV_TEXT(94213L),
        AV_CODEC_ID_HDMV_PGS_SUBTITLE(94214L),
        AV_CODEC_ID_DVB_TELETEXT(94215L),
        AV_CODEC_ID_SRT(94216L),
        AV_CODEC_ID_MICRODVD(96256L),
        AV_CODEC_ID_EIA_608(96257L),
        AV_CODEC_ID_JACOSUB(96258L),
        AV_CODEC_ID_SAMI(96259L),
        AV_CODEC_ID_REALTEXT(96260L),
        AV_CODEC_ID_STL(96261L),
        AV_CODEC_ID_SUBVIEWER1(96262L),
        AV_CODEC_ID_SUBVIEWER(96263L),
        AV_CODEC_ID_SUBRIP(96264L),
        AV_CODEC_ID_WEBVTT(96265L),
        AV_CODEC_ID_MPL2(96266L),
        AV_CODEC_ID_VPLAYER(96267L),
        AV_CODEC_ID_PJS(96268L),
        AV_CODEC_ID_ASS(96269L),
        AV_CODEC_ID_HDMV_TEXT_SUBTITLE(96270L),
        AV_CODEC_ID_FIRST_UNKNOWN(98304L),
        AV_CODEC_ID_TTF(98304L),
        AV_CODEC_ID_SCTE_35(98305L),
        AV_CODEC_ID_BINTEXT(100352L),
        AV_CODEC_ID_XBIN(100353L),
        AV_CODEC_ID_IDF(100354L),
        AV_CODEC_ID_OTF(100355L),
        AV_CODEC_ID_SMPTE_KLV(100356L),
        AV_CODEC_ID_DVD_NAV(100357L),
        AV_CODEC_ID_TIMED_ID3(100358L),
        AV_CODEC_ID_BIN_DATA(100359L),
        AV_CODEC_ID_PROBE(102400L),
        AV_CODEC_ID_MPEG2TS(131072L),
        AV_CODEC_ID_MPEG4SYSTEMS(131073L),
        AV_CODEC_ID_FFMETADATA(135168L),
        AV_CODEC_ID_WRAPPED_AVFRAME(135169L);

        public final long value;

        private AVCodecID(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVCodecID> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVCodecID> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVDiscard implements IntValuedEnum<AvcodecLibrary.AVDiscard> {
        AVDISCARD_NONE(-16L),
        AVDISCARD_DEFAULT(0L),
        AVDISCARD_NONREF(8L),
        AVDISCARD_BIDIR(16L),
        AVDISCARD_NONINTRA(24L),
        AVDISCARD_NONKEY(32L),
        AVDISCARD_ALL(48L);

        public final long value;

        private AVDiscard(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVDiscard> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVDiscard> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVFieldOrder implements IntValuedEnum<AvcodecLibrary.AVFieldOrder> {
        AV_FIELD_UNKNOWN(0L),
        AV_FIELD_PROGRESSIVE(1L),
        AV_FIELD_TT(2L),
        AV_FIELD_BB(3L),
        AV_FIELD_TB(4L),
        AV_FIELD_BT(5L);

        public final long value;

        private AVFieldOrder(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVFieldOrder> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVFieldOrder> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    /** @deprecated */
    public static enum AVLockOp implements IntValuedEnum<AvcodecLibrary.AVLockOp> {
        AV_LOCK_CREATE(0L),
        AV_LOCK_OBTAIN(1L),
        AV_LOCK_RELEASE(2L),
        AV_LOCK_DESTROY(3L);

        public final long value;

        private AVLockOp(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVLockOp> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVLockOp> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVPacketSideDataType implements IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> {
        AV_PKT_DATA_PALETTE(0L),
        AV_PKT_DATA_NEW_EXTRADATA(1L),
        AV_PKT_DATA_PARAM_CHANGE(2L),
        AV_PKT_DATA_H263_MB_INFO(3L),
        AV_PKT_DATA_REPLAYGAIN(4L),
        AV_PKT_DATA_DISPLAYMATRIX(5L),
        AV_PKT_DATA_STEREO3D(6L),
        AV_PKT_DATA_AUDIO_SERVICE_TYPE(7L),
        AV_PKT_DATA_QUALITY_STATS(8L),
        AV_PKT_DATA_FALLBACK_TRACK(9L),
        AV_PKT_DATA_CPB_PROPERTIES(10L),
        AV_PKT_DATA_SKIP_SAMPLES(11L),
        AV_PKT_DATA_JP_DUALMONO(12L),
        AV_PKT_DATA_STRINGS_METADATA(13L),
        AV_PKT_DATA_SUBTITLE_POSITION(14L),
        AV_PKT_DATA_MATROSKA_BLOCKADDITIONAL(15L),
        AV_PKT_DATA_WEBVTT_IDENTIFIER(16L),
        AV_PKT_DATA_WEBVTT_SETTINGS(17L),
        AV_PKT_DATA_METADATA_UPDATE(18L),
        AV_PKT_DATA_MPEGTS_STREAM_ID(19L),
        AV_PKT_DATA_MASTERING_DISPLAY_METADATA(20L),
        AV_PKT_DATA_SPHERICAL(21L),
        AV_PKT_DATA_CONTENT_LIGHT_LEVEL(22L),
        AV_PKT_DATA_A53_CC(23L),
        AV_PKT_DATA_ENCRYPTION_INIT_INFO(24L),
        AV_PKT_DATA_ENCRYPTION_INFO(25L),
        AV_PKT_DATA_NB(26L);

        public final long value;

        private AVPacketSideDataType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVPacketSideDataType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVPacketSideDataType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVPictureStructure implements IntValuedEnum<AvcodecLibrary.AVPictureStructure> {
        AV_PICTURE_STRUCTURE_UNKNOWN(0L),
        AV_PICTURE_STRUCTURE_TOP_FIELD(1L),
        AV_PICTURE_STRUCTURE_BOTTOM_FIELD(2L),
        AV_PICTURE_STRUCTURE_FRAME(3L);

        public final long value;

        private AVPictureStructure(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVPictureStructure> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVPictureStructure> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVSideDataParamChangeFlags implements IntValuedEnum<AvcodecLibrary.AVSideDataParamChangeFlags> {
        AV_SIDE_DATA_PARAM_CHANGE_CHANNEL_COUNT(1L),
        AV_SIDE_DATA_PARAM_CHANGE_CHANNEL_LAYOUT(2L),
        AV_SIDE_DATA_PARAM_CHANGE_SAMPLE_RATE(4L),
        AV_SIDE_DATA_PARAM_CHANGE_DIMENSIONS(8L);

        public final long value;

        private AVSideDataParamChangeFlags(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVSideDataParamChangeFlags> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVSideDataParamChangeFlags> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVSubtitleType implements IntValuedEnum<AvcodecLibrary.AVSubtitleType> {
        SUBTITLE_NONE(0L),
        SUBTITLE_BITMAP(1L),
        SUBTITLE_TEXT(2L),
        SUBTITLE_ASS(3L);

        public final long value;

        private AVSubtitleType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvcodecLibrary.AVSubtitleType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvcodecLibrary.AVSubtitleType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public interface MpegEncContext {
    }

    public abstract static class avcodec_default_execute2_func_callback extends Callback<AvcodecLibrary.avcodec_default_execute2_func_callback> {
        public avcodec_default_execute2_func_callback() {
        }

        public int apply(Pointer<AVCodecContext> c2, Pointer<?> arg2, int int1, int int2) {
            return this.apply(Pointer.getPeer(c2), Pointer.getPeer(arg2), int1, int2);
        }

        public int apply(@Ptr long c2, @Ptr long arg2, int int1, int int2) {
            return this.apply(Pointer.pointerToAddress(c2, AVCodecContext.class), Pointer.pointerToAddress(arg2), int1, int2);
        }
    }

    public abstract static class avcodec_default_execute_func_callback extends Callback<AvcodecLibrary.avcodec_default_execute_func_callback> {
        public avcodec_default_execute_func_callback() {
        }

        public int apply(Pointer<AVCodecContext> c2, Pointer<?> arg2) {
            return this.apply(Pointer.getPeer(c2), Pointer.getPeer(arg2));
        }

        public int apply(@Ptr long c2, @Ptr long arg2) {
            return this.apply(Pointer.pointerToAddress(c2, AVCodecContext.class), Pointer.pointerToAddress(arg2));
        }
    }
}
