package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;

@Library("avcodec")
public abstract class AVCodec extends StructObject {
    static {
        BridJ.register();
    }

    public AVCodec() {
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVCodec name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> long_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVCodec long_name(Pointer<Byte> long_name) {
        this.io.setPointerField(this, 1, long_name);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVMediaType> type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVCodec type(IntValuedEnum<AVMediaType> type) {
        this.io.setEnumField(this, 2, type);
        return this;
    }

    @Field(3)
    public IntValuedEnum<AVCodecID> id() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public AVCodec id(IntValuedEnum<AVCodecID> id) {
        this.io.setEnumField(this, 3, id);
        return this;
    }

    @Field(4)
    public int capabilities() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVCodec capabilities(int capabilities) {
        this.io.setIntField(this, 4, capabilities);
        return this;
    }

    @Field(5)
    public Pointer<AVRational> supported_framerates() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVCodec supported_framerates(Pointer<AVRational> supported_framerates) {
        this.io.setPointerField(this, 5, supported_framerates);
        return this;
    }

    @Field(6)
    public Pointer<IntValuedEnum<AVPixelFormat>> pix_fmts() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVCodec pix_fmts(Pointer<IntValuedEnum<AVPixelFormat>> pix_fmts) {
        this.io.setPointerField(this, 6, pix_fmts);
        return this;
    }

    @Field(7)
    public Pointer<Integer> supported_samplerates() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVCodec supported_samplerates(Pointer<Integer> supported_samplerates) {
        this.io.setPointerField(this, 7, supported_samplerates);
        return this;
    }

    @Field(8)
    public Pointer<IntValuedEnum<AVSampleFormat>> sample_fmts() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVCodec sample_fmts(Pointer<IntValuedEnum<AVSampleFormat>> sample_fmts) {
        this.io.setPointerField(this, 8, sample_fmts);
        return this;
    }

    @Field(9)
    public Pointer<Long> channel_layouts() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVCodec channel_layouts(Pointer<Long> channel_layouts) {
        this.io.setPointerField(this, 9, channel_layouts);
        return this;
    }

    @Field(10)
    public byte max_lowres() {
        return this.io.getByteField(this, 10);
    }

    @Field(10)
    public AVCodec max_lowres(byte max_lowres) {
        this.io.setByteField(this, 10, max_lowres);
        return this;
    }

    @Field(11)
    public Pointer<AVClass> priv_class() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public AVCodec priv_class(Pointer<AVClass> priv_class) {
        this.io.setPointerField(this, 11, priv_class);
        return this;
    }

    @Field(12)
    public Pointer<AVProfile> profiles() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public AVCodec profiles(Pointer<AVProfile> profiles) {
        this.io.setPointerField(this, 12, profiles);
        return this;
    }

    @Field(13)
    public Pointer<Byte> wrapper_name() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public AVCodec wrapper_name(Pointer<Byte> wrapper_name) {
        this.io.setPointerField(this, 13, wrapper_name);
        return this;
    }

    @Field(14)
    public int priv_data_size() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public AVCodec priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 14, priv_data_size);
        return this;
    }

    @Field(15)
    public Pointer<AVCodec> next() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVCodec next(Pointer<AVCodec> next) {
        this.io.setPointerField(this, 15, next);
        return this;
    }

    @Field(16)
    public Pointer<AVCodec.init_thread_copy_callback> init_thread_copy() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public AVCodec init_thread_copy(Pointer<AVCodec.init_thread_copy_callback> init_thread_copy) {
        this.io.setPointerField(this, 16, init_thread_copy);
        return this;
    }

    @Field(17)
    public Pointer<AVCodec.update_thread_context_callback> update_thread_context() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public AVCodec update_thread_context(Pointer<AVCodec.update_thread_context_callback> update_thread_context) {
        this.io.setPointerField(this, 17, update_thread_context);
        return this;
    }

    @Field(18)
    public Pointer<AVCodecDefault> defaults() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVCodec defaults(Pointer<AVCodecDefault> defaults) {
        this.io.setPointerField(this, 18, defaults);
        return this;
    }

    @Field(19)
    public Pointer<AVCodec.init_static_data_callback> init_static_data() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public AVCodec init_static_data(Pointer<AVCodec.init_static_data_callback> init_static_data) {
        this.io.setPointerField(this, 19, init_static_data);
        return this;
    }

    @Field(20)
    public Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    public AVCodec init(Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init) {
        this.io.setPointerField(this, 20, init);
        return this;
    }

    @Field(21)
    public Pointer<AVCodec.encode_sub_callback> encode_sub() {
        return this.io.getPointerField(this, 21);
    }

    @Field(21)
    public AVCodec encode_sub(Pointer<AVCodec.encode_sub_callback> encode_sub) {
        this.io.setPointerField(this, 21, encode_sub);
        return this;
    }

    @Field(22)
    public Pointer<AVCodec.encode2_callback> encode2() {
        return this.io.getPointerField(this, 22);
    }

    @Field(22)
    public AVCodec encode2(Pointer<AVCodec.encode2_callback> encode2) {
        this.io.setPointerField(this, 22, encode2);
        return this;
    }

    @Field(23)
    public Pointer<AVCodec.decode_callback> decode() {
        return this.io.getPointerField(this, 23);
    }

    @Field(23)
    public AVCodec decode(Pointer<AVCodec.decode_callback> decode) {
        this.io.setPointerField(this, 23, decode);
        return this;
    }

    @Field(24)
    public Pointer<org.ffmpeg.avcodec.AVBitStreamFilter.close_callback> close() {
        return this.io.getPointerField(this, 24);
    }

    @Field(24)
    public AVCodec close(Pointer<org.ffmpeg.avcodec.AVBitStreamFilter.close_callback> close) {
        this.io.setPointerField(this, 24, close);
        return this;
    }

    @Field(25)
    public Pointer<AVCodec.send_frame_callback> send_frame() {
        return this.io.getPointerField(this, 25);
    }

    @Field(25)
    public AVCodec send_frame(Pointer<AVCodec.send_frame_callback> send_frame) {
        this.io.setPointerField(this, 25, send_frame);
        return this;
    }

    @Field(26)
    public Pointer<AVCodec.receive_packet_callback> receive_packet() {
        return this.io.getPointerField(this, 26);
    }

    @Field(26)
    public AVCodec receive_packet(Pointer<AVCodec.receive_packet_callback> receive_packet) {
        this.io.setPointerField(this, 26, receive_packet);
        return this;
    }

    @Field(27)
    public Pointer<AVCodec.receive_frame_callback> receive_frame() {
        return this.io.getPointerField(this, 27);
    }

    @Field(27)
    public AVCodec receive_frame(Pointer<AVCodec.receive_frame_callback> receive_frame) {
        this.io.setPointerField(this, 27, receive_frame);
        return this;
    }

    @Field(28)
    public Pointer<AVCodec.flush_callback> flush() {
        return this.io.getPointerField(this, 28);
    }

    @Field(28)
    public AVCodec flush(Pointer<AVCodec.flush_callback> flush) {
        this.io.setPointerField(this, 28, flush);
        return this;
    }

    @Field(29)
    public int caps_internal() {
        return this.io.getIntField(this, 29);
    }

    @Field(29)
    public AVCodec caps_internal(int caps_internal) {
        this.io.setIntField(this, 29, caps_internal);
        return this;
    }

    @Field(30)
    public Pointer<Byte> bsfs() {
        return this.io.getPointerField(this, 30);
    }

    @Field(30)
    public AVCodec bsfs(Pointer<Byte> bsfs) {
        this.io.setPointerField(this, 30, bsfs);
        return this;
    }

    public abstract static class close_callback extends Callback<AVCodec.close_callback> {
        public close_callback() {
        }

        public int apply(Pointer<AVCodecContext> AVCodecContextPtr1) {
            return this.apply(Pointer.getPeer(AVCodecContextPtr1));
        }

        public int apply(@Ptr long AVCodecContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class));
        }
    }

    public abstract static class decode_callback extends Callback<AVCodec.decode_callback> {
        public decode_callback() {
        }

        public int apply(Pointer<AVCodecContext> AVCodecContextPtr1, Pointer<?> outdata, Pointer<Integer> outdata_size, Pointer<AVPacket> avpkt) {
            return this.apply(Pointer.getPeer(AVCodecContextPtr1), Pointer.getPeer(outdata), Pointer.getPeer(outdata_size), Pointer.getPeer(avpkt));
        }

        public int apply(@Ptr long AVCodecContextPtr1, @Ptr long outdata, @Ptr long outdata_size, @Ptr long avpkt) {
            return this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class), Pointer.pointerToAddress(outdata), Pointer.pointerToAddress(outdata_size, Integer.class), Pointer.pointerToAddress(avpkt, AVPacket.class));
        }
    }

    public abstract static class encode2_callback extends Callback<AVCodec.encode2_callback> {
        public encode2_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt, Pointer<AVFrame> frame, Pointer<Integer> got_packet_ptr) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(avpkt), Pointer.getPeer(frame), Pointer.getPeer(got_packet_ptr));
        }

        public int apply(@Ptr long avctx, @Ptr long avpkt, @Ptr long frame, @Ptr long got_packet_ptr) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(avpkt, AVPacket.class), Pointer.pointerToAddress(frame, AVFrame.class), Pointer.pointerToAddress(got_packet_ptr, Integer.class));
        }
    }

    public abstract static class encode_sub_callback extends Callback<AVCodec.encode_sub_callback> {
        public encode_sub_callback() {
        }

        public int apply(Pointer<AVCodecContext> AVCodecContextPtr1, Pointer<Byte> buf, int buf_size, Pointer<AVSubtitle> sub) {
            return this.apply(Pointer.getPeer(AVCodecContextPtr1), Pointer.getPeer(buf), buf_size, Pointer.getPeer(sub));
        }

        public int apply(@Ptr long AVCodecContextPtr1, @Ptr long buf, int buf_size, @Ptr long sub) {
            return this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class), Pointer.pointerToAddress(buf, Byte.class), buf_size, Pointer.pointerToAddress(sub, AVSubtitle.class));
        }
    }

    public abstract static class flush_callback extends Callback<AVCodec.flush_callback> {
        public flush_callback() {
        }

        public void apply(Pointer<AVCodecContext> AVCodecContextPtr1) {
            this.apply(Pointer.getPeer(AVCodecContextPtr1));
        }

        public void apply(@Ptr long AVCodecContextPtr1) {
            this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class));
        }
    }

    public abstract static class init_callback extends Callback<AVCodec.init_callback> {
        public init_callback() {
        }

        public int apply(Pointer<AVCodecContext> AVCodecContextPtr1) {
            return this.apply(Pointer.getPeer(AVCodecContextPtr1));
        }

        public int apply(@Ptr long AVCodecContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class));
        }
    }

    public abstract static class init_static_data_callback extends Callback<AVCodec.init_static_data_callback> {
        public init_static_data_callback() {
        }

        public void apply(Pointer<AVCodec> codec) {
            this.apply(Pointer.getPeer(codec));
        }

        public void apply(@Ptr long codec) {
            this.apply(Pointer.pointerToAddress(codec, AVCodec.class));
        }
    }

    public abstract static class init_thread_copy_callback extends Callback<AVCodec.init_thread_copy_callback> {
        public init_thread_copy_callback() {
        }

        public int apply(Pointer<AVCodecContext> AVCodecContextPtr1) {
            return this.apply(Pointer.getPeer(AVCodecContextPtr1));
        }

        public int apply(@Ptr long AVCodecContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVCodecContextPtr1, AVCodecContext.class));
        }
    }

    public abstract static class receive_frame_callback extends Callback<AVCodec.receive_frame_callback> {
        public receive_frame_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(frame));
        }

        public int apply(@Ptr long avctx, @Ptr long frame) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(frame, AVFrame.class));
        }
    }

    public abstract static class receive_packet_callback extends Callback<AVCodec.receive_packet_callback> {
        public receive_packet_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVPacket> avpkt) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(avpkt));
        }

        public int apply(@Ptr long avctx, @Ptr long avpkt) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(avpkt, AVPacket.class));
        }
    }

    public abstract static class send_frame_callback extends Callback<AVCodec.send_frame_callback> {
        public send_frame_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(frame));
        }

        public int apply(@Ptr long avctx, @Ptr long frame) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(frame, AVFrame.class));
        }
    }

    public abstract static class update_thread_context_callback extends Callback<AVCodec.update_thread_context_callback> {
        public update_thread_context_callback() {
        }

        public int apply(Pointer<AVCodecContext> dst, Pointer<AVCodecContext> src) {
            return this.apply(Pointer.getPeer(dst), Pointer.getPeer(src));
        }

        public int apply(@Ptr long dst, @Ptr long src) {
            return this.apply(Pointer.pointerToAddress(dst, AVCodecContext.class), Pointer.pointerToAddress(src, AVCodecContext.class));
        }
    }
}
