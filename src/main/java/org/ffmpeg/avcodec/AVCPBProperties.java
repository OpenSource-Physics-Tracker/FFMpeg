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
public class AVCPBProperties extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public int max_bitrate() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public AVCPBProperties max_bitrate(int max_bitrate) {
        this.io.setIntField(this, 0, max_bitrate);
        return this;
    }

    @Field(1)
    public int min_bitrate() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVCPBProperties min_bitrate(int min_bitrate) {
        this.io.setIntField(this, 1, min_bitrate);
        return this;
    }

    @Field(2)
    public int avg_bitrate() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVCPBProperties avg_bitrate(int avg_bitrate) {
        this.io.setIntField(this, 2, avg_bitrate);
        return this;
    }

    @Field(3)
    public int buffer_size() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVCPBProperties buffer_size(int buffer_size) {
        this.io.setIntField(this, 3, buffer_size);
        return this;
    }

    @Field(4)
    public long vbv_delay() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public AVCPBProperties vbv_delay(long vbv_delay) {
        this.io.setLongField(this, 4, vbv_delay);
        return this;
    }

    public AVCPBProperties() {
    }

    public AVCPBProperties(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
