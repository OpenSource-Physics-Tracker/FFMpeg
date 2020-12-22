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
public class AVOptionRange extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> str() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVOptionRange str(Pointer<Byte> str) {
        this.io.setPointerField(this, 0, str);
        return this;
    }

    @Field(1)
    public double value_min() {
        return this.io.getDoubleField(this, 1);
    }

    @Field(1)
    public AVOptionRange value_min(double value_min) {
        this.io.setDoubleField(this, 1, value_min);
        return this;
    }

    @Field(2)
    public double value_max() {
        return this.io.getDoubleField(this, 2);
    }

    @Field(2)
    public AVOptionRange value_max(double value_max) {
        this.io.setDoubleField(this, 2, value_max);
        return this;
    }

    @Field(3)
    public double component_min() {
        return this.io.getDoubleField(this, 3);
    }

    @Field(3)
    public AVOptionRange component_min(double component_min) {
        this.io.setDoubleField(this, 3, component_min);
        return this;
    }

    @Field(4)
    public double component_max() {
        return this.io.getDoubleField(this, 4);
    }

    @Field(4)
    public AVOptionRange component_max(double component_max) {
        this.io.setDoubleField(this, 4, component_max);
        return this;
    }

    @Field(5)
    public int is_range() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVOptionRange is_range(int is_range) {
        this.io.setIntField(this, 5, is_range);
        return this;
    }

    public AVOptionRange() {
    }

    public AVOptionRange(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
