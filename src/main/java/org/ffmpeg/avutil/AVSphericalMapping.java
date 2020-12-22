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
import org.ffmpeg.avutil.AvutilLibrary.AVSphericalProjection;

@Library("avutil")
public class AVSphericalMapping extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public IntValuedEnum<AVSphericalProjection> projection() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public AVSphericalMapping projection(IntValuedEnum<AVSphericalProjection> projection) {
        this.io.setEnumField(this, 0, projection);
        return this;
    }

    @Field(1)
    public int yaw() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVSphericalMapping yaw(int yaw) {
        this.io.setIntField(this, 1, yaw);
        return this;
    }

    @Field(2)
    public int pitch() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVSphericalMapping pitch(int pitch) {
        this.io.setIntField(this, 2, pitch);
        return this;
    }

    @Field(3)
    public int roll() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVSphericalMapping roll(int roll) {
        this.io.setIntField(this, 3, roll);
        return this;
    }

    @Field(4)
    public int bound_left() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVSphericalMapping bound_left(int bound_left) {
        this.io.setIntField(this, 4, bound_left);
        return this;
    }

    @Field(5)
    public int bound_top() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVSphericalMapping bound_top(int bound_top) {
        this.io.setIntField(this, 5, bound_top);
        return this;
    }

    @Field(6)
    public int bound_right() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVSphericalMapping bound_right(int bound_right) {
        this.io.setIntField(this, 6, bound_right);
        return this;
    }

    @Field(7)
    public int bound_bottom() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVSphericalMapping bound_bottom(int bound_bottom) {
        this.io.setIntField(this, 7, bound_bottom);
        return this;
    }

    @Field(8)
    public int padding() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVSphericalMapping padding(int padding) {
        this.io.setIntField(this, 8, padding);
        return this;
    }

    public AVSphericalMapping() {
    }

    public AVSphericalMapping(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
