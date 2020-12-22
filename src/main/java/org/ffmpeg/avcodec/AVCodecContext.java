//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avcodec;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Struct;
import org.ffmpeg.avcodec.AvcodecLibrary.AVAudioServiceType;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avcodec.AvcodecLibrary.AVDiscard;
import org.ffmpeg.avcodec.AvcodecLibrary.AVFieldOrder;
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVChromaLocation;
import org.ffmpeg.avutil.AvutilLibrary.AVColorPrimaries;
import org.ffmpeg.avutil.AvutilLibrary.AVColorRange;
import org.ffmpeg.avutil.AvutilLibrary.AVColorSpace;
import org.ffmpeg.avutil.AvutilLibrary.AVColorTransferCharacteristic;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
import org.ffmpeg.avutil.AvutilLibrary.AVSampleFormat;
import org.ffmpeg.util.AlignmentCustomizer;

@Library("avcodec")
public class AVCodecContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVCodecContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public int log_level_offset() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public AVCodecContext log_level_offset(int log_level_offset) {
        this.io.setIntField(this, 1, log_level_offset);
        return this;
    }

    @Field(2)
    public IntValuedEnum<AVMediaType> codec_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public AVCodecContext codec_type(IntValuedEnum<AVMediaType> codec_type) {
        this.io.setEnumField(this, 2, codec_type);
        return this;
    }

    @Field(3)
    public Pointer<AVCodec> codec() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVCodecContext codec(Pointer<AVCodec> codec) {
        this.io.setPointerField(this, 3, codec);
        return this;
    }

    @Field(4)
    public IntValuedEnum<AVCodecID> codec_id() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public AVCodecContext codec_id(IntValuedEnum<AVCodecID> codec_id) {
        this.io.setEnumField(this, 4, codec_id);
        return this;
    }

    @Field(5)
    public int codec_tag() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVCodecContext codec_tag(int codec_tag) {
        this.io.setIntField(this, 5, codec_tag);
        return this;
    }

    @Field(6)
    public Pointer<?> priv_data() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVCodecContext priv_data(Pointer<?> priv_data) {
        this.io.setPointerField(this, 6, priv_data);
        return this;
    }

    @Field(7)
    public Pointer<AVCodecInternal> internal() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVCodecContext internal(Pointer<AVCodecInternal> internal) {
        this.io.setPointerField(this, 7, internal);
        return this;
    }

    @Field(8)
    public Pointer<?> opaque() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVCodecContext opaque(Pointer<?> opaque) {
        this.io.setPointerField(this, 8, opaque);
        return this;
    }

    @Field(9)
    public long bit_rate() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public AVCodecContext bit_rate(long bit_rate) {
        this.io.setLongField(this, 9, bit_rate);
        return this;
    }

    @Field(10)
    public int bit_rate_tolerance() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    public AVCodecContext bit_rate_tolerance(int bit_rate_tolerance) {
        this.io.setIntField(this, 10, bit_rate_tolerance);
        return this;
    }

    @Field(11)
    public int global_quality() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVCodecContext global_quality(int global_quality) {
        this.io.setIntField(this, 11, global_quality);
        return this;
    }

    @Field(12)
    public int compression_level() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVCodecContext compression_level(int compression_level) {
        this.io.setIntField(this, 12, compression_level);
        return this;
    }

    @Field(13)
    public int flags() {
        return this.io.getIntField(this, 13);
    }

    @Field(13)
    public AVCodecContext flags(int flags) {
        this.io.setIntField(this, 13, flags);
        return this;
    }

    @Field(14)
    public int flags2() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public AVCodecContext flags2(int flags2) {
        this.io.setIntField(this, 14, flags2);
        return this;
    }

    @Field(15)
    public Pointer<Byte> extradata() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVCodecContext extradata(Pointer<Byte> extradata) {
        this.io.setPointerField(this, 15, extradata);
        return this;
    }

    @Field(16)
    public int extradata_size() {
        return this.io.getIntField(this, 16);
    }

    @Field(16)
    public AVCodecContext extradata_size(int extradata_size) {
        this.io.setIntField(this, 16, extradata_size);
        return this;
    }

    @Field(17)
    public AVRational time_base() {
        return (AVRational)this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public AVCodecContext time_base(AVRational time_base) {
        this.io.setNativeObjectField(this, 17, time_base);
        return this;
    }

    @Field(18)
    public int ticks_per_frame() {
        return this.io.getIntField(this, 18);
    }

    @Field(18)
    public AVCodecContext ticks_per_frame(int ticks_per_frame) {
        this.io.setIntField(this, 18, ticks_per_frame);
        return this;
    }

    @Field(19)
    public int delay() {
        return this.io.getIntField(this, 19);
    }

    @Field(19)
    public AVCodecContext delay(int delay) {
        this.io.setIntField(this, 19, delay);
        return this;
    }

    @Field(20)
    public int width() {
        return this.io.getIntField(this, 20);
    }

    @Field(20)
    public AVCodecContext width(int width) {
        this.io.setIntField(this, 20, width);
        return this;
    }

    @Field(21)
    public int height() {
        return this.io.getIntField(this, 21);
    }

    @Field(21)
    public AVCodecContext height(int height) {
        this.io.setIntField(this, 21, height);
        return this;
    }

    @Field(22)
    public int coded_width() {
        return this.io.getIntField(this, 22);
    }

    @Field(22)
    public AVCodecContext coded_width(int coded_width) {
        this.io.setIntField(this, 22, coded_width);
        return this;
    }

    @Field(23)
    public int coded_height() {
        return this.io.getIntField(this, 23);
    }

    @Field(23)
    public AVCodecContext coded_height(int coded_height) {
        this.io.setIntField(this, 23, coded_height);
        return this;
    }

    @Field(24)
    public int gop_size() {
        return this.io.getIntField(this, 24);
    }

    @Field(24)
    public AVCodecContext gop_size(int gop_size) {
        this.io.setIntField(this, 24, gop_size);
        return this;
    }

    @Field(25)
    public IntValuedEnum<AVPixelFormat> pix_fmt() {
        return this.io.getEnumField(this, 25);
    }

    @Field(25)
    public AVCodecContext pix_fmt(IntValuedEnum<AVPixelFormat> pix_fmt) {
        this.io.setEnumField(this, 25, pix_fmt);
        return this;
    }

    @Field(26)
    public Pointer<AVCodecContext.draw_horiz_band_callback> draw_horiz_band() {
        return this.io.getPointerField(this, 26);
    }

    @Field(26)
    public AVCodecContext draw_horiz_band(Pointer<AVCodecContext.draw_horiz_band_callback> draw_horiz_band) {
        this.io.setPointerField(this, 26, draw_horiz_band);
        return this;
    }

    @CLong
    @Field(27)
    public long get_format() {
        return this.io.getCLongField(this, 27);
    }

    @CLong
    @Field(27)
    public AVCodecContext get_format(long get_format) {
        this.io.setCLongField(this, 27, get_format);
        return this;
    }

    @Field(28)
    public int max_b_frames() {
        return this.io.getIntField(this, 28);
    }

    @Field(28)
    public AVCodecContext max_b_frames(int max_b_frames) {
        this.io.setIntField(this, 28, max_b_frames);
        return this;
    }

    @Field(29)
    public float b_quant_factor() {
        return this.io.getFloatField(this, 29);
    }

    @Field(29)
    public AVCodecContext b_quant_factor(float b_quant_factor) {
        this.io.setFloatField(this, 29, b_quant_factor);
        return this;
    }

    @Field(30)
    public int b_frame_strategy() {
        return this.io.getIntField(this, 30);
    }

    @Field(30)
    public AVCodecContext b_frame_strategy(int b_frame_strategy) {
        this.io.setIntField(this, 30, b_frame_strategy);
        return this;
    }

    @Field(31)
    public float b_quant_offset() {
        return this.io.getFloatField(this, 31);
    }

    @Field(31)
    public AVCodecContext b_quant_offset(float b_quant_offset) {
        this.io.setFloatField(this, 31, b_quant_offset);
        return this;
    }

    @Field(32)
    public int has_b_frames() {
        return this.io.getIntField(this, 32);
    }

    @Field(32)
    public AVCodecContext has_b_frames(int has_b_frames) {
        this.io.setIntField(this, 32, has_b_frames);
        return this;
    }

    /** @deprecated */
    @Field(33)
    public int mpeg_quant() {
        return this.io.getIntField(this, 33);
    }

    /** @deprecated */
    @Field(33)
    public AVCodecContext mpeg_quant(int mpeg_quant) {
        this.io.setIntField(this, 33, mpeg_quant);
        return this;
    }

    @Field(34)
    public float i_quant_factor() {
        return this.io.getFloatField(this, 34);
    }

    @Field(34)
    public AVCodecContext i_quant_factor(float i_quant_factor) {
        this.io.setFloatField(this, 34, i_quant_factor);
        return this;
    }

    @Field(35)
    public float i_quant_offset() {
        return this.io.getFloatField(this, 35);
    }

    @Field(35)
    public AVCodecContext i_quant_offset(float i_quant_offset) {
        this.io.setFloatField(this, 35, i_quant_offset);
        return this;
    }

    @Field(36)
    public float lumi_masking() {
        return this.io.getFloatField(this, 36);
    }

    @Field(36)
    public AVCodecContext lumi_masking(float lumi_masking) {
        this.io.setFloatField(this, 36, lumi_masking);
        return this;
    }

    @Field(37)
    public float temporal_cplx_masking() {
        return this.io.getFloatField(this, 37);
    }

    @Field(37)
    public AVCodecContext temporal_cplx_masking(float temporal_cplx_masking) {
        this.io.setFloatField(this, 37, temporal_cplx_masking);
        return this;
    }

    @Field(38)
    public float spatial_cplx_masking() {
        return this.io.getFloatField(this, 38);
    }

    @Field(38)
    public AVCodecContext spatial_cplx_masking(float spatial_cplx_masking) {
        this.io.setFloatField(this, 38, spatial_cplx_masking);
        return this;
    }

    @Field(39)
    public float p_masking() {
        return this.io.getFloatField(this, 39);
    }

    @Field(39)
    public AVCodecContext p_masking(float p_masking) {
        this.io.setFloatField(this, 39, p_masking);
        return this;
    }

    @Field(40)
    public float dark_masking() {
        return this.io.getFloatField(this, 40);
    }

    @Field(40)
    public AVCodecContext dark_masking(float dark_masking) {
        this.io.setFloatField(this, 40, dark_masking);
        return this;
    }

    @Field(41)
    public int slice_count() {
        return this.io.getIntField(this, 41);
    }

    @Field(41)
    public AVCodecContext slice_count(int slice_count) {
        this.io.setIntField(this, 41, slice_count);
        return this;
    }

    /** @deprecated */
    @Field(42)
    public int prediction_method() {
        return this.io.getIntField(this, 42);
    }

    /** @deprecated */
    @Field(42)
    public AVCodecContext prediction_method(int prediction_method) {
        this.io.setIntField(this, 42, prediction_method);
        return this;
    }

    @Field(43)
    public Pointer<Integer> slice_offset() {
        return this.io.getPointerField(this, 43);
    }

    @Field(43)
    public AVCodecContext slice_offset(Pointer<Integer> slice_offset) {
        this.io.setPointerField(this, 43, slice_offset);
        return this;
    }

    @Field(44)
    public AVRational sample_aspect_ratio() {
        return (AVRational)this.io.getNativeObjectField(this, 44);
    }

    @Field(44)
    public AVCodecContext sample_aspect_ratio(AVRational sample_aspect_ratio) {
        this.io.setNativeObjectField(this, 44, sample_aspect_ratio);
        return this;
    }

    @Field(45)
    public int me_cmp() {
        return this.io.getIntField(this, 45);
    }

    @Field(45)
    public AVCodecContext me_cmp(int me_cmp) {
        this.io.setIntField(this, 45, me_cmp);
        return this;
    }

    @Field(46)
    public int me_sub_cmp() {
        return this.io.getIntField(this, 46);
    }

    @Field(46)
    public AVCodecContext me_sub_cmp(int me_sub_cmp) {
        this.io.setIntField(this, 46, me_sub_cmp);
        return this;
    }

    @Field(47)
    public int mb_cmp() {
        return this.io.getIntField(this, 47);
    }

    @Field(47)
    public AVCodecContext mb_cmp(int mb_cmp) {
        this.io.setIntField(this, 47, mb_cmp);
        return this;
    }

    @Field(48)
    public int ildct_cmp() {
        return this.io.getIntField(this, 48);
    }

    @Field(48)
    public AVCodecContext ildct_cmp(int ildct_cmp) {
        this.io.setIntField(this, 48, ildct_cmp);
        return this;
    }

    @Field(49)
    public int dia_size() {
        return this.io.getIntField(this, 49);
    }

    @Field(49)
    public AVCodecContext dia_size(int dia_size) {
        this.io.setIntField(this, 49, dia_size);
        return this;
    }

    @Field(50)
    public int last_predictor_count() {
        return this.io.getIntField(this, 50);
    }

    @Field(50)
    public AVCodecContext last_predictor_count(int last_predictor_count) {
        this.io.setIntField(this, 50, last_predictor_count);
        return this;
    }

    /** @deprecated */
    @Field(51)
    public int pre_me() {
        return this.io.getIntField(this, 51);
    }

    /** @deprecated */
    @Field(51)
    public AVCodecContext pre_me(int pre_me) {
        this.io.setIntField(this, 51, pre_me);
        return this;
    }

    @Field(52)
    public int me_pre_cmp() {
        return this.io.getIntField(this, 52);
    }

    @Field(52)
    public AVCodecContext me_pre_cmp(int me_pre_cmp) {
        this.io.setIntField(this, 52, me_pre_cmp);
        return this;
    }

    @Field(53)
    public int pre_dia_size() {
        return this.io.getIntField(this, 53);
    }

    @Field(53)
    public AVCodecContext pre_dia_size(int pre_dia_size) {
        this.io.setIntField(this, 53, pre_dia_size);
        return this;
    }

    @Field(54)
    public int me_subpel_quality() {
        return this.io.getIntField(this, 54);
    }

    @Field(54)
    public AVCodecContext me_subpel_quality(int me_subpel_quality) {
        this.io.setIntField(this, 54, me_subpel_quality);
        return this;
    }

    @Field(55)
    public int me_range() {
        return this.io.getIntField(this, 55);
    }

    @Field(55)
    public AVCodecContext me_range(int me_range) {
        this.io.setIntField(this, 55, me_range);
        return this;
    }

    @Field(56)
    public int slice_flags() {
        return this.io.getIntField(this, 56);
    }

    @Field(56)
    public AVCodecContext slice_flags(int slice_flags) {
        this.io.setIntField(this, 56, slice_flags);
        return this;
    }

    @Field(57)
    public int mb_decision() {
        return this.io.getIntField(this, 57);
    }

    @Field(57)
    public AVCodecContext mb_decision(int mb_decision) {
        this.io.setIntField(this, 57, mb_decision);
        return this;
    }

    @Field(58)
    public Pointer<Short> intra_matrix() {
        return this.io.getPointerField(this, 58);
    }

    @Field(58)
    public AVCodecContext intra_matrix(Pointer<Short> intra_matrix) {
        this.io.setPointerField(this, 58, intra_matrix);
        return this;
    }

    @Field(59)
    public Pointer<Short> inter_matrix() {
        return this.io.getPointerField(this, 59);
    }

    @Field(59)
    public AVCodecContext inter_matrix(Pointer<Short> inter_matrix) {
        this.io.setPointerField(this, 59, inter_matrix);
        return this;
    }

    /** @deprecated */
    @Field(60)
    public int scenechange_threshold() {
        return this.io.getIntField(this, 60);
    }

    /** @deprecated */
    @Field(60)
    public AVCodecContext scenechange_threshold(int scenechange_threshold) {
        this.io.setIntField(this, 60, scenechange_threshold);
        return this;
    }

    /** @deprecated */
    @Field(61)
    public int noise_reduction() {
        return this.io.getIntField(this, 61);
    }

    /** @deprecated */
    @Field(61)
    public AVCodecContext noise_reduction(int noise_reduction) {
        this.io.setIntField(this, 61, noise_reduction);
        return this;
    }

    @Field(62)
    public int intra_dc_precision() {
        return this.io.getIntField(this, 62);
    }

    @Field(62)
    public AVCodecContext intra_dc_precision(int intra_dc_precision) {
        this.io.setIntField(this, 62, intra_dc_precision);
        return this;
    }

    @Field(63)
    public int skip_top() {
        return this.io.getIntField(this, 63);
    }

    @Field(63)
    public AVCodecContext skip_top(int skip_top) {
        this.io.setIntField(this, 63, skip_top);
        return this;
    }

    @Field(64)
    public int skip_bottom() {
        return this.io.getIntField(this, 64);
    }

    @Field(64)
    public AVCodecContext skip_bottom(int skip_bottom) {
        this.io.setIntField(this, 64, skip_bottom);
        return this;
    }

    @Field(65)
    public int mb_lmin() {
        return this.io.getIntField(this, 65);
    }

    @Field(65)
    public AVCodecContext mb_lmin(int mb_lmin) {
        this.io.setIntField(this, 65, mb_lmin);
        return this;
    }

    @Field(66)
    public int mb_lmax() {
        return this.io.getIntField(this, 66);
    }

    @Field(66)
    public AVCodecContext mb_lmax(int mb_lmax) {
        this.io.setIntField(this, 66, mb_lmax);
        return this;
    }

    /** @deprecated */
    @Field(67)
    public int me_penalty_compensation() {
        return this.io.getIntField(this, 67);
    }

    /** @deprecated */
    @Field(67)
    public AVCodecContext me_penalty_compensation(int me_penalty_compensation) {
        this.io.setIntField(this, 67, me_penalty_compensation);
        return this;
    }

    @Field(68)
    public int bidir_refine() {
        return this.io.getIntField(this, 68);
    }

    @Field(68)
    public AVCodecContext bidir_refine(int bidir_refine) {
        this.io.setIntField(this, 68, bidir_refine);
        return this;
    }

    /** @deprecated */
    @Field(69)
    public int brd_scale() {
        return this.io.getIntField(this, 69);
    }

    /** @deprecated */
    @Field(69)
    public AVCodecContext brd_scale(int brd_scale) {
        this.io.setIntField(this, 69, brd_scale);
        return this;
    }

    @Field(70)
    public int keyint_min() {
        return this.io.getIntField(this, 70);
    }

    @Field(70)
    public AVCodecContext keyint_min(int keyint_min) {
        this.io.setIntField(this, 70, keyint_min);
        return this;
    }

    @Field(71)
    public int refs() {
        return this.io.getIntField(this, 71);
    }

    @Field(71)
    public AVCodecContext refs(int refs) {
        this.io.setIntField(this, 71, refs);
        return this;
    }

    /** @deprecated */
    @Field(72)
    public int chromaoffset() {
        return this.io.getIntField(this, 72);
    }

    /** @deprecated */
    @Field(72)
    public AVCodecContext chromaoffset(int chromaoffset) {
        this.io.setIntField(this, 72, chromaoffset);
        return this;
    }

    @Field(73)
    public int mv0_threshold() {
        return this.io.getIntField(this, 73);
    }

    @Field(73)
    public AVCodecContext mv0_threshold(int mv0_threshold) {
        this.io.setIntField(this, 73, mv0_threshold);
        return this;
    }

    /** @deprecated */
    @Field(74)
    public int b_sensitivity() {
        return this.io.getIntField(this, 74);
    }

    /** @deprecated */
    @Field(74)
    public AVCodecContext b_sensitivity(int b_sensitivity) {
        this.io.setIntField(this, 74, b_sensitivity);
        return this;
    }

    @Field(75)
    public IntValuedEnum<AVColorPrimaries> color_primaries() {
        return this.io.getEnumField(this, 75);
    }

    @Field(75)
    public AVCodecContext color_primaries(IntValuedEnum<AVColorPrimaries> color_primaries) {
        this.io.setEnumField(this, 75, color_primaries);
        return this;
    }

    @Field(76)
    public IntValuedEnum<AVColorTransferCharacteristic> color_trc() {
        return this.io.getEnumField(this, 76);
    }

    @Field(76)
    public AVCodecContext color_trc(IntValuedEnum<AVColorTransferCharacteristic> color_trc) {
        this.io.setEnumField(this, 76, color_trc);
        return this;
    }

    @Field(77)
    public IntValuedEnum<AVColorSpace> colorspace() {
        return this.io.getEnumField(this, 77);
    }

    @Field(77)
    public AVCodecContext colorspace(IntValuedEnum<AVColorSpace> colorspace) {
        this.io.setEnumField(this, 77, colorspace);
        return this;
    }

    @Field(78)
    public IntValuedEnum<AVColorRange> color_range() {
        return this.io.getEnumField(this, 78);
    }

    @Field(78)
    public AVCodecContext color_range(IntValuedEnum<AVColorRange> color_range) {
        this.io.setEnumField(this, 78, color_range);
        return this;
    }

    @Field(79)
    public IntValuedEnum<AVChromaLocation> chroma_sample_location() {
        return this.io.getEnumField(this, 79);
    }

    @Field(79)
    public AVCodecContext chroma_sample_location(IntValuedEnum<AVChromaLocation> chroma_sample_location) {
        this.io.setEnumField(this, 79, chroma_sample_location);
        return this;
    }

    @Field(80)
    public int slices() {
        return this.io.getIntField(this, 80);
    }

    @Field(80)
    public AVCodecContext slices(int slices) {
        this.io.setIntField(this, 80, slices);
        return this;
    }

    @Field(81)
    public IntValuedEnum<AVFieldOrder> field_order() {
        return this.io.getEnumField(this, 81);
    }

    @Field(81)
    public AVCodecContext field_order(IntValuedEnum<AVFieldOrder> field_order) {
        this.io.setEnumField(this, 81, field_order);
        return this;
    }

    @Field(82)
    public int sample_rate() {
        return this.io.getIntField(this, 82);
    }

    @Field(82)
    public AVCodecContext sample_rate(int sample_rate) {
        this.io.setIntField(this, 82, sample_rate);
        return this;
    }

    @Field(83)
    public int channels() {
        return this.io.getIntField(this, 83);
    }

    @Field(83)
    public AVCodecContext channels(int channels) {
        this.io.setIntField(this, 83, channels);
        return this;
    }

    @Field(84)
    public IntValuedEnum<AVSampleFormat> sample_fmt() {
        return this.io.getEnumField(this, 84);
    }

    @Field(84)
    public AVCodecContext sample_fmt(IntValuedEnum<AVSampleFormat> sample_fmt) {
        this.io.setEnumField(this, 84, sample_fmt);
        return this;
    }

    @Field(85)
    public int frame_size() {
        return this.io.getIntField(this, 85);
    }

    @Field(85)
    public AVCodecContext frame_size(int frame_size) {
        this.io.setIntField(this, 85, frame_size);
        return this;
    }

    @Field(86)
    public int frame_number() {
        return this.io.getIntField(this, 86);
    }

    @Field(86)
    public AVCodecContext frame_number(int frame_number) {
        this.io.setIntField(this, 86, frame_number);
        return this;
    }

    @Field(87)
    public int block_align() {
        return this.io.getIntField(this, 87);
    }

    @Field(87)
    public AVCodecContext block_align(int block_align) {
        this.io.setIntField(this, 87, block_align);
        return this;
    }

    @Field(88)
    public int cutoff() {
        return this.io.getIntField(this, 88);
    }

    @Field(88)
    public AVCodecContext cutoff(int cutoff) {
        this.io.setIntField(this, 88, cutoff);
        return this;
    }

    @Field(89)
    public long channel_layout() {
        return this.io.getLongField(this, 89);
    }

    @Field(89)
    public AVCodecContext channel_layout(long channel_layout) {
        this.io.setLongField(this, 89, channel_layout);
        return this;
    }

    @Field(90)
    public long request_channel_layout() {
        return this.io.getLongField(this, 90);
    }

    @Field(90)
    public AVCodecContext request_channel_layout(long request_channel_layout) {
        this.io.setLongField(this, 90, request_channel_layout);
        return this;
    }

    @Field(91)
    public IntValuedEnum<AVAudioServiceType> audio_service_type() {
        return this.io.getEnumField(this, 91);
    }

    @Field(91)
    public AVCodecContext audio_service_type(IntValuedEnum<AVAudioServiceType> audio_service_type) {
        this.io.setEnumField(this, 91, audio_service_type);
        return this;
    }

    @Field(92)
    public IntValuedEnum<AVSampleFormat> request_sample_fmt() {
        return this.io.getEnumField(this, 92);
    }

    @Field(92)
    public AVCodecContext request_sample_fmt(IntValuedEnum<AVSampleFormat> request_sample_fmt) {
        this.io.setEnumField(this, 92, request_sample_fmt);
        return this;
    }

    @Field(93)
    public Pointer<AVCodecContext.get_buffer2_callback> get_buffer2() {
        return this.io.getPointerField(this, 93);
    }

    @Field(93)
    public AVCodecContext get_buffer2(Pointer<AVCodecContext.get_buffer2_callback> get_buffer2) {
        this.io.setPointerField(this, 93, get_buffer2);
        return this;
    }

    @Field(94)
    public int refcounted_frames() {
        return this.io.getIntField(this, 94);
    }

    @Field(94)
    public AVCodecContext refcounted_frames(int refcounted_frames) {
        this.io.setIntField(this, 94, refcounted_frames);
        return this;
    }

    @Field(95)
    public float qcompress() {
        return this.io.getFloatField(this, 95);
    }

    @Field(95)
    public AVCodecContext qcompress(float qcompress) {
        this.io.setFloatField(this, 95, qcompress);
        return this;
    }

    @Field(96)
    public float qblur() {
        return this.io.getFloatField(this, 96);
    }

    @Field(96)
    public AVCodecContext qblur(float qblur) {
        this.io.setFloatField(this, 96, qblur);
        return this;
    }

    @Field(97)
    public int qmin() {
        return this.io.getIntField(this, 97);
    }

    @Field(97)
    public AVCodecContext qmin(int qmin) {
        this.io.setIntField(this, 97, qmin);
        return this;
    }

    @Field(98)
    public int qmax() {
        return this.io.getIntField(this, 98);
    }

    @Field(98)
    public AVCodecContext qmax(int qmax) {
        this.io.setIntField(this, 98, qmax);
        return this;
    }

    @Field(99)
    public int max_qdiff() {
        return this.io.getIntField(this, 99);
    }

    @Field(99)
    public AVCodecContext max_qdiff(int max_qdiff) {
        this.io.setIntField(this, 99, max_qdiff);
        return this;
    }

    @Field(100)
    public int rc_buffer_size() {
        return this.io.getIntField(this, 100);
    }

    @Field(100)
    public AVCodecContext rc_buffer_size(int rc_buffer_size) {
        this.io.setIntField(this, 100, rc_buffer_size);
        return this;
    }

    @Field(101)
    public int rc_override_count() {
        return this.io.getIntField(this, 101);
    }

    @Field(101)
    public AVCodecContext rc_override_count(int rc_override_count) {
        this.io.setIntField(this, 101, rc_override_count);
        return this;
    }

    @Field(102)
    public Pointer<RcOverride> rc_override() {
        return this.io.getPointerField(this, 102);
    }

    @Field(102)
    public AVCodecContext rc_override(Pointer<RcOverride> rc_override) {
        this.io.setPointerField(this, 102, rc_override);
        return this;
    }

    @Field(103)
    public long rc_max_rate() {
        return this.io.getLongField(this, 103);
    }

    @Field(103)
    public AVCodecContext rc_max_rate(long rc_max_rate) {
        this.io.setLongField(this, 103, rc_max_rate);
        return this;
    }

    @Field(104)
    public long rc_min_rate() {
        return this.io.getLongField(this, 104);
    }

    @Field(104)
    public AVCodecContext rc_min_rate(long rc_min_rate) {
        this.io.setLongField(this, 104, rc_min_rate);
        return this;
    }

    @Field(105)
    public float rc_max_available_vbv_use() {
        return this.io.getFloatField(this, 105);
    }

    @Field(105)
    public AVCodecContext rc_max_available_vbv_use(float rc_max_available_vbv_use) {
        this.io.setFloatField(this, 105, rc_max_available_vbv_use);
        return this;
    }

    @Field(106)
    public float rc_min_vbv_overflow_use() {
        return this.io.getFloatField(this, 106);
    }

    @Field(106)
    public AVCodecContext rc_min_vbv_overflow_use(float rc_min_vbv_overflow_use) {
        this.io.setFloatField(this, 106, rc_min_vbv_overflow_use);
        return this;
    }

    @Field(107)
    public int rc_initial_buffer_occupancy() {
        return this.io.getIntField(this, 107);
    }

    @Field(107)
    public AVCodecContext rc_initial_buffer_occupancy(int rc_initial_buffer_occupancy) {
        this.io.setIntField(this, 107, rc_initial_buffer_occupancy);
        return this;
    }

    /** @deprecated */
    @Field(108)
    public int coder_type() {
        return this.io.getIntField(this, 108);
    }

    /** @deprecated */
    @Field(108)
    public AVCodecContext coder_type(int coder_type) {
        this.io.setIntField(this, 108, coder_type);
        return this;
    }

    /** @deprecated */
    @Field(109)
    public int context_model() {
        return this.io.getIntField(this, 109);
    }

    /** @deprecated */
    @Field(109)
    public AVCodecContext context_model(int context_model) {
        this.io.setIntField(this, 109, context_model);
        return this;
    }

    @Field(110)
    public int frame_skip_threshold() {
        return this.io.getIntField(this, 110);
    }

    @Field(110)
    public AVCodecContext frame_skip_threshold(int frame_skip_threshold) {
        this.io.setIntField(this, 110, frame_skip_threshold);
        return this;
    }

    @Field(111)
    public int frame_skip_factor() {
        return this.io.getIntField(this, 111);
    }

    @Field(111)
    public AVCodecContext frame_skip_factor(int frame_skip_factor) {
        this.io.setIntField(this, 111, frame_skip_factor);
        return this;
    }

    @Field(112)
    public int frame_skip_exp() {
        return this.io.getIntField(this, 112);
    }

    @Field(112)
    public AVCodecContext frame_skip_exp(int frame_skip_exp) {
        this.io.setIntField(this, 112, frame_skip_exp);
        return this;
    }

    @Field(113)
    public int frame_skip_cmp() {
        return this.io.getIntField(this, 113);
    }

    @Field(113)
    public AVCodecContext frame_skip_cmp(int frame_skip_cmp) {
        this.io.setIntField(this, 113, frame_skip_cmp);
        return this;
    }

    @Field(114)
    public int trellis() {
        return this.io.getIntField(this, 114);
    }

    @Field(114)
    public AVCodecContext trellis(int trellis) {
        this.io.setIntField(this, 114, trellis);
        return this;
    }

    /** @deprecated */
    @Field(115)
    public int min_prediction_order() {
        return this.io.getIntField(this, 115);
    }

    /** @deprecated */
    @Field(115)
    public AVCodecContext min_prediction_order(int min_prediction_order) {
        this.io.setIntField(this, 115, min_prediction_order);
        return this;
    }

    /** @deprecated */
    @Field(116)
    public int max_prediction_order() {
        return this.io.getIntField(this, 116);
    }

    /** @deprecated */
    @Field(116)
    public AVCodecContext max_prediction_order(int max_prediction_order) {
        this.io.setIntField(this, 116, max_prediction_order);
        return this;
    }

    /** @deprecated */
    @Field(117)
    public long timecode_frame_start() {
        return this.io.getLongField(this, 117);
    }

    /** @deprecated */
    @Field(117)
    public AVCodecContext timecode_frame_start(long timecode_frame_start) {
        this.io.setLongField(this, 117, timecode_frame_start);
        return this;
    }

    @Field(118)
    public Pointer<AVCodecContext.rtp_callback_callback> rtp_callback() {
        return this.io.getPointerField(this, 118);
    }

    @Field(118)
    public AVCodecContext rtp_callback(Pointer<AVCodecContext.rtp_callback_callback> rtp_callback) {
        this.io.setPointerField(this, 118, rtp_callback);
        return this;
    }

    /** @deprecated */
    @Field(119)
    public int rtp_payload_size() {
        return this.io.getIntField(this, 119);
    }

    /** @deprecated */
    @Field(119)
    public AVCodecContext rtp_payload_size(int rtp_payload_size) {
        this.io.setIntField(this, 119, rtp_payload_size);
        return this;
    }

    @Field(120)
    public int mv_bits() {
        return this.io.getIntField(this, 120);
    }

    @Field(120)
    public AVCodecContext mv_bits(int mv_bits) {
        this.io.setIntField(this, 120, mv_bits);
        return this;
    }

    @Field(121)
    public int header_bits() {
        return this.io.getIntField(this, 121);
    }

    @Field(121)
    public AVCodecContext header_bits(int header_bits) {
        this.io.setIntField(this, 121, header_bits);
        return this;
    }

    @Field(122)
    public int i_tex_bits() {
        return this.io.getIntField(this, 122);
    }

    @Field(122)
    public AVCodecContext i_tex_bits(int i_tex_bits) {
        this.io.setIntField(this, 122, i_tex_bits);
        return this;
    }

    @Field(123)
    public int p_tex_bits() {
        return this.io.getIntField(this, 123);
    }

    @Field(123)
    public AVCodecContext p_tex_bits(int p_tex_bits) {
        this.io.setIntField(this, 123, p_tex_bits);
        return this;
    }

    @Field(124)
    public int i_count() {
        return this.io.getIntField(this, 124);
    }

    @Field(124)
    public AVCodecContext i_count(int i_count) {
        this.io.setIntField(this, 124, i_count);
        return this;
    }

    @Field(125)
    public int p_count() {
        return this.io.getIntField(this, 125);
    }

    @Field(125)
    public AVCodecContext p_count(int p_count) {
        this.io.setIntField(this, 125, p_count);
        return this;
    }

    @Field(126)
    public int skip_count() {
        return this.io.getIntField(this, 126);
    }

    @Field(126)
    public AVCodecContext skip_count(int skip_count) {
        this.io.setIntField(this, 126, skip_count);
        return this;
    }

    @Field(127)
    public int misc_bits() {
        return this.io.getIntField(this, 127);
    }

    @Field(127)
    public AVCodecContext misc_bits(int misc_bits) {
        this.io.setIntField(this, 127, misc_bits);
        return this;
    }

    /** @deprecated */
    @Field(128)
    public int frame_bits() {
        return this.io.getIntField(this, 128);
    }

    /** @deprecated */
    @Field(128)
    public AVCodecContext frame_bits(int frame_bits) {
        this.io.setIntField(this, 128, frame_bits);
        return this;
    }

    @Field(129)
    public Pointer<Byte> stats_out() {
        return this.io.getPointerField(this, 129);
    }

    @Field(129)
    public AVCodecContext stats_out(Pointer<Byte> stats_out) {
        this.io.setPointerField(this, 129, stats_out);
        return this;
    }

    @Field(130)
    public Pointer<Byte> stats_in() {
        return this.io.getPointerField(this, 130);
    }

    @Field(130)
    public AVCodecContext stats_in(Pointer<Byte> stats_in) {
        this.io.setPointerField(this, 130, stats_in);
        return this;
    }

    @Field(131)
    public int workaround_bugs() {
        return this.io.getIntField(this, 131);
    }

    @Field(131)
    public AVCodecContext workaround_bugs(int workaround_bugs) {
        this.io.setIntField(this, 131, workaround_bugs);
        return this;
    }

    @Field(132)
    public int strict_std_compliance() {
        return this.io.getIntField(this, 132);
    }

    @Field(132)
    public AVCodecContext strict_std_compliance(int strict_std_compliance) {
        this.io.setIntField(this, 132, strict_std_compliance);
        return this;
    }

    @Field(133)
    public int error_concealment() {
        return this.io.getIntField(this, 133);
    }

    @Field(133)
    public AVCodecContext error_concealment(int error_concealment) {
        this.io.setIntField(this, 133, error_concealment);
        return this;
    }

    @Field(134)
    public int debug() {
        return this.io.getIntField(this, 134);
    }

    @Field(134)
    public AVCodecContext debug(int debug) {
        this.io.setIntField(this, 134, debug);
        return this;
    }

    @Field(135)
    public int err_recognition() {
        return this.io.getIntField(this, 135);
    }

    @Field(135)
    public AVCodecContext err_recognition(int err_recognition) {
        this.io.setIntField(this, 135, err_recognition);
        return this;
    }

    @Field(136)
    public long reordered_opaque() {
        return this.io.getLongField(this, 136);
    }

    @Field(136)
    public AVCodecContext reordered_opaque(long reordered_opaque) {
        this.io.setLongField(this, 136, reordered_opaque);
        return this;
    }

    @Field(137)
    public Pointer<AVHWAccel> hwaccel() {
        return this.io.getPointerField(this, 137);
    }

    @Field(137)
    public AVCodecContext hwaccel(Pointer<AVHWAccel> hwaccel) {
        this.io.setPointerField(this, 137, hwaccel);
        return this;
    }

    @Field(138)
    public Pointer<?> hwaccel_context() {
        return this.io.getPointerField(this, 138);
    }

    @Field(138)
    public AVCodecContext hwaccel_context(Pointer<?> hwaccel_context) {
        this.io.setPointerField(this, 138, hwaccel_context);
        return this;
    }

    @Array({8L})
    @Field(139)
    public Pointer<Long> error() {
        return this.io.getPointerField(this, 139);
    }

    @Field(140)
    public int dct_algo() {
        return this.io.getIntField(this, 140);
    }

    @Field(140)
    public AVCodecContext dct_algo(int dct_algo) {
        this.io.setIntField(this, 140, dct_algo);
        return this;
    }

    @Field(141)
    public int idct_algo() {
        return this.io.getIntField(this, 141);
    }

    @Field(141)
    public AVCodecContext idct_algo(int idct_algo) {
        this.io.setIntField(this, 141, idct_algo);
        return this;
    }

    @Field(142)
    public int bits_per_coded_sample() {
        return this.io.getIntField(this, 142);
    }

    @Field(142)
    public AVCodecContext bits_per_coded_sample(int bits_per_coded_sample) {
        this.io.setIntField(this, 142, bits_per_coded_sample);
        return this;
    }

    @Field(143)
    public int bits_per_raw_sample() {
        return this.io.getIntField(this, 143);
    }

    @Field(143)
    public AVCodecContext bits_per_raw_sample(int bits_per_raw_sample) {
        this.io.setIntField(this, 143, bits_per_raw_sample);
        return this;
    }

    @Field(144)
    public int lowres() {
        return this.io.getIntField(this, 144);
    }

    @Field(144)
    public AVCodecContext lowres(int lowres) {
        this.io.setIntField(this, 144, lowres);
        return this;
    }

    /** @deprecated */
    @Field(145)
    public Pointer<AVFrame> coded_frame() {
        return this.io.getPointerField(this, 145);
    }

    /** @deprecated */
    @Field(145)
    public AVCodecContext coded_frame(Pointer<AVFrame> coded_frame) {
        this.io.setPointerField(this, 145, coded_frame);
        return this;
    }

    @Field(146)
    public int thread_count() {
        return this.io.getIntField(this, 146);
    }

    @Field(146)
    public AVCodecContext thread_count(int thread_count) {
        this.io.setIntField(this, 146, thread_count);
        return this;
    }

    @Field(147)
    public int thread_type() {
        return this.io.getIntField(this, 147);
    }

    @Field(147)
    public AVCodecContext thread_type(int thread_type) {
        this.io.setIntField(this, 147, thread_type);
        return this;
    }

    @Field(148)
    public int active_thread_type() {
        return this.io.getIntField(this, 148);
    }

    @Field(148)
    public AVCodecContext active_thread_type(int active_thread_type) {
        this.io.setIntField(this, 148, active_thread_type);
        return this;
    }

    @Field(149)
    public int thread_safe_callbacks() {
        return this.io.getIntField(this, 149);
    }

    @Field(149)
    public AVCodecContext thread_safe_callbacks(int thread_safe_callbacks) {
        this.io.setIntField(this, 149, thread_safe_callbacks);
        return this;
    }

    @Field(150)
    public Pointer<AVCodecContext.execute_callback> execute() {
        return this.io.getPointerField(this, 150);
    }

    @Field(150)
    public AVCodecContext execute(Pointer<AVCodecContext.execute_callback> execute) {
        this.io.setPointerField(this, 150, execute);
        return this;
    }

    @Field(151)
    public Pointer<AVCodecContext.execute2_callback> execute2() {
        return this.io.getPointerField(this, 151);
    }

    @Field(151)
    public AVCodecContext execute2(Pointer<AVCodecContext.execute2_callback> execute2) {
        this.io.setPointerField(this, 151, execute2);
        return this;
    }

    @Field(152)
    public int nsse_weight() {
        return this.io.getIntField(this, 152);
    }

    @Field(152)
    public AVCodecContext nsse_weight(int nsse_weight) {
        this.io.setIntField(this, 152, nsse_weight);
        return this;
    }

    @Field(153)
    public int profile() {
        return this.io.getIntField(this, 153);
    }

    @Field(153)
    public AVCodecContext profile(int profile) {
        this.io.setIntField(this, 153, profile);
        return this;
    }

    @Field(154)
    public int level() {
        return this.io.getIntField(this, 154);
    }

    @Field(154)
    public AVCodecContext level(int level) {
        this.io.setIntField(this, 154, level);
        return this;
    }

    @Field(155)
    public IntValuedEnum<AVDiscard> skip_loop_filter() {
        return this.io.getEnumField(this, 155);
    }

    @Field(155)
    public AVCodecContext skip_loop_filter(IntValuedEnum<AVDiscard> skip_loop_filter) {
        this.io.setEnumField(this, 155, skip_loop_filter);
        return this;
    }

    @Field(156)
    public IntValuedEnum<AVDiscard> skip_idct() {
        return this.io.getEnumField(this, 156);
    }

    @Field(156)
    public AVCodecContext skip_idct(IntValuedEnum<AVDiscard> skip_idct) {
        this.io.setEnumField(this, 156, skip_idct);
        return this;
    }

    @Field(157)
    public IntValuedEnum<AVDiscard> skip_frame() {
        return this.io.getEnumField(this, 157);
    }

    @Field(157)
    public AVCodecContext skip_frame(IntValuedEnum<AVDiscard> skip_frame) {
        this.io.setEnumField(this, 157, skip_frame);
        return this;
    }

    @Field(158)
    public Pointer<Byte> subtitle_header() {
        return this.io.getPointerField(this, 158);
    }

    @Field(158)
    public AVCodecContext subtitle_header(Pointer<Byte> subtitle_header) {
        this.io.setPointerField(this, 158, subtitle_header);
        return this;
    }

    @Field(159)
    public int subtitle_header_size() {
        return this.io.getIntField(this, 159);
    }

    @Field(159)
    public AVCodecContext subtitle_header_size(int subtitle_header_size) {
        this.io.setIntField(this, 159, subtitle_header_size);
        return this;
    }

    /** @deprecated */
    @Field(160)
    public long vbv_delay() {
        return this.io.getLongField(this, 160);
    }

    /** @deprecated */
    @Field(160)
    public AVCodecContext vbv_delay(long vbv_delay) {
        this.io.setLongField(this, 160, vbv_delay);
        return this;
    }

    /** @deprecated */
    @Field(161)
    public int side_data_only_packets() {
        return this.io.getIntField(this, 161);
    }

    /** @deprecated */
    @Field(161)
    public AVCodecContext side_data_only_packets(int side_data_only_packets) {
        this.io.setIntField(this, 161, side_data_only_packets);
        return this;
    }

    @Field(162)
    public int initial_padding() {
        return this.io.getIntField(this, 162);
    }

    @Field(162)
    public AVCodecContext initial_padding(int initial_padding) {
        this.io.setIntField(this, 162, initial_padding);
        return this;
    }

    @Field(163)
    public AVRational framerate() {
        return (AVRational)this.io.getNativeObjectField(this, 163);
    }

    @Field(163)
    public AVCodecContext framerate(AVRational framerate) {
        this.io.setNativeObjectField(this, 163, framerate);
        return this;
    }

    @Field(164)
    public IntValuedEnum<AVPixelFormat> sw_pix_fmt() {
        return this.io.getEnumField(this, 164);
    }

    @Field(164)
    public AVCodecContext sw_pix_fmt(IntValuedEnum<AVPixelFormat> sw_pix_fmt) {
        this.io.setEnumField(this, 164, sw_pix_fmt);
        return this;
    }

    @Field(165)
    public AVRational pkt_timebase() {
        return (AVRational)this.io.getNativeObjectField(this, 165);
    }

    @Field(165)
    public AVCodecContext pkt_timebase(AVRational pkt_timebase) {
        this.io.setNativeObjectField(this, 165, pkt_timebase);
        return this;
    }

    @Field(166)
    public Pointer<AVCodecDescriptor> codec_descriptor() {
        return this.io.getPointerField(this, 166);
    }

    @Field(166)
    public AVCodecContext codec_descriptor(Pointer<AVCodecDescriptor> codec_descriptor) {
        this.io.setPointerField(this, 166, codec_descriptor);
        return this;
    }

    @Field(167)
    public long pts_correction_num_faulty_pts() {
        return this.io.getLongField(this, 167);
    }

    @Field(167)
    public AVCodecContext pts_correction_num_faulty_pts(long pts_correction_num_faulty_pts) {
        this.io.setLongField(this, 167, pts_correction_num_faulty_pts);
        return this;
    }

    @Field(168)
    public long pts_correction_num_faulty_dts() {
        return this.io.getLongField(this, 168);
    }

    @Field(168)
    public AVCodecContext pts_correction_num_faulty_dts(long pts_correction_num_faulty_dts) {
        this.io.setLongField(this, 168, pts_correction_num_faulty_dts);
        return this;
    }

    @Field(169)
    public long pts_correction_last_pts() {
        return this.io.getLongField(this, 169);
    }

    @Field(169)
    public AVCodecContext pts_correction_last_pts(long pts_correction_last_pts) {
        this.io.setLongField(this, 169, pts_correction_last_pts);
        return this;
    }

    @Field(170)
    public long pts_correction_last_dts() {
        return this.io.getLongField(this, 170);
    }

    @Field(170)
    public AVCodecContext pts_correction_last_dts(long pts_correction_last_dts) {
        this.io.setLongField(this, 170, pts_correction_last_dts);
        return this;
    }

    @Field(171)
    public Pointer<Byte> sub_charenc() {
        return this.io.getPointerField(this, 171);
    }

    @Field(171)
    public AVCodecContext sub_charenc(Pointer<Byte> sub_charenc) {
        this.io.setPointerField(this, 171, sub_charenc);
        return this;
    }

    @Field(172)
    public int sub_charenc_mode() {
        return this.io.getIntField(this, 172);
    }

    @Field(172)
    public AVCodecContext sub_charenc_mode(int sub_charenc_mode) {
        this.io.setIntField(this, 172, sub_charenc_mode);
        return this;
    }

    @Field(173)
    public int skip_alpha() {
        return this.io.getIntField(this, 173);
    }

    @Field(173)
    public AVCodecContext skip_alpha(int skip_alpha) {
        this.io.setIntField(this, 173, skip_alpha);
        return this;
    }

    @Field(174)
    public int seek_preroll() {
        return this.io.getIntField(this, 174);
    }

    @Field(174)
    public AVCodecContext seek_preroll(int seek_preroll) {
        this.io.setIntField(this, 174, seek_preroll);
        return this;
    }

    @Field(175)
    public int debug_mv() {
        return this.io.getIntField(this, 175);
    }

    @Field(175)
    public AVCodecContext debug_mv(int debug_mv) {
        this.io.setIntField(this, 175, debug_mv);
        return this;
    }

    @Field(176)
    public Pointer<Short> chroma_intra_matrix() {
        return this.io.getPointerField(this, 176);
    }

    @Field(176)
    public AVCodecContext chroma_intra_matrix(Pointer<Short> chroma_intra_matrix) {
        this.io.setPointerField(this, 176, chroma_intra_matrix);
        return this;
    }

    @Field(177)
    public Pointer<Byte> dump_separator() {
        return this.io.getPointerField(this, 177);
    }

    @Field(177)
    public AVCodecContext dump_separator(Pointer<Byte> dump_separator) {
        this.io.setPointerField(this, 177, dump_separator);
        return this;
    }

    @Field(178)
    public Pointer<Byte> codec_whitelist() {
        return this.io.getPointerField(this, 178);
    }

    @Field(178)
    public AVCodecContext codec_whitelist(Pointer<Byte> codec_whitelist) {
        this.io.setPointerField(this, 178, codec_whitelist);
        return this;
    }

    @Field(179)
    public int properties() {
        return this.io.getIntField(this, 179);
    }

    @Field(179)
    public AVCodecContext properties(int properties) {
        this.io.setIntField(this, 179, properties);
        return this;
    }

    @Field(180)
    public Pointer<AVPacketSideData> coded_side_data() {
        return this.io.getPointerField(this, 180);
    }

    @Field(180)
    public AVCodecContext coded_side_data(Pointer<AVPacketSideData> coded_side_data) {
        this.io.setPointerField(this, 180, coded_side_data);
        return this;
    }

    @Field(181)
    public int nb_coded_side_data() {
        return this.io.getIntField(this, 181);
    }

    @Field(181)
    public AVCodecContext nb_coded_side_data(int nb_coded_side_data) {
        this.io.setIntField(this, 181, nb_coded_side_data);
        return this;
    }

    @Field(182)
    public Pointer<AVBufferRef> hw_frames_ctx() {
        return this.io.getPointerField(this, 182);
    }

    @Field(182)
    public AVCodecContext hw_frames_ctx(Pointer<AVBufferRef> hw_frames_ctx) {
        this.io.setPointerField(this, 182, hw_frames_ctx);
        return this;
    }

    @Field(183)
    public int sub_text_format() {
        return this.io.getIntField(this, 183);
    }

    @Field(183)
    public AVCodecContext sub_text_format(int sub_text_format) {
        this.io.setIntField(this, 183, sub_text_format);
        return this;
    }

    @Field(184)
    public int trailing_padding() {
        return this.io.getIntField(this, 184);
    }

    @Field(184)
    public AVCodecContext trailing_padding(int trailing_padding) {
        this.io.setIntField(this, 184, trailing_padding);
        return this;
    }

    @Field(185)
    public long max_pixels() {
        return this.io.getLongField(this, 185);
    }

    @Field(185)
    public AVCodecContext max_pixels(long max_pixels) {
        this.io.setLongField(this, 185, max_pixels);
        return this;
    }

    @Field(186)
    public Pointer<AVBufferRef> hw_device_ctx() {
        return this.io.getPointerField(this, 186);
    }

    @Field(186)
    public AVCodecContext hw_device_ctx(Pointer<AVBufferRef> hw_device_ctx) {
        this.io.setPointerField(this, 186, hw_device_ctx);
        return this;
    }

    @Field(187)
    public int hwaccel_flags() {
        return this.io.getIntField(this, 187);
    }

    @Field(187)
    public AVCodecContext hwaccel_flags(int hwaccel_flags) {
        this.io.setIntField(this, 187, hwaccel_flags);
        return this;
    }

    @Field(188)
    public int apply_cropping() {
        return this.io.getIntField(this, 188);
    }

    @Field(188)
    public AVCodecContext apply_cropping(int apply_cropping) {
        this.io.setIntField(this, 188, apply_cropping);
        return this;
    }

    @Field(189)
    public int extra_hw_frames() {
        return this.io.getIntField(this, 189);
    }

    @Field(189)
    public AVCodecContext extra_hw_frames(int extra_hw_frames) {
        this.io.setIntField(this, 189, extra_hw_frames);
        return this;
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVCodecContext() {
    }

    @Struct(
            customizer = AlignmentCustomizer.class
    )
    public AVCodecContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class draw_horiz_band_callback extends Callback<AVCodecContext.draw_horiz_band_callback> {
        public draw_horiz_band_callback() {
        }

        public void apply(Pointer<AVCodecContext> s, Pointer<AVFrame> src, Pointer<Integer> offset, int y, int type, int height) {
            this.apply(Pointer.getPeer(s), Pointer.getPeer(src), Pointer.getPeer(offset), y, type, height);
        }

        public void apply(@Ptr long s, @Ptr long src, @Ptr long offset, int y, int type, int height) {
            this.apply(Pointer.pointerToAddress(s, AVCodecContext.class), Pointer.pointerToAddress(src, AVFrame.class), Pointer.pointerToAddress(offset, Integer.class), y, type, height);
        }
    }

    public abstract static class execute2_callback extends Callback<AVCodecContext.execute2_callback> {
        public execute2_callback() {
        }

        public int apply(Pointer<AVCodecContext> c, Pointer<AVCodecContext.execute2_callback_func_callback> func, Pointer<?> arg2, Pointer<Integer> ret, int count) {
            return this.apply(Pointer.getPeer(c), Pointer.getPeer(func), Pointer.getPeer(arg2), Pointer.getPeer(ret), count);
        }

        public int apply(@Ptr long c, @Ptr long func, @Ptr long arg2, @Ptr long ret, int count) {
            return this.apply(Pointer.pointerToAddress(c, AVCodecContext.class), Pointer.pointerToAddress(func, AVCodecContext.execute2_callback_func_callback.class), Pointer.pointerToAddress(arg2), Pointer.pointerToAddress(ret, Integer.class), count);
        }
    }

    public abstract static class execute2_callback_func_callback extends Callback<AVCodecContext.execute2_callback_func_callback> {
        public execute2_callback_func_callback() {
        }

        public int apply(Pointer<AVCodecContext> c2, Pointer<?> arg, int jobnr, int threadnr) {
            return this.apply(Pointer.getPeer(c2), Pointer.getPeer(arg), jobnr, threadnr);
        }

        public int apply(@Ptr long c2, @Ptr long arg, int jobnr, int threadnr) {
            return this.apply(Pointer.pointerToAddress(c2, AVCodecContext.class), Pointer.pointerToAddress(arg), jobnr, threadnr);
        }
    }

    public abstract static class execute_callback extends Callback<AVCodecContext.execute_callback> {
        public execute_callback() {
        }

        public int apply(Pointer<AVCodecContext> c, Pointer<AVCodecContext.execute_callback_func_callback> func, Pointer<?> arg2, Pointer<Integer> ret, int count, int size) {
            return this.apply(Pointer.getPeer(c), Pointer.getPeer(func), Pointer.getPeer(arg2), Pointer.getPeer(ret), count, size);
        }

        public int apply(@Ptr long c, @Ptr long func, @Ptr long arg2, @Ptr long ret, int count, int size) {
            return this.apply(Pointer.pointerToAddress(c, AVCodecContext.class), Pointer.pointerToAddress(func, AVCodecContext.execute_callback_func_callback.class), Pointer.pointerToAddress(arg2), Pointer.pointerToAddress(ret, Integer.class), count, size);
        }
    }

    public abstract static class execute_callback_func_callback extends Callback<AVCodecContext.execute_callback_func_callback> {
        public execute_callback_func_callback() {
        }

        public int apply(Pointer<AVCodecContext> c2, Pointer<?> arg) {
            return this.apply(Pointer.getPeer(c2), Pointer.getPeer(arg));
        }

        public int apply(@Ptr long c2, @Ptr long arg) {
            return this.apply(Pointer.pointerToAddress(c2, AVCodecContext.class), Pointer.pointerToAddress(arg));
        }
    }

    public abstract static class get_buffer2_callback extends Callback<AVCodecContext.get_buffer2_callback> {
        public get_buffer2_callback() {
        }

        public int apply(Pointer<AVCodecContext> s, Pointer<AVFrame> frame, int flags) {
            return this.apply(Pointer.getPeer(s), Pointer.getPeer(frame), flags);
        }

        public int apply(@Ptr long s, @Ptr long frame, int flags) {
            return this.apply(Pointer.pointerToAddress(s, AVCodecContext.class), Pointer.pointerToAddress(frame, AVFrame.class), flags);
        }
    }

    public abstract static class rtp_callback_callback extends Callback<AVCodecContext.rtp_callback_callback> {
        public rtp_callback_callback() {
        }

        public void apply(Pointer<AVCodecContext> avctx, Pointer<?> data, int size, int mb_nb) {
            this.apply(Pointer.getPeer(avctx), Pointer.getPeer(data), size, mb_nb);
        }

        public void apply(@Ptr long avctx, @Ptr long data, int size, int mb_nb) {
            this.apply(Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(data), size, mb_nb);
        }
    }
}
