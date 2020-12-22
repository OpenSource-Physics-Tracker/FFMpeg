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
public class AVIODirContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<?> url_context() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVIODirContext url_context(Pointer<?> url_context) {
        this.io.setPointerField(this, 0, url_context);
        return this;
    }

    public AVIODirContext() {
    }

    public AVIODirContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
