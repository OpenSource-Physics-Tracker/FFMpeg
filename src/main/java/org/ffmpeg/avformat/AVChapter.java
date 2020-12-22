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
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVRational;

@Library("avformat")
public class AVChapter extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int id() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVChapter id(int id) {
        this.io.setIntField(this, 0, id);
        return this;
    }

    @Field(1)
    public AVRational time_base() {
        return (AVRational)this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public AVChapter time_base(AVRational time_base) {
        this.io.setNativeObjectField(this, 1, time_base);
        return this;
    }

    @Field(2)
    public long start() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public AVChapter start(long start) {
        this.io.setLongField(this, 2, start);
        return this;
    }

    @Field(3)
    public long end() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public AVChapter end(long end) {
        this.io.setLongField(this, 3, end);
        return this;
    }

    @Field(4)
    public Pointer<AVDictionary> metadata() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVChapter metadata(Pointer<AVDictionary> metadata) {
        this.io.setPointerField(this, 4, metadata);
        return this;
    }

    public AVChapter() {
    }

    public AVChapter(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
