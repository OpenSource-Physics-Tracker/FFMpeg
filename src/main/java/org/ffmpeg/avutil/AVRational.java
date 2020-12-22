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
public class AVRational extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int num() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVRational num(int num) {
        this.io.setIntField(this, 0, num);
        return this;
    }

    @Field(1)
    public int den() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVRational den(int den) {
        this.io.setIntField(this, 1, den);
        return this;
    }

    public AVRational() {
    }

    public AVRational(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
