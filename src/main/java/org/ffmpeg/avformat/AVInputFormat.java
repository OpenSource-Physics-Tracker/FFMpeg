//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avdevice.AVDeviceCapabilitiesQuery;
import org.ffmpeg.avdevice.AVDeviceInfoList;
import org.ffmpeg.avutil.AVClass;

@Library("avformat")
public class AVInputFormat extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVInputFormat name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> long_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVInputFormat long_name(Pointer<Byte> long_name) {
        this.io.setPointerField(this, 1, long_name);
        return this;
    }

    @Field(2)
    public int flags() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVInputFormat flags(int flags) {
        this.io.setIntField(this, 2, flags);
        return this;
    }

    @Field(3)
    public Pointer<Byte> extensions() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVInputFormat extensions(Pointer<Byte> extensions) {
        this.io.setPointerField(this, 3, extensions);
        return this;
    }

    @Field(4)
    public Pointer<Pointer<AVCodecTag>> codec_tag() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVInputFormat codec_tag(Pointer<Pointer<AVCodecTag>> codec_tag) {
        this.io.setPointerField(this, 4, codec_tag);
        return this;
    }

    @Field(5)
    public Pointer<AVClass> priv_class() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVInputFormat priv_class(Pointer<AVClass> priv_class) {
        this.io.setPointerField(this, 5, priv_class);
        return this;
    }

    @Field(6)
    public Pointer<Byte> mime_type() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVInputFormat mime_type(Pointer<Byte> mime_type) {
        this.io.setPointerField(this, 6, mime_type);
        return this;
    }

    @Field(7)
    public Pointer<AVInputFormat> next() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVInputFormat next(Pointer<AVInputFormat> next) {
        this.io.setPointerField(this, 7, next);
        return this;
    }

    @Field(8)
    public int raw_codec_id() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVInputFormat raw_codec_id(int raw_codec_id) {
        this.io.setIntField(this, 8, raw_codec_id);
        return this;
    }

    @Field(9)
    public int priv_data_size() {
        return this.io.getIntField(this, 9);
    }

    @Field(9)
    public AVInputFormat priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 9, priv_data_size);
        return this;
    }

    @Field(10)
    public Pointer<AVInputFormat.read_probe_callback> read_probe() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVInputFormat read_probe(Pointer<AVInputFormat.read_probe_callback> read_probe) {
        this.io.setPointerField(this, 10, read_probe);
        return this;
    }

    @Field(11)
    public Pointer<AVInputFormat.read_header_callback> read_header() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public AVInputFormat read_header(Pointer<AVInputFormat.read_header_callback> read_header) {
        this.io.setPointerField(this, 11, read_header);
        return this;
    }

    @Field(12)
    public Pointer<AVInputFormat.read_packet_callback> read_packet() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public AVInputFormat read_packet(Pointer<AVInputFormat.read_packet_callback> read_packet) {
        this.io.setPointerField(this, 12, read_packet);
        return this;
    }

    @Field(13)
    public Pointer<AVInputFormat.read_close_callback> read_close() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public AVInputFormat read_close(Pointer<AVInputFormat.read_close_callback> read_close) {
        this.io.setPointerField(this, 13, read_close);
        return this;
    }

    @Field(14)
    public Pointer<AVInputFormat.read_seek_callback> read_seek() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public AVInputFormat read_seek(Pointer<AVInputFormat.read_seek_callback> read_seek) {
        this.io.setPointerField(this, 14, read_seek);
        return this;
    }

    @Field(15)
    public Pointer<AVInputFormat.read_timestamp_callback> read_timestamp() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVInputFormat read_timestamp(Pointer<AVInputFormat.read_timestamp_callback> read_timestamp) {
        this.io.setPointerField(this, 15, read_timestamp);
        return this;
    }

    @Field(16)
    public Pointer<AVInputFormat.read_play_callback> read_play() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public AVInputFormat read_play(Pointer<AVInputFormat.read_play_callback> read_play) {
        this.io.setPointerField(this, 16, read_play);
        return this;
    }

    @Field(17)
    public Pointer<AVInputFormat.read_pause_callback> read_pause() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public AVInputFormat read_pause(Pointer<AVInputFormat.read_pause_callback> read_pause) {
        this.io.setPointerField(this, 17, read_pause);
        return this;
    }

    @Field(18)
    public Pointer<AVInputFormat.read_seek2_callback> read_seek2() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVInputFormat read_seek2(Pointer<AVInputFormat.read_seek2_callback> read_seek2) {
        this.io.setPointerField(this, 18, read_seek2);
        return this;
    }

    @Field(19)
    public Pointer<AVInputFormat.get_device_list_callback> get_device_list() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public AVInputFormat get_device_list(Pointer<AVInputFormat.get_device_list_callback> get_device_list) {
        this.io.setPointerField(this, 19, get_device_list);
        return this;
    }

    @Field(20)
    public Pointer<AVInputFormat.create_device_capabilities_callback> create_device_capabilities() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    public AVInputFormat create_device_capabilities(Pointer<AVInputFormat.create_device_capabilities_callback> create_device_capabilities) {
        this.io.setPointerField(this, 20, create_device_capabilities);
        return this;
    }

    @Field(21)
    public Pointer<AVInputFormat.free_device_capabilities_callback> free_device_capabilities() {
        return this.io.getPointerField(this, 21);
    }

    @Field(21)
    public AVInputFormat free_device_capabilities(Pointer<AVInputFormat.free_device_capabilities_callback> free_device_capabilities) {
        this.io.setPointerField(this, 21, free_device_capabilities);
        return this;
    }

    public AVInputFormat() {
    }

    public AVInputFormat(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class create_device_capabilities_callback extends Callback<AVInputFormat.create_device_capabilities_callback> {
        public create_device_capabilities_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceCapabilitiesQuery> caps) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(caps));
        }

        public int apply(@Ptr long s, @Ptr long caps) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(caps, AVDeviceCapabilitiesQuery.class));
        }
    }

    public abstract static class free_device_capabilities_callback extends Callback<AVInputFormat.free_device_capabilities_callback> {
        public free_device_capabilities_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceCapabilitiesQuery> caps) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(caps));
        }

        public int apply(@Ptr long s, @Ptr long caps) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(caps, AVDeviceCapabilitiesQuery.class));
        }
    }

    public abstract static class get_device_list_callback extends Callback<AVInputFormat.get_device_list_callback> {
        public get_device_list_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, Pointer<AVDeviceInfoList> device_list) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(device_list));
        }

        public int apply(@Ptr long s, @Ptr long device_list) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), Pointer.pointerToAddress(device_list, AVDeviceInfoList.class));
        }
    }

    public abstract static class read_close_callback extends Callback<AVInputFormat.read_close_callback> {
        public read_close_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class read_header_callback extends Callback<AVInputFormat.read_header_callback> {
        public read_header_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class read_packet_callback extends Callback<AVInputFormat.read_packet_callback> {
        public read_packet_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, Pointer<AVPacket> pkt) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), Pointer.getPeer(pkt));
        }

        public int apply(@Ptr long AVFormatContextPtr1, @Ptr long pkt) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), Pointer.pointerToAddress(pkt, AVPacket.class));
        }
    }

    public abstract static class read_pause_callback extends Callback<AVInputFormat.read_pause_callback> {
        public read_pause_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class read_play_callback extends Callback<AVInputFormat.read_play_callback> {
        public read_play_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1));
        }

        public int apply(@Ptr long AVFormatContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class));
        }
    }

    public abstract static class read_probe_callback extends Callback<AVInputFormat.read_probe_callback> {
        public read_probe_callback() {
        }

        public int apply(Pointer<AVProbeData> AVProbeDataPtr1) {
            return this.apply(Pointer.getPeer(AVProbeDataPtr1));
        }

        public int apply(@Ptr long AVProbeDataPtr1) {
            return this.apply(Pointer.pointerToAddress(AVProbeDataPtr1, AVProbeData.class));
        }
    }

    public abstract static class read_seek2_callback extends Callback<AVInputFormat.read_seek2_callback> {
        public read_seek2_callback() {
        }

        public int apply(Pointer<AVFormatContext> s, int stream_index, long min_ts, long ts, long max_ts, int flags) {
            return this.apply(Pointer.getPeer(s), stream_index, min_ts, ts, max_ts, flags);
        }

        public int apply(@Ptr long s, int stream_index, long min_ts, long ts, long max_ts, int flags) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), stream_index, min_ts, ts, max_ts, flags);
        }
    }

    public abstract static class read_seek_callback extends Callback<AVInputFormat.read_seek_callback> {
        public read_seek_callback() {
        }

        public int apply(Pointer<AVFormatContext> AVFormatContextPtr1, int stream_index, long timestamp, int flags) {
            return this.apply(Pointer.getPeer(AVFormatContextPtr1), stream_index, timestamp, flags);
        }

        public int apply(@Ptr long AVFormatContextPtr1, int stream_index, long timestamp, int flags) {
            return this.apply(Pointer.pointerToAddress(AVFormatContextPtr1, AVFormatContext.class), stream_index, timestamp, flags);
        }
    }

    public abstract static class read_timestamp_callback extends Callback<AVInputFormat.read_timestamp_callback> {
        public read_timestamp_callback() {
        }

        public long apply(Pointer<AVFormatContext> s, int stream_index, Pointer<Long> pos, long pos_limit) {
            return this.apply(Pointer.getPeer(s), stream_index, Pointer.getPeer(pos), pos_limit);
        }

        public long apply(@Ptr long s, int stream_index, @Ptr long pos, long pos_limit) {
            return this.apply(Pointer.pointerToAddress(s, AVFormatContext.class), stream_index, Pointer.pointerToAddress(pos, Long.class), pos_limit);
        }
    }
}
