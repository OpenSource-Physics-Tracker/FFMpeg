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
public class AVPicture extends StructObject {
    static {
        BridJ.register();
    }

    @Array({8L})
    @Field(0)
    public Pointer<Pointer<Byte>> data() {
        return this.io.getPointerField(this, 0);
    }

    @Array({8L})
    @Field(1)
    public Pointer<Integer> linesize() {
        return this.io.getPointerField(this, 1);
    }

    public AVPicture() {
    }

    public AVPicture(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
