//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AvutilLibrary.AVHWDeviceType;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("avcodec")
public class AVCodecHWConfig extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public IntValuedEnum<AVPixelFormat> pix_fmt() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public AVCodecHWConfig pix_fmt(IntValuedEnum<AVPixelFormat> pix_fmt) {
        this.io.setEnumField(this, 0, pix_fmt);
        return this;
    }

    @Field(1)
    public int methods() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVCodecHWConfig methods(int methods) {
        this.io.setIntField(this, 1, methods);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVHWDeviceType> device_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVCodecHWConfig device_type(IntValuedEnum<AVHWDeviceType> device_type) {
        this.io.setEnumField(this, 2, device_type);
        return this;
    }

    public AVCodecHWConfig() {
    }

    public AVCodecHWConfig(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
