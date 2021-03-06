package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avcodec")
public class AVBSFInternal extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int dummy() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVBSFInternal dummy(int dummy) {
        this.io.setIntField(this, 0, dummy);
        return this;
    }

    public AVBSFInternal() {
    }

    public AVBSFInternal(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
