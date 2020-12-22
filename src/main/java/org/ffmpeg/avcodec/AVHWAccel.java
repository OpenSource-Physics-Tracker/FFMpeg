//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import org.ffmpeg.avcodec.AvcodecLibrary.MpegEncContext;
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("avcodec")
public class AVHWAccel extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVHWAccel name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public IntValuedEnum<AVMediaType> type() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public AVHWAccel type(IntValuedEnum<AVMediaType> type) {
        this.io.setEnumField(this, 1, type);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVCodecID> id() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVHWAccel id(IntValuedEnum<AVCodecID> id) {
        this.io.setEnumField(this, 2, id);
        return this;
    }

    @Field(3)
    public IntValuedEnum<AVPixelFormat> pix_fmt() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public AVHWAccel pix_fmt(IntValuedEnum<AVPixelFormat> pix_fmt) {
        this.io.setEnumField(this, 3, pix_fmt);
        return this;
    }

    @Field(4)
    public int capabilities() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVHWAccel capabilities(int capabilities) {
        this.io.setIntField(this, 4, capabilities);
        return this;
    }

    @Field(5)
    public Pointer<AVHWAccel.alloc_frame_callback> alloc_frame() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVHWAccel alloc_frame(Pointer<AVHWAccel.alloc_frame_callback> alloc_frame) {
        this.io.setPointerField(this, 5, alloc_frame);
        return this;
    }

    @Field(6)
    public Pointer<AVHWAccel.start_frame_callback> start_frame() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVHWAccel start_frame(Pointer<AVHWAccel.start_frame_callback> start_frame) {
        this.io.setPointerField(this, 6, start_frame);
        return this;
    }

    @Field(7)
    public Pointer<AVHWAccel.decode_params_callback> decode_params() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVHWAccel decode_params(Pointer<AVHWAccel.decode_params_callback> decode_params) {
        this.io.setPointerField(this, 7, decode_params);
        return this;
    }

    @Field(8)
    public Pointer<AVHWAccel.decode_slice_callback> decode_slice() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVHWAccel decode_slice(Pointer<AVHWAccel.decode_slice_callback> decode_slice) {
        this.io.setPointerField(this, 8, decode_slice);
        return this;
    }

    @Field(9)
    public Pointer<AVHWAccel.end_frame_callback> end_frame() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVHWAccel end_frame(Pointer<AVHWAccel.end_frame_callback> end_frame) {
        this.io.setPointerField(this, 9, end_frame);
        return this;
    }

    @Field(10)
    public int frame_priv_data_size() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    public AVHWAccel frame_priv_data_size(int frame_priv_data_size) {
        this.io.setIntField(this, 10, frame_priv_data_size);
        return this;
    }

    @Field(11)
    public Pointer<AVHWAccel.decode_mb_callback> decode_mb() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public AVHWAccel decode_mb(Pointer<AVHWAccel.decode_mb_callback> decode_mb) {
        this.io.setPointerField(this, 11, decode_mb);
        return this;
    }

    @Field(12)
    public Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public AVHWAccel init(Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init) {
        this.io.setPointerField(this, 12, init);
        return this;
    }

    @Field(13)
    public Pointer<org.ffmpeg.avfilter.AVFilter.uninit_callback> uninit() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public AVHWAccel uninit(Pointer<org.ffmpeg.avfilter.AVFilter.uninit_callback> uninit) {
        this.io.setPointerField(this, 13, uninit);
        return this;
    }

    @Field(14)
    public int priv_data_size() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public AVHWAccel priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 14, priv_data_size);
        return this;
    }

    @Field(15)
    public int caps_internal() {
        return this.io.getIntField(this, 15);
    }

    @Field(15)
    public AVHWAccel caps_internal(int caps_internal) {
        this.io.setIntField(this, 15, caps_internal);
        return this;
    }

    @Field(16)
    public Pointer<AVHWAccel.frame_params_callback> frame_params() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public AVHWAccel frame_params(Pointer<AVHWAccel.frame_params_callback> frame_params) {
        this.io.setPointerField(this, 16, frame_params);
        return this;
    }

    public AVHWAccel() {
    }

    public AVHWAccel(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class alloc_frame_callback extends Callback<AVHWAccel.alloc_frame_callback> {
        public alloc_frame_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVFrame> frame) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(frame));
        }

        public int apply(@Ptr long avctx, @Ptr long frame) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(frame, AVFrame.class));
        }
    }

    public abstract static class decode_mb_callback extends Callback<AVHWAccel.decode_mb_callback> {
        public decode_mb_callback() {
        }

        public void apply(Pointer<MpegEncContext> s) {
            this.apply(Pointer.getPeer(s));
        }

        public void apply(@Ptr long s) {
            this.apply(Pointer.pointerToAddress(s, MpegEncContext.class));
        }
    }

    public abstract static class decode_params_callback extends Callback<AVHWAccel.decode_params_callback> {
        public decode_params_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, int type, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(avctx), type, Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long avctx, int type, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), type, Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class decode_slice_callback extends Callback<AVHWAccel.decode_slice_callback> {
        public decode_slice_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long avctx, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class end_frame_callback extends Callback<AVHWAccel.end_frame_callback> {
        public end_frame_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx) {
            return this.apply(Pointer.getPeer(avctx));
        }

        public int apply(@Ptr long avctx) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class));
        }
    }

    public abstract static class frame_params_callback extends Callback<AVHWAccel.frame_params_callback> {
        public frame_params_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<AVBufferRef> hw_frames_ctx) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(hw_frames_ctx));
        }

        public int apply(@Ptr long avctx, @Ptr long hw_frames_ctx) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(hw_frames_ctx, AVBufferRef.class));
        }
    }

    public abstract static class init_callback extends Callback<AVHWAccel.init_callback> {
        public init_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx) {
            return this.apply(Pointer.getPeer(avctx));
        }

        public int apply(@Ptr long avctx) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class));
        }
    }

    public abstract static class start_frame_callback extends Callback<AVHWAccel.start_frame_callback> {
        public start_frame_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long avctx, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class uninit_callback extends Callback<AVHWAccel.uninit_callback> {
        public uninit_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx) {
            return this.apply(Pointer.getPeer(avctx));
        }

        public int apply(@Ptr long avctx) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class));
        }
    }
}
