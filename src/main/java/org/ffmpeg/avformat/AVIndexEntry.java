//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avformat")
public class AVIndexEntry extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public long pos() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public AVIndexEntry pos(long pos) {
        this.io.setLongField(this, 0, pos);
        return this;
    }

    @Field(1)
    public long timestamp() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public AVIndexEntry timestamp(long timestamp) {
        this.io.setLongField(this, 1, timestamp);
        return this;
    }

    @Field(2)
    @Bits(2)
    public int flags() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    @Bits(2)
    public AVIndexEntry flags(int flags) {
        this.io.setIntField(this, 2, flags);
        return this;
    }

    @Field(3)
    @Bits(30)
    public int size() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    @Bits(30)
    public AVIndexEntry size(int size) {
        this.io.setIntField(this, 3, size);
        return this;
    }

    @Field(4)
    public int min_distance() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVIndexEntry min_distance(int min_distance) {
        this.io.setIntField(this, 4, min_distance);
        return this;
    }

    public AVIndexEntry() {
    }

    public AVIndexEntry(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
