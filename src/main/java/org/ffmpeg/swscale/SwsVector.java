//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.swscale;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("swscale")
public class SwsVector extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Double> coeff() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public SwsVector coeff(Pointer<Double> coeff) {
        this.io.setPointerField(this, 0, coeff);
        return this;
    }

    @Field(1)
    public int length() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public SwsVector length(int length) {
        this.io.setIntField(this, 1, length);
        return this;
    }

    public SwsVector() {
    }

    public SwsVector(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
