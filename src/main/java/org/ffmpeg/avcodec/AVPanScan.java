//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avcodec")
public class AVPanScan extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int id() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVPanScan id(int id) {
        this.io.setIntField(this, 0, id);
        return this;
    }

    @Field(1)
    public int width() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVPanScan width(int width) {
        this.io.setIntField(this, 1, width);
        return this;
    }

    @Field(2)
    public int height() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVPanScan height(int height) {
        this.io.setIntField(this, 2, height);
        return this;
    }

    @Array({3L, 2L})
    @Field(3)
    public Pointer<Short> position() {
        return this.io.getPointerField(this, 3);
    }

    public AVPanScan() {
    }

    public AVPanScan(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
