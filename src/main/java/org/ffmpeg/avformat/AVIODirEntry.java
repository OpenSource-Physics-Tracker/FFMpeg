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
public class AVIODirEntry extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVIODirEntry name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public int type() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVIODirEntry type(int type) {
        this.io.setIntField(this, 1, type);
        return this;
    }

    @Field(2)
    public int utf8() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVIODirEntry utf8(int utf8) {
        this.io.setIntField(this, 2, utf8);
        return this;
    }

    @Field(3)
    public long size() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public AVIODirEntry size(long size) {
        this.io.setLongField(this, 3, size);
        return this;
    }

    @Field(4)
    public long modification_timestamp() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public AVIODirEntry modification_timestamp(long modification_timestamp) {
        this.io.setLongField(this, 4, modification_timestamp);
        return this;
    }

    @Field(5)
    public long access_timestamp() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public AVIODirEntry access_timestamp(long access_timestamp) {
        this.io.setLongField(this, 5, access_timestamp);
        return this;
    }

    @Field(6)
    public long status_change_timestamp() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public AVIODirEntry status_change_timestamp(long status_change_timestamp) {
        this.io.setLongField(this, 6, status_change_timestamp);
        return this;
    }

    @Field(7)
    public long user_id() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public AVIODirEntry user_id(long user_id) {
        this.io.setLongField(this, 7, user_id);
        return this;
    }

    @Field(8)
    public long group_id() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public AVIODirEntry group_id(long group_id) {
        this.io.setLongField(this, 8, group_id);
        return this;
    }

    @Field(9)
    public long filemode() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public AVIODirEntry filemode(long filemode) {
        this.io.setLongField(this, 9, filemode);
        return this;
    }

    public AVIODirEntry() {
    }

    public AVIODirEntry(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
