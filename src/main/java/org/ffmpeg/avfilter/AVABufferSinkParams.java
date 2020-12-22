//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;

@Library("avfilter")
public class AVABufferSinkParams extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<IntValuedEnum<AVSampleFormat>> sample_fmts() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVABufferSinkParams sample_fmts(Pointer<IntValuedEnum<AVSampleFormat>> sample_fmts) {
        this.io.setPointerField(this, 0, sample_fmts);
        return this;
    }

    @Field(1)
    public Pointer<Long> channel_layouts() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVABufferSinkParams channel_layouts(Pointer<Long> channel_layouts) {
        this.io.setPointerField(this, 1, channel_layouts);
        return this;
    }

    @Field(2)
    public Pointer<Integer> channel_counts() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public AVABufferSinkParams channel_counts(Pointer<Integer> channel_counts) {
        this.io.setPointerField(this, 2, channel_counts);
        return this;
    }

    @Field(3)
    public int all_channel_counts() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public AVABufferSinkParams all_channel_counts(int all_channel_counts) {
        this.io.setIntField(this, 3, all_channel_counts);
        return this;
    }

    @Field(4)
    public Pointer<Integer> sample_rates() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVABufferSinkParams sample_rates(Pointer<Integer> sample_rates) {
        this.io.setPointerField(this, 4, sample_rates);
        return this;
    }

    public AVABufferSinkParams() {
    }

    public AVABufferSinkParams(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
