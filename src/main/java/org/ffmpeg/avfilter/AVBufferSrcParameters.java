//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.avutil.AVRational;

@Library("avfilter")
public class AVBufferSrcParameters extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int format() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVBufferSrcParameters format(int format) {
        this.io.setIntField(this, 0, format);
        return this;
    }

    @Field(1)
    public AVRational time_base() {
        return (AVRational)this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public AVBufferSrcParameters time_base(AVRational time_base) {
        this.io.setNativeObjectField(this, 1, time_base);
        return this;
    }

    @Field(2)
    public int width() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVBufferSrcParameters width(int width) {
        this.io.setIntField(this, 2, width);
        return this;
    }

    @Field(3)
    public int height() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVBufferSrcParameters height(int height) {
        this.io.setIntField(this, 3, height);
        return this;
    }

    @Field(4)
    public AVRational sample_aspect_ratio() {
        return (AVRational)this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public AVBufferSrcParameters sample_aspect_ratio(AVRational sample_aspect_ratio) {
        this.io.setNativeObjectField(this, 4, sample_aspect_ratio);
        return this;
    }

    @Field(5)
    public AVRational frame_rate() {
        return (AVRational)this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public AVBufferSrcParameters frame_rate(AVRational frame_rate) {
        this.io.setNativeObjectField(this, 5, frame_rate);
        return this;
    }

    @Field(6)
    public Pointer<AVBufferRef> hw_frames_ctx() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVBufferSrcParameters hw_frames_ctx(Pointer<AVBufferRef> hw_frames_ctx) {
        this.io.setPointerField(this, 6, hw_frames_ctx);
        return this;
    }

    @Field(7)
    public int sample_rate() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVBufferSrcParameters sample_rate(int sample_rate) {
        this.io.setIntField(this, 7, sample_rate);
        return this;
    }

    @Field(8)
    public long channel_layout() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public AVBufferSrcParameters channel_layout(long channel_layout) {
        this.io.setLongField(this, 8, channel_layout);
        return this;
    }

    public AVBufferSrcParameters() {
    }

    public AVBufferSrcParameters(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
