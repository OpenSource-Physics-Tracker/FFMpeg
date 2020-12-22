//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avutil")
public class AVBufferRef extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVBuffer> buffer() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBufferRef buffer(Pointer<AVBuffer> buffer) {
        this.io.setPointerField(this, 0, buffer);
        return this;
    }

    @Field(1)
    public Pointer<Byte> data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVBufferRef data(Pointer<Byte> data) {
        this.io.setPointerField(this, 1, data);
        return this;
    }

    @Field(2)
    public int size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVBufferRef size(int size) {
        this.io.setIntField(this, 2, size);
        return this;
    }

    public AVBufferRef() {
    }

    public AVBufferRef(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
