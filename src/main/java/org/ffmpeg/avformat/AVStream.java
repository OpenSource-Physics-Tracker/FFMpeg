//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AVCodecContext;
import org.ffmpeg.avcodec.AVCodecParameters;
import org.ffmpeg.avcodec.AVCodecParserContext;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AVPacketSideData;
import org.ffmpeg.avcodec.AvcodecLibrary.AVDiscard;
import org.ffmpeg.avformat.AvformatLibrary.AVStreamParseType;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVRational;

@Library("avformat")
public class AVStream extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int index() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVStream index(int index) {
        this.io.setIntField(this, 0, index);
        return this;
    }

    @Field(1)
    public int id() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVStream id(int id) {
        this.io.setIntField(this, 1, id);
        return this;
    }

    /** @deprecated */
    @Field(2)
    public Pointer<AVCodecContext> codec() {
        return this.io.getPointerField(this, 2);
    }

    /** @deprecated */
    @Field(2)
    public AVStream codec(Pointer<AVCodecContext> codec) {
        this.io.setPointerField(this, 2, codec);
        return this;
    }

    @Field(3)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVStream priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 3, priv_data);
        return this;
    }

    @Field(4)
    public AVRational time_base() {
        return (AVRational)this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public AVStream time_base(AVRational time_base) {
        this.io.setNativeObjectField(this, 4, time_base);
        return this;
    }

    @Field(5)
    public long start_time() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public AVStream start_time(long start_time) {
        this.io.setLongField(this, 5, start_time);
        return this;
    }

    @Field(6)
    public long duration() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public AVStream duration(long duration) {
        this.io.setLongField(this, 6, duration);
        return this;
    }

    @Field(7)
    public long nb_frames() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public AVStream nb_frames(long nb_frames) {
        this.io.setLongField(this, 7, nb_frames);
        return this;
    }

    @Field(8)
    public int disposition() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVStream disposition(int disposition) {
        this.io.setIntField(this, 8, disposition);
        return this;
    }

    @Field(9)
    public IntValuedEnum<AVDiscard> discard() {
        return this.io.getEnumField(this, 9);
    }

    @Field(9)
    public AVStream discard(IntValuedEnum<AVDiscard> discard) {
        this.io.setEnumField(this, 9, discard);
        return this;
    }

    @Field(10)
    public AVRational sample_aspect_ratio() {
        return (AVRational)this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public AVStream sample_aspect_ratio(AVRational sample_aspect_ratio) {
        this.io.setNativeObjectField(this, 10, sample_aspect_ratio);
        return this;
    }

    @Field(11)
    public Pointer<AVDictionary> metadata() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public AVStream metadata(Pointer<AVDictionary> metadata) {
        this.io.setPointerField(this, 11, metadata);
        return this;
    }

    @Field(12)
    public AVRational avg_frame_rate() {
        return (AVRational)this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public AVStream avg_frame_rate(AVRational avg_frame_rate) {
        this.io.setNativeObjectField(this, 12, avg_frame_rate);
        return this;
    }

    @Field(13)
    public AVPacket attached_pic() {
        return (AVPacket)this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public AVStream attached_pic(AVPacket attached_pic) {
        this.io.setNativeObjectField(this, 13, attached_pic);
        return this;
    }

    @Field(14)
    public Pointer<AVPacketSideData> side_data() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public AVStream side_data(Pointer<AVPacketSideData> side_data) {
        this.io.setPointerField(this, 14, side_data);
        return this;
    }

    @Field(15)
    public int nb_side_data() {
        return this.io.getIntField(this, 15);
    }

    @Field(15)
    public AVStream nb_side_data(int nb_side_data) {
        this.io.setIntField(this, 15, nb_side_data);
        return this;
    }

    @Field(16)
    public int event_flags() {
        return this.io.getIntField(this, 16);
    }

    @Field(16)
    public AVStream event_flags(int event_flags) {
        this.io.setIntField(this, 16, event_flags);
        return this;
    }

    @Field(17)
    public AVRational r_frame_rate() {
        return (AVRational)this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public AVStream r_frame_rate(AVRational r_frame_rate) {
        this.io.setNativeObjectField(this, 17, r_frame_rate);
        return this;
    }

    @Field(18)
    public Pointer<Byte> recommended_encoder_configuration() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVStream recommended_encoder_configuration(Pointer<Byte> recommended_encoder_configuration) {
        this.io.setPointerField(this, 18, recommended_encoder_configuration);
        return this;
    }

    @Field(19)
    public Pointer<AVCodecParameters> codecpar() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public AVStream codecpar(Pointer<AVCodecParameters> codecpar) {
        this.io.setPointerField(this, 19, codecpar);
        return this;
    }

    @Field(20)
    public Pointer<AVStream.info_struct> info() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    public AVStream info(Pointer<AVStream.info_struct> info) {
        this.io.setPointerField(this, 20, info);
        return this;
    }

    @Field(21)
    public int pts_wrap_bits() {
        return this.io.getIntField(this, 21);
    }

    @Field(21)
    public AVStream pts_wrap_bits(int pts_wrap_bits) {
        this.io.setIntField(this, 21, pts_wrap_bits);
        return this;
    }

    @Field(22)
    public long first_dts() {
        return this.io.getLongField(this, 22);
    }

    @Field(22)
    public AVStream first_dts(long first_dts) {
        this.io.setLongField(this, 22, first_dts);
        return this;
    }

    @Field(23)
    public long cur_dts() {
        return this.io.getLongField(this, 23);
    }

    @Field(23)
    public AVStream cur_dts(long cur_dts) {
        this.io.setLongField(this, 23, cur_dts);
        return this;
    }

    @Field(24)
    public long last_IP_pts() {
        return this.io.getLongField(this, 24);
    }

    @Field(24)
    public AVStream last_IP_pts(long last_IP_pts) {
        this.io.setLongField(this, 24, last_IP_pts);
        return this;
    }

    @Field(25)
    public int last_IP_duration() {
        return this.io.getIntField(this, 25);
    }

    @Field(25)
    public AVStream last_IP_duration(int last_IP_duration) {
        this.io.setIntField(this, 25, last_IP_duration);
        return this;
    }

    @Field(26)
    public int probe_packets() {
        return this.io.getIntField(this, 26);
    }

    @Field(26)
    public AVStream probe_packets(int probe_packets) {
        this.io.setIntField(this, 26, probe_packets);
        return this;
    }

    @Field(27)
    public int codec_info_nb_frames() {
        return this.io.getIntField(this, 27);
    }

    @Field(27)
    public AVStream codec_info_nb_frames(int codec_info_nb_frames) {
        this.io.setIntField(this, 27, codec_info_nb_frames);
        return this;
    }

    @Field(28)
    public IntValuedEnum<AVStreamParseType> need_parsing() {
        return this.io.getEnumField(this, 28);
    }

    @Field(28)
    public AVStream need_parsing(IntValuedEnum<AVStreamParseType> need_parsing) {
        this.io.setEnumField(this, 28, need_parsing);
        return this;
    }

    @Field(29)
    public Pointer<AVCodecParserContext> parser() {
        return this.io.getPointerField(this, 29);
    }

    @Field(29)
    public AVStream parser(Pointer<AVCodecParserContext> parser) {
        this.io.setPointerField(this, 29, parser);
        return this;
    }

    @Field(30)
    public Pointer<AVPacketList> last_in_packet_buffer() {
        return this.io.getPointerField(this, 30);
    }

    @Field(30)
    public AVStream last_in_packet_buffer(Pointer<AVPacketList> last_in_packet_buffer) {
        this.io.setPointerField(this, 30, last_in_packet_buffer);
        return this;
    }

    @Field(31)
    public AVProbeData probe_data() {
        return (AVProbeData)this.io.getNativeObjectField(this, 31);
    }

    @Field(31)
    public AVStream probe_data(AVProbeData probe_data) {
        this.io.setNativeObjectField(this, 31, probe_data);
        return this;
    }

    @Array({17L})
    @Field(32)
    public Pointer<Long> pts_buffer() {
        return this.io.getPointerField(this, 32);
    }

    @Field(33)
    public Pointer<AVIndexEntry> index_entries() {
        return this.io.getPointerField(this, 33);
    }

    @Field(33)
    public AVStream index_entries(Pointer<AVIndexEntry> index_entries) {
        this.io.setPointerField(this, 33, index_entries);
        return this;
    }

    @Field(34)
    public int nb_index_entries() {
        return this.io.getIntField(this, 34);
    }

    @Field(34)
    public AVStream nb_index_entries(int nb_index_entries) {
        this.io.setIntField(this, 34, nb_index_entries);
        return this;
    }

    @Field(35)
    public int index_entries_allocated_size() {
        return this.io.getIntField(this, 35);
    }

    @Field(35)
    public AVStream index_entries_allocated_size(int index_entries_allocated_size) {
        this.io.setIntField(this, 35, index_entries_allocated_size);
        return this;
    }

    @Field(36)
    public int stream_identifier() {
        return this.io.getIntField(this, 36);
    }

    @Field(36)
    public AVStream stream_identifier(int stream_identifier) {
        this.io.setIntField(this, 36, stream_identifier);
        return this;
    }

    @Field(37)
    public long interleaver_chunk_size() {
        return this.io.getLongField(this, 37);
    }

    @Field(37)
    public AVStream interleaver_chunk_size(long interleaver_chunk_size) {
        this.io.setLongField(this, 37, interleaver_chunk_size);
        return this;
    }

    @Field(38)
    public long interleaver_chunk_duration() {
        return this.io.getLongField(this, 38);
    }

    @Field(38)
    public AVStream interleaver_chunk_duration(long interleaver_chunk_duration) {
        this.io.setLongField(this, 38, interleaver_chunk_duration);
        return this;
    }

    @Field(39)
    public int request_probe() {
        return this.io.getIntField(this, 39);
    }

    @Field(39)
    public AVStream request_probe(int request_probe) {
        this.io.setIntField(this, 39, request_probe);
        return this;
    }

    @Field(40)
    public int skip_to_keyframe() {
        return this.io.getIntField(this, 40);
    }

    @Field(40)
    public AVStream skip_to_keyframe(int skip_to_keyframe) {
        this.io.setIntField(this, 40, skip_to_keyframe);
        return this;
    }

    @Field(41)
    public int skip_samples() {
        return this.io.getIntField(this, 41);
    }

    @Field(41)
    public AVStream skip_samples(int skip_samples) {
        this.io.setIntField(this, 41, skip_samples);
        return this;
    }

    @Field(42)
    public long start_skip_samples() {
        return this.io.getLongField(this, 42);
    }

    @Field(42)
    public AVStream start_skip_samples(long start_skip_samples) {
        this.io.setLongField(this, 42, start_skip_samples);
        return this;
    }

    @Field(43)
    public long first_discard_sample() {
        return this.io.getLongField(this, 43);
    }

    @Field(43)
    public AVStream first_discard_sample(long first_discard_sample) {
        this.io.setLongField(this, 43, first_discard_sample);
        return this;
    }

    @Field(44)
    public long last_discard_sample() {
        return this.io.getLongField(this, 44);
    }

    @Field(44)
    public AVStream last_discard_sample(long last_discard_sample) {
        this.io.setLongField(this, 44, last_discard_sample);
        return this;
    }

    @Field(45)
    public int nb_decoded_frames() {
        return this.io.getIntField(this, 45);
    }

    @Field(45)
    public AVStream nb_decoded_frames(int nb_decoded_frames) {
        this.io.setIntField(this, 45, nb_decoded_frames);
        return this;
    }

    @Field(46)
    public long mux_ts_offset() {
        return this.io.getLongField(this, 46);
    }

    @Field(46)
    public AVStream mux_ts_offset(long mux_ts_offset) {
        this.io.setLongField(this, 46, mux_ts_offset);
        return this;
    }

    @Field(47)
    public long pts_wrap_reference() {
        return this.io.getLongField(this, 47);
    }

    @Field(47)
    public AVStream pts_wrap_reference(long pts_wrap_reference) {
        this.io.setLongField(this, 47, pts_wrap_reference);
        return this;
    }

    @Field(48)
    public int pts_wrap_behavior() {
        return this.io.getIntField(this, 48);
    }

    @Field(48)
    public AVStream pts_wrap_behavior(int pts_wrap_behavior) {
        this.io.setIntField(this, 48, pts_wrap_behavior);
        return this;
    }

    @Field(49)
    public int update_initial_durations_done() {
        return this.io.getIntField(this, 49);
    }

    @Field(49)
    public AVStream update_initial_durations_done(int update_initial_durations_done) {
        this.io.setIntField(this, 49, update_initial_durations_done);
        return this;
    }

    @Array({17L})
    @Field(50)
    public Pointer<Long> pts_reorder_error() {
        return this.io.getPointerField(this, 50);
    }

    @Array({17L})
    @Field(51)
    public Pointer<Byte> pts_reorder_error_count() {
        return this.io.getPointerField(this, 51);
    }

    @Field(52)
    public long last_dts_for_order_check() {
        return this.io.getLongField(this, 52);
    }

    @Field(52)
    public AVStream last_dts_for_order_check(long last_dts_for_order_check) {
        this.io.setLongField(this, 52, last_dts_for_order_check);
        return this;
    }

    @Field(53)
    public byte dts_ordered() {
        return this.io.getByteField(this, 53);
    }

    @Field(53)
    public AVStream dts_ordered(byte dts_ordered) {
        this.io.setByteField(this, 53, dts_ordered);
        return this;
    }

    @Field(54)
    public byte dts_misordered() {
        return this.io.getByteField(this, 54);
    }

    @Field(54)
    public AVStream dts_misordered(byte dts_misordered) {
        this.io.setByteField(this, 54, dts_misordered);
        return this;
    }

    @Field(55)
    public int inject_global_side_data() {
        return this.io.getIntField(this, 55);
    }

    @Field(55)
    public AVStream inject_global_side_data(int inject_global_side_data) {
        this.io.setIntField(this, 55, inject_global_side_data);
        return this;
    }

    @Field(56)
    public AVRational display_aspect_ratio() {
        return (AVRational)this.io.getNativeObjectField(this, 56);
    }

    @Field(56)
    public AVStream display_aspect_ratio(AVRational display_aspect_ratio) {
        this.io.setNativeObjectField(this, 56, display_aspect_ratio);
        return this;
    }

    @Field(57)
    public Pointer<AVStreamInternal> internal() {
        return this.io.getPointerField(this, 57);
    }

    @Field(57)
    public AVStream internal(Pointer<AVStreamInternal> internal) {
        this.io.setPointerField(this, 57, internal);
        return this;
    }

    public AVStream() {
    }

    public AVStream(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public static class info_struct extends StructObject {
        static {
            BridJ.register();
        }

        @Field(0)
        public long last_dts() {
            return this.io.getLongField(this, 0);
        }

        @Field(0)
        public AVStream.info_struct last_dts(long last_dts) {
            this.io.setLongField(this, 0, last_dts);
            return this;
        }

        @Field(1)
        public long duration_gcd() {
            return this.io.getLongField(this, 1);
        }

        @Field(1)
        public AVStream.info_struct duration_gcd(long duration_gcd) {
            this.io.setLongField(this, 1, duration_gcd);
            return this;
        }

        @Field(2)
        public int duration_count() {
            return this.io.getIntField(this, 2);
        }

        @Field(2)
        public AVStream.info_struct duration_count(int duration_count) {
            this.io.setIntField(this, 2, duration_count);
            return this;
        }

        @Field(3)
        public long rfps_duration_sum() {
            return this.io.getLongField(this, 3);
        }

        @Field(3)
        public AVStream.info_struct rfps_duration_sum(long rfps_duration_sum) {
            this.io.setLongField(this, 3, rfps_duration_sum);
            return this;
        }

        @Field(4)
        public Pointer<Pointer<Double>> duration_error() {
            return this.io.getPointerField(this, 4);
        }

        @Field(4)
        public AVStream.info_struct duration_error(Pointer<Pointer<Double>> duration_error) {
            this.io.setPointerField(this, 4, duration_error);
            return this;
        }

        @Field(5)
        public long codec_info_duration() {
            return this.io.getLongField(this, 5);
        }

        @Field(5)
        public AVStream.info_struct codec_info_duration(long codec_info_duration) {
            this.io.setLongField(this, 5, codec_info_duration);
            return this;
        }

        @Field(6)
        public long codec_info_duration_fields() {
            return this.io.getLongField(this, 6);
        }

        @Field(6)
        public AVStream.info_struct codec_info_duration_fields(long codec_info_duration_fields) {
            this.io.setLongField(this, 6, codec_info_duration_fields);
            return this;
        }

        @Field(7)
        public int frame_delay_evidence() {
            return this.io.getIntField(this, 7);
        }

        @Field(7)
        public AVStream.info_struct frame_delay_evidence(int frame_delay_evidence) {
            this.io.setIntField(this, 7, frame_delay_evidence);
            return this;
        }

        @Field(8)
        public int found_decoder() {
            return this.io.getIntField(this, 8);
        }

        @Field(8)
        public AVStream.info_struct found_decoder(int found_decoder) {
            this.io.setIntField(this, 8, found_decoder);
            return this;
        }

        @Field(9)
        public long last_duration() {
            return this.io.getLongField(this, 9);
        }

        @Field(9)
        public AVStream.info_struct last_duration(long last_duration) {
            this.io.setLongField(this, 9, last_duration);
            return this;
        }

        @Field(10)
        public long fps_first_dts() {
            return this.io.getLongField(this, 10);
        }

        @Field(10)
        public AVStream.info_struct fps_first_dts(long fps_first_dts) {
            this.io.setLongField(this, 10, fps_first_dts);
            return this;
        }

        @Field(11)
        public int fps_first_dts_idx() {
            return this.io.getIntField(this, 11);
        }

        @Field(11)
        public AVStream.info_struct fps_first_dts_idx(int fps_first_dts_idx) {
            this.io.setIntField(this, 11, fps_first_dts_idx);
            return this;
        }

        @Field(12)
        public long fps_last_dts() {
            return this.io.getLongField(this, 12);
        }

        @Field(12)
        public AVStream.info_struct fps_last_dts(long fps_last_dts) {
            this.io.setLongField(this, 12, fps_last_dts);
            return this;
        }

        @Field(13)
        public int fps_last_dts_idx() {
            return this.io.getIntField(this, 13);
        }

        @Field(13)
        public AVStream.info_struct fps_last_dts_idx(int fps_last_dts_idx) {
            this.io.setIntField(this, 13, fps_last_dts_idx);
            return this;
        }

        public info_struct() {
        }

        public info_struct(Pointer pointer) {
            super(pointer, new Object[0]);
        }
    }
}
