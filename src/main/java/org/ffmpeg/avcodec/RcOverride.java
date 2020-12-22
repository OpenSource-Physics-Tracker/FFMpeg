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
public class RcOverride extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int start_frame() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public RcOverride start_frame(int start_frame) {
        this.io.setIntField(this, 0, start_frame);
        return this;
    }

    @Field(1)
    public int end_frame() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public RcOverride end_frame(int end_frame) {
        this.io.setIntField(this, 1, end_frame);
        return this;
    }

    @Field(2)
    public int qscale() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public RcOverride qscale(int qscale) {
        this.io.setIntField(this, 2, qscale);
        return this;
    }

    @Field(3)
    public float quality_factor() {
        return this.io.getFloatField(this, 3);
    }

    @Field(3)
    public RcOverride quality_factor(float quality_factor) {
        this.io.setFloatField(this, 3, quality_factor);
        return this;
    }

    public RcOverride() {
    }

    public RcOverride(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
