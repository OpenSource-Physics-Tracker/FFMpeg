//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avdevice;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avdevice")
public class AVDeviceInfoList extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Pointer<AVDeviceInfo>> devices() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVDeviceInfoList devices(Pointer<Pointer<AVDeviceInfo>> devices) {
        this.io.setPointerField(this, 0, devices);
        return this;
    }

    @Field(1)
    public int nb_devices() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVDeviceInfoList nb_devices(int nb_devices) {
        this.io.setIntField(this, 1, nb_devices);
        return this;
    }

    @Field(2)
    public int default_device() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVDeviceInfoList default_device(int default_device) {
        this.io.setIntField(this, 2, default_device);
        return this;
    }

    public AVDeviceInfoList() {
    }

    public AVDeviceInfoList(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
