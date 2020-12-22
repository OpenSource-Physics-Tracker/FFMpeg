//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avcodec")
public class AVProfile extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int profile() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVProfile profile(int profile) {
        this.io.setIntField(this, 0, profile);
        return this;
    }

    @Field(1)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVProfile name(Pointer<Byte> name) {
        this.io.setPointerField(this, 1, name);
        return this;
    }

    public AVProfile() {
    }

    public AVProfile(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
