//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avdevice;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avdevice")
public class AVDeviceRect extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int x() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVDeviceRect x(int x) {
        this.io.setIntField(this, 0, x);
        return this;
    }

    @Field(1)
    public int y() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVDeviceRect y(int y) {
        this.io.setIntField(this, 1, y);
        return this;
    }

    @Field(2)
    public int width() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVDeviceRect width(int width) {
        this.io.setIntField(this, 2, width);
        return this;
    }

    @Field(3)
    public int height() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVDeviceRect height(int height) {
        this.io.setIntField(this, 3, height);
        return this;
    }

    public AVDeviceRect() {
    }

    public AVDeviceRect(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
