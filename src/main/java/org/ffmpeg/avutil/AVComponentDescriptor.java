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
public class AVComponentDescriptor extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int plane() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVComponentDescriptor plane(int plane) {
        this.io.setIntField(this, 0, plane);
        return this;
    }

    @Field(1)
    public int step() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVComponentDescriptor step(int step) {
        this.io.setIntField(this, 1, step);
        return this;
    }

    @Field(2)
    public int offset() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVComponentDescriptor offset(int offset) {
        this.io.setIntField(this, 2, offset);
        return this;
    }

    @Field(3)
    public int shift() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVComponentDescriptor shift(int shift) {
        this.io.setIntField(this, 3, shift);
        return this;
    }

    @Field(4)
    public int depth() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVComponentDescriptor depth(int depth) {
        this.io.setIntField(this, 4, depth);
        return this;
    }

    @Field(5)
    public int step_minus1() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVComponentDescriptor step_minus1(int step_minus1) {
        this.io.setIntField(this, 5, step_minus1);
        return this;
    }

    @Field(6)
    public int depth_minus1() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVComponentDescriptor depth_minus1(int depth_minus1) {
        this.io.setIntField(this, 6, depth_minus1);
        return this;
    }

    @Field(7)
    public int offset_plus1() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVComponentDescriptor offset_plus1(int offset_plus1) {
        this.io.setIntField(this, 7, offset_plus1);
        return this;
    }

    public AVComponentDescriptor() {
    }

    public AVComponentDescriptor(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
