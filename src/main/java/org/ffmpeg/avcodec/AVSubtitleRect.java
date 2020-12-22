//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVSubtitleType;

@Library("avcodec")
public class AVSubtitleRect extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int x() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVSubtitleRect x(int x) {
        this.io.setIntField(this, 0, x);
        return this;
    }

    @Field(1)
    public int y() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVSubtitleRect y(int y) {
        this.io.setIntField(this, 1, y);
        return this;
    }

    @Field(2)
    public int w() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVSubtitleRect w(int w) {
        this.io.setIntField(this, 2, w);
        return this;
    }

    @Field(3)
    public int h() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVSubtitleRect h(int h) {
        this.io.setIntField(this, 3, h);
        return this;
    }

    @Field(4)
    public int nb_colors() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVSubtitleRect nb_colors(int nb_colors) {
        this.io.setIntField(this, 4, nb_colors);
        return this;
    }

    /** @deprecated */
    @Field(5)
    public AVPicture pict() {
        return (AVPicture)this.io.getNativeObjectField(this, 5);
    }

    /** @deprecated */
    @Field(5)
    public AVSubtitleRect pict(AVPicture pict) {
        this.io.setNativeObjectField(this, 5, pict);
        return this;
    }

    @Array({4L})
    @Field(6)
    public Pointer<Pointer<Byte>> data() {
        return this.io.getPointerField(this, 6);
    }

    @Array({4L})
    @Field(7)
    public Pointer<Integer> linesize() {
        return this.io.getPointerField(this, 7);
    }

    @Field(8)
    public IntValuedEnum<AVSubtitleType> type() {
        return this.io.getEnumField(this, 8);
    }

    @Field(8)
    public AVSubtitleRect type(IntValuedEnum<AVSubtitleType> type) {
        this.io.setEnumField(this, 8, type);
        return this;
    }

    @Field(9)
    public Pointer<Byte> text() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVSubtitleRect text(Pointer<Byte> text) {
        this.io.setPointerField(this, 9, text);
        return this;
    }

    @Field(10)
    public Pointer<Byte> ass() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVSubtitleRect ass(Pointer<Byte> ass) {
        this.io.setPointerField(this, 10, ass);
        return this;
    }

    @Field(11)
    public int flags() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVSubtitleRect flags(int flags) {
        this.io.setIntField(this, 11, flags);
        return this;
    }

    public AVSubtitleRect() {
    }

    public AVSubtitleRect(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
