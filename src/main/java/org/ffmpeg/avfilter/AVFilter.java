//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avutil.AVClass;

@Library("avfilter")
public class AVFilter extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVFilter name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> description() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVFilter description(Pointer<Byte> description) {
        this.io.setPointerField(this, 1, description);
        return this;
    }

    @Field(2)
    public Pointer<AVFilterPad> inputs() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVFilter inputs(Pointer<AVFilterPad> inputs) {
        this.io.setPointerField(this, 2, inputs);
        return this;
    }

    @Field(3)
    public Pointer<AVFilterPad> outputs() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVFilter outputs(Pointer<AVFilterPad> outputs) {
        this.io.setPointerField(this, 3, outputs);
        return this;
    }

    @Field(4)
    public Pointer<AVClass> priv_class() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVFilter priv_class(Pointer<AVClass> priv_class) {
        this.io.setPointerField(this, 4, priv_class);
        return this;
    }

    @Field(5)
    public int flags() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVFilter flags(int flags) {
        this.io.setIntField(this, 5, flags);
        return this;
    }

    @Field(6)
    public Pointer<AVFilter.preinit_callback> preinit() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVFilter preinit(Pointer<AVFilter.preinit_callback> preinit) {
        this.io.setPointerField(this, 6, preinit);
        return this;
    }

    @Field(7)
    public Pointer<AVFilter.init_callback> init() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVFilter init(Pointer<AVFilter.init_callback> init) {
        this.io.setPointerField(this, 7, init);
        return this;
    }

    @Field(8)
    public Pointer<AVFilter.init_dict_callback> init_dict() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVFilter init_dict(Pointer<AVFilter.init_dict_callback> init_dict) {
        this.io.setPointerField(this, 8, init_dict);
        return this;
    }

    @Field(9)
    public Pointer<AVFilter.uninit_callback> uninit() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVFilter uninit(Pointer<AVFilter.uninit_callback> uninit) {
        this.io.setPointerField(this, 9, uninit);
        return this;
    }

    @Field(10)
    public Pointer<AVFilter.query_formats_callback> query_formats() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVFilter query_formats(Pointer<AVFilter.query_formats_callback> query_formats) {
        this.io.setPointerField(this, 10, query_formats);
        return this;
    }

    @Field(11)
    public int priv_size() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVFilter priv_size(int priv_size) {
        this.io.setIntField(this, 11, priv_size);
        return this;
    }

    @Field(12)
    public int flags_internal() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVFilter flags_internal(int flags_internal) {
        this.io.setIntField(this, 12, flags_internal);
        return this;
    }

    @Field(13)
    public Pointer<AVFilter> next() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public AVFilter next(Pointer<AVFilter> next) {
        this.io.setPointerField(this, 13, next);
        return this;
    }

    @Field(14)
    public Pointer<AVFilter.process_command_callback> process_command() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public AVFilter process_command(Pointer<AVFilter.process_command_callback> process_command) {
        this.io.setPointerField(this, 14, process_command);
        return this;
    }

    @Field(15)
    public Pointer<AVFilter.init_opaque_callback> init_opaque() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVFilter init_opaque(Pointer<AVFilter.init_opaque_callback> init_opaque) {
        this.io.setPointerField(this, 15, init_opaque);
        return this;
    }

    @Field(16)
    public Pointer<AVFilter.activate_callback> activate() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public AVFilter activate(Pointer<AVFilter.activate_callback> activate) {
        this.io.setPointerField(this, 16, activate);
        return this;
    }

    public AVFilter() {
    }

    public AVFilter(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class activate_callback extends Callback<AVFilter.activate_callback> {
        public activate_callback() {
        }

        public int apply(Pointer<AVFilterContext> ctx) {
            return this.apply(Pointer.getPeer(ctx));
        }

        public int apply(@Ptr long ctx) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
        }
    }

    public abstract static class init_callback extends Callback<AVFilter.init_callback> {
        public init_callback() {
        }

        public int apply(Pointer<AVFilterContext> ctx) {
            return this.apply(Pointer.getPeer(ctx));
        }

        public int apply(@Ptr long ctx) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
        }
    }

    public abstract static class init_dict_callback extends Callback<AVFilter.init_dict_callback> {
        public init_dict_callback() {
        }

        public int apply(Pointer<AVFilterContext> ctx, Pointer<Pointer> options) {
            return this.apply(Pointer.getPeer(ctx), Pointer.getPeer(options));
        }

        public int apply(@Ptr long ctx, @Ptr long options) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(options, Pointer.class));
        }
    }

    public abstract static class init_opaque_callback extends Callback<AVFilter.init_opaque_callback> {
        public init_opaque_callback() {
        }

        public int apply(Pointer<AVFilterContext> ctx, Pointer<?> opaque) {
            return this.apply(Pointer.getPeer(ctx), Pointer.getPeer(opaque));
        }

        public int apply(@Ptr long ctx, @Ptr long opaque) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(opaque));
        }
    }

    public abstract static class preinit_callback extends Callback<AVFilter.preinit_callback> {
        public preinit_callback() {
        }

        public int apply(Pointer<AVFilterContext> ctx) {
            return this.apply(Pointer.getPeer(ctx));
        }

        public int apply(@Ptr long ctx) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
        }
    }

    public abstract static class process_command_callback extends Callback<AVFilter.process_command_callback> {
        public process_command_callback() {
        }

        public int apply(Pointer<AVFilterContext> AVFilterContextPtr1, Pointer<Byte> cmd, Pointer<Byte> arg, Pointer<Byte> res, int res_len, int flags) {
            return this.apply(Pointer.getPeer(AVFilterContextPtr1), Pointer.getPeer(cmd), Pointer.getPeer(arg), Pointer.getPeer(res), res_len, flags);
        }

        public int apply(@Ptr long AVFilterContextPtr1, @Ptr long cmd, @Ptr long arg, @Ptr long res, int res_len, int flags) {
            return this.apply(Pointer.pointerToAddress(AVFilterContextPtr1, AVFilterContext.class), Pointer.pointerToAddress(cmd, Byte.class), Pointer.pointerToAddress(arg, Byte.class), Pointer.pointerToAddress(res, Byte.class), res_len, flags);
        }
    }

    public abstract static class query_formats_callback extends Callback<AVFilter.query_formats_callback> {
        public query_formats_callback() {
        }

        public int apply(Pointer<AVFilterContext> AVFilterContextPtr1) {
            return this.apply(Pointer.getPeer(AVFilterContextPtr1));
        }

        public int apply(@Ptr long AVFilterContextPtr1) {
            return this.apply(Pointer.pointerToAddress(AVFilterContextPtr1, AVFilterContext.class));
        }
    }

    public abstract static class uninit_callback extends Callback<AVFilter.uninit_callback> {
        public uninit_callback() {
        }

        public void apply(Pointer<AVFilterContext> ctx) {
            this.apply(Pointer.getPeer(ctx));
        }

        public void apply(@Ptr long ctx) {
            this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
        }
    }
}
