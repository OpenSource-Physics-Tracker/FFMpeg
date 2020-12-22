//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
import org.ffmpeg.avutil.AvutilLibrary.AVOptionType;

@Library("avutil")
public class AVOption extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<Byte> name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVOption name(Pointer<Byte> name) {
        this.io.setPointerField(this, 0, name);
        return this;
    }

    @Field(1)
    public Pointer<Byte> help() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVOption help(Pointer<Byte> help) {
        this.io.setPointerField(this, 1, help);
        return this;
    }

    @Field(2)
    public int offset() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVOption offset(int offset) {
        this.io.setIntField(this, 2, offset);
        return this;
    }

    @Field(3)
    public IntValuedEnum<AVOptionType> type() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public AVOption type(IntValuedEnum<AVOptionType> type) {
        this.io.setEnumField(this, 3, type);
        return this;
    }

    @Field(4)
    public AVOption.default_val_union default_val() {
        return (AVOption.default_val_union)this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public AVOption default_val(AVOption.default_val_union default_val) {
        this.io.setNativeObjectField(this, 4, default_val);
        return this;
    }

    @Field(5)
    public double min() {
        return this.io.getDoubleField(this, 5);
    }

    @Field(5)
    public AVOption min(double min) {
        this.io.setDoubleField(this, 5, min);
        return this;
    }

    @Field(6)
    public double max() {
        return this.io.getDoubleField(this, 6);
    }

    @Field(6)
    public AVOption max(double max) {
        this.io.setDoubleField(this, 6, max);
        return this;
    }

    @Field(7)
    public int flags() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVOption flags(int flags) {
        this.io.setIntField(this, 7, flags);
        return this;
    }

    @Field(8)
    public Pointer<Byte> unit() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVOption unit(Pointer<Byte> unit) {
        this.io.setPointerField(this, 8, unit);
        return this;
    }

    public AVOption() {
    }

    public AVOption(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    @Union
    public static class default_val_union extends StructObject {
        static {
            BridJ.register();
        }

        @Field(0)
        public long i64() {
            return this.io.getLongField(this, 0);
        }

        @Field(0)
        public AVOption.default_val_union i64(long i64) {
            this.io.setLongField(this, 0, i64);
            return this;
        }

        @Field(1)
        public double dbl() {
            return this.io.getDoubleField(this, 1);
        }

        @Field(1)
        public AVOption.default_val_union dbl(double dbl) {
            this.io.setDoubleField(this, 1, dbl);
            return this;
        }

        @Field(2)
        public Pointer<Byte> str() {
            return this.io.getPointerField(this, 2);
        }

        @Field(2)
        public AVOption.default_val_union str(Pointer<Byte> str) {
            this.io.setPointerField(this, 2, str);
            return this;
        }

        @Field(3)
        public AVRational q() {
            return (AVRational)this.io.getNativeObjectField(this, 3);
        }

        @Field(3)
        public AVOption.default_val_union q(AVRational q) {
            this.io.setNativeObjectField(this, 3, q);
            return this;
        }

        public default_val_union() {
        }

        public default_val_union(Pointer pointer) {
            super(pointer, new Object[0]);
        }
    }
}
