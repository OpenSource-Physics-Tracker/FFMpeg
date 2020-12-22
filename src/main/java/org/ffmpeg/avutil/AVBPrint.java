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
public class AVBPrint extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> str() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBPrint str(Pointer<Byte> str) {
        this.io.setPointerField(this, 0, str);
        return this;
    }

    @Field(1)
    public int len() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVBPrint len(int len) {
        this.io.setIntField(this, 1, len);
        return this;
    }

    @Field(2)
    public int size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVBPrint size(int size) {
        this.io.setIntField(this, 2, size);
        return this;
    }

    @Field(3)
    public int size_max() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVBPrint size_max(int size_max) {
        this.io.setIntField(this, 3, size_max);
        return this;
    }

    @Array({1L})
    @Field(4)
    public Pointer<Byte> reserved_internal_buffer() {
        return this.io.getPointerField(this, 4);
    }

    @Array({1007L})
    @Field(5)
    public Pointer<Byte> reserved_padding() {
        return this.io.getPointerField(this, 5);
    }

    public AVBPrint() {
    }

    public AVBPrint(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
