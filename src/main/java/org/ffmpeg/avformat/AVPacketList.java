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
import org.ffmpeg.avcodec.AVPacket;

@Library("avformat")
public class AVPacketList extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public AVPacket pkt() {
        return (AVPacket)this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public AVPacketList pkt(AVPacket pkt) {
        this.io.setNativeObjectField(this, 0, pkt);
        return this;
    }

    @Field(1)
    public Pointer<AVPacketList> next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVPacketList next(Pointer<AVPacketList> next) {
        this.io.setPointerField(this, 1, next);
        return this;
    }

    public AVPacketList() {
    }

    public AVPacketList(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
