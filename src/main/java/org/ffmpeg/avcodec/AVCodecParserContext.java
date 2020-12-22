//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVFieldOrder;
import org.ffmpeg.avcodec.AvcodecLibrary.AVPictureStructure;

@Library("avcodec")
public class AVCodecParserContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVCodecParserContext priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 0, priv_data);
        return this;
    }

    @Field(1)
    public Pointer<AVCodecParser> parser() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVCodecParserContext parser(Pointer<AVCodecParser> parser) {
        this.io.setPointerField(this, 1, parser);
        return this;
    }

    @Field(2)
    public long frame_offset() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public AVCodecParserContext frame_offset(long frame_offset) {
        this.io.setLongField(this, 2, frame_offset);
        return this;
    }

    @Field(3)
    public long cur_offset() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public AVCodecParserContext cur_offset(long cur_offset) {
        this.io.setLongField(this, 3, cur_offset);
        return this;
    }

    @Field(4)
    public long next_frame_offset() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public AVCodecParserContext next_frame_offset(long next_frame_offset) {
        this.io.setLongField(this, 4, next_frame_offset);
        return this;
    }

    @Field(5)
    public int pict_type() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVCodecParserContext pict_type(int pict_type) {
        this.io.setIntField(this, 5, pict_type);
        return this;
    }

    @Field(6)
    public int repeat_pict() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVCodecParserContext repeat_pict(int repeat_pict) {
        this.io.setIntField(this, 6, repeat_pict);
        return this;
    }

    @Field(7)
    public long pts() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public AVCodecParserContext pts(long pts) {
        this.io.setLongField(this, 7, pts);
        return this;
    }

    @Field(8)
    public long dts() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public AVCodecParserContext dts(long dts) {
        this.io.setLongField(this, 8, dts);
        return this;
    }

    @Field(9)
    public long last_pts() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public AVCodecParserContext last_pts(long last_pts) {
        this.io.setLongField(this, 9, last_pts);
        return this;
    }

    @Field(10)
    public long last_dts() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    public AVCodecParserContext last_dts(long last_dts) {
        this.io.setLongField(this, 10, last_dts);
        return this;
    }

    @Field(11)
    public int fetch_timestamp() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVCodecParserContext fetch_timestamp(int fetch_timestamp) {
        this.io.setIntField(this, 11, fetch_timestamp);
        return this;
    }

    @Field(12)
    public int cur_frame_start_index() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVCodecParserContext cur_frame_start_index(int cur_frame_start_index) {
        this.io.setIntField(this, 12, cur_frame_start_index);
        return this;
    }

    @Array({4L})
    @Field(13)
    public Pointer<Long> cur_frame_offset() {
        return this.io.getPointerField(this, 13);
    }

    @Array({4L})
    @Field(14)
    public Pointer<Long> cur_frame_pts() {
        return this.io.getPointerField(this, 14);
    }

    @Array({4L})
    @Field(15)
    public Pointer<Long> cur_frame_dts() {
        return this.io.getPointerField(this, 15);
    }

    @Field(16)
    public int flags() {
        return this.io.getIntField(this, 16);
    }

    @Field(16)
    public AVCodecParserContext flags(int flags) {
        this.io.setIntField(this, 16, flags);
        return this;
    }

    @Field(17)
    public long offset() {
        return this.io.getLongField(this, 17);
    }

    @Field(17)
    public AVCodecParserContext offset(long offset) {
        this.io.setLongField(this, 17, offset);
        return this;
    }

    @Array({4L})
    @Field(18)
    public Pointer<Long> cur_frame_end() {
        return this.io.getPointerField(this, 18);
    }

    @Field(19)
    public int key_frame() {
        return this.io.getIntField(this, 19);
    }

    @Field(19)
    public AVCodecParserContext key_frame(int key_frame) {
        this.io.setIntField(this, 19, key_frame);
        return this;
    }

    /** @deprecated */
    @Field(20)
    public long convergence_duration() {
        return this.io.getLongField(this, 20);
    }

    /** @deprecated */
    @Field(20)
    public AVCodecParserContext convergence_duration(long convergence_duration) {
        this.io.setLongField(this, 20, convergence_duration);
        return this;
    }

    @Field(21)
    public int dts_sync_point() {
        return this.io.getIntField(this, 21);
    }

    @Field(21)
    public AVCodecParserContext dts_sync_point(int dts_sync_point) {
        this.io.setIntField(this, 21, dts_sync_point);
        return this;
    }

    @Field(22)
    public int dts_ref_dts_delta() {
        return this.io.getIntField(this, 22);
    }

    @Field(22)
    public AVCodecParserContext dts_ref_dts_delta(int dts_ref_dts_delta) {
        this.io.setIntField(this, 22, dts_ref_dts_delta);
        return this;
    }

    @Field(23)
    public int pts_dts_delta() {
        return this.io.getIntField(this, 23);
    }

    @Field(23)
    public AVCodecParserContext pts_dts_delta(int pts_dts_delta) {
        this.io.setIntField(this, 23, pts_dts_delta);
        return this;
    }

    @Array({4L})
    @Field(24)
    public Pointer<Long> cur_frame_pos() {
        return this.io.getPointerField(this, 24);
    }

    @Field(25)
    public long pos() {
        return this.io.getLongField(this, 25);
    }

    @Field(25)
    public AVCodecParserContext pos(long pos) {
        this.io.setLongField(this, 25, pos);
        return this;
    }

    @Field(26)
    public long last_pos() {
        return this.io.getLongField(this, 26);
    }

    @Field(26)
    public AVCodecParserContext last_pos(long last_pos) {
        this.io.setLongField(this, 26, last_pos);
        return this;
    }

    @Field(27)
    public int duration() {
        return this.io.getIntField(this, 27);
    }

    @Field(27)
    public AVCodecParserContext duration(int duration) {
        this.io.setIntField(this, 27, duration);
        return this;
    }

    @Field(28)
    public IntValuedEnum<AVFieldOrder> field_order() {
        return this.io.getEnumField(this, 28);
    }

    @Field(28)
    public AVCodecParserContext field_order(IntValuedEnum<AVFieldOrder> field_order) {
        this.io.setEnumField(this, 28, field_order);
        return this;
    }

    @Field(29)
    public IntValuedEnum<AVPictureStructure> picture_structure() {
        return this.io.getEnumField(this, 29);
    }

    @Field(29)
    public AVCodecParserContext picture_structure(IntValuedEnum<AVPictureStructure> picture_structure) {
        this.io.setEnumField(this, 29, picture_structure);
        return this;
    }

    @Field(30)
    public int output_picture_number() {
        return this.io.getIntField(this, 30);
    }

    @Field(30)
    public AVCodecParserContext output_picture_number(int output_picture_number) {
        this.io.setIntField(this, 30, output_picture_number);
        return this;
    }

    @Field(31)
    public int width() {
        return this.io.getIntField(this, 31);
    }

    @Field(31)
    public AVCodecParserContext width(int width) {
        this.io.setIntField(this, 31, width);
        return this;
    }

    @Field(32)
    public int height() {
        return this.io.getIntField(this, 32);
    }

    @Field(32)
    public AVCodecParserContext height(int height) {
        this.io.setIntField(this, 32, height);
        return this;
    }

    @Field(33)
    public int coded_width() {
        return this.io.getIntField(this, 33);
    }

    @Field(33)
    public AVCodecParserContext coded_width(int coded_width) {
        this.io.setIntField(this, 33, coded_width);
        return this;
    }

    @Field(34)
    public int coded_height() {
        return this.io.getIntField(this, 34);
    }

    @Field(34)
    public AVCodecParserContext coded_height(int coded_height) {
        this.io.setIntField(this, 34, coded_height);
        return this;
    }

    @Field(35)
    public int format() {
        return this.io.getIntField(this, 35);
    }

    @Field(35)
    public AVCodecParserContext format(int format) {
        this.io.setIntField(this, 35, format);
        return this;
    }

    public AVCodecParserContext() {
    }

    public AVCodecParserContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
