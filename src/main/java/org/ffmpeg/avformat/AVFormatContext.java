//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Struct;
import org.ffmpeg.avcodec.AVCodec;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avformat.AvformatLibrary.AVDurationEstimationMethod;
import org.ffmpeg.avformat.AvformatLibrary.av_format_control_message;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.util.AlignmentCustomizer;

@Library("avformat")
public class AVFormatContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVFormatContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<AVInputFormat> iformat() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVFormatContext iformat(Pointer<AVInputFormat> iformat) {
        this.io.setPointerField(this, 1, iformat);
        return this;
    }

    @Field(2)
    public Pointer<AVOutputFormat> oformat() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVFormatContext oformat(Pointer<AVOutputFormat> oformat) {
        this.io.setPointerField(this, 2, oformat);
        return this;
    }

    @Field(3)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVFormatContext priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 3, priv_data);
        return this;
    }

    @Field(4)
    public Pointer<AVIOContext> pb() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVFormatContext pb(Pointer<AVIOContext> pb) {
        this.io.setPointerField(this, 4, pb);
        return this;
    }

    @Field(5)
    public int ctx_flags() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVFormatContext ctx_flags(int ctx_flags) {
        this.io.setIntField(this, 5, ctx_flags);
        return this;
    }

    @Field(6)
    public int nb_streams() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVFormatContext nb_streams(int nb_streams) {
        this.io.setIntField(this, 6, nb_streams);
        return this;
    }

    @Field(7)
    public Pointer<Pointer<AVStream>> streams() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVFormatContext streams(Pointer<Pointer<AVStream>> streams) {
        this.io.setPointerField(this, 7, streams);
        return this;
    }

    @Array({1024L})
    @Field(8)
    public Pointer<Byte> filename() {
        return this.io.getPointerField(this, 8);
    }

    @Field(9)
    public Pointer<Byte> url() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVFormatContext url(Pointer<Byte> url) {
        this.io.setPointerField(this, 9, url);
        return this;
    }

    @Field(10)
    public long start_time() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    public AVFormatContext start_time(long start_time) {
        this.io.setLongField(this, 10, start_time);
        return this;
    }

    @Field(11)
    public long duration() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public AVFormatContext duration(long duration) {
        this.io.setLongField(this, 11, duration);
        return this;
    }

    @Field(12)
    public long bit_rate() {
        return this.io.getLongField(this, 12);
    }

    @Field(12)
    public AVFormatContext bit_rate(long bit_rate) {
        this.io.setLongField(this, 12, bit_rate);
        return this;
    }

    @Field(13)
    public int packet_size() {
        return this.io.getIntField(this, 13);
    }

    @Field(13)
    public AVFormatContext packet_size(int packet_size) {
        this.io.setIntField(this, 13, packet_size);
        return this;
    }

    @Field(14)
    public int max_delay() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public AVFormatContext max_delay(int max_delay) {
        this.io.setIntField(this, 14, max_delay);
        return this;
    }

    @Field(15)
    public int flags() {
        return this.io.getIntField(this, 15);
    }

    @Field(15)
    public AVFormatContext flags(int flags) {
        this.io.setIntField(this, 15, flags);
        return this;
    }

    @Field(16)
    public long probesize() {
        return this.io.getLongField(this, 16);
    }

    @Field(16)
    public AVFormatContext probesize(long probesize) {
        this.io.setLongField(this, 16, probesize);
        return this;
    }

    @Field(17)
    public long max_analyze_duration() {
        return this.io.getLongField(this, 17);
    }

    @Field(17)
    public AVFormatContext max_analyze_duration(long max_analyze_duration) {
        this.io.setLongField(this, 17, max_analyze_duration);
        return this;
    }

    @Field(18)
    public Pointer<Byte> key() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVFormatContext key(Pointer<Byte> key) {
        this.io.setPointerField(this, 18, key);
        return this;
    }

    @Field(19)
    public int keylen() {
        return this.io.getIntField(this, 19);
    }

    @Field(19)
    public AVFormatContext keylen(int keylen) {
        this.io.setIntField(this, 19, keylen);
        return this;
    }

    @Field(20)
    public int nb_programs() {
        return this.io.getIntField(this, 20);
    }

    @Field(20)
    public AVFormatContext nb_programs(int nb_programs) {
        this.io.setIntField(this, 20, nb_programs);
        return this;
    }

    @Field(21)
    public Pointer<Pointer<AVProgram>> programs() {
        return this.io.getPointerField(this, 21);
    }

    @Field(21)
    public AVFormatContext programs(Pointer<Pointer<AVProgram>> programs) {
        this.io.setPointerField(this, 21, programs);
        return this;
    }

    @Field(22)
    public IntValuedEnum<AVCodecID> video_codec_id() {
        return this.io.getEnumField(this, 22);
    }

    @Field(22)
    public AVFormatContext video_codec_id(IntValuedEnum<AVCodecID> video_codec_id) {
        this.io.setEnumField(this, 22, video_codec_id);
        return this;
    }

    @Field(23)
    public IntValuedEnum<AVCodecID> audio_codec_id() {
        return this.io.getEnumField(this, 23);
    }

    @Field(23)
    public AVFormatContext audio_codec_id(IntValuedEnum<AVCodecID> audio_codec_id) {
        this.io.setEnumField(this, 23, audio_codec_id);
        return this;
    }

    @Field(24)
    public IntValuedEnum<AVCodecID> subtitle_codec_id() {
        return this.io.getEnumField(this, 24);
    }

    @Field(24)
    public AVFormatContext subtitle_codec_id(IntValuedEnum<AVCodecID> subtitle_codec_id) {
        this.io.setEnumField(this, 24, subtitle_codec_id);
        return this;
    }

    @Field(25)
    public int max_index_size() {
        return this.io.getIntField(this, 25);
    }

    @Field(25)
    public AVFormatContext max_index_size(int max_index_size) {
        this.io.setIntField(this, 25, max_index_size);
        return this;
    }

    @Field(26)
    public int max_picture_buffer() {
        return this.io.getIntField(this, 26);
    }

    @Field(26)
    public AVFormatContext max_picture_buffer(int max_picture_buffer) {
        this.io.setIntField(this, 26, max_picture_buffer);
        return this;
    }

    @Field(27)
    public int nb_chapters() {
        return this.io.getIntField(this, 27);
    }

    @Field(27)
    public AVFormatContext nb_chapters(int nb_chapters) {
        this.io.setIntField(this, 27, nb_chapters);
        return this;
    }

    @Field(28)
    public Pointer<Pointer<AVChapter>> chapters() {
        return this.io.getPointerField(this, 28);
    }

    @Field(28)
    public AVFormatContext chapters(Pointer<Pointer<AVChapter>> chapters) {
        this.io.setPointerField(this, 28, chapters);
        return this;
    }

    @Field(29)
    public Pointer<AVDictionary> metadata() {
        return this.io.getPointerField(this, 29);
    }

    @Field(29)
    public AVFormatContext metadata(Pointer<AVDictionary> metadata) {
        this.io.setPointerField(this, 29, metadata);
        return this;
    }

    @Field(30)
    public long start_time_realtime() {
        return this.io.getLongField(this, 30);
    }

    @Field(30)
    public AVFormatContext start_time_realtime(long start_time_realtime) {
        this.io.setLongField(this, 30, start_time_realtime);
        return this;
    }

    @Field(31)
    public int fps_probe_size() {
        return this.io.getIntField(this, 31);
    }

    @Field(31)
    public AVFormatContext fps_probe_size(int fps_probe_size) {
        this.io.setIntField(this, 31, fps_probe_size);
        return this;
    }

    @Field(32)
    public int error_recognition() {
        return this.io.getIntField(this, 32);
    }

    @Field(32)
    public AVFormatContext error_recognition(int error_recognition) {
        this.io.setIntField(this, 32, error_recognition);
        return this;
    }

    @Field(33)
    public AVIOInterruptCB interrupt_callback() {
        return (AVIOInterruptCB)this.io.getNativeObjectField(this, 33);
    }

    @Field(33)
    public AVFormatContext interrupt_callback(AVIOInterruptCB interrupt_callback) {
        this.io.setNativeObjectField(this, 33, interrupt_callback);
        return this;
    }

    @Field(34)
    public int debug() {
        return this.io.getIntField(this, 34);
    }

    @Field(34)
    public AVFormatContext debug(int debug) {
        this.io.setIntField(this, 34, debug);
        return this;
    }

    @Field(35)
    public long max_interleave_delta() {
        return this.io.getLongField(this, 35);
    }

    @Field(35)
    public AVFormatContext max_interleave_delta(long max_interleave_delta) {
        this.io.setLongField(this, 35, max_interleave_delta);
        return this;
    }

    @Field(36)
    public int strict_std_compliance() {
        return this.io.getIntField(this, 36);
    }

    @Field(36)
    public AVFormatContext strict_std_compliance(int strict_std_compliance) {
        this.io.setIntField(this, 36, strict_std_compliance);
        return this;
    }

    @Field(37)
    public int event_flags() {
        return this.io.getIntField(this, 37);
    }

    @Field(37)
    public AVFormatContext event_flags(int event_flags) {
        this.io.setIntField(this, 37, event_flags);
        return this;
    }

    @Field(38)
    public int max_ts_probe() {
        return this.io.getIntField(this, 38);
    }

    @Field(38)
    public AVFormatContext max_ts_probe(int max_ts_probe) {
        this.io.setIntField(this, 38, max_ts_probe);
        return this;
    }

    @Field(39)
    public int avoid_negative_ts() {
        return this.io.getIntField(this, 39);
    }

    @Field(39)
    public AVFormatContext avoid_negative_ts(int avoid_negative_ts) {
        this.io.setIntField(this, 39, avoid_negative_ts);
        return this;
    }

    @Field(40)
    public int ts_id() {
        return this.io.getIntField(this, 40);
    }

    @Field(40)
    public AVFormatContext ts_id(int ts_id) {
        this.io.setIntField(this, 40, ts_id);
        return this;
    }

    @Field(41)
    public int audio_preload() {
        return this.io.getIntField(this, 41);
    }

    @Field(41)
    public AVFormatContext audio_preload(int audio_preload) {
        this.io.setIntField(this, 41, audio_preload);
        return this;
    }

    @Field(42)
    public int max_chunk_duration() {
        return this.io.getIntField(this, 42);
    }

    @Field(42)
    public AVFormatContext max_chunk_duration(int max_chunk_duration) {
        this.io.setIntField(this, 42, max_chunk_duration);
        return this;
    }

    @Field(43)
    public int max_chunk_size() {
        return this.io.getIntField(this, 43);
    }

    @Field(43)
    public AVFormatContext max_chunk_size(int max_chunk_size) {
        this.io.setIntField(this, 43, max_chunk_size);
        return this;
    }

    @Field(44)
    public int use_wallclock_as_timestamps() {
        return this.io.getIntField(this, 44);
    }

    @Field(44)
    public AVFormatContext use_wallclock_as_timestamps(int use_wallclock_as_timestamps) {
        this.io.setIntField(this, 44, use_wallclock_as_timestamps);
        return this;
    }

    @Field(45)
    public int avio_flags() {
        return this.io.getIntField(this, 45);
    }

    @Field(45)
    public AVFormatContext avio_flags(int avio_flags) {
        this.io.setIntField(this, 45, avio_flags);
        return this;
    }

    @Field(46)
    public IntValuedEnum<AVDurationEstimationMethod> duration_estimation_method() {
        return this.io.getEnumField(this, 46);
    }

    @Field(46)
    public AVFormatContext duration_estimation_method(IntValuedEnum<AVDurationEstimationMethod> duration_estimation_method) {
        this.io.setEnumField(this, 46, duration_estimation_method);
        return this;
    }

    @Field(47)
    public long skip_initial_bytes() {
        return this.io.getLongField(this, 47);
    }

    @Field(47)
    public AVFormatContext skip_initial_bytes(long skip_initial_bytes) {
        this.io.setLongField(this, 47, skip_initial_bytes);
        return this;
    }

    @Field(48)
    public int correct_ts_overflow() {
        return this.io.getIntField(this, 48);
    }

    @Field(48)
    public AVFormatContext correct_ts_overflow(int correct_ts_overflow) {
        this.io.setIntField(this, 48, correct_ts_overflow);
        return this;
    }

    @Field(49)
    public int seek2any() {
        return this.io.getIntField(this, 49);
    }

    @Field(49)
    public AVFormatContext seek2any(int seek2any) {
        this.io.setIntField(this, 49, seek2any);
        return this;
    }

    @Field(50)
    public int flush_packets() {
        return this.io.getIntField(this, 50);
    }

    @Field(50)
    public AVFormatContext flush_packets(int flush_packets) {
        this.io.setIntField(this, 50, flush_packets);
        return this;
    }

    @Field(51)
    public int probe_score() {
        return this.io.getIntField(this, 51);
    }

    @Field(51)
    public AVFormatContext probe_score(int probe_score) {
        this.io.setIntField(this, 51, probe_score);
        return this;
    }

    @Field(52)
    public int format_probesize() {
        return this.io.getIntField(this, 52);
    }

    @Field(52)
    public AVFormatContext format_probesize(int format_probesize) {
        this.io.setIntField(this, 52, format_probesize);
        return this;
    }

    @Field(53)
    public Pointer<Byte> codec_whitelist() {
        return this.io.getPointerField(this, 53);
    }

    @Field(53)
    public AVFormatContext codec_whitelist(Pointer<Byte> codec_whitelist) {
        this.io.setPointerField(this, 53, codec_whitelist);
        return this;
    }

    @Field(54)
    public Pointer<Byte> format_whitelist() {
        return this.io.getPointerField(this, 54);
    }

    @Field(54)
    public AVFormatContext format_whitelist(Pointer<Byte> format_whitelist) {
        this.io.setPointerField(this, 54, format_whitelist);
        return this;
    }

    @Field(55)
    public Pointer<AVFormatInternal> internal() {
        return this.io.getPointerField(this, 55);
    }

    @Field(55)
    public AVFormatContext internal(Pointer<AVFormatInternal> internal) {
        this.io.setPointerField(this, 55, internal);
        return this;
    }

    @Field(56)
    public int io_repositioned() {
        return this.io.getIntField(this, 56);
    }

    @Field(56)
    public AVFormatContext io_repositioned(int io_repositioned) {
        this.io.setIntField(this, 56, io_repositioned);
        return this;
    }

    @Field(57)
    public Pointer<AVCodec> video_codec() {
        return this.io.getPointerField(this, 57);
    }

    @Field(57)
    public AVFormatContext video_codec(Pointer<AVCodec> video_codec) {
        this.io.setPointerField(this, 57, video_codec);
        return this;
    }

    @Field(58)
    public Pointer<AVCodec> audio_codec() {
        return this.io.getPointerField(this, 58);
    }

    @Field(58)
    public AVFormatContext audio_codec(Pointer<AVCodec> audio_codec) {
        this.io.setPointerField(this, 58, audio_codec);
        return this;
    }

    @Field(59)
    public Pointer<AVCodec> subtitle_codec() {
        return this.io.getPointerField(this, 59);
    }

    @Field(59)
    public AVFormatContext subtitle_codec(Pointer<AVCodec> subtitle_codec) {
        this.io.setPointerField(this, 59, subtitle_codec);
        return this;
    }

    @Field(60)
    public Pointer<AVCodec> data_codec() {
        return this.io.getPointerField(this, 60);
    }

    @Field(60)
    public AVFormatContext data_codec(Pointer<AVCodec> data_codec) {
        this.io.setPointerField(this, 60, data_codec);
        return this;
    }

    @Field(61)
    public int metadata_header_padding() {
        return this.io.getIntField(this, 61);
    }

    @Field(61)
    public AVFormatContext metadata_header_padding(int metadata_header_padding) {
        this.io.setIntField(this, 61, metadata_header_padding);
        return this;
    }

    @Field(62)
    public Pointer<?> opaque() {
        return this.io.getPointerField(this, 62);
    }

    @Field(62)
    public AVFormatContext opaque(Pointer<?> opaque) {
        this.io.setPointerField(this, 62, opaque);
        return this;
    }

    @Field(63)
    public Pointer<av_format_control_message> control_message_cb() {
        return this.io.getPointerField(this, 63);
    }

    @Field(63)
    public AVFormatContext control_message_cb(Pointer<av_format_control_message> control_message_cb) {
        this.io.setPointerField(this, 63, control_message_cb);
        return this;
    }

    @Field(64)
    public long output_ts_offset() {
        return this.io.getLongField(this, 64);
    }

    @Field(64)
    public AVFormatContext output_ts_offset(long output_ts_offset) {
        this.io.setLongField(this, 64, output_ts_offset);
        return this;
    }

    @Field(65)
    public Pointer<Byte> dump_separator() {
        return this.io.getPointerField(this, 65);
    }

    @Field(65)
    public AVFormatContext dump_separator(Pointer<Byte> dump_separator) {
        this.io.setPointerField(this, 65, dump_separator);
        return this;
    }

    @Field(66)
    public IntValuedEnum<AVCodecID> data_codec_id() {
        return this.io.getEnumField(this, 66);
    }

    @Field(66)
    public AVFormatContext data_codec_id(IntValuedEnum<AVCodecID> data_codec_id) {
        this.io.setEnumField(this, 66, data_codec_id);
        return this;
    }

    /** @deprecated */
    @Field(67)
    public Pointer<AVFormatContext.open_cb_callback> open_cb() {
        return this.io.getPointerField(this, 67);
    }

    /** @deprecated */
    @Field(67)
    public AVFormatContext open_cb(Pointer<AVFormatContext.open_cb_callback> open_cb) {
        this.io.setPointerField(this, 67, open_cb);
        return this;
    }

    @Field(68)
    public Pointer<Byte> protocol_whitelist() {
        return this.io.getPointerField(this, 68);
    }

    @Field(68)
    public AVFormatContext protocol_whitelist(Pointer<Byte> protocol_whitelist) {
        this.io.setPointerField(this, 68, protocol_whitelist);
        return this;
    }

    @Field(69)
    public Pointer<AVFormatContext.io_open_callback> io_open() {
        return this.io.getPointerField(this, 69);
    }

    @Field(69)
    public AVFormatContext io_open(Pointer<AVFormatContext.io_open_callback> io_open) {
        this.io.setPointerField(this, 69, io_open);
        return this;
    }

    @Field(70)
    public Pointer<AVFormatContext.io_close_callback> io_close() {
        return this.io.getPointerField(this, 70);
    }

    @Field(70)
    public AVFormatContext io_close(Pointer<AVFormatContext.io_close_callback> io_close) {
        this.io.setPointerField(this, 70, io_close);
        return this;
    }

    @Field(71)
    public Pointer<Byte> protocol_blacklist() {
        return this.io.getPointerField(this, 71);
    }

    @Field(71)
    public AVFormatContext protocol_blacklist(Pointer<Byte> protocol_blacklist) {
        this.io.setPointerField(this, 71, protocol_blacklist);
        return this;
    }

    @Field(72)
    public int max_streams() {
        return this.io.getIntField(this, 72);
    }

    @Field(72)
    public AVFormatContext max_streams(int max_streams) {
        this.io.setIntField(this, 72, max_streams);
        return this;
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVFormatContext() {
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVFormatContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class io_close_callback extends Callback<AVFormatContext.io_close_callback> {
        public io_close_callback() {
        }

        public void apply(Pointer<AVFormatContext> s, Pointer<AVIOContext> pb) {
            this.apply(Pointer.getPeer(s), Pointer.getPeer(pb));
        }

        public void apply(@Ptr long s, @Ptr long pb) {
            this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(pb, AVIOContext.class));
        }
    }

    public abstract static class io_open_callback extends Callback<AVFormatContext.io_open_callback> {
        public io_open_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<Pointer> pb, Pointer<Byte> url, int flags, Pointer<Pointer> options) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(pb), Pointer.getPeer(url), flags, Pointer.getPeer(options));
        }

        public int apply(@Ptr long s, @Ptr long pb, @Ptr long url, int flags, @Ptr long options) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(pb, Pointer.class), Pointer.pointerToAddress(url, Byte.class), flags, Pointer.pointerToAddress(options, Pointer.class));
        }
    }

    public abstract static class open_cb_callback extends Callback<AVFormatContext.open_cb_callback> {
        public open_cb_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<Pointer> p, Pointer<Byte> url, int flags, Pointer<AVIOInterruptCB> int_cb, Pointer<Pointer> options) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(p), Pointer.getPeer(url), flags, Pointer.getPeer(int_cb), Pointer.getPeer(options));
        }

        public int apply(@Ptr long s, @Ptr long p, @Ptr long url, int flags, @Ptr long int_cb, @Ptr long options) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(p, Pointer.class), Pointer.pointerToAddress(url, Byte.class), flags, Pointer.pointerToAddress(int_cb, AVIOInterruptCB.class), Pointer.pointerToAddress(options, Pointer.class));
        }
    }
}
