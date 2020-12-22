//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avutil.AvutilLibrary.AVHWDeviceType;

@Library("avutil")
public class AVHWDeviceContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVHWDeviceContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<AVHWDeviceInternal> internal() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVHWDeviceContext internal(Pointer<AVHWDeviceInternal> internal) {
        this.io.setPointerField(this, 1, internal);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVHWDeviceType> type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVHWDeviceContext type(IntValuedEnum<AVHWDeviceType> type) {
        this.io.setEnumField(this, 2, type);
        return this;
    }

    @Field(3)
    public Pointer<?> hwctx() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVHWDeviceContext hwctx(Pointer<?> hwctx) {
        this.io.setPointerField(this, 3, hwctx);
        return this;
    }

    @Field(4)
    public Pointer<org.ffmpeg.avutil.AVHWFramesContext.free_callback> free() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVHWDeviceContext free(Pointer<org.ffmpeg.avutil.AVHWFramesContext.free_callback> free) {
        this.io.setPointerField(this, 4, free);
        return this;
    }

    @Field(5)
    public Pointer<?> user_opaque() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVHWDeviceContext user_opaque(Pointer<?> user_opaque) {
        this.io.setPointerField(this, 5, user_opaque);
        return this;
    }

    public AVHWDeviceContext() {
    }

    public AVHWDeviceContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class free_callback extends Callback<AVHWDeviceContext.free_callback> {
        public free_callback() {
        }

        public void apply(Pointer<AVHWDeviceContext> ctx) {
            this.apply(Pointer.getPeer(ctx));
        }

        public void apply(@Ptr long ctx) {
            this.apply(Pointer.pointerToAddress(ctx, AVHWDeviceContext.class));
        }
    }
}
