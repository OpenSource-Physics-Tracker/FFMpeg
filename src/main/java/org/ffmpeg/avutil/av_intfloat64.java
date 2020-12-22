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
public class av_intfloat64 extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public long i() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public av_intfloat64 i(long i) {
        this.io.setLongField(this, 0, i);
        return this;
    }

    @Field(1)
    public double f() {
        return this.io.getDoubleField(this, 1);
    }

    @Field(1)
    public av_intfloat64 f(double f) {
        this.io.setDoubleField(this, 1, f);
        return this;
    }

    public av_intfloat64() {
    }

    public av_intfloat64(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
