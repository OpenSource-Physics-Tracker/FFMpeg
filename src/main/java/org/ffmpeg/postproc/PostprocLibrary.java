//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.postproc;

import java.lang.reflect.Type;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.bridj.util.DefaultParameterizedType;

@Library("postproc")
@Runtime(CRuntime.class)
public class PostprocLibrary {
    public static final int PP_CPU_CAPS_ALTIVEC = 268435456;
    public static final int LIBPOSTPROC_VERSION_MINOR = 1;
    public static final String LIBPOSTPROC_IDENT = "postproc55.1.100";
    public static final int LIBPOSTPROC_BUILD = 3604836;
    public static final int PP_CPU_CAPS_AUTO = 524288;
    public static final int LIBPOSTPROC_VERSION_MAJOR = 55;
    public static final int PP_FORMAT = 8;
    public static final int PP_CPU_CAPS_3DNOW = 1073741824;
    public static final int LIBPOSTPROC_VERSION_MICRO = 100;
    public static final int LIBPOSTPROC_VERSION_INT = 3604836;
    public static final int PP_FORMAT_444 = 8;
    public static final int PP_FORMAT_440 = 24;
    public static final int PP_FORMAT_411 = 10;
    public static final int PP_FORMAT_422 = 9;
    public static final int PP_FORMAT_420 = 25;
    public static final int PP_CPU_CAPS_MMX = -2147483648;
    public static final int PP_QUALITY_MAX = 6;
    public static final int PP_PICT_TYPE_QP2 = 16;
    public static final int PP_CPU_CAPS_MMX2 = 536870912;

    static {
        BridJ.register();
    }

    public PostprocLibrary() {
    }

    public static native int postproc_version();

    public static Pointer<Byte> postproc__configuration() {
        return Pointer.pointerToAddress(postproc_configuration(), Byte.class);
    }

    @Ptr
    protected static native long postproc_configuration();

    public static Pointer<Byte> postproc__license() {
        return Pointer.pointerToAddress(postproc_license(), Byte.class);
    }

    @Ptr
    protected static native long postproc_license();

    public static void pp_postprocess(Pointer<Pointer<Byte>> src, Pointer<Integer> srcStride, Pointer<Pointer<Byte>> dst, Pointer<Integer> dstStride, int horizontalSize, int verticalSize, Pointer<Byte> QP_store, int QP_stride, Pointer<?> mode, Pointer<?> ppContext, int pict_type) {
        pp_postprocess(Pointer.getPeer(src), Pointer.getPeer(srcStride), Pointer.getPeer(dst), Pointer.getPeer(dstStride), horizontalSize, verticalSize, Pointer.getPeer(QP_store), QP_stride, Pointer.getPeer(mode), Pointer.getPeer(ppContext), pict_type);
    }

    protected static native void pp_postprocess(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9, @Ptr long var10, int var12, @Ptr long var13, @Ptr long var15, int var17);

    public static Pointer<?> pp_get_mode_by_name_and_quality(Pointer<Byte> name, int quality) {
        return Pointer.pointerToAddress(pp_get_mode_by_name_and_quality(Pointer.getPeer(name), quality));
    }

    @Ptr
    protected static native long pp_get_mode_by_name_and_quality(@Ptr long var0, int var2);

    public static void pp_free_mode(Pointer<?> mode) {
        pp_free_mode(Pointer.getPeer(mode));
    }

    protected static native void pp_free_mode(@Ptr long var0);

    public static Pointer<?> pp__get_context(int width, int height, int flags) {
        return Pointer.pointerToAddress(pp_get_context(width, height, flags));
    }

    @Ptr
    protected static native long pp_get_context(int var0, int var1, int var2);

    public static void pp_free_context(Pointer<?> ppContext) {
        pp_free_context(Pointer.getPeer(ppContext));
    }

    protected static native void pp_free_context(@Ptr long var0);

    public Pointer<Byte> pp_help() {
        try {
            return (Pointer)BridJ.getNativeLibrary("postproc").getSymbolPointer("pp_help").as(DefaultParameterizedType.paramType(Pointer.class, new Type[]{Byte.class})).get();
        } catch (Throwable var2) {
            throw new RuntimeException(var2);
        }
    }

    public PostprocLibrary pp_help(Pointer<Byte> pp_help) {
        try {
            BridJ.getNativeLibrary("postproc").getSymbolPointer("pp_help").as(DefaultParameterizedType.paramType(Pointer.class, new Type[]{Byte.class})).set(pp_help);
            return this;
        } catch (Throwable var3) {
            throw new RuntimeException(var3);
        }
    }
}
