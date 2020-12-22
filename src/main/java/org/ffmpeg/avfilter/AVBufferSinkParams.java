//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("avfilter")
public class AVBufferSinkParams extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<IntValuedEnum<AVPixelFormat>> pixel_fmts() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBufferSinkParams pixel_fmts(Pointer<IntValuedEnum<AVPixelFormat>> pixel_fmts) {
        this.io.setPointerField(this, 0, pixel_fmts);
        return this;
    }

    public AVBufferSinkParams() {
    }

    public AVBufferSinkParams(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
