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

@Library("avutil")
public class AVDictionaryEntry extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> key() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVDictionaryEntry key(Pointer<Byte> key) {
        this.io.setPointerField(this, 0, key);
        return this;
    }

    @Field(1)
    public Pointer<Byte> value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVDictionaryEntry value(Pointer<Byte> value) {
        this.io.setPointerField(this, 1, value);
        return this;
    }

    public AVDictionaryEntry() {
    }

    public AVDictionaryEntry(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
