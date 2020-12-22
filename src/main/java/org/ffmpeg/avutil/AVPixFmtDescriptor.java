//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avutil")
public class AVPixFmtDescriptor extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVPixFmtDescriptor name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public byte nb_components() {
        return this.io.getByteField(this, 1);
    }

    @Field(1)
    public AVPixFmtDescriptor nb_components(byte nb_components) {
        this.io.setByteField(this, 1, nb_components);
        return this;
    }

    @Field(2)
    public byte log2_chroma_w() {
        return this.io.getByteField(this, 2);
    }

    @Field(2)
    public AVPixFmtDescriptor log2_chroma_w(byte log2_chroma_w) {
        this.io.setByteField(this, 2, log2_chroma_w);
        return this;
    }

    @Field(3)
    public byte log2_chroma_h() {
        return this.io.getByteField(this, 3);
    }

    @Field(3)
    public AVPixFmtDescriptor log2_chroma_h(byte log2_chroma_h) {
        this.io.setByteField(this, 3, log2_chroma_h);
        return this;
    }

    @Field(4)
    public long flags() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public AVPixFmtDescriptor flags(long flags) {
        this.io.setLongField(this, 4, flags);
        return this;
    }

    @Array({4L})
    @Field(5)
    public Pointer<AVComponentDescriptor> comp() {
        return this.io.getPointerField(this, 5);
    }

    @Field(6)
    public Pointer<Byte> alias() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVPixFmtDescriptor alias(Pointer<Byte> alias) {
        this.io.setPointerField(this, 6, alias);
        return this;
    }

    public AVPixFmtDescriptor() {
    }

    public AVPixFmtDescriptor(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
