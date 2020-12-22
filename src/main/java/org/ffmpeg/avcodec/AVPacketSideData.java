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
import org.bridj.ann.Struct;
import org.ffmpeg.avcodec.AvcodecLibrary.AVPacketSideDataType;
import org.ffmpeg.util.AlignmentCustomizer;

@Library("avcodec")
public class AVPacketSideData extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVPacketSideData data(Pointer<Byte> data) {
        this.io.setPointerField(this, 0, data);
        return this;
    }

    @Field(1)
    public int size() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVPacketSideData size(int size) {
        this.io.setIntField(this, 1, size);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVPacketSideDataType> type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVPacketSideData type(IntValuedEnum<AVPacketSideDataType> type) {
        this.io.setEnumField(this, 2, type);
        return this;
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVPacketSideData() {
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVPacketSideData(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
