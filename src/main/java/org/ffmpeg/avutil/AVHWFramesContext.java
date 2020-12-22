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
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("avutil")
public class AVHWFramesContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVHWFramesContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<AVHWFramesInternal> internal() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVHWFramesContext internal(Pointer<AVHWFramesInternal> internal) {
        this.io.setPointerField(this, 1, internal);
        return this;
    }

    @Field(2)
    public Pointer<AVBufferRef> device_ref() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVHWFramesContext device_ref(Pointer<AVBufferRef> device_ref) {
        this.io.setPointerField(this, 2, device_ref);
        return this;
    }

    @Field(3)
    public Pointer<AVHWDeviceContext> device_ctx() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVHWFramesContext device_ctx(Pointer<AVHWDeviceContext> device_ctx) {
        this.io.setPointerField(this, 3, device_ctx);
        return this;
    }

    @Field(4)
    public Pointer<?> hwctx() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVHWFramesContext hwctx(Pointer<?> hwctx) {
        this.io.setPointerField(this, 4, hwctx);
        return this;
    }

    @Field(5)
    public Pointer<AVHWFramesContext.free_callback> free() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVHWFramesContext free(Pointer<AVHWFramesContext.free_callback> free) {
        this.io.setPointerField(this, 5, free);
        return this;
    }

    @Field(6)
    public Pointer<?> user_opaque() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVHWFramesContext user_opaque(Pointer<?> user_opaque) {
        this.io.setPointerField(this, 6, user_opaque);
        return this;
    }

    @Field(7)
    public Pointer<AVBufferPool> pool() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVHWFramesContext pool(Pointer<AVBufferPool> pool) {
        this.io.setPointerField(this, 7, pool);
        return this;
    }

    @Field(8)
    public int initial_pool_size() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVHWFramesContext initial_pool_size(int initial_pool_size) {
        this.io.setIntField(this, 8, initial_pool_size);
        return this;
    }

    @Field(9)
    public IntValuedEnum<AVPixelFormat> format() {
        return this.io.getEnumField(this, 9);
    }

    @Field(9)
    public AVHWFramesContext format(IntValuedEnum<AVPixelFormat> format) {
        this.io.setEnumField(this, 9, format);
        return this;
    }

    @Field(10)
    public IntValuedEnum<AVPixelFormat> sw_format() {
        return this.io.getEnumField(this, 10);
    }

    @Field(10)
    public AVHWFramesContext sw_format(IntValuedEnum<AVPixelFormat> sw_format) {
        this.io.setEnumField(this, 10, sw_format);
        return this;
    }

    @Field(11)
    public int width() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVHWFramesContext width(int width) {
        this.io.setIntField(this, 11, width);
        return this;
    }

    @Field(12)
    public int height() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVHWFramesContext height(int height) {
        this.io.setIntField(this, 12, height);
        return this;
    }

    public AVHWFramesContext() {
    }

    public AVHWFramesContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class free_callback extends Callback<AVHWFramesContext.free_callback> {
        public free_callback() {
        }

        public void apply(Pointer<AVHWFramesContext> ctx) {
            this.apply(Pointer.getPeer(ctx));
        }

        public void apply(@Ptr long ctx) {
            this.apply(Pointer.pointerToAddress(ctx, AVHWFramesContext.class));
        }
    }
}
