//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avfilter")
public class AVFilterInOut extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVFilterInOut name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<AVFilterContext> filter_ctx() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVFilterInOut filter_ctx(Pointer<AVFilterContext> filter_ctx) {
        this.io.setPointerField(this, 1, filter_ctx);
        return this;
    }

    @Field(2)
    public int pad_idx() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVFilterInOut pad_idx(int pad_idx) {
        this.io.setIntField(this, 2, pad_idx);
        return this;
    }

    @Field(3)
    public Pointer<AVFilterInOut> next() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVFilterInOut next(Pointer<AVFilterInOut> next) {
        this.io.setPointerField(this, 3, next);
        return this;
    }

    public AVFilterInOut() {
    }

    public AVFilterInOut(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
