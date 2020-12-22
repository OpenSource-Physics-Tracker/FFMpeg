//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("avcodec")
public class AVCodecParser extends StructObject {
    static {
        BridJ.register();
    }

    @Array({5L})
    @Field(0)
    public Pointer<Integer> codec_ids() {
        return this.io.getPointerField(this, 0);
    }

    @Field(1)
    public int priv_data_size() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVCodecParser priv_data_size(int priv_data_size) {
        this.io.setIntField(this, 1, priv_data_size);
        return this;
    }

    @Field(2)
    public Pointer<AVCodecParser.parser_init_callback> parser_init() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVCodecParser parser_init(Pointer<AVCodecParser.parser_init_callback> parser_init) {
        this.io.setPointerField(this, 2, parser_init);
        return this;
    }

    @Field(3)
    public Pointer<AVCodecParser.parser_parse_callback> parser_parse() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVCodecParser parser_parse(Pointer<AVCodecParser.parser_parse_callback> parser_parse) {
        this.io.setPointerField(this, 3, parser_parse);
        return this;
    }

    @Field(4)
    public Pointer<AVCodecParser.parser_close_callback> parser_close() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVCodecParser parser_close(Pointer<AVCodecParser.parser_close_callback> parser_close) {
        this.io.setPointerField(this, 4, parser_close);
        return this;
    }

    @Field(5)
    public Pointer<AVCodecParser.split_callback> split() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVCodecParser split(Pointer<AVCodecParser.split_callback> split) {
        this.io.setPointerField(this, 5, split);
        return this;
    }

    @Field(6)
    public Pointer<AVCodecParser> next() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVCodecParser next(Pointer<AVCodecParser> next) {
        this.io.setPointerField(this, 6, next);
        return this;
    }

    public AVCodecParser() {
    }

    public AVCodecParser(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class parser_close_callback extends Callback<AVCodecParser.parser_close_callback> {
        public parser_close_callback() {
        }

        public void apply(Pointer<AVCodecParserContext> s) {
            this.apply(Pointer.getPeer(s));
        }

        public void apply(@Ptr long s) {
            this.apply(Pointer.pointerToAddress(s, AVCodecParserContext.class));
        }
    }

    public abstract static class parser_init_callback extends Callback<AVCodecParser.parser_init_callback> {
        public parser_init_callback() {
        }

        public int apply(Pointer<AVCodecParserContext> s) {
            return this.apply(Pointer.getPeer(s));
        }

        public int apply(@Ptr long s) {
            return this.apply(Pointer.pointerToAddress(s, AVCodecParserContext.class));
        }
    }

    public abstract static class parser_parse_callback extends Callback<AVCodecParser.parser_parse_callback> {
        public parser_parse_callback() {
        }

        public int apply(Pointer<AVCodecParserContext> s, Pointer<AVCodecContext> avctx, Pointer<Pointer> poutbuf, Pointer<Integer> poutbuf_size, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(avctx), Pointer.getPeer(poutbuf), Pointer.getPeer(poutbuf_size), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long s, @Ptr long avctx, @Ptr long poutbuf, @Ptr long poutbuf_size, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(s, AVCodecParserContext.class), Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(poutbuf, Pointer.class), Pointer.pointerToAddress(poutbuf_size, Integer.class), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class split_callback extends Callback<AVCodecParser.split_callback> {
        public split_callback() {
        }

        public int apply(Pointer<AVCodecContext> avctx, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(avctx), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long avctx, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }
}
