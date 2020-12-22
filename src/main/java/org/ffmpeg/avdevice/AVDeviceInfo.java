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
public class AVDeviceInfo extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> device_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVDeviceInfo device_name(Pointer<Byte> device_name) {
        this.io.setPointerField(this, 0, device_name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> device_description() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVDeviceInfo device_description(Pointer<Byte> device_description) {
        this.io.setPointerField(this, 1, device_description);
        return this;
    }

    public AVDeviceInfo() {
    }

    public AVDeviceInfo(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
