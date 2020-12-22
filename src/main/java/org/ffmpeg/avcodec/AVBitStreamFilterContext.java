package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("avcodec")
public class AVBitStreamFilterContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVBitStreamFilterContext priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 0, priv_data);
        return this;
    }

    @Field(1)
    public Pointer<AVBitStreamFilter> filter() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVBitStreamFilterContext filter(Pointer<AVBitStreamFilter> filter) {
        this.io.setPointerField(this, 1, filter);
        return this;
    }

    @Field(2)
    public Pointer<AVCodecParserContext> parser() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVBitStreamFilterContext parser(Pointer<AVCodecParserContext> parser) {
        this.io.setPointerField(this, 2, parser);
        return this;
    }

    @Field(3)
    public Pointer<AVBitStreamFilterContext> next() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVBitStreamFilterContext next(Pointer<AVBitStreamFilterContext> next) {
        this.io.setPointerField(this, 3, next);
        return this;
    }

    @Field(4)
    public Pointer<Byte> args() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVBitStreamFilterContext args(Pointer<Byte> args) {
        this.io.setPointerField(this, 4, args);
        return this;
    }

    public AVBitStreamFilterContext() {
    }

    public AVBitStreamFilterContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
