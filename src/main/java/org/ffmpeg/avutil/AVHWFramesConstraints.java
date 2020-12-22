//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("avutil")
public class AVHWFramesConstraints extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<IntValuedEnum<AVPixelFormat>> valid_hw_formats() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVHWFramesConstraints valid_hw_formats(Pointer<IntValuedEnum<AVPixelFormat>> valid_hw_formats) {
        this.io.setPointerField(this, 0, valid_hw_formats);
        return this;
    }

    @Field(1)
    public Pointer<IntValuedEnum<AVPixelFormat>> valid_sw_formats() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVHWFramesConstraints valid_sw_formats(Pointer<IntValuedEnum<AVPixelFormat>> valid_sw_formats) {
        this.io.setPointerField(this, 1, valid_sw_formats);
        return this;
    }

    @Field(2)
    public int min_width() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVHWFramesConstraints min_width(int min_width) {
        this.io.setIntField(this, 2, min_width);
        return this;
    }

    @Field(3)
    public int min_height() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVHWFramesConstraints min_height(int min_height) {
        this.io.setIntField(this, 3, min_height);
        return this;
    }

    @Field(4)
    public int max_width() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVHWFramesConstraints max_width(int max_width) {
        this.io.setIntField(this, 4, max_width);
        return this;
    }

    @Field(5)
    public int max_height() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVHWFramesConstraints max_height(int max_height) {
        this.io.setIntField(this, 5, max_height);
        return this;
    }

    public AVHWFramesConstraints() {
    }

    public AVHWFramesConstraints(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
