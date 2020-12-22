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
import org.bridj.ann.Union;

@Union
@Library("avutil")
public class av_intfloat32 extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int i() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public av_intfloat32 i(int i) {
        this.io.setIntField(this, 0, i);
        return this;
    }

    @Field(1)
    public float f() {
        return this.io.getFloatField(this, 1);
    }

    @Field(1)
    public av_intfloat32 f(float f) {
        this.io.setFloatField(this, 1, f);
        return this;
    }

    public av_intfloat32() {
    }

    public av_intfloat32(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
