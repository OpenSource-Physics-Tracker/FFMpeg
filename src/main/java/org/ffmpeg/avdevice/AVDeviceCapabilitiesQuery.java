//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avdevice;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avformat.AVFormatContext;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;

@Library("avdevice")
public class AVDeviceCapabilitiesQuery extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVDeviceCapabilitiesQuery av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<AVFormatContext> device_context() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVDeviceCapabilitiesQuery device_context(Pointer<AVFormatContext> device_context) {
        this.io.setPointerField(this, 1, device_context);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVCodecID> codec() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVDeviceCapabilitiesQuery codec(IntValuedEnum<AVCodecID> codec) {
        this.io.setEnumField(this, 2, codec);
        return this;
    }

    @Field(3)
    public IntValuedEnum<AVSampleFormat> sample_format() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public AVDeviceCapabilitiesQuery sample_format(IntValuedEnum<AVSampleFormat> sample_format) {
        this.io.setEnumField(this, 3, sample_format);
        return this;
    }

    @Field(4)
    public IntValuedEnum<AVPixelFormat> pixel_format() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public AVDeviceCapabilitiesQuery pixel_format(IntValuedEnum<AVPixelFormat> pixel_format) {
        this.io.setEnumField(this, 4, pixel_format);
        return this;
    }

    @Field(5)
    public int sample_rate() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVDeviceCapabilitiesQuery sample_rate(int sample_rate) {
        this.io.setIntField(this, 5, sample_rate);
        return this;
    }

    @Field(6)
    public int channels() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVDeviceCapabilitiesQuery channels(int channels) {
        this.io.setIntField(this, 6, channels);
        return this;
    }

    @Field(7)
    public long channel_layout() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public AVDeviceCapabilitiesQuery channel_layout(long channel_layout) {
        this.io.setLongField(this, 7, channel_layout);
        return this;
    }

    @Field(8)
    public int window_width() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVDeviceCapabilitiesQuery window_width(int window_width) {
        this.io.setIntField(this, 8, window_width);
        return this;
    }

    @Field(9)
    public int window_height() {
        return this.io.getIntField(this, 9);
    }

    @Field(9)
    public AVDeviceCapabilitiesQuery window_height(int window_height) {
        this.io.setIntField(this, 9, window_height);
        return this;
    }

    @Field(10)
    public int frame_width() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    public AVDeviceCapabilitiesQuery frame_width(int frame_width) {
        this.io.setIntField(this, 10, frame_width);
        return this;
    }

    @Field(11)
    public int frame_height() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVDeviceCapabilitiesQuery frame_height(int frame_height) {
        this.io.setIntField(this, 11, frame_height);
        return this;
    }

    @Field(12)
    public AVRational fps() {
        return (AVRational)this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public AVDeviceCapabilitiesQuery fps(AVRational fps) {
        this.io.setNativeObjectField(this, 12, fps);
        return this;
    }

    public AVDeviceCapabilitiesQuery() {
    }

    public AVDeviceCapabilitiesQuery(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
