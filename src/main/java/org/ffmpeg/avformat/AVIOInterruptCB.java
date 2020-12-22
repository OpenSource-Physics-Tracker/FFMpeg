//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("avformat")
public class AVIOInterruptCB extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVIOInterruptCB.callback_callback> callback() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVIOInterruptCB callback(Pointer<AVIOInterruptCB.callback_callback> callback) {
        this.io.setPointerField(this, 0, callback);
        return this;
    }

    @Field(1)
    public Pointer<?> opaque() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVIOInterruptCB opaque(Pointer<?> opaque) {
        this.io.setPointerField(this, 1, opaque);
        return this;
    }

    public AVIOInterruptCB() {
    }

    public AVIOInterruptCB(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class callback_callback extends Callback<AVIOInterruptCB.callback_callback> {
        public callback_callback() {
        }

        public int apply(Pointer<?> voidPtr1) {
            return this.apply(Pointer.getPeer(voidPtr1));
        }

        public int apply(@Ptr long voidPtr1) {
            return this.apply(Pointer.pointerToAddress(voidPtr1));
        }
    }
}
