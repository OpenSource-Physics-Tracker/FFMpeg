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

@Library("avcodec")
public class AVBitStreamFilter extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBitStreamFilter name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<IntValuedEnum<AVCodecID>> codec_ids() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVBitStreamFilter codec_ids(Pointer<IntValuedEnum<AVCodecID>> codec_ids) {
        this.io.setPointerField(this, 1, codec_ids);
        return this;
    }

    @Field(2)
    public Pointer<AVClass> priv_class() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVBitStreamFilter priv_class(Pointer<AVClass> priv_class) {
        this.io.setPointerField(this, 2, priv_class);
        return this;
    }

    @Field(3)
    public int priv_data_size() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVBitStreamFilter priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 3, priv_data_size);
        return this;
    }

    @Field(4)
    public Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVBitStreamFilter init(Pointer<org.ffmpeg.avfilter.AVFilter.init_callback> init) {
        this.io.setPointerField(this, 4, init);
        return this;
    }

    @Field(5)
    public Pointer<AVBitStreamFilter.filter_callback> filter() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVBitStreamFilter filter(Pointer<AVBitStreamFilter.filter_callback> filter) {
        this.io.setPointerField(this, 5, filter);
        return this;
    }

    @Field(6)
    public Pointer<AVBitStreamFilter.close_callback> close() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVBitStreamFilter close(Pointer<AVBitStreamFilter.close_callback> close) {
        this.io.setPointerField(this, 6, close);
        return this;
    }

    public AVBitStreamFilter() {
    }

    public AVBitStreamFilter(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class close_callback extends Callback<AVBitStreamFilter.close_callback> {
        public close_callback() {
        }

        public void apply(Pointer<AVBSFContext> ctx) {
            this.apply(Pointer.getPeer(ctx));
        }

        public void apply(@Ptr long ctx) {
            this.apply(Pointer.pointerToAddress(ctx, AVBSFContext.class));
        }
    }

    public abstract static class filter_callback extends Callback<AVBitStreamFilter.filter_callback> {
        public filter_callback() {
        }

        public int apply(Pointer<AVBSFContext> ctx, Pointer<AVPacket> pkt) {
            return this.apply(Pointer.getPeer(ctx), Pointer.getPeer(pkt));
        }

        public int apply(@Ptr long ctx, @Ptr long pkt) {
            return this.apply(Pointer.pointerToAddress(ctx, AVBSFContext.class), Pointer.pointerToAddress(pkt, AVPacket.class));
        }
    }

    public abstract static class init_callback extends Callback<AVBitStreamFilter.init_callback> {
        public init_callback() {
        }

        public int apply(Pointer<AVBSFContext> ctx) {
            return this.apply(Pointer.getPeer(ctx));
        }

        public int apply(@Ptr long ctx) {
            return this.apply(Pointer.pointerToAddress(ctx, AVBSFContext.class));
        }
    }
}
