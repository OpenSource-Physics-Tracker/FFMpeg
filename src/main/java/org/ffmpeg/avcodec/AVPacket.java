//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import java.util.List;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructFieldDescription;
import org.bridj.StructObject;
import org.bridj.ann.Alignment;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Struct;
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.util.AlignmentCustomizer;

@Library("avcodec")
public class AVPacket extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVBufferRef> buf() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVPacket buf(Pointer<AVBufferRef> buf) {
        this.io.setPointerField(this, 0, buf);
        return this;
    }

    @Alignment(4)
    @Field(1)
    public long pts() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public AVPacket pts(long pts) {
        this.io.setLongField(this, 1, pts);
        return this;
    }

    @Alignment(4)
    @Field(2)
    public long dts() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public AVPacket dts(long dts) {
        this.io.setLongField(this, 2, dts);
        return this;
    }

    @Field(3)
    public Pointer<Byte> data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVPacket data(Pointer<Byte> data) {
        this.io.setPointerField(this, 3, data);
        return this;
    }

    @Field(4)
    public int size() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVPacket size(int size) {
        this.io.setIntField(this, 4, size);
        return this;
    }

    @Field(5)
    public int stream_index() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVPacket stream_index(int stream_index) {
        this.io.setIntField(this, 5, stream_index);
        return this;
    }

    @Field(6)
    public int flags() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVPacket flags(int flags) {
        this.io.setIntField(this, 6, flags);
        return this;
    }

    @Field(7)
    public Pointer<AVPacketSideData> side_data() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVPacket side_data(Pointer<AVPacketSideData> side_data) {
        this.io.setPointerField(this, 7, side_data);
        return this;
    }

    @Field(8)
    public int side_data_elems() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVPacket side_data_elems(int side_data_elems) {
        this.io.setIntField(this, 8, side_data_elems);
        return this;
    }

    @Field(9)
    public long duration() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public AVPacket duration(long duration) {
        this.io.setLongField(this, 9, duration);
        return this;
    }

    @Field(10)
    public long pos() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    public AVPacket pos(long pos) {
        this.io.setLongField(this, 10, pos);
        return this;
    }

    /** @deprecated */
    @Field(11)
    public long convergence_duration() {
        return this.io.getLongField(this, 11);
    }

    /** @deprecated */
    @Field(11)
    public AVPacket convergence_duration(long convergence_duration) {
        this.io.setLongField(this, 11, convergence_duration);
        return this;
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVPacket() {
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVPacket(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public List<StructFieldDescription> getDescriptions() {
        return this.io.desc.getAggregatedFields();
    }
}
