//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.swscale;

import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;

@Library("swscale")
@Runtime(CRuntime.class)
public class SwscaleLibrary {
    public static final int SWS_BILINEAR = 2;
    public static final int SWS_SINC = 256;
    public static final int LIBSWSCALE_BUILD = 328036;
    public static final int SWS_SPLINE = 1024;
    public static final int SWS_CS_FCC = 4;
    public static final int LIBSWSCALE_VERSION_MINOR = 1;
    public static final double SWS_MAX_REDUCE_CUTOFF = 0.002D;
    public static final int SWS_ERROR_DIFFUSION = 8388608;
    public static final int LIBSWSCALE_VERSION_MICRO = 100;
    public static final int SWS_CS_DEFAULT = 5;
    public static final int SWS_CS_ITU709 = 1;
    public static final int SWS_CS_SMPTE170M = 5;
    public static final int SWS_PARAM_DEFAULT = 123456;
    public static final String LIBSWSCALE_IDENT = "SwS5.1.100";
    public static final int SWS_ACCURATE_RND = 262144;
    public static final int SWS_AREA = 32;
    public static final int SWS_DIRECT_BGR = 32768;
    public static final int LIBSWSCALE_VERSION_INT = 328036;
    public static final int SWS_CS_BT2020 = 9;
    public static final int SWS_CS_ITU624 = 5;
    public static final int SWS_SRC_V_CHR_DROP_MASK = 196608;
    public static final int SWS_CS_ITU601 = 5;
    public static final int SWS_SRC_V_CHR_DROP_SHIFT = 16;
    public static final int SWS_X = 8;
    public static final int SWS_FULL_CHR_H_INP = 16384;
    public static final int SWS_FULL_CHR_H_INT = 8192;
    public static final int SWS_LANCZOS = 512;
    public static final int SWS_BITEXACT = 524288;
    public static final int SWS_BICUBIC = 4;
    public static final int SWS_GAUSS = 128;
    public static final int SWS_PRINT_INFO = 4096;
    public static final int LIBSWSCALE_VERSION_MAJOR = 5;
    public static final int SWS_POINT = 16;
    public static final int SWS_FAST_BILINEAR = 1;
    public static final int SWS_CS_SMPTE240M = 7;
    public static final int SWS_BICUBLIN = 64;
    public static final boolean FF_API_SWS_VECTOR = true;

    static {
        BridJ.register();
    }

    public SwscaleLibrary() {
    }

    public static native int swscale_version();

    public static Pointer<Byte> swscale__configuration() {
        return Pointer.pointerToAddress(swscale_configuration(), Byte.class);
    }

    @Ptr
    protected static native long swscale_configuration();

    public static Pointer<Byte> swscale__license() {
        return Pointer.pointerToAddress(swscale_license(), Byte.class);
    }

    @Ptr
    protected static native long swscale_license();

    public static Pointer<Integer> sws__getCoefficients(int colorspace) {
        return Pointer.pointerToAddress(sws_getCoefficients(colorspace), Integer.class);
    }

    @Ptr
    protected static native long sws_getCoefficients(int var0);

    public static int sws_isSupportedInput(IntValuedEnum<AVPixelFormat> pix_fmt) {
        return sws_isSupportedInput((int)pix_fmt.value());
    }

    protected static native int sws_isSupportedInput(int var0);

    public static int sws_isSupportedOutput(IntValuedEnum<AVPixelFormat> pix_fmt) {
        return sws_isSupportedOutput((int)pix_fmt.value());
    }

    protected static native int sws_isSupportedOutput(int var0);

    public static int sws_isSupportedEndiannessConversion(IntValuedEnum<AVPixelFormat> pix_fmt) {
        return sws_isSupportedEndiannessConversion((int)pix_fmt.value());
    }

    protected static native int sws_isSupportedEndiannessConversion(int var0);

    public static Pointer<SwscaleLibrary.SwsContext> sws__alloc_context() {
        return Pointer.pointerToAddress(sws_alloc_context(), SwscaleLibrary.SwsContext.class);
    }

    @Ptr
    protected static native long sws_alloc_context();

    public static int sws_init_context(Pointer<SwscaleLibrary.SwsContext> sws_context, Pointer<SwsFilter> srcFilter, Pointer<SwsFilter> dstFilter) {
        return sws_init_context(Pointer.getPeer(sws_context), Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter));
    }

    protected static native int sws_init_context(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void sws_freeContext(Pointer<SwscaleLibrary.SwsContext> swsContext) {
        sws_freeContext(Pointer.getPeer(swsContext));
    }

    protected static native void sws_freeContext(@Ptr long var0);

    public static Pointer<SwscaleLibrary.SwsContext> sws_getContext(int srcW, int srcH, IntValuedEnum<AVPixelFormat> srcFormat, int dstW, int dstH, IntValuedEnum<AVPixelFormat> dstFormat, int flags, Pointer<SwsFilter> srcFilter, Pointer<SwsFilter> dstFilter, Pointer<Double> param) {
        return Pointer.pointerToAddress(sws_getContext(srcW, srcH, (int)srcFormat.value(), dstW, dstH, (int)dstFormat.value(), flags, Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter), Pointer.getPeer(param)), SwscaleLibrary.SwsContext.class);
    }

    @Ptr
    protected static native long sws_getContext(int var0, int var1, int var2, int var3, int var4, int var5, int var6, @Ptr long var7, @Ptr long var9, @Ptr long var11);

    public static int sws_scale(Pointer<SwscaleLibrary.SwsContext> c, Pointer<Pointer<Byte>> srcSlice, Pointer<Integer> srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<Byte>> dst, Pointer<Integer> dstStride) {
        return sws_scale(Pointer.getPeer(c), Pointer.getPeer(srcSlice), Pointer.getPeer(srcStride), srcSliceY, srcSliceH, Pointer.getPeer(dst), Pointer.getPeer(dstStride));
    }

    protected static native int sws_scale(@Ptr long var0, @Ptr long var2, @Ptr long var4, int var6, int var7, @Ptr long var8, @Ptr long var10);

    public static int sws_setColorspaceDetails(Pointer<SwscaleLibrary.SwsContext> c, Pointer<Integer> inv_table, int srcRange, Pointer<Integer> table, int dstRange, int brightness, int contrast, int saturation) {
        return sws_setColorspaceDetails(Pointer.getPeer(c), Pointer.getPeer(inv_table), srcRange, Pointer.getPeer(table), dstRange, brightness, contrast, saturation);
    }

    protected static native int sws_setColorspaceDetails(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5, int var7, int var8, int var9, int var10);

    public static int sws_getColorspaceDetails(Pointer<SwscaleLibrary.SwsContext> c, Pointer<Pointer<Integer>> inv_table, Pointer<Integer> srcRange, Pointer<Pointer<Integer>> table, Pointer<Integer> dstRange, Pointer<Integer> brightness, Pointer<Integer> contrast, Pointer<Integer> saturation) {
        return sws_getColorspaceDetails(Pointer.getPeer(c), Pointer.getPeer(inv_table), Pointer.getPeer(srcRange), Pointer.getPeer(table), Pointer.getPeer(dstRange), Pointer.getPeer(brightness), Pointer.getPeer(contrast), Pointer.getPeer(saturation));
    }

    protected static native int sws_getColorspaceDetails(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, @Ptr long var10, @Ptr long var12, @Ptr long var14);

    public static Pointer<SwsVector> sws__allocVec(int length) {
        return Pointer.pointerToAddress(sws_allocVec(length), SwsVector.class);
    }

    @Ptr
    protected static native long sws_allocVec(int var0);

    public static Pointer<SwsVector> sws__getGaussianVec(double variance, double quality) {
        return Pointer.pointerToAddress(sws_getGaussianVec(variance, quality), SwsVector.class);
    }

    @Ptr
    protected static native long sws_getGaussianVec(double var0, double var2);

    public static void sws_scaleVec(Pointer<SwsVector> a, double scalar) {
        sws_scaleVec(Pointer.getPeer(a), scalar);
    }

    protected static native void sws_scaleVec(@Ptr long var0, double var2);

    public static void sws_normalizeVec(Pointer<SwsVector> a, double height) {
        sws_normalizeVec(Pointer.getPeer(a), height);
    }

    protected static native void sws_normalizeVec(@Ptr long var0, double var2);

    public static Pointer<SwsVector> sws__getConstVec(double c, int length) {
        return Pointer.pointerToAddress(sws_getConstVec(c, length), SwsVector.class);
    }

    @Ptr
    protected static native long sws_getConstVec(double var0, int var2);

    public static Pointer<SwsVector> sws__getIdentityVec() {
        return Pointer.pointerToAddress(sws_getIdentityVec(), SwsVector.class);
    }

    @Ptr
    protected static native long sws_getIdentityVec();

    public static void sws_convVec(Pointer<SwsVector> a, Pointer<SwsVector> b) {
        sws_convVec(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native void sws_convVec(@Ptr long var0, @Ptr long var2);

    public static void sws_addVec(Pointer<SwsVector> a, Pointer<SwsVector> b) {
        sws_addVec(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native void sws_addVec(@Ptr long var0, @Ptr long var2);

    public static void sws_subVec(Pointer<SwsVector> a, Pointer<SwsVector> b) {
        sws_subVec(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native void sws_subVec(@Ptr long var0, @Ptr long var2);

    public static void sws_shiftVec(Pointer<SwsVector> a, int shift) {
        sws_shiftVec(Pointer.getPeer(a), shift);
    }

    protected static native void sws_shiftVec(@Ptr long var0, int var2);

    public static Pointer<SwsVector> sws_cloneVec(Pointer<SwsVector> a) {
        return Pointer.pointerToAddress(sws_cloneVec(Pointer.getPeer(a)), SwsVector.class);
    }

    @Ptr
    protected static native long sws_cloneVec(@Ptr long var0);

    public static void sws_printVec2(Pointer<SwsVector> a, Pointer<AVClass> log_ctx, int log_level) {
        sws_printVec2(Pointer.getPeer(a), Pointer.getPeer(log_ctx), log_level);
    }

    protected static native void sws_printVec2(@Ptr long var0, @Ptr long var2, int var4);

    public static void sws_freeVec(Pointer<SwsVector> a) {
        sws_freeVec(Pointer.getPeer(a));
    }

    protected static native void sws_freeVec(@Ptr long var0);

    public static Pointer<SwsFilter> sws__getDefaultFilter(float lumaGBlur, float chromaGBlur, float lumaSharpen, float chromaSharpen, float chromaHShift, float chromaVShift, int verbose) {
        return Pointer.pointerToAddress(sws_getDefaultFilter(lumaGBlur, chromaGBlur, lumaSharpen, chromaSharpen, chromaHShift, chromaVShift, verbose), SwsFilter.class);
    }

    @Ptr
    protected static native long sws_getDefaultFilter(float var0, float var1, float var2, float var3, float var4, float var5, int var6);

    public static void sws_freeFilter(Pointer<SwsFilter> filter) {
        sws_freeFilter(Pointer.getPeer(filter));
    }

    protected static native void sws_freeFilter(@Ptr long var0);

    public static Pointer<SwscaleLibrary.SwsContext> sws_getCachedContext(Pointer<SwscaleLibrary.SwsContext> context, int srcW, int srcH, IntValuedEnum<AVPixelFormat> srcFormat, int dstW, int dstH, IntValuedEnum<AVPixelFormat> dstFormat, int flags, Pointer<SwsFilter> srcFilter, Pointer<SwsFilter> dstFilter, Pointer<Double> param) {
        return Pointer.pointerToAddress(sws_getCachedContext(Pointer.getPeer(context), srcW, srcH, (int)srcFormat.value(), dstW, dstH, (int)dstFormat.value(), flags, Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter), Pointer.getPeer(param)), SwscaleLibrary.SwsContext.class);
    }

    @Ptr
    protected static native long sws_getCachedContext(@Ptr long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, @Ptr long var9, @Ptr long var11, @Ptr long var13);

    public static void sws_convertPalette8ToPacked32(Pointer<Byte> src, Pointer<Byte> dst, int num_pixels, Pointer<Byte> palette) {
        sws_convertPalette8ToPacked32(Pointer.getPeer(src), Pointer.getPeer(dst), num_pixels, Pointer.getPeer(palette));
    }

    protected static native void sws_convertPalette8ToPacked32(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static void sws_convertPalette8ToPacked24(Pointer<Byte> src, Pointer<Byte> dst, int num_pixels, Pointer<Byte> palette) {
        sws_convertPalette8ToPacked24(Pointer.getPeer(src), Pointer.getPeer(dst), num_pixels, Pointer.getPeer(palette));
    }

    protected static native void sws_convertPalette8ToPacked24(@Ptr long var0, @Ptr long var2, int var4, @Ptr long var5);

    public static Pointer<AVClass> sws__get_class() {
        return Pointer.pointerToAddress(sws_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long sws_get_class();

    public interface SwsContext {
    }
}
