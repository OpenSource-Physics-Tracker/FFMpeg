package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVRational;

@Library("avcodec")
public class AVBSFContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBSFContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<AVBitStreamFilter> filter() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVBSFContext filter(Pointer<AVBitStreamFilter> filter) {
        this.io.setPointerField(this, 1, filter);
        return this;
    }

    @Field(2)
    public Pointer<AVBSFInternal> internal() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVBSFContext internal(Pointer<AVBSFInternal> internal) {
        this.io.setPointerField(this, 2, internal);
        return this;
    }

    @Field(3)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVBSFContext priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 3, priv_data);
        return this;
    }

    @Field(4)
    public Pointer<AVCodecParameters> par_in() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVBSFContext par_in(Pointer<AVCodecParameters> par_in) {
        this.io.setPointerField(this, 4, par_in);
        return this;
    }

    @Field(5)
    public Pointer<AVCodecParameters> par_out() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVBSFContext par_out(Pointer<AVCodecParameters> par_out) {
        this.io.setPointerField(this, 5, par_out);
        return this;
    }

    @Field(6)
    public AVRational time_base_in() {
        return (AVRational)this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public AVBSFContext time_base_in(AVRational time_base_in) {
        this.io.setNativeObjectField(this, 6, time_base_in);
        return this;
    }

    @Field(7)
    public AVRational time_base_out() {
        return (AVRational)this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public AVBSFContext time_base_out(AVRational time_base_out) {
        this.io.setNativeObjectField(this, 7, time_base_out);
        return this;
    }

    public AVBSFContext() {
    }

    public AVBSFContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
