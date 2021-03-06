//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avcodec.AvcodecLibrary.AVFieldOrder;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVChromaLocation;
import org.ffmpeg.avutil.AvutilLibrary.AVColorPrimaries;
import org.ffmpeg.avutil.AvutilLibrary.AVColorRange;
import org.ffmpeg.avutil.AvutilLibrary.AVColorSpace;
import org.ffmpeg.avutil.AvutilLibrary.AVColorTransferCharacteristic;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;

@Library("avcodec")
public class AVCodecParameters extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public IntValuedEnum<AVMediaType> codec_type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public AVCodecParameters codec_type(IntValuedEnum<AVMediaType> codec_type) {
        this.io.setEnumField(this, 0, codec_type);
        return this;
    }

    @Field(1)
    public IntValuedEnum<AVCodecID> codec_id() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public AVCodecParameters codec_id(IntValuedEnum<AVCodecID> codec_id) {
        this.io.setEnumField(this, 1, codec_id);
        return this;
    }

    @Field(2)
    public int codec_tag() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVCodecParameters codec_tag(int codec_tag) {
        this.io.setIntField(this, 2, codec_tag);
        return this;
    }

    @Field(3)
    public Pointer<Byte> extradata() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVCodecParameters extradata(Pointer<Byte> extradata) {
        this.io.setPointerField(this, 3, extradata);
        return this;
    }

    @Field(4)
    public int extradata_size() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public AVCodecParameters extradata_size(int extradata_size) {
        this.io.setIntField(this, 4, extradata_size);
        return this;
    }

    @Field(5)
    public int format() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVCodecParameters format(int format) {
        this.io.setIntField(this, 5, format);
        return this;
    }

    @Field(6)
    public long bit_rate() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public AVCodecParameters bit_rate(long bit_rate) {
        this.io.setLongField(this, 6, bit_rate);
        return this;
    }

    @Field(7)
    public int bits_per_coded_sample() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public AVCodecParameters bits_per_coded_sample(int bits_per_coded_sample) {
        this.io.setIntField(this, 7, bits_per_coded_sample);
        return this;
    }

    @Field(8)
    public int bits_per_raw_sample() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public AVCodecParameters bits_per_raw_sample(int bits_per_raw_sample) {
        this.io.setIntField(this, 8, bits_per_raw_sample);
        return this;
    }

    @Field(9)
    public int profile() {
        return this.io.getIntField(this, 9);
    }

    @Field(9)
    public AVCodecParameters profile(int profile) {
        this.io.setIntField(this, 9, profile);
        return this;
    }

    @Field(10)
    public int level() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    public AVCodecParameters level(int level) {
        this.io.setIntField(this, 10, level);
        return this;
    }

    @Field(11)
    public int width() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVCodecParameters width(int width) {
        this.io.setIntField(this, 11, width);
        return this;
    }

    @Field(12)
    public int height() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVCodecParameters height(int height) {
        this.io.setIntField(this, 12, height);
        return this;
    }

    @Field(13)
    public AVRational sample_aspect_ratio() {
        return (AVRational)this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public AVCodecParameters sample_aspect_ratio(AVRational sample_aspect_ratio) {
        this.io.setNativeObjectField(this, 13, sample_aspect_ratio);
        return this;
    }

    @Field(14)
    public IntValuedEnum<AVFieldOrder> field_order() {
        return this.io.getEnumField(this, 14);
    }

    @Field(14)
    public AVCodecParameters field_order(IntValuedEnum<AVFieldOrder> field_order) {
        this.io.setEnumField(this, 14, field_order);
        return this;
    }

    @Field(15)
    public IntValuedEnum<AVColorRange> color_range() {
        return this.io.getEnumField(this, 15);
    }

    @Field(15)
    public AVCodecParameters color_range(IntValuedEnum<AVColorRange> color_range) {
        this.io.setEnumField(this, 15, color_range);
        return this;
    }

    @Field(16)
    public IntValuedEnum<AVColorPrimaries> color_primaries() {
        return this.io.getEnumField(this, 16);
    }

    @Field(16)
    public AVCodecParameters color_primaries(IntValuedEnum<AVColorPrimaries> color_primaries) {
        this.io.setEnumField(this, 16, color_primaries);
        return this;
    }

    @Field(17)
    public IntValuedEnum<AVColorTransferCharacteristic> color_trc() {
        return this.io.getEnumField(this, 17);
    }

    @Field(17)
    public AVCodecParameters color_trc(IntValuedEnum<AVColorTransferCharacteristic> color_trc) {
        this.io.setEnumField(this, 17, color_trc);
        return this;
    }

    @Field(18)
    public IntValuedEnum<AVColorSpace> color_space() {
        return this.io.getEnumField(this, 18);
    }

    @Field(18)
    public AVCodecParameters color_space(IntValuedEnum<AVColorSpace> color_space) {
        this.io.setEnumField(this, 18, color_space);
        return this;
    }

    @Field(19)
    public IntValuedEnum<AVChromaLocation> chroma_location() {
        return this.io.getEnumField(this, 19);
    }

    @Field(19)
    public AVCodecParameters chroma_location(IntValuedEnum<AVChromaLocation> chroma_location) {
        this.io.setEnumField(this, 19, chroma_location);
        return this;
    }

    @Field(20)
    public int video_delay() {
        return this.io.getIntField(this, 20);
    }

    @Field(20)
    public AVCodecParameters video_delay(int video_delay) {
        this.io.setIntField(this, 20, video_delay);
        return this;
    }

    @Field(21)
    public long channel_layout() {
        return this.io.getLongField(this, 21);
    }

    @Field(21)
    public AVCodecParameters channel_layout(long channel_layout) {
        this.io.setLongField(this, 21, channel_layout);
        return this;
    }

    @Field(22)
    public int channels() {
        return this.io.getIntField(this, 22);
    }

    @Field(22)
    public AVCodecParameters channels(int channels) {
        this.io.setIntField(this, 22, channels);
        return this;
    }

    @Field(23)
    public int sample_rate() {
        return this.io.getIntField(this, 23);
    }

    @Field(23)
    public AVCodecParameters sample_rate(int sample_rate) {
        this.io.setIntField(this, 23, sample_rate);
        return this;
    }

    @Field(24)
    public int block_align() {
        return this.io.getIntField(this, 24);
    }

    @Field(24)
    public AVCodecParameters block_align(int block_align) {
        this.io.setIntField(this, 24, block_align);
        return this;
    }

    @Field(25)
    public int frame_size() {
        return this.io.getIntField(this, 25);
    }

    @Field(25)
    public AVCodecParameters frame_size(int frame_size) {
        this.io.setIntField(this, 25, frame_size);
        return this;
    }

    @Field(26)
    public int initial_padding() {
        return this.io.getIntField(this, 26);
    }

    @Field(26)
    public AVCodecParameters initial_padding(int initial_padding) {
        this.io.setIntField(this, 26, initial_padding);
        return this;
    }

    @Field(27)
    public int trailing_padding() {
        return this.io.getIntField(this, 27);
    }

    @Field(27)
    public AVCodecParameters trailing_padding(int trailing_padding) {
        this.io.setIntField(this, 27, trailing_padding);
        return this;
    }

    @Field(28)
    public int seek_preroll() {
        return this.io.getIntField(this, 28);
    }

    @Field(28)
    public AVCodecParameters seek_preroll(int seek_preroll) {
        this.io.setIntField(this, 28, seek_preroll);
        return this;
    }

    public AVCodecParameters() {
    }

    public AVCodecParameters(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
