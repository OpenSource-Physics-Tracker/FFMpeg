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
public class SwsFilter extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<SwsVector> lumH() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public SwsFilter lumH(Pointer<SwsVector> lumH) {
        this.io.setPointerField(this, 0, lumH);
        return this;
    }

    @Field(1)
    public Pointer<SwsVector> lumV() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public SwsFilter lumV(Pointer<SwsVector> lumV) {
        this.io.setPointerField(this, 1, lumV);
        return this;
    }

    @Field(2)
    public Pointer<SwsVector> chrH() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public SwsFilter chrH(Pointer<SwsVector> chrH) {
        this.io.setPointerField(this, 2, chrH);
        return this;
    }

    @Field(3)
    public Pointer<SwsVector> chrV() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public SwsFilter chrV(Pointer<SwsVector> chrV) {
        this.io.setPointerField(this, 3, chrV);
        return this;
    }

    public SwsFilter() {
    }

    public SwsFilter(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
