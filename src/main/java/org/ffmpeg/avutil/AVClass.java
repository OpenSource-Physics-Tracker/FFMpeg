//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avutil.AvutilLibrary.AVClassCategory;

@Library("avutil")
public class AVClass extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> class_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVClass class_name(Pointer<Byte> class_name) {
        this.io.setPointerField(this, 0, class_name);
        return this;
    }

    @Field(1)
    public Pointer<AVClass.item_name_callback> item_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVClass item_name(Pointer<AVClass.item_name_callback> item_name) {
        this.io.setPointerField(this, 1, item_name);
        return this;
    }

    @Field(2)
    public Pointer<AVOption> option() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVClass option(Pointer<AVOption> option) {
        this.io.setPointerField(this, 2, option);
        return this;
    }

    @Field(3)
    public int version() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVClass version(int version) {
        this.io.setIntField(this, 3, version);
        return this;
    }

    @Field(4)
    public int log_level_offset_offset() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVClass log_level_offset_offset(int log_level_offset_offset) {
        this.io.setIntField(this, 4, log_level_offset_offset);
        return this;
    }

    @Field(5)
    public int parent_log_context_offset() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVClass parent_log_context_offset(int parent_log_context_offset) {
        this.io.setIntField(this, 5, parent_log_context_offset);
        return this;
    }

    @Field(6)
    public Pointer<AVClass.child_next_callback> child_next() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVClass child_next(Pointer<AVClass.child_next_callback> child_next) {
        this.io.setPointerField(this, 6, child_next);
        return this;
    }

    @Field(7)
    public Pointer<AVClass.child_class_next_callback> child_class_next() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVClass child_class_next(Pointer<AVClass.child_class_next_callback> child_class_next) {
        this.io.setPointerField(this, 7, child_class_next);
        return this;
    }

    @Field(8)
    public IntValuedEnum<AVClassCategory> category() {
        return this.io.getEnumField(this, 8);
    }

    @Field(8)
    public AVClass category(IntValuedEnum<AVClassCategory> category) {
        this.io.setEnumField(this, 8, category);
        return this;
    }

    @Field(9)
    public Pointer<AVClass.get_category_callback> get_category() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVClass get_category(Pointer<AVClass.get_category_callback> get_category) {
        this.io.setPointerField(this, 9, get_category);
        return this;
    }

    @Field(10)
    public Pointer<AVClass.query_ranges_callback> query_ranges() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVClass query_ranges(Pointer<AVClass.query_ranges_callback> query_ranges) {
        this.io.setPointerField(this, 10, query_ranges);
        return this;
    }

    public AVClass() {
    }

    public AVClass(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class child_class_next_callback extends Callback<AVClass.child_class_next_callback> {
        public child_class_next_callback() {
        }

        public Pointer<AVClass> apply(Pointer<AVClass> prev) {
            return Pointer.pointerToAddress(this.apply(Pointer.getPeer(prev)), AVClass.class);
        }

        @Ptr
        public long apply(@Ptr long prev) {
            return Pointer.getPeer(this.apply(Pointer.pointerToAddress(prev, AVClass.class)));
        }
    }

    public abstract static class child_next_callback extends Callback<AVClass.child_next_callback> {
        public child_next_callback() {
        }

        public Pointer<?> apply(Pointer<?> obj, Pointer<?> prev) {
            return Pointer.pointerToAddress(this.apply(Pointer.getPeer(obj), Pointer.getPeer(prev)));
        }

        @Ptr
        public long apply(@Ptr long obj, @Ptr long prev) {
            return Pointer.getPeer(this.apply(Pointer.pointerToAddress(obj), Pointer.pointerToAddress(prev)));
        }
    }

    public abstract static class get_category_callback extends Callback<AVClass.get_category_callback> {
        public get_category_callback() {
        }

        public IntValuedEnum<AVClassCategory> apply(Pointer<?> ctx) {
            return FlagSet.fromValue(this.apply(Pointer.getPeer(ctx)), AVClassCategory.class);
        }

        public int apply(@Ptr long ctx) {
            return (int)this.apply(Pointer.pointerToAddress(ctx)).value();
        }
    }

    public abstract static class item_name_callback extends Callback<AVClass.item_name_callback> {
        public item_name_callback() {
        }

        public Pointer<Byte> apply(Pointer<?> ctx) {
            return Pointer.pointerToAddress(this.apply(Pointer.getPeer(ctx)), Byte.class);
        }

        @Ptr
        public long apply(@Ptr long ctx) {
            return Pointer.getPeer(this.apply(Pointer.pointerToAddress(ctx)));
        }
    }

    public abstract static class query_ranges_callback extends Callback<AVClass.query_ranges_callback> {
        public query_ranges_callback() {
        }

        public int apply(Pointer<Pointer> AVOptionRangesPtrPtr1, Pointer<?> obj, Pointer<Byte> key, int flags) {
            return this.apply(Pointer.getPeer(AVOptionRangesPtrPtr1), Pointer.getPeer(obj), Pointer.getPeer(key), flags);
        }

        public int apply(@Ptr long AVOptionRangesPtrPtr1, @Ptr long obj, @Ptr long key, int flags) {
            return this.apply(Pointer.pointerToAddress(AVOptionRangesPtrPtr1, Pointer.class), Pointer.pointerToAddress(obj), Pointer.pointerToAddress(key, Byte.class), flags);
        }
    }
}
