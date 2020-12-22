//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avcodec")
public class AVSubtitle extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public short format() {
        return this.io.getShortField(this, 0);
    }

    @Field(0)
    public AVSubtitle format(short format) {
        this.io.setShortField(this, 0, format);
        return this;
    }

    @Field(1)
    public int start_display_time() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVSubtitle start_display_time(int start_display_time) {
        this.io.setIntField(this, 1, start_display_time);
        return this;
    }

    @Field(2)
    public int end_display_time() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVSubtitle end_display_time(int end_display_time) {
        this.io.setIntField(this, 2, end_display_time);
        return this;
    }

    @Field(3)
    public int num_rects() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVSubtitle num_rects(int num_rects) {
        this.io.setIntField(this, 3, num_rects);
        return this;
    }

    @Field(4)
    public Pointer<Pointer<AVSubtitleRect>> rects() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVSubtitle rects(Pointer<Pointer<AVSubtitleRect>> rects) {
        this.io.setPointerField(this, 4, rects);
        return this;
    }

    @Field(5)
    public long pts() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public AVSubtitle pts(long pts) {
        this.io.setLongField(this, 5, pts);
        return this;
    }

    public AVSubtitle() {
    }

    public AVSubtitle(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
