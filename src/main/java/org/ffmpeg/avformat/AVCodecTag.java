//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avformat")
public class AVCodecTag extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int dummy() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVCodecTag dummy(int dummy) {
        this.io.setIntField(this, 0, dummy);
        return this;
    }

    public AVCodecTag() {
    }

    public AVCodecTag(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
