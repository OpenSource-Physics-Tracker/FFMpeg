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
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;

@Library("avcodec")
public class AVCodecDescriptor extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public IntValuedEnum<AVCodecID> id() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public AVCodecDescriptor id(IntValuedEnum<AVCodecID> id) {
        this.io.setEnumField(this, 0, id);
        return this;
    }

    @Field(1)
    public IntValuedEnum<AVMediaType> type() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public AVCodecDescriptor type(IntValuedEnum<AVMediaType> type) {
        this.io.setEnumField(this, 1, type);
        return this;
    }

    @Field(2)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVCodecDescriptor name(Pointer<Byte> name) {
        this.io.setPointerField(this, 2, name);
        return this;
    }

    @Field(3)
    public Pointer<Byte> long_name() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVCodecDescriptor long_name(Pointer<Byte> long_name) {
        this.io.setPointerField(this, 3, long_name);
        return this;
    }

    @Field(4)
    public int props() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVCodecDescriptor props(int props) {
        this.io.setIntField(this, 4, props);
        return this;
    }

    @Field(5)
    public Pointer<Pointer<Byte>> mime_types() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVCodecDescriptor mime_types(Pointer<Pointer<Byte>> mime_types) {
        this.io.setPointerField(this, 5, mime_types);
        return this;
    }

    @Field(6)
    public Pointer<AVProfile> profiles() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVCodecDescriptor profiles(Pointer<AVProfile> profiles) {
        this.io.setPointerField(this, 6, profiles);
        return this;
    }

    public AVCodecDescriptor() {
    }

    public AVCodecDescriptor(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
