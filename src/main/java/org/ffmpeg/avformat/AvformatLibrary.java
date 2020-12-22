//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avcodec.AVBitStreamFilterContext;
import org.ffmpeg.avcodec.AVCodec;
import org.ffmpeg.avcodec.AVCodecContext;
import org.ffmpeg.avcodec.AVCodecParserContext;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avcodec.AvcodecLibrary.AVPacketSideDataType;
import org.ffmpeg.avutil.AVBPrint;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;

@Library("avformat")
@Runtime(CRuntime.class)
public class AvformatLibrary {
    public static final int AVIO_FLAG_READ = 1;
    public static final int AVFMT_ALLOW_FLUSH = 65536;
    public static final int AVFMT_NOTIMESTAMPS = 128;
    public static final boolean FF_API_OLD_RTSP_OPTIONS = true;
    public static final int AVSTREAM_INIT_IN_INIT_OUTPUT = 1;
    public static final int AVSEEK_SIZE = 65536;
    public static final int AVPROBE_SCORE_MAX = 100;
    public static final int AVFMT_FLAG_FLUSH_PACKETS = 512;
    public static final int FF_API_R_FRAME_RATE = 1;
    public static final int AV_DISPOSITION_KARAOKE = 32;
    public static final int AVFMT_NOBINSEARCH = 8192;
    public static final int AVFMT_FLAG_NOBUFFER = 64;
    public static final int AVFMT_FLAG_NONBLOCK = 4;
    public static final int AVSEEK_FLAG_BYTE = 2;
    public static final int AVPROBE_SCORE_RETRY = 25;
    public static final int AVFMT_FLAG_BITEXACT = 1024;
    public static final int AVFMT_NOGENSEARCH = 16384;
    public static final int AVFMT_AVOID_NEG_TS_MAKE_NON_NEGATIVE = 1;
    public static final int AVINDEX_DISCARD_FRAME = 2;
    public static final int AVFMT_TS_DISCONT = 512;
    public static final int AV_DISPOSITION_DUB = 2;
    public static final int AVIO_FLAG_NONBLOCK = 8;
    public static final int AVFMT_FLAG_IGNDTS = 8;
    public static final int AV_DISPOSITION_ATTACHED_PIC = 1024;
    public static final int AV_DISPOSITION_ORIGINAL = 4;
    public static final int AVSEEK_FORCE = 131072;
    public static final int AVPROBE_SCORE_STREAM_RETRY = 24;
    public static final int AVFMT_GLOBALHEADER = 64;
    public static final int AVSEEK_FLAG_FRAME = 8;
    public static final int AV_PTS_WRAP_SUB_OFFSET = -1;
    public static final int MAX_STD_TIMEBASES = 399;
    public static final int LIBAVFORMAT_VERSION_MAJOR = 58;
    public static final int AVFMT_FLAG_DISCARD_CORRUPT = 256;
    public static final int AVFMT_EVENT_FLAG_METADATA_UPDATED = 1;
    public static final int AVFMT_NOSTREAMS = 4096;
    public static final int AVFMT_FLAG_GENPTS = 1;
    public static final int AVFMT_NEEDNUMBER = 2;
    public static final int LIBAVFORMAT_BUILD = 3804260;
    public static final String LIBAVFORMAT_IDENT = "Lavf58.12.100";
    public static final int AVIO_SEEKABLE_TIME = 2;
    public static final boolean FF_API_FORMAT_FILENAME = true;
    public static final int AVFMT_AVOID_NEG_TS_AUTO = -1;
    public static final int AVFMT_SHOW_IDS = 8;
    public static final int AVSEEK_FLAG_ANY = 4;
    public static final boolean FF_API_FORMAT_GET_SET = true;
    public static final int AV_DISPOSITION_CLEAN_EFFECTS = 512;
    public static final int AVFMTCTX_NOHEADER = 1;
    public static final int AV_PTS_WRAP_IGNORE = 0;
    public static final int AVFMT_NO_BYTE_SEEK = 32768;
    public static final int LIBAVFORMAT_VERSION_MINOR = 12;
    public static final int MAX_REORDER_DELAY = 16;
    public static final boolean FF_API_LAVF_KEEPSIDE_FLAG = true;
    public static final int AV_PROGRAM_RUNNING = 1;
    public static final boolean FF_API_HLS_WRAP = true;
    public static final boolean FF_API_OLD_AVIO_EOF_0 = true;
    public static final int AVFMT_FLAG_CUSTOM_IO = 128;
    public static final int AVFMT_TS_NEGATIVE = 262144;
    public static final int AVIO_FLAG_DIRECT = 32768;
    public static final int LIBAVFORMAT_VERSION_INT = 3804260;
    public static final int AVSTREAM_INIT_IN_WRITE_HEADER = 0;
    public static final int AVSEEK_FLAG_BACKWARD = 1;
    public static final boolean FF_API_COMPUTE_PKT_FIELDS2 = true;
    public static final int AV_DISPOSITION_TIMED_THUMBNAILS = 2048;
    public static final int AV_PTS_WRAP_ADD_OFFSET = 1;
    public static final int AVFMT_AVOID_NEG_TS_MAKE_ZERO = 2;
    public static final int AVFMTCTX_UNSEEKABLE = 2;
    public static final int AV_DISPOSITION_COMMENT = 8;
    public static final int AV_FRAME_FILENAME_FLAGS_MULTIPLE = 1;
    public static final int AVPROBE_SCORE_MIME = 75;
    public static final int AVPROBE_SCORE_EXTENSION = 50;
    public static final int AVFMT_FLAG_FAST_SEEK = 524288;
    public static final int AVFMT_TS_NONSTRICT = 131072;
    public static final int AVFMT_FLAG_PRIV_OPT = 131072;
    public static final int AVFMT_FLAG_SHORTEST = 1048576;
    public static final int AVFMT_GENERIC_INDEX = 256;
    public static final int AVINDEX_KEYFRAME = 1;
    public static final int AVFMT_FLAG_KEEP_SIDE_DATA = 262144;
    public static final int AVPROBE_PADDING_SIZE = 32;
    public static final int AVFMT_FLAG_IGNIDX = 2;
    public static final int AVFMT_FLAG_NOPARSE = 32;
    public static final int AVFMT_FLAG_MP4A_LATM = 32768;
    public static final int AVSTREAM_EVENT_FLAG_METADATA_UPDATED = 1;
    public static final int AV_DISPOSITION_LYRICS = 16;
    public static final boolean FF_API_OLD_OPEN_CALLBACKS = true;
    public static final int AV_DISPOSITION_DEFAULT = 1;
    public static final int AVIO_FLAG_READ_WRITE = 3;
    public static final int AV_DISPOSITION_VISUAL_IMPAIRED = 256;
    public static final boolean FF_API_HTTP_USER_AGENT = true;
    public static final int AVFMT_FLAG_AUTO_BSF = 2097152;
    public static final int AVFMT_FLAG_NOFILLIN = 16;
    public static final int LIBAVFORMAT_VERSION_MICRO = 100;
    public static final int AV_DISPOSITION_HEARING_IMPAIRED = 128;
    public static final int AVIO_SEEKABLE_NORMAL = 1;
    public static final int AVFMT_NOFILE = 1;
    public static final int AV_DISPOSITION_METADATA = 262144;
    public static final int AV_DISPOSITION_DEPENDENT = 524288;
    public static final int AV_DISPOSITION_FORCED = 64;
    public static final int AV_DISPOSITION_CAPTIONS = 65536;
    public static final int AVFMT_VARIABLE_FPS = 1024;
    public static final boolean FF_API_LAVF_FFSERVER = true;
    public static final boolean FF_API_OLD_ROTATE_API = true;
    public static final int AVFMT_FLAG_SORT_DTS = 65536;
    public static final int AVFMT_SEEK_TO_PTS = 67108864;
    public static final int AVIO_FLAG_WRITE = 2;
    public static final int AVFMT_NODIMENSIONS = 2048;
    public static final int AV_DISPOSITION_DESCRIPTIONS = 131072;
    public static final boolean FF_API_LAVF_AVCTX = true;
    public static final int FF_FDEBUG_TS = 1;

    static {
        BridJ.register();
    }

    public AvformatLibrary() {
    }

    public static Pointer<Byte> avio_find_protocol_name(Pointer<Byte> url) {
        return Pointer.pointerToAddress(avio_find_protocol_name(Pointer.getPeer(url)), Byte.class);
    }

    @Ptr
    protected static native long avio_find_protocol_name(@Ptr long var0);

    public static int avio_check(Pointer<Byte> url, int flags) {
        return avio_check(Pointer.getPeer(url), flags);
    }

    protected static native int avio_check(@Ptr long var0, int var2);

    public static int avpriv_io_move(Pointer<Byte> url_src, Pointer<Byte> url_dst) {
        return avpriv_io_move(Pointer.getPeer(url_src), Pointer.getPeer(url_dst));
    }

    protected static native int avpriv_io_move(@Ptr long var0, @Ptr long var2);

    public static int avpriv_io_delete(Pointer<Byte> url) {
        return avpriv_io_delete(Pointer.getPeer(url));
    }

    protected static native int avpriv_io_delete(@Ptr long var0);

    public static int avio_open_dir(Pointer<Pointer<AVIODirContext>> s, Pointer<Byte> url, Pointer<Pointer<AVDictionary>> options) {
        return avio_open_dir(Pointer.getPeer(s), Pointer.getPeer(url), Pointer.getPeer(options));
    }

    protected static native int avio_open_dir(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avio_read_dir(Pointer<AVIODirContext> s, Pointer<Pointer<AVIODirEntry>> next) {
        return avio_read_dir(Pointer.getPeer(s), Pointer.getPeer(next));
    }

    protected static native int avio_read_dir(@Ptr long var0, @Ptr long var2);

    public static int avio_close_dir(Pointer<Pointer<AVIODirContext>> s) {
        return avio_close_dir(Pointer.getPeer(s));
    }

    protected static native int avio_close_dir(@Ptr long var0);

    public static void avio_free_directory_entry(Pointer<Pointer<AVIODirEntry>> entry) {
        avio_free_directory_entry(Pointer.getPeer(entry));
    }

    protected static native void avio_free_directory_entry(@Ptr long var0);

    public static Pointer<AVIOContext> avio_alloc_context(Pointer<Byte> buffer, int buffer_size, int write_flag, Pointer<?> opaque, Pointer<AvformatLibrary.avio_alloc_context_read_packet_callback> read_packet, Pointer<AvformatLibrary.avio_alloc_context_write_packet_callback> write_packet, Pointer<AvformatLibrary.avio_alloc_context_seek_callback> seek) {
        return Pointer.pointerToAddress(avio_alloc_context(Pointer.getPeer(buffer), buffer_size, write_flag, Pointer.getPeer(opaque), Pointer.getPeer(read_packet), Pointer.getPeer(write_packet), Pointer.getPeer(seek)), AVIOContext.class);
    }

    @Ptr
    protected static native long avio_alloc_context(@Ptr long var0, int var2, int var3, @Ptr long var4, @Ptr long var6, @Ptr long var8, @Ptr long var10);

    public static void avio_context_free(Pointer<Pointer<AVIOContext>> s) {
        avio_context_free(Pointer.getPeer(s));
    }

    protected static native void avio_context_free(@Ptr long var0);

    public static void avio_w8(Pointer<AVIOContext> s, int b) {
        avio_w8(Pointer.getPeer(s), b);
    }

    protected static native void avio_w8(@Ptr long var0, int var2);

    public static void avio_write(Pointer<AVIOContext> s, Pointer<Byte> buf, int size) {
        avio_write(Pointer.getPeer(s), Pointer.getPeer(buf), size);
    }

    protected static native void avio_write(@Ptr long var0, @Ptr long var2, int var4);

    public static void avio_wl64(Pointer<AVIOContext> s, long val) {
        avio_wl64(Pointer.getPeer(s), val);
    }

    protected static native void avio_wl64(@Ptr long var0, long var2);

    public static void avio_wb64(Pointer<AVIOContext> s, long val) {
        avio_wb64(Pointer.getPeer(s), val);
    }

    protected static native void avio_wb64(@Ptr long var0, long var2);

    public static void avio_wl32(Pointer<AVIOContext> s, int val) {
        avio_wl32(Pointer.getPeer(s), val);
    }

    protected static native void avio_wl32(@Ptr long var0, int var2);

    public static void avio_wb32(Pointer<AVIOContext> s, int val) {
        avio_wb32(Pointer.getPeer(s), val);
    }

    protected static native void avio_wb32(@Ptr long var0, int var2);

    public static void avio_wl24(Pointer<AVIOContext> s, int val) {
        avio_wl24(Pointer.getPeer(s), val);
    }

    protected static native void avio_wl24(@Ptr long var0, int var2);

    public static void avio_wb24(Pointer<AVIOContext> s, int val) {
        avio_wb24(Pointer.getPeer(s), val);
    }

    protected static native void avio_wb24(@Ptr long var0, int var2);

    public static void avio_wl16(Pointer<AVIOContext> s, int val) {
        avio_wl16(Pointer.getPeer(s), val);
    }

    protected static native void avio_wl16(@Ptr long var0, int var2);

    public static void avio_wb16(Pointer<AVIOContext> s, int val) {
        avio_wb16(Pointer.getPeer(s), val);
    }

    protected static native void avio_wb16(@Ptr long var0, int var2);

    public static int avio_put_str(Pointer<AVIOContext> s, Pointer<Byte> str) {
        return avio_put_str(Pointer.getPeer(s), Pointer.getPeer(str));
    }

    protected static native int avio_put_str(@Ptr long var0, @Ptr long var2);

    public static int avio_put_str16le(Pointer<AVIOContext> s, Pointer<Byte> str) {
        return avio_put_str16le(Pointer.getPeer(s), Pointer.getPeer(str));
    }

    protected static native int avio_put_str16le(@Ptr long var0, @Ptr long var2);

    public static int avio_put_str16be(Pointer<AVIOContext> s, Pointer<Byte> str) {
        return avio_put_str16be(Pointer.getPeer(s), Pointer.getPeer(str));
    }

    protected static native int avio_put_str16be(@Ptr long var0, @Ptr long var2);

    public static void avio_write_marker(Pointer<AVIOContext> s, long time, IntValuedEnum<AvformatLibrary.AVIODataMarkerType> type) {
        avio_write_marker(Pointer.getPeer(s), time, (int)type.value());
    }

    protected static native void avio_write_marker(@Ptr long var0, long var2, int var4);

    public static long avio_seek(Pointer<AVIOContext> s, long offset, int whence) {
        return avio_seek(Pointer.getPeer(s), offset, whence);
    }

    protected static native long avio_seek(@Ptr long var0, long var2, int var4);

    public static long avio_skip(Pointer<AVIOContext> s, long offset) {
        return avio_skip(Pointer.getPeer(s), offset);
    }

    protected static native long avio_skip(@Ptr long var0, long var2);

    public static long avio_size(Pointer<AVIOContext> s) {
        return avio_size(Pointer.getPeer(s));
    }

    protected static native long avio_size(@Ptr long var0);

    public static int avio_feof(Pointer<AVIOContext> s) {
        return avio_feof(Pointer.getPeer(s));
    }

    protected static native int avio_feof(@Ptr long var0);

    public static int avio_printf(Pointer<AVIOContext> s, Pointer<Byte> fmt, Object... varArgs1) {
        return avio_printf(Pointer.getPeer(s), Pointer.getPeer(fmt), varArgs1);
    }

    protected static native int avio_printf(@Ptr long var0, @Ptr long var2, Object... var4);

    public static void avio_flush(Pointer<AVIOContext> s) {
        avio_flush(Pointer.getPeer(s));
    }

    protected static native void avio_flush(@Ptr long var0);

    public static int avio_read(Pointer<AVIOContext> s, Pointer<Byte> buf, int size) {
        return avio_read(Pointer.getPeer(s), Pointer.getPeer(buf), size);
    }

    protected static native int avio_read(@Ptr long var0, @Ptr long var2, int var4);

    public static int avio_read_partial(Pointer<AVIOContext> s, Pointer<Byte> buf, int size) {
        return avio_read_partial(Pointer.getPeer(s), Pointer.getPeer(buf), size);
    }

    protected static native int avio_read_partial(@Ptr long var0, @Ptr long var2, int var4);

    public static int avio_r8(Pointer<AVIOContext> s) {
        return avio_r8(Pointer.getPeer(s));
    }

    protected static native int avio_r8(@Ptr long var0);

    public static int avio_rl16(Pointer<AVIOContext> s) {
        return avio_rl16(Pointer.getPeer(s));
    }

    protected static native int avio_rl16(@Ptr long var0);

    public static int avio_rl24(Pointer<AVIOContext> s) {
        return avio_rl24(Pointer.getPeer(s));
    }

    protected static native int avio_rl24(@Ptr long var0);

    public static int avio_rl32(Pointer<AVIOContext> s) {
        return avio_rl32(Pointer.getPeer(s));
    }

    protected static native int avio_rl32(@Ptr long var0);

    public static long avio_rl64(Pointer<AVIOContext> s) {
        return avio_rl64(Pointer.getPeer(s));
    }

    protected static native long avio_rl64(@Ptr long var0);

    public static int avio_rb16(Pointer<AVIOContext> s) {
        return avio_rb16(Pointer.getPeer(s));
    }

    protected static native int avio_rb16(@Ptr long var0);

    public static int avio_rb24(Pointer<AVIOContext> s) {
        return avio_rb24(Pointer.getPeer(s));
    }

    protected static native int avio_rb24(@Ptr long var0);

    public static int avio_rb32(Pointer<AVIOContext> s) {
        return avio_rb32(Pointer.getPeer(s));
    }

    protected static native int avio_rb32(@Ptr long var0);

    public static long avio_rb64(Pointer<AVIOContext> s) {
        return avio_rb64(Pointer.getPeer(s));
    }

    protected static native long avio_rb64(@Ptr long var0);

    public static int avio_get_str(Pointer<AVIOContext> pb, int maxlen, Pointer<Byte> buf, int buflen) {
        return avio_get_str(Pointer.getPeer(pb), maxlen, Pointer.getPeer(buf), buflen);
    }

    protected static native int avio_get_str(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int avio_get_str16le(Pointer<AVIOContext> pb, int maxlen, Pointer<Byte> buf, int buflen) {
        return avio_get_str16le(Pointer.getPeer(pb), maxlen, Pointer.getPeer(buf), buflen);
    }

    protected static native int avio_get_str16le(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int avio_get_str16be(Pointer<AVIOContext> pb, int maxlen, Pointer<Byte> buf, int buflen) {
        return avio_get_str16be(Pointer.getPeer(pb), maxlen, Pointer.getPeer(buf), buflen);
    }

    protected static native int avio_get_str16be(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int avio_open(Pointer<Pointer<AVIOContext>> s, Pointer<Byte> url, int flags) {
        return avio_open(Pointer.getPeer(s), Pointer.getPeer(url), flags);
    }

    protected static native int avio_open(@Ptr long var0, @Ptr long var2, int var4);

    public static int avio_open2(Pointer<Pointer<AVIOContext>> s, Pointer<Byte> url, int flags, Pointer<AVIOInterruptCB> int_cb, Pointer<Pointer<AVDictionary>> options) {
        return avio_open2(Pointer.getPeer(s), Pointer.getPeer(url), flags, Pointer.getPeer(int_cb), Pointer.getPeer(options));
    }

    protected static native int avio_open2(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5, @Ptr long var7);

    public static int avio_close(Pointer<AVIOContext> s) {
        return avio_close(Pointer.getPeer(s));
    }

    protected static native int avio_close(@Ptr long var0);

    public static int avio_closep(Pointer<Pointer<AVIOContext>> s) {
        return avio_closep(Pointer.getPeer(s));
    }

    protected static native int avio_closep(@Ptr long var0);

    public static int avio_open_dyn_buf(Pointer<Pointer<AVIOContext>> s) {
        return avio_open_dyn_buf(Pointer.getPeer(s));
    }

    protected static native int avio_open_dyn_buf(@Ptr long var0);

    public static int avio_get_dyn_buf(Pointer<AVIOContext> s, Pointer<Pointer<Byte>> pbuffer) {
        return avio_get_dyn_buf(Pointer.getPeer(s), Pointer.getPeer(pbuffer));
    }

    protected static native int avio_get_dyn_buf(@Ptr long var0, @Ptr long var2);

    public static int avio_close_dyn_buf(Pointer<AVIOContext> s, Pointer<Pointer<Byte>> pbuffer) {
        return avio_close_dyn_buf(Pointer.getPeer(s), Pointer.getPeer(pbuffer));
    }

    protected static native int avio_close_dyn_buf(@Ptr long var0, @Ptr long var2);

    public static Pointer<Byte> avio_enum_protocols(Pointer<Pointer<?>> opaque, int output) {
        return Pointer.pointerToAddress(avio_enum_protocols(Pointer.getPeer(opaque), output), Byte.class);
    }

    @Ptr
    protected static native long avio_enum_protocols(@Ptr long var0, int var2);

    public static int avio_pause(Pointer<AVIOContext> h, int pause) {
        return avio_pause(Pointer.getPeer(h), pause);
    }

    protected static native int avio_pause(@Ptr long var0, int var2);

    public static long avio_seek_time(Pointer<AVIOContext> h, int stream_index, long timestamp, int flags) {
        return avio_seek_time(Pointer.getPeer(h), stream_index, timestamp, flags);
    }

    protected static native long avio_seek_time(@Ptr long var0, int var2, long var3, int var5);

    public static int avio_read_to_bprint(Pointer<AVIOContext> h, Pointer<AVBPrint> pb, @Ptr long max_size) {
        return avio_read_to_bprint(Pointer.getPeer(h), Pointer.getPeer(pb), max_size);
    }

    protected static native int avio_read_to_bprint(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avio_accept(Pointer<AVIOContext> s, Pointer<Pointer<AVIOContext>> c) {
        return avio_accept(Pointer.getPeer(s), Pointer.getPeer(c));
    }

    protected static native int avio_accept(@Ptr long var0, @Ptr long var2);

    public static int avio_handshake(Pointer<AVIOContext> c) {
        return avio_handshake(Pointer.getPeer(c));
    }

    protected static native int avio_handshake(@Ptr long var0);

    public static int av_get_packet(Pointer<AVIOContext> s, Pointer<AVPacket> pkt, int size) {
        return av_get_packet(Pointer.getPeer(s), Pointer.getPeer(pkt), size);
    }

    protected static native int av_get_packet(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_append_packet(Pointer<AVIOContext> s, Pointer<AVPacket> pkt, int size) {
        return av_append_packet(Pointer.getPeer(s), Pointer.getPeer(pkt), size);
    }

    protected static native int av_append_packet(@Ptr long var0, @Ptr long var2, int var4);

    public static AVRational av_stream_get_r_frame_rate(Pointer<AVStream> s) {
        return av_stream_get_r_frame_rate(Pointer.getPeer(s));
    }

    protected static native AVRational av_stream_get_r_frame_rate(@Ptr long var0);

    public static void av_stream_set_r_frame_rate(Pointer<AVStream> s, AVRational r) {
        av_stream_set_r_frame_rate(Pointer.getPeer(s), r);
    }

    protected static native void av_stream_set_r_frame_rate(@Ptr long var0, AVRational var2);

    public static Pointer<Byte> av_stream_get_recommended_encoder_configuration(Pointer<AVStream> s) {
        return Pointer.pointerToAddress(av_stream_get_recommended_encoder_configuration(Pointer.getPeer(s)), Byte.class);
    }

    @Ptr
    protected static native long av_stream_get_recommended_encoder_configuration(@Ptr long var0);

    public static void av_stream_set_recommended_encoder_configuration(Pointer<AVStream> s, Pointer<Byte> configuration) {
        av_stream_set_recommended_encoder_configuration(Pointer.getPeer(s), Pointer.getPeer(configuration));
    }

    protected static native void av_stream_set_recommended_encoder_configuration(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVCodecParserContext> av_stream_get_parser(Pointer<AVStream> s) {
        return Pointer.pointerToAddress(av_stream_get_parser(Pointer.getPeer(s)), AVCodecParserContext.class);
    }

    @Ptr
    protected static native long av_stream_get_parser(@Ptr long var0);

    public static long av_stream_get_end_pts(Pointer<AVStream> st) {
        return av_stream_get_end_pts(Pointer.getPeer(st));
    }

    protected static native long av_stream_get_end_pts(@Ptr long var0);

    public static int av_format_get_probe_score(Pointer<AVFormatContext> s) {
        return av_format_get_probe_score(Pointer.getPeer(s));
    }

    protected static native int av_format_get_probe_score(@Ptr long var0);

    public static Pointer<AVCodec> av_format_get_video_codec(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_video_codec(Pointer.getPeer(s)), AVCodec.class);
    }

    @Ptr
    protected static native long av_format_get_video_codec(@Ptr long var0);

    public static void av_format_set_video_codec(Pointer<AVFormatContext> s, Pointer<AVCodec> c) {
        av_format_set_video_codec(Pointer.getPeer(s), Pointer.getPeer(c));
    }

    protected static native void av_format_set_video_codec(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVCodec> av_format_get_audio_codec(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_audio_codec(Pointer.getPeer(s)), AVCodec.class);
    }

    @Ptr
    protected static native long av_format_get_audio_codec(@Ptr long var0);

    public static void av_format_set_audio_codec(Pointer<AVFormatContext> s, Pointer<AVCodec> c) {
        av_format_set_audio_codec(Pointer.getPeer(s), Pointer.getPeer(c));
    }

    protected static native void av_format_set_audio_codec(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVCodec> av_format_get_subtitle_codec(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_subtitle_codec(Pointer.getPeer(s)), AVCodec.class);
    }

    @Ptr
    protected static native long av_format_get_subtitle_codec(@Ptr long var0);

    public static void av_format_set_subtitle_codec(Pointer<AVFormatContext> s, Pointer<AVCodec> c) {
        av_format_set_subtitle_codec(Pointer.getPeer(s), Pointer.getPeer(c));
    }

    protected static native void av_format_set_subtitle_codec(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVCodec> av_format_get_data_codec(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_data_codec(Pointer.getPeer(s)), AVCodec.class);
    }

    @Ptr
    protected static native long av_format_get_data_codec(@Ptr long var0);

    public static void av_format_set_data_codec(Pointer<AVFormatContext> s, Pointer<AVCodec> c) {
        av_format_set_data_codec(Pointer.getPeer(s), Pointer.getPeer(c));
    }

    protected static native void av_format_set_data_codec(@Ptr long var0, @Ptr long var2);

    public static int av_format_get_metadata_header_padding(Pointer<AVFormatContext> s) {
        return av_format_get_metadata_header_padding(Pointer.getPeer(s));
    }

    protected static native int av_format_get_metadata_header_padding(@Ptr long var0);

    public static void av_format_set_metadata_header_padding(Pointer<AVFormatContext> s, int c) {
        av_format_set_metadata_header_padding(Pointer.getPeer(s), c);
    }

    protected static native void av_format_set_metadata_header_padding(@Ptr long var0, int var2);

    public static Pointer<?> av_format_get_opaque(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_opaque(Pointer.getPeer(s)));
    }

    @Ptr
    protected static native long av_format_get_opaque(@Ptr long var0);

    public static void av_format_set_opaque(Pointer<AVFormatContext> s, Pointer<?> opaque) {
        av_format_set_opaque(Pointer.getPeer(s), Pointer.getPeer(opaque));
    }

    protected static native void av_format_set_opaque(@Ptr long var0, @Ptr long var2);

    public static Pointer<AvformatLibrary.av_format_control_message> av_format_get_control_message_cb(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_control_message_cb(Pointer.getPeer(s)), AvformatLibrary.av_format_control_message.class);
    }

    @Ptr
    protected static native long av_format_get_control_message_cb(@Ptr long var0);

    public static void av_format_set_control_message_cb(Pointer<AVFormatContext> s, Pointer<AvformatLibrary.av_format_control_message> callback) {
        av_format_set_control_message_cb(Pointer.getPeer(s), Pointer.getPeer(callback));
    }

    protected static native void av_format_set_control_message_cb(@Ptr long var0, @Ptr long var2);

    public static Pointer<AvformatLibrary.AVOpenCallback> av_format_get_open_cb(Pointer<AVFormatContext> s) {
        return Pointer.pointerToAddress(av_format_get_open_cb(Pointer.getPeer(s)), AvformatLibrary.AVOpenCallback.class);
    }

    @Ptr
    protected static native long av_format_get_open_cb(@Ptr long var0);

    public static void av_format_set_open_cb(Pointer<AVFormatContext> s, Pointer<AvformatLibrary.AVOpenCallback> callback) {
        av_format_set_open_cb(Pointer.getPeer(s), Pointer.getPeer(callback));
    }

    protected static native void av_format_set_open_cb(@Ptr long var0, @Ptr long var2);

    public static void av_format_inject_global_side_data(Pointer<AVFormatContext> s) {
        av_format_inject_global_side_data(Pointer.getPeer(s));
    }

    protected static native void av_format_inject_global_side_data(@Ptr long var0);

    public static IntValuedEnum<AvformatLibrary.AVDurationEstimationMethod> av_fmt_ctx_get_duration_estimation_method(Pointer<AVFormatContext> ctx) {
        return FlagSet.fromValue(av_fmt_ctx_get_duration_estimation_method(Pointer.getPeer(ctx)), AvformatLibrary.AVDurationEstimationMethod.class);
    }

    protected static native int av_fmt_ctx_get_duration_estimation_method(@Ptr long var0);

    public static native int avformat_version();

    public static Pointer<Byte> avformat__configuration() {
        return Pointer.pointerToAddress(avformat_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avformat_configuration();

    public static Pointer<Byte> avformat__license() {
        return Pointer.pointerToAddress(avformat_license(), Byte.class);
    }

    @Ptr
    protected static native long avformat_license();

    public static native void av_register_all();

    public static void av_register_input_format(Pointer<AVInputFormat> format) {
        av_register_input_format(Pointer.getPeer(format));
    }

    protected static native void av_register_input_format(@Ptr long var0);

    public static void av_register_output_format(Pointer<AVOutputFormat> format) {
        av_register_output_format(Pointer.getPeer(format));
    }

    protected static native void av_register_output_format(@Ptr long var0);

    public static native int avformat_network_init();

    public static native int avformat_network_deinit();

    public static Pointer<AVInputFormat> av_iformat_next(Pointer<AVInputFormat> f) {
        return Pointer.pointerToAddress(av_iformat_next(Pointer.getPeer(f)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_iformat_next(@Ptr long var0);

    public static Pointer<AVOutputFormat> av_oformat_next(Pointer<AVOutputFormat> f) {
        return Pointer.pointerToAddress(av_oformat_next(Pointer.getPeer(f)), AVOutputFormat.class);
    }

    @Ptr
    protected static native long av_oformat_next(@Ptr long var0);

    public static Pointer<AVOutputFormat> av_muxer_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_muxer_iterate(Pointer.getPeer(opaque)), AVOutputFormat.class);
    }

    @Ptr
    protected static native long av_muxer_iterate(@Ptr long var0);

    public static Pointer<AVInputFormat> av_demuxer_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_demuxer_iterate(Pointer.getPeer(opaque)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_demuxer_iterate(@Ptr long var0);

    public static Pointer<AVFormatContext> alloc_context() {
        return Pointer.pointerToAddress(avformat_alloc_context(), AVFormatContext.class);
    }

    @Ptr
    protected static native long avformat_alloc_context();

    public static void avformat_free_context(Pointer<AVFormatContext> s) {
        avformat_free_context(Pointer.getPeer(s));
    }

    protected static native void avformat_free_context(@Ptr long var0);

    public static Pointer<AVClass> avformat__get_class() {
        return Pointer.pointerToAddress(avformat_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long avformat_get_class();

    public static Pointer<AVStream> avformat_new_stream(Pointer<AVFormatContext> s, Pointer<AVCodec> c) {
        return Pointer.pointerToAddress(avformat_new_stream(Pointer.getPeer(s), Pointer.getPeer(c)), AVStream.class);
    }

    @Ptr
    protected static native long avformat_new_stream(@Ptr long var0, @Ptr long var2);

    public static int av_stream_add_side_data(Pointer<AVStream> st, IntValuedEnum<AVPacketSideDataType> type, Pointer<Byte> data, @Ptr long size) {
        return av_stream_add_side_data(Pointer.getPeer(st), (int)type.value(), Pointer.getPeer(data), size);
    }

    protected static native int av_stream_add_side_data(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static Pointer<Byte> av_stream_new_side_data(Pointer<AVStream> stream, IntValuedEnum<AVPacketSideDataType> type, int size) {
        return Pointer.pointerToAddress(av_stream_new_side_data(Pointer.getPeer(stream), (int)type.value(), size), Byte.class);
    }

    @Ptr
    protected static native long av_stream_new_side_data(@Ptr long var0, int var2, int var3);

    public static Pointer<Byte> av_stream_get_side_data(Pointer<AVStream> stream, IntValuedEnum<AVPacketSideDataType> type, Pointer<Integer> size) {
        return Pointer.pointerToAddress(av_stream_get_side_data(Pointer.getPeer(stream), (int)type.value(), Pointer.getPeer(size)), Byte.class);
    }

    @Ptr
    protected static native long av_stream_get_side_data(@Ptr long var0, int var2, @Ptr long var3);

    public static Pointer<AVProgram> av_new_program(Pointer<AVFormatContext> s, int id) {
        return Pointer.pointerToAddress(av_new_program(Pointer.getPeer(s), id), AVProgram.class);
    }

    @Ptr
    protected static native long av_new_program(@Ptr long var0, int var2);

    public static int avformat_alloc_output_context2(Pointer<Pointer<AVFormatContext>> ctx, Pointer<AVOutputFormat> oformat, Pointer<Byte> format_name, Pointer<Byte> filename) {
        return avformat_alloc_output_context2(Pointer.getPeer(ctx), Pointer.getPeer(oformat), Pointer.getPeer(format_name), Pointer.getPeer(filename));
    }

    protected static native int avformat_alloc_output_context2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static Pointer<AVInputFormat> av_find_input_format(Pointer<Byte> short_name) {
        return Pointer.pointerToAddress(av_find_input_format(Pointer.getPeer(short_name)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_find_input_format(@Ptr long var0);

    public static Pointer<AVInputFormat> av_probe_input_format(Pointer<AVProbeData> pd, int is_opened) {
        return Pointer.pointerToAddress(av_probe_input_format(Pointer.getPeer(pd), is_opened), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_probe_input_format(@Ptr long var0, int var2);

    public static Pointer<AVInputFormat> av_probe_input_format2(Pointer<AVProbeData> pd, int is_opened, Pointer<Integer> score_max) {
        return Pointer.pointerToAddress(av_probe_input_format2(Pointer.getPeer(pd), is_opened, Pointer.getPeer(score_max)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_probe_input_format2(@Ptr long var0, int var2, @Ptr long var3);

    public static Pointer<AVInputFormat> av_probe_input_format3(Pointer<AVProbeData> pd, int is_opened, Pointer<Integer> score_ret) {
        return Pointer.pointerToAddress(av_probe_input_format3(Pointer.getPeer(pd), is_opened, Pointer.getPeer(score_ret)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_probe_input_format3(@Ptr long var0, int var2, @Ptr long var3);

    public static int av_probe_input_buffer2(Pointer<AVIOContext> pb, Pointer<Pointer<AVInputFormat>> fmt, Pointer<Byte> url, Pointer<?> logctx, int offset, int max_probe_size) {
        return av_probe_input_buffer2(Pointer.getPeer(pb), Pointer.getPeer(fmt), Pointer.getPeer(url), Pointer.getPeer(logctx), offset, max_probe_size);
    }

    protected static native int av_probe_input_buffer2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9);

    public static int av_probe_input_buffer(Pointer<AVIOContext> pb, Pointer<Pointer<AVInputFormat>> fmt, Pointer<Byte> url, Pointer<?> logctx, int offset, int max_probe_size) {
        return av_probe_input_buffer(Pointer.getPeer(pb), Pointer.getPeer(fmt), Pointer.getPeer(url), Pointer.getPeer(logctx), offset, max_probe_size);
    }

    protected static native int av_probe_input_buffer(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9);

    public static int avformat_open_input(Pointer<Pointer<AVFormatContext>> ps, Pointer<Byte> url, Pointer<AVInputFormat> fmt, Pointer<Pointer<AVDictionary>> options) {
        return avformat_open_input(Pointer.getPeer(ps), Pointer.getPeer(url), Pointer.getPeer(fmt), Pointer.getPeer(options));
    }

    protected static native int avformat_open_input(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int av_demuxer_open(Pointer<AVFormatContext> ic) {
        return av_demuxer_open(Pointer.getPeer(ic));
    }

    protected static native int av_demuxer_open(@Ptr long var0);

    public static int avformat_find_stream_info(Pointer<AVFormatContext> ic, Pointer<Pointer<AVDictionary>> options) {
        return avformat_find_stream_info(Pointer.getPeer(ic), Pointer.getPeer(options));
    }

    protected static native int avformat_find_stream_info(@Ptr long var0, @Ptr long var2);

    public static Pointer<AVProgram> av_find_program_from_stream(Pointer<AVFormatContext> ic, Pointer<AVProgram> last, int s) {
        return Pointer.pointerToAddress(av_find_program_from_stream(Pointer.getPeer(ic), Pointer.getPeer(last), s), AVProgram.class);
    }

    @Ptr
    protected static native long av_find_program_from_stream(@Ptr long var0, @Ptr long var2, int var4);

    public static void av_program_add_stream_index(Pointer<AVFormatContext> ac, int progid, int idx) {
        av_program_add_stream_index(Pointer.getPeer(ac), progid, idx);
    }

    protected static native void av_program_add_stream_index(@Ptr long var0, int var2, int var3);

    public static int av_find_best_stream(Pointer<AVFormatContext> ic, IntValuedEnum<AVMediaType> type, int wanted_stream_nb, int related_stream, Pointer<Pointer<AVCodec>> decoder_ret, int flags) {
        return av_find_best_stream(Pointer.getPeer(ic), (int)type.value(), wanted_stream_nb, related_stream, Pointer.getPeer(decoder_ret), flags);
    }

    protected static native int av_find_best_stream(@Ptr long var0, int var2, int var3, int var4, @Ptr long var5, int var7);

    public static int av_read_frame(Pointer<AVFormatContext> s, Pointer<AVPacket> pkt) {
        return av_read_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
    }

    protected static native int av_read_frame(@Ptr long var0, @Ptr long var2);

    public static int av_seek_frame(Pointer<AVFormatContext> s, int stream_index, long timestamp, int flags) {
        return av_seek_frame(Pointer.getPeer(s), stream_index, timestamp, flags);
    }

    protected static native int av_seek_frame(@Ptr long var0, int var2, long var3, int var5);

    public static int avformat_seek_file(Pointer<AVFormatContext> s, int stream_index, long min_ts, long ts, long max_ts, int flags) {
        return avformat_seek_file(Pointer.getPeer(s), stream_index, min_ts, ts, max_ts, flags);
    }

    protected static native int avformat_seek_file(@Ptr long var0, int var2, long var3, long var5, long var7, int var9);

    public static int avformat_flush(Pointer<AVFormatContext> s) {
        return avformat_flush(Pointer.getPeer(s));
    }

    protected static native int avformat_flush(@Ptr long var0);

    public static int av_read_play(Pointer<AVFormatContext> s) {
        return av_read_play(Pointer.getPeer(s));
    }

    protected static native int av_read_play(@Ptr long var0);

    public static int av_read_pause(Pointer<AVFormatContext> s) {
        return av_read_pause(Pointer.getPeer(s));
    }

    protected static native int av_read_pause(@Ptr long var0);

    public static void avformat_close_input(Pointer<Pointer<AVFormatContext>> s) {
        avformat_close_input(Pointer.getPeer(s));
    }

    protected static native void avformat_close_input(@Ptr long var0);

    public static int avformat_write_header(Pointer<AVFormatContext> s, Pointer<Pointer<AVDictionary>> options) {
        return avformat_write_header(Pointer.getPeer(s), Pointer.getPeer(options));
    }

    protected static native int avformat_write_header(@Ptr long var0, @Ptr long var2);

    public static int avformat_init_output(Pointer<AVFormatContext> s, Pointer<Pointer<AVDictionary>> options) {
        return avformat_init_output(Pointer.getPeer(s), Pointer.getPeer(options));
    }

    protected static native int avformat_init_output(@Ptr long var0, @Ptr long var2);

    public static int av_write_frame(Pointer<AVFormatContext> s, Pointer<AVPacket> pkt) {
        return av_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
    }

    protected static native int av_write_frame(@Ptr long var0, @Ptr long var2);

    public static int av_interleaved_write_frame(Pointer<AVFormatContext> s, Pointer<AVPacket> pkt) {
        return av_interleaved_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
    }

    protected static native int av_interleaved_write_frame(@Ptr long var0, @Ptr long var2);

    public static int av_write_uncoded_frame(Pointer<AVFormatContext> s, int stream_index, Pointer<AVFrame> frame) {
        return av_write_uncoded_frame(Pointer.getPeer(s), stream_index, Pointer.getPeer(frame));
    }

    protected static native int av_write_uncoded_frame(@Ptr long var0, int var2, @Ptr long var3);

    public static int av_interleaved_write_uncoded_frame(Pointer<AVFormatContext> s, int stream_index, Pointer<AVFrame> frame) {
        return av_interleaved_write_uncoded_frame(Pointer.getPeer(s), stream_index, Pointer.getPeer(frame));
    }

    protected static native int av_interleaved_write_uncoded_frame(@Ptr long var0, int var2, @Ptr long var3);

    public static int av_write_uncoded_frame_query(Pointer<AVFormatContext> s, int stream_index) {
        return av_write_uncoded_frame_query(Pointer.getPeer(s), stream_index);
    }

    protected static native int av_write_uncoded_frame_query(@Ptr long var0, int var2);

    public static int av_write_trailer(Pointer<AVFormatContext> s) {
        return av_write_trailer(Pointer.getPeer(s));
    }

    protected static native int av_write_trailer(@Ptr long var0);

    public static Pointer<AVOutputFormat> av_guess_format(Pointer<Byte> short_name, Pointer<Byte> filename, Pointer<Byte> mime_type) {
        return Pointer.pointerToAddress(av_guess_format(Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type)), AVOutputFormat.class);
    }

    @Ptr
    protected static native long av_guess_format(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static IntValuedEnum<AVCodecID> av_guess_codec(Pointer<AVOutputFormat> fmt, Pointer<Byte> short_name, Pointer<Byte> filename, Pointer<Byte> mime_type, IntValuedEnum<AVMediaType> type) {
        return FlagSet.fromValue(av_guess_codec(Pointer.getPeer(fmt), Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type), (int)type.value()), AVCodecID.class);
    }

    protected static native int av_guess_codec(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8);

    public static int av_get_output_timestamp(Pointer<AVFormatContext> s, int stream, Pointer<Long> dts, Pointer<Long> wall) {
        return av_get_output_timestamp(Pointer.getPeer(s), stream, Pointer.getPeer(dts), Pointer.getPeer(wall));
    }

    protected static native int av_get_output_timestamp(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static void av_hex_dump(Pointer f, Pointer<Byte> buf, int size) {
        av_hex_dump(Pointer.getPeer(f), Pointer.getPeer(buf), size);
    }

    protected static native void av_hex_dump(@Ptr long var0, @Ptr long var2, int var4);

    public static void av_hex_dump_log(Pointer<?> avcl, int level, Pointer<Byte> buf, int size) {
        av_hex_dump_log(Pointer.getPeer(avcl), level, Pointer.getPeer(buf), size);
    }

    protected static native void av_hex_dump_log(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static void av_pkt_dump2(Pointer f, Pointer<AVPacket> pkt, int dump_payload, Pointer<AVStream> st) {
        av_pkt_dump2(Pointer.getPeer(f), Pointer.getPeer(pkt), dump_payload, Pointer.getPeer(st));
    }

    protected static native void av_pkt_dump2(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static void av_pkt_dump_log2(Pointer<?> avcl, int level, Pointer<AVPacket> pkt, int dump_payload, Pointer<AVStream> st) {
        av_pkt_dump_log2(Pointer.getPeer(avcl), level, Pointer.getPeer(pkt), dump_payload, Pointer.getPeer(st));
    }

    protected static native void av_pkt_dump_log2(@Ptr long var0, int var2, @Ptr long var3, int var5, @Ptr long var6);

    public static IntValuedEnum<AVCodecID> av_codec_get_id(Pointer<Pointer<AVCodecTag>> tags, int tag) {
        return FlagSet.fromValue(av_codec_get_id(Pointer.getPeer(tags), tag), AVCodecID.class);
    }

    protected static native int av_codec_get_id(@Ptr long var0, int var2);

    public static int av_codec_get_tag(Pointer<Pointer<AVCodecTag>> tags, IntValuedEnum<AVCodecID> id) {
        return av_codec_get_tag(Pointer.getPeer(tags), (int)id.value());
    }

    protected static native int av_codec_get_tag(@Ptr long var0, int var2);

    public static int av_codec_get_tag2(Pointer<Pointer<AVCodecTag>> tags, IntValuedEnum<AVCodecID> id, Pointer<Integer> tag) {
        return av_codec_get_tag2(Pointer.getPeer(tags), (int)id.value(), Pointer.getPeer(tag));
    }

    protected static native int av_codec_get_tag2(@Ptr long var0, int var2, @Ptr long var3);

    public static int av_find_default_stream_index(Pointer<AVFormatContext> s) {
        return av_find_default_stream_index(Pointer.getPeer(s));
    }

    protected static native int av_find_default_stream_index(@Ptr long var0);

    public static int av_index_search_timestamp(Pointer<AVStream> st, long timestamp, int flags) {
        return av_index_search_timestamp(Pointer.getPeer(st), timestamp, flags);
    }

    protected static native int av_index_search_timestamp(@Ptr long var0, long var2, int var4);

    public static int av_add_index_entry(Pointer<AVStream> st, long pos, long timestamp, int size, int distance, int flags) {
        return av_add_index_entry(Pointer.getPeer(st), pos, timestamp, size, distance, flags);
    }

    protected static native int av_add_index_entry(@Ptr long var0, long var2, long var4, int var6, int var7, int var8);

    public static void av_url_split(Pointer<Byte> proto, int proto_size, Pointer<Byte> authorization, int authorization_size, Pointer<Byte> hostname, int hostname_size, Pointer<Integer> port_ptr, Pointer<Byte> path, int path_size, Pointer<Byte> url) {
        av_url_split(Pointer.getPeer(proto), proto_size, Pointer.getPeer(authorization), authorization_size, Pointer.getPeer(hostname), hostname_size, Pointer.getPeer(port_ptr), Pointer.getPeer(path), path_size, Pointer.getPeer(url));
    }

    protected static native void av_url_split(@Ptr long var0, int var2, @Ptr long var3, int var5, @Ptr long var6, int var8, @Ptr long var9, @Ptr long var11, int var13, @Ptr long var14);

    public static void av_dump_format(Pointer<AVFormatContext> ic, int index, Pointer<Byte> url, int is_output) {
        av_dump_format(Pointer.getPeer(ic), index, Pointer.getPeer(url), is_output);
    }

    protected static native void av_dump_format(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int av_get_frame_filename2(Pointer<Byte> buf, int buf_size, Pointer<Byte> path, int number, int flags) {
        return av_get_frame_filename2(Pointer.getPeer(buf), buf_size, Pointer.getPeer(path), number, flags);
    }

    protected static native int av_get_frame_filename2(@Ptr long var0, int var2, @Ptr long var3, int var5, int var6);

    public static int av_get_frame_filename(Pointer<Byte> buf, int buf_size, Pointer<Byte> path, int number) {
        return av_get_frame_filename(Pointer.getPeer(buf), buf_size, Pointer.getPeer(path), number);
    }

    protected static native int av_get_frame_filename(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int av_filename_number_test(Pointer<Byte> filename) {
        return av_filename_number_test(Pointer.getPeer(filename));
    }

    protected static native int av_filename_number_test(@Ptr long var0);

    public static int av_sdp_create(Pointer<Pointer<AVFormatContext>> ac, int n_files, Pointer<Byte> buf, int size) {
        return av_sdp_create(Pointer.getPeer(ac), n_files, Pointer.getPeer(buf), size);
    }

    protected static native int av_sdp_create(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static int av_match_ext(Pointer<Byte> filename, Pointer<Byte> extensions) {
        return av_match_ext(Pointer.getPeer(filename), Pointer.getPeer(extensions));
    }

    protected static native int av_match_ext(@Ptr long var0, @Ptr long var2);

    public static int avformat_query_codec(Pointer<AVOutputFormat> ofmt, IntValuedEnum<AVCodecID> codec_id, int std_compliance) {
        return avformat_query_codec(Pointer.getPeer(ofmt), (int)codec_id.value(), std_compliance);
    }

    protected static native int avformat_query_codec(@Ptr long var0, int var2, int var3);

    public static Pointer<AVCodecTag> avformat__get_riff_video_tags() {
        return Pointer.pointerToAddress(avformat_get_riff_video_tags(), AVCodecTag.class);
    }

    @Ptr
    protected static native long avformat_get_riff_video_tags();

    public static Pointer<AVCodecTag> avformat__get_riff_audio_tags() {
        return Pointer.pointerToAddress(avformat_get_riff_audio_tags(), AVCodecTag.class);
    }

    @Ptr
    protected static native long avformat_get_riff_audio_tags();

    public static Pointer<AVCodecTag> avformat__get_mov_video_tags() {
        return Pointer.pointerToAddress(avformat_get_mov_video_tags(), AVCodecTag.class);
    }

    @Ptr
    protected static native long avformat_get_mov_video_tags();

    public static Pointer<AVCodecTag> avformat__get_mov_audio_tags() {
        return Pointer.pointerToAddress(avformat_get_mov_audio_tags(), AVCodecTag.class);
    }

    @Ptr
    protected static native long avformat_get_mov_audio_tags();

    public static AVRational av_guess_sample_aspect_ratio(Pointer<AVFormatContext> format, Pointer<AVStream> stream, Pointer<AVFrame> frame) {
        return av_guess_sample_aspect_ratio(Pointer.getPeer(format), Pointer.getPeer(stream), Pointer.getPeer(frame));
    }

    protected static native AVRational av_guess_sample_aspect_ratio(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static AVRational av_guess_frame_rate(Pointer<AVFormatContext> ctx, Pointer<AVStream> stream, Pointer<AVFrame> frame) {
        return av_guess_frame_rate(Pointer.getPeer(ctx), Pointer.getPeer(stream), Pointer.getPeer(frame));
    }

    protected static native AVRational av_guess_frame_rate(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avformat_match_stream_specifier(Pointer<AVFormatContext> s, Pointer<AVStream> st, Pointer<Byte> spec) {
        return avformat_match_stream_specifier(Pointer.getPeer(s), Pointer.getPeer(st), Pointer.getPeer(spec));
    }

    protected static native int avformat_match_stream_specifier(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avformat_queue_attached_pictures(Pointer<AVFormatContext> s) {
        return avformat_queue_attached_pictures(Pointer.getPeer(s));
    }

    protected static native int avformat_queue_attached_pictures(@Ptr long var0);

    public static int av_apply_bitstream_filters(Pointer<AVCodecContext> codec, Pointer<AVPacket> pkt, Pointer<AVBitStreamFilterContext> bsfc) {
        return av_apply_bitstream_filters(Pointer.getPeer(codec), Pointer.getPeer(pkt), Pointer.getPeer(bsfc));
    }

    protected static native int av_apply_bitstream_filters(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static int avformat_transfer_internal_stream_timing_info(Pointer<AVOutputFormat> ofmt, Pointer<AVStream> ost, Pointer<AVStream> ist, IntValuedEnum<AvformatLibrary.AVTimebaseSource> copy_tb) {
        return avformat_transfer_internal_stream_timing_info(Pointer.getPeer(ofmt), Pointer.getPeer(ost), Pointer.getPeer(ist), (int)copy_tb.value());
    }

    protected static native int avformat_transfer_internal_stream_timing_info(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6);

    public static AVRational av_stream_get_codec_timebase(Pointer<AVStream> st) {
        return av_stream_get_codec_timebase(Pointer.getPeer(st));
    }

    protected static native AVRational av_stream_get_codec_timebase(@Ptr long var0);

    public static enum AVDurationEstimationMethod implements IntValuedEnum<AvformatLibrary.AVDurationEstimationMethod> {
        AVFMT_DURATION_FROM_PTS(0L),
        AVFMT_DURATION_FROM_STREAM(1L),
        AVFMT_DURATION_FROM_BITRATE(2L);

        public final long value;

        private AVDurationEstimationMethod(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvformatLibrary.AVDurationEstimationMethod> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvformatLibrary.AVDurationEstimationMethod> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVIODataMarkerType implements IntValuedEnum<AvformatLibrary.AVIODataMarkerType> {
        AVIO_DATA_MARKER_HEADER(0L),
        AVIO_DATA_MARKER_SYNC_POINT(1L),
        AVIO_DATA_MARKER_BOUNDARY_POINT(2L),
        AVIO_DATA_MARKER_UNKNOWN(3L),
        AVIO_DATA_MARKER_TRAILER(4L),
        AVIO_DATA_MARKER_FLUSH_POINT(5L);

        public final long value;

        private AVIODataMarkerType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvformatLibrary.AVIODataMarkerType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvformatLibrary.AVIODataMarkerType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVIODirEntryType implements IntValuedEnum<AvformatLibrary.AVIODirEntryType> {
        AVIO_ENTRY_UNKNOWN(0L),
        AVIO_ENTRY_BLOCK_DEVICE(1L),
        AVIO_ENTRY_CHARACTER_DEVICE(2L),
        AVIO_ENTRY_DIRECTORY(3L),
        AVIO_ENTRY_NAMED_PIPE(4L),
        AVIO_ENTRY_SYMBOLIC_LINK(5L),
        AVIO_ENTRY_SOCKET(6L),
        AVIO_ENTRY_FILE(7L),
        AVIO_ENTRY_SERVER(8L),
        AVIO_ENTRY_SHARE(9L),
        AVIO_ENTRY_WORKGROUP(10L);

        public final long value;

        private AVIODirEntryType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvformatLibrary.AVIODirEntryType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvformatLibrary.AVIODirEntryType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public abstract static class AVOpenCallback extends Callback<AvformatLibrary.AVOpenCallback> {
        public AVOpenCallback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<Pointer> pb, Pointer<Byte> url, int flags, Pointer<AVIOInterruptCB> int_cb, Pointer<Pointer> options) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(pb), Pointer.getPeer(url), flags, Pointer.getPeer(int_cb), Pointer.getPeer(options));
        }

        public int apply(@Ptr long s, @Ptr long pb, @Ptr long url, int flags, @Ptr long int_cb, @Ptr long options) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(pb, Pointer.class), Pointer.pointerToAddress(url, Byte.class), flags, Pointer.pointerToAddress(int_cb, AVIOInterruptCB.class), Pointer.pointerToAddress(options, Pointer.class));
        }
    }

    public static enum AVStreamParseType implements IntValuedEnum<AvformatLibrary.AVStreamParseType> {
        AVSTREAM_PARSE_NONE(0L),
        AVSTREAM_PARSE_FULL(1L),
        AVSTREAM_PARSE_HEADERS(2L),
        AVSTREAM_PARSE_TIMESTAMPS(3L),
        AVSTREAM_PARSE_FULL_ONCE(4L),
        AVSTREAM_PARSE_FULL_RAW(5L);

        public final long value;

        private AVStreamParseType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvformatLibrary.AVStreamParseType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvformatLibrary.AVStreamParseType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVTimebaseSource implements IntValuedEnum<AvformatLibrary.AVTimebaseSource> {
        AVFMT_TBCF_AUTO(-1L),
        AVFMT_TBCF_DECODER(0L),
        AVFMT_TBCF_DEMUXER(1L),
        AVFMT_TBCF_R_FRAMERATE(2L);

        public final long value;

        private AVTimebaseSource(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvformatLibrary.AVTimebaseSource> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvformatLibrary.AVTimebaseSource> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public abstract static class av_format_control_message extends Callback<AvformatLibrary.av_format_control_message> {
        public av_format_control_message() {
        }

        public int apply(Pointer<AVFormatContext> s, int type, Pointer<?> data, @Ptr long data_size) {
            return this.apply(Pointer.getPeer(s), type, Pointer.getPeer(data), data_size);
        }

        public int apply(@Ptr long s, int type, @Ptr long data, @Ptr long data_size) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), type, Pointer.pointerToAddress(data), data_size);
        }
    }

    public abstract static class avio_alloc_context_read_packet_callback extends Callback<AvformatLibrary.avio_alloc_context_read_packet_callback> {
        public avio_alloc_context_read_packet_callback() {
        }

        public int apply(Pointer<?> opaque, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class avio_alloc_context_seek_callback extends Callback<AvformatLibrary.avio_alloc_context_seek_callback> {
        public avio_alloc_context_seek_callback() {
        }

        public long apply(Pointer<?> opaque, long offset, int whence) {
            return this.apply(Pointer.getPeer(opaque), offset, whence);
        }

        public long apply(@Ptr long opaque, long offset, int whence) {
            return this.apply(Pointer.pointerToAddress(opaque), offset, whence);
        }
    }

    public abstract static class avio_alloc_context_write_packet_callback extends Callback<AvformatLibrary.avio_alloc_context_write_packet_callback> {
        public avio_alloc_context_write_packet_callback() {
        }

        public int apply(Pointer<?> opaque, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }
}
