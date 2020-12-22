//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avdevice.AVDeviceCapabilitiesQuery;
import org.ffmpeg.avdevice.AVDeviceInfoList;
import org.ffmpeg.avutil.AVClass;

@Library("avformat")
public class AVOutputFormat extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVOutputFormat name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> long_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVOutputFormat long_name(Pointer<Byte> long_name) {
        this.io.setPointerField(this, 1, long_name);
        return this;
    }

    @Field(2)
    public Pointer<Byte> mime_type() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVOutputFormat mime_type(Pointer<Byte> mime_type) {
        this.io.setPointerField(this, 2, mime_type);
        return this;
    }

    @Field(3)
    public Pointer<Byte> extensions() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVOutputFormat extensions(Pointer<Byte> extensions) {
        this.io.setPointerField(this, 3, extensions);
        return this;
    }

    @Field(4)
    public IntValuedEnum<AVCodecID> audio_codec() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public AVOutputFormat audio_codec(IntValuedEnum<AVCodecID> audio_codec) {
        this.io.setEnumField(this, 4, audio_codec);
        return this;
    }

    @Field(5)
    public IntValuedEnum<AVCodecID> video_codec() {
        return this.io.getEnumField(this, 5);
    }

    @Field(5)
    public AVOutputFormat video_codec(IntValuedEnum<AVCodecID> video_codec) {
        this.io.setEnumField(this, 5, video_codec);
        return this;
    }

    @Field(6)
    public IntValuedEnum<AVCodecID> subtitle_codec() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    public AVOutputFormat subtitle_codec(IntValuedEnum<AVCodecID> subtitle_codec) {
        this.io.setEnumField(this, 6, subtitle_codec);
        return this;
    }

    @Field(7)
    public int flags() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVOutputFormat flags(int flags) {
        this.io.setIntField(this, 7, flags);
        return this;
    }

    @Field(8)
    public Pointer<Pointer<AVCodecTag>> codec_tag() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVOutputFormat codec_tag(Pointer<Pointer<AVCodecTag>> codec_tag) {
        this.io.setPointerField(this, 8, codec_tag);
        return this;
    }

    @Field(9)
    public Pointer<AVClass> priv_class() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVOutputFormat priv_class(Pointer<AVClass> priv_class) {
        this.io.setPointerField(this, 9, priv_class);
        return this;
    }

    @Field(10)
    public Pointer<AVOutputFormat> next() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVOutputFormat next(Pointer<AVOutputFormat> next) {
        this.io.setPointerField(this, 10, next);
        return this;
    }

    @Field(11)
    public int priv_data_size() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVOutputFormat priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 11, priv_data_size);
        return this;
    }

    @Field(12)
    public Pointer<AVOutputFormat.write_header_callback> write_header() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public AVOutputFormat write_header(Pointer<AVOutputFormat.write_header_callback> write_header) {
        this.io.setPointerField(this, 12, write_header);
        return this;
    }

    @Field(13)
    public Pointer<AVOutputFormat.write_packet_callback> write_packet() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public AVOutputFormat write_packet(Pointer<AVOutputFormat.write_packet_callback> write_packet) {
        this.io.setPointerField(this, 13, write_packet);
        return this;
    }

    @Field(14)
    public Pointer<AVOutputFormat.write_trailer_callback> write_trailer() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public AVOutputFormat write_trailer(Pointer<AVOutputFormat.write_trailer_callback> write_trailer) {
        this.io.setPointerField(this, 14, write_trailer);
        return this;
    }

    @Field(15)
    public Pointer<AVOutputFormat.interleave_packet_callback> interleave_packet() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVOutputFormat interleave_packet(Pointer<AVOutputFormat.interleave_packet_callback> interleave_packet) {
        this.io.setPointerField(this, 15, interleave_packet);
        return this;
    }

    @Field(16)
    public Pointer<AVOutputFormat.query_codec_callback> query_codec() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public AVOutputFormat query_codec(Pointer<AVOutputFormat.query_codec_callback> query_codec) {
        this.io.setPointerField(this, 16, query_codec);
        return this;
    }

    @Field(17)
    public Pointer<AVOutputFormat.get_output_timestamp_callback> get_output_timestamp() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public AVOutputFormat get_output_timestamp(Pointer<AVOutputFormat.get_output_timestamp_callback> get_output_timestamp) {
        this.io.setPointerField(this, 17, get_output_timestamp);
        return this;
    }

    @Field(18)
    public Pointer<AVOutputFormat.control_message_callback> control_message() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVOutputFormat control_message(Pointer<AVOutputFormat.control_message_callback> control_message) {
        this.io.setPointerField(this, 18, control_message);
        return this;
    }

    @Field(19)
    public Pointer<AVOutputFormat.write_uncoded_frame_callback> write_uncoded_frame() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public AVOutputFormat write_uncoded_frame(Pointer<AVOutputFormat.write_uncoded_frame_callback> write_uncoded_frame) {
        this.io.setPointerField(this, 19, write_uncoded_frame);
        return this;
    }

    @Field(20)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.get_device_list_callback> get_device_list() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    public AVOutputFormat get_device_list(Pointer<org.ffmpeg.avformat.AVInputFormat.get_device_list_callback> get_device_list) {
        this.io.setPointerField(this, 20, get_device_list);
        return this;
    }

    @Field(21)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.create_device_capabilities_callback> create_device_capabilities() {
        return this.io.getPointerField(this, 21);
    }

    @Field(21)
    public AVOutputFormat create_device_capabilities(Pointer<org.ffmpeg.avformat.AVInputFormat.create_device_capabilities_callback> create_device_capabilities) {
        this.io.setPointerField(this, 21, create_device_capabilities);
        return this;
    }

    @Field(22)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.free_device_capabilities_callback> free_device_capabilities() {
        return this.io.getPointerField(this, 22);
    }

    @Field(22)
    public AVOutputFormat free_device_capabilities(Pointer<org.ffmpeg.avformat.AVInputFormat.free_device_capabilities_callback> free_device_capabilities) {
        this.io.setPointerField(this, 22, free_device_capabilities);
        return this;
    }

    @Field(23)
    public IntValuedEnum<AVCodecID> data_codec() {
        return this.io.getEnumField(this, 23);
    }

    @Field(23)
    public AVOutputFormat data_codec(IntValuedEnum<AVCodecID> data_codec) {
        this.io.setEnumField(this, 23, data_codec);
        return this;
    }

    @Field(24)
    public Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init() {
        return this.io.getPointerField(this, 24);
    }

    @Field(24)
    public AVOutputFormat init(Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init) {
        this.io.setPointerField(this, 24, init);
        return this;
    }

    @Field(25)
    public Pointer<AVOutputFormat.deinit_callback> deinit() {
        return this.io.getPointerField(this, 25);
    }

    @Field(25)
    public AVOutputFormat deinit(Pointer<AVOutputFormat.deinit_callback> deinit) {
        this.io.setPointerField(this, 25, deinit);
        return this;
    }

    @Field(26)
    public Pointer<AVOutputFormat.check_bitstream_callback> check_bitstream() {
        return this.io.getPointerField(this, 26);
    }

    @Field(26)
    public AVOutputFormat check_bitstream(Pointer<AVOutputFormat.check_bitstream_callback> check_bitstream) {
        this.io.setPointerField(this, 26, check_bitstream);
        return this;
    }

    public AVOutputFormat() {
    }

    public AVOutputFormat(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class check_bitstream_callback extends Callback<AVOutputFormat.check_bitstream_callback> {
        public check_bitstream_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, Pointer<AVPacket> pkt) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), Pointer.getPeer(pkt));
        }

        public int apply(@Ptr long AVFormatContextPtr1, @Ptr long pkt) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), Pointer.pointerToAddress(pkt, AVPacket.class));
        }
    }

    public abstract static class control_message_callback extends Callback<AVOutputFormat.control_message_callback> {
        public control_message_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, int type, Pointer<?> data, @Ptr long data_size) {
            return this.apply(Pointer.getPeer(s), type, Pointer.getPeer(data), data_size);
        }

        public int apply(@Ptr long s, int type, @Ptr long data, @Ptr long data_size) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), type, Pointer.pointerToAddress(data), data_size);
        }
    }

    public abstract static class create_device_capabilities_callback extends Callback<AVOutputFormat.create_device_capabilities_callback> {
        public create_device_capabilities_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceCapabilitiesQuery> caps) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(caps));
        }

        public int apply(@Ptr long s, @Ptr long caps) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(caps, AVDeviceCapabilitiesQuery.class));
        }
    }

    public abstract static class deinit_callback extends Callback<AVOutputFormat.deinit_callback> {
        public deinit_callback() {
        }

        public void apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public void apply(@Ptr long AVFormatContextPtr1) {
            this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class free_device_capabilities_callback extends Callback<AVOutputFormat.free_device_capabilities_callback> {
        public free_device_capabilities_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceCapabilitiesQuery> caps) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(caps));
        }

        public int apply(@Ptr long s, @Ptr long caps) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(caps, AVDeviceCapabilitiesQuery.class));
        }
    }

    public abstract static class get_device_list_callback extends Callback<AVOutputFormat.get_device_list_callback> {
        public get_device_list_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceInfoList> device_list) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(device_list));
        }

        public int apply(@Ptr long s, @Ptr long device_list) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(device_list, AVDeviceInfoList.class));
        }
    }

    public abstract static class get_output_timestamp_callback extends Callback<AVOutputFormat.get_output_timestamp_callback> {
        public get_output_timestamp_callback() {
        }

        public void apply(Pointer<AVFormatContext> s, int stream, Pointer<Long> dts, Pointer<Long> wall) {
            this.apply(Pointer.getPeer(s), stream, Pointer.getPeer(dts), Pointer.getPeer(wall));
        }

        public void apply(@Ptr long s, int stream, @Ptr long dts, @Ptr long wall) {
            this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), stream, Pointer.pointerToAddress(dts, Long.class), Pointer.pointerToAddress(wall, Long.class));
        }
    }

    public abstract static class init_callback extends Callback<AVOutputFormat.init_callback> {
        public init_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class interleave_packet_callback extends Callback<AVOutputFormat.interleave_packet_callback> {
        public interleave_packet_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, Pointer<AVPacket> out, Pointer<AVPacket> in, int flush) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), Pointer.getPeer(out), Pointer.getPeer(in), flush);
        }

        public int apply(@Ptr long AVFormatContextPtr1, @Ptr long out, @Ptr long in, int flush) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), Pointer.pointerToAddress(out, AVPacket.class), Pointer.pointerToAddress(in, AVPacket.class), flush);
        }
    }

    public abstract static class query_codec_callback extends Callback<AVOutputFormat.query_codec_callback> {
        public query_codec_callback() {
        }

        public int apply(IntValuedEnum<AVCodecID> id, int std_compliance) {
            return this.apply((int)id.value(), std_compliance);
        }

        public int apply(int id, int std_compliance) {
            return this.apply(FlagSet.fromValue(id, AVCodecID.class), std_compliance);
        }
    }

    public abstract static class write_header_callback extends Callback<AVOutputFormat.write_header_callback> {
        public write_header_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class write_packet_callback extends Callback<AVOutputFormat.write_packet_callback> {
        public write_packet_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, Pointer<AVPacket> pkt) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), Pointer.getPeer(pkt));
        }

        public int apply(@Ptr long AVFormatContextPtr1, @Ptr long pkt) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), Pointer.pointerToAddress(pkt, AVPacket.class));
        }
    }

    public abstract static class write_trailer_callback extends Callback<AVOutputFormat.write_trailer_callback> {
        public write_trailer_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class write_uncoded_frame_callback extends Callback<AVOutputFormat.write_uncoded_frame_callback> {
        public write_uncoded_frame_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, int stream_index, Pointer<Pointer> frame, int flags) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), stream_index, Pointer.getPeer(frame), flags);
        }

        public int apply(@Ptr long AVFormatContextPtr1, int stream_index, @Ptr long frame, int flags) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), stream_index, Pointer.pointerToAddress(frame, Pointer.class), flags);
        }
    }
}
