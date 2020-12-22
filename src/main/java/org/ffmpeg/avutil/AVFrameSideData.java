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
import org.ffmpeg.avutil.AvutilLibrary.AVFrameSideDataType;

@Library("avutil")
public class AVFrameSideData extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public IntValuedEnum<AVFrameSideDataType> type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public AVFrameSideData type(IntValuedEnum<AVFrameSideDataType> type) {
        this.io.setEnumField(this, 0, type);
        return this;
    }

    @Field(1)
    public Pointer<Byte> data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVFrameSideData data(Pointer<Byte> data) {
        this.io.setPointerField(this, 1, data);
        return this;
    }

    @Field(2)
    public int size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVFrameSideData size(int size) {
        this.io.setIntField(this, 2, size);
        return this;
    }

    @Field(3)
    public Pointer<AVDictionary> metadata() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVFrameSideData metadata(Pointer<AVDictionary> metadata) {
        this.io.setPointerField(this, 3, metadata);
        return this;
    }

    @Field(4)
    public Pointer<AVBufferRef> buf() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVFrameSideData buf(Pointer<AVBufferRef> buf) {
        this.io.setPointerField(this, 4, buf);
        return this;
    }

    public AVFrameSideData() {
    }

    public AVFrameSideData(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
