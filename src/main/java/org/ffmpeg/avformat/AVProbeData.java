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
public class AVProbeData extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> filename() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVProbeData filename(Pointer<Byte> filename) {
        this.io.setPointerField(this, 0, filename);
        return this;
    }

    @Field(1)
    public Pointer<Byte> buf() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVProbeData buf(Pointer<Byte> buf) {
        this.io.setPointerField(this, 1, buf);
        return this;
    }

    @Field(2)
    public int buf_size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVProbeData buf_size(int buf_size) {
        this.io.setIntField(this, 2, buf_size);
        return this;
    }

    @Field(3)
    public Pointer<Byte> mime_type() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVProbeData mime_type(Pointer<Byte> mime_type) {
        this.io.setPointerField(this, 3, mime_type);
        return this;
    }

    public AVProbeData() {
    }

    public AVProbeData(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
