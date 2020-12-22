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
public class AVOptionRanges extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Pointer<AVOptionRange>> range() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVOptionRanges range(Pointer<Pointer<AVOptionRange>> range) {
        this.io.setPointerField(this, 0, range);
        return this;
    }

    @Field(1)
    public int nb_ranges() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVOptionRanges nb_ranges(int nb_ranges) {
        this.io.setIntField(this, 1, nb_ranges);
        return this;
    }

    @Field(2)
    public int nb_components() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVOptionRanges nb_components(int nb_components) {
        this.io.setIntField(this, 2, nb_components);
        return this;
    }

    public AVOptionRanges() {
    }

    public AVOptionRanges(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
