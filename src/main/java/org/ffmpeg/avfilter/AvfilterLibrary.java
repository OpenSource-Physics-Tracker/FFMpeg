//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avutil.AVBufferRef;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;

@Library("avfilter")
@Runtime(CRuntime.class)
public class AvfilterLibrary {
    public static final int AVFILTER_AUTO_CONVERT_ALL = 0;
    public static final int AVFILTER_AUTO_CONVERT_NONE = -1;
    public static final int AV_BUFFERSRC_FLAG_NO_CHECK_FORMAT = 1;
    public static final int AV_BUFFERSRC_FLAG_PUSH = 4;
    public static final int AV_BUFFERSRC_FLAG_KEEP_REF = 8;
    public static final int LIBAVFILTER_VERSION_INT = 462948;
    public static final int AVFILTER_FLAG_SLICE_THREADS = 4;
    public static final boolean FF_API_LAVR_OPTS = true;
    public static final int AVFILTER_CMD_FLAG_FAST = 2;
    public static final int LIBAVFILTER_VERSION_MAJOR = 7;
    public static final int AV_BUFFERSINK_FLAG_PEEK = 1;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE = 196608;
    public static final int LIBAVFILTER_BUILD = 462948;
    public static final int AVFILTER_FLAG_DYNAMIC_OUTPUTS = 2;
    public static final int AVFILTER_FLAG_DYNAMIC_INPUTS = 1;
    public static final int LIBAVFILTER_VERSION_MICRO = 100;
    public static final String LIBAVFILTER_IDENT = "Lavfi7.16.100";
    public static final int AVFILTER_CMD_FLAG_ONE = 1;
    public static final int AVFILTER_THREAD_SLICE = 1;
    public static final boolean FF_API_OLD_FILTER_OPTS_ERROR = true;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE_GENERIC = 65536;
    public static final boolean FF_API_FILTER_GET_SET = true;
    public static final int AV_BUFFERSINK_FLAG_NO_REQUEST = 2;
    public static final int AVFILTER_FLAG_SUPPORT_TIMELINE_INTERNAL = 131072;
    public static final int LIBAVFILTER_VERSION_MINOR = 16;

    static {
        BridJ.register();
    }

    public AvfilterLibrary() {
    }

    public static native int avfilter_version();

    public static Pointer<Byte> avfilter__configuration() {
        return Pointer.pointerToAddress(avfilter_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avfilter_configuration();

    public static Pointer<Byte> avfilter__license() {
        return Pointer.pointerToAddress(avfilter_license(), Byte.class);
    }

    @Ptr
    protected static native long avfilter_license();

    public static int avfilter_pad_count(Pointer<AVFilterPad> pads) {
        return avfilter_pad_count(Pointer.getPeer(pads));
    }

    protected static native int avfilter_pad_count(@Ptr long var0);

    public static Pointer<Byte> avfilter_pad_get_name(Pointer<AVFilterPad> pads, int pad_idx) {
        return Pointer.pointerToAddress(avfilter_pad_get_name(Pointer.getPeer(pads), pad_idx), Byte.class);
    }

    @Ptr
    protected static native long avfilter_pad_get_name(@Ptr long var0, int var2);

    public static IntValuedEnum<AVMediaType> avfilter_pad_get_type(Pointer<AVFilterPad> pads, int pad_idx) {
        return FlagSet.fromValue(avfilter_pad_get_type(Pointer.getPeer(pads), pad_idx), AVMediaType.class);
    }

    protected static native int avfilter_pad_get_type(@Ptr long var0, int var2);

    public static int avfilter_link(Pointer<AVFilterContext> src, int srcpad, Pointer<AVFilterContext> dst, int dstpad) {
        return avfilter_link(Pointer.getPeer(src), srcpad, Pointer.getPeer(dst), dstpad);
    }

    protected static native int avfilter_link(@Ptr long var0, int var2, @Ptr long var3, int var5);

    public static void avfilter_link_free(Pointer<Pointer<AVFilterLink>> link) {
        avfilter_link_free(Pointer.getPeer(link));
    }

    protected static native void avfilter_link_free(@Ptr long var0);

    public static int avfilter_link_get_channels(Pointer<AVFilterLink> link) {
        return avfilter_link_get_channels(Pointer.getPeer(link));
    }

    protected static native int avfilter_link_get_channels(@Ptr long var0);

    /** @deprecated */
    public static void avfilter_link_set_closed(Pointer<AVFilterLink> link, int closed) {
        avfilter_link_set_closed(Pointer.getPeer(link), closed);
    }

    protected static native void avfilter_link_set_closed(@Ptr long var0, int var2);

    public static int avfilter_config_links(Pointer<AVFilterContext> filter) {
        return avfilter_config_links(Pointer.getPeer(filter));
    }

    protected static native int avfilter_config_links(@Ptr long var0);

    public static int avfilter_process_command(Pointer<AVFilterContext> filter, Pointer<Byte> cmd, Pointer<Byte> arg, Pointer<Byte> res, int res_len, int flags) {
        return avfilter_process_command(Pointer.getPeer(filter), Pointer.getPeer(cmd), Pointer.getPeer(arg), Pointer.getPeer(res), res_len, flags);
    }

    protected static native int avfilter_process_command(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, int var9);

    public static Pointer<AVFilter> av_filter_iterate(Pointer<Pointer<?>> opaque) {
        return Pointer.pointerToAddress(av_filter_iterate(Pointer.getPeer(opaque)), AVFilter.class);
    }

    @Ptr
    protected static native long av_filter_iterate(@Ptr long var0);

    public static native void avfilter_register_all();

    public static int avfilter_register(Pointer<AVFilter> filter) {
        return avfilter_register(Pointer.getPeer(filter));
    }

    protected static native int avfilter_register(@Ptr long var0);

    public static Pointer<AVFilter> avfilter_next(Pointer<AVFilter> prev) {
        return Pointer.pointerToAddress(avfilter_next(Pointer.getPeer(prev)), AVFilter.class);
    }

    @Ptr
    protected static native long avfilter_next(@Ptr long var0);

    public static Pointer<AVFilter> avfilter_get_by_name(Pointer<Byte> name) {
        return Pointer.pointerToAddress(avfilter_get_by_name(Pointer.getPeer(name)), AVFilter.class);
    }

    @Ptr
    protected static native long avfilter_get_by_name(@Ptr long var0);

    public static int avfilter_init_str(Pointer<AVFilterContext> ctx, Pointer<Byte> args) {
        return avfilter_init_str(Pointer.getPeer(ctx), Pointer.getPeer(args));
    }

    protected static native int avfilter_init_str(@Ptr long var0, @Ptr long var2);

    public static int avfilter_init_dict(Pointer<AVFilterContext> ctx, Pointer<Pointer<AVDictionary>> options) {
        return avfilter_init_dict(Pointer.getPeer(ctx), Pointer.getPeer(options));
    }

    protected static native int avfilter_init_dict(@Ptr long var0, @Ptr long var2);

    public static void avfilter_free(Pointer<AVFilterContext> filter) {
        avfilter_free(Pointer.getPeer(filter));
    }

    protected static native void avfilter_free(@Ptr long var0);

    public static int avfilter_insert_filter(Pointer<AVFilterLink> link, Pointer<AVFilterContext> filt, int filt_srcpad_idx, int filt_dstpad_idx) {
        return avfilter_insert_filter(Pointer.getPeer(link), Pointer.getPeer(filt), filt_srcpad_idx, filt_dstpad_idx);
    }

    protected static native int avfilter_insert_filter(@Ptr long var0, @Ptr long var2, int var4, int var5);

    public static Pointer<AVClass> avfilter__get_class() {
        return Pointer.pointerToAddress(avfilter_get_class(), AVClass.class);
    }

    @Ptr
    protected static native long avfilter_get_class();

    public static Pointer<AVFilterGraph> avfilter__graph_alloc() {
        return Pointer.pointerToAddress(avfilter_graph_alloc(), AVFilterGraph.class);
    }

    @Ptr
    protected static native long avfilter_graph_alloc();

    public static Pointer<AVFilterContext> avfilter_graph_alloc_filter(Pointer<AVFilterGraph> graph, Pointer<AVFilter> filter, Pointer<Byte> name) {
        return Pointer.pointerToAddress(avfilter_graph_alloc_filter(Pointer.getPeer(graph), Pointer.getPeer(filter), Pointer.getPeer(name)), AVFilterContext.class);
    }

    @Ptr
    protected static native long avfilter_graph_alloc_filter(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static Pointer<AVFilterContext> avfilter_graph_get_filter(Pointer<AVFilterGraph> graph, Pointer<Byte> name) {
        return Pointer.pointerToAddress(avfilter_graph_get_filter(Pointer.getPeer(graph), Pointer.getPeer(name)), AVFilterContext.class);
    }

    @Ptr
    protected static native long avfilter_graph_get_filter(@Ptr long var0, @Ptr long var2);

    public static int avfilter_graph_create_filter(Pointer<Pointer<AVFilterContext>> filt_ctx, Pointer<AVFilter> filt, Pointer<Byte> name, Pointer<Byte> args, Pointer<?> opaque, Pointer<AVFilterGraph> graph_ctx) {
        return avfilter_graph_create_filter(Pointer.getPeer(filt_ctx), Pointer.getPeer(filt), Pointer.getPeer(name), Pointer.getPeer(args), Pointer.getPeer(opaque), Pointer.getPeer(graph_ctx));
    }

    protected static native int avfilter_graph_create_filter(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, @Ptr long var10);

    public static void avfilter_graph_set_auto_convert(Pointer<AVFilterGraph> graph, int flags) {
        avfilter_graph_set_auto_convert(Pointer.getPeer(graph), flags);
    }

    protected static native void avfilter_graph_set_auto_convert(@Ptr long var0, int var2);

    public static int avfilter_graph_config(Pointer<AVFilterGraph> graphctx, Pointer<?> log_ctx) {
        return avfilter_graph_config(Pointer.getPeer(graphctx), Pointer.getPeer(log_ctx));
    }

    protected static native int avfilter_graph_config(@Ptr long var0, @Ptr long var2);

    public static void avfilter_graph_free(Pointer<Pointer<AVFilterGraph>> graph) {
        avfilter_graph_free(Pointer.getPeer(graph));
    }

    protected static native void avfilter_graph_free(@Ptr long var0);

    public static Pointer<AVFilterInOut> avfilter__inout_alloc() {
        return Pointer.pointerToAddress(avfilter_inout_alloc(), AVFilterInOut.class);
    }

    @Ptr
    protected static native long avfilter_inout_alloc();

    public static void avfilter_inout_free(Pointer<Pointer<AVFilterInOut>> inout) {
        avfilter_inout_free(Pointer.getPeer(inout));
    }

    protected static native void avfilter_inout_free(@Ptr long var0);

    public static int avfilter_graph_parse(Pointer<AVFilterGraph> graph, Pointer<Byte> filters, Pointer<AVFilterInOut> inputs, Pointer<AVFilterInOut> outputs, Pointer<?> log_ctx) {
        return avfilter_graph_parse(Pointer.getPeer(graph), Pointer.getPeer(filters), Pointer.getPeer(inputs), Pointer.getPeer(outputs), Pointer.getPeer(log_ctx));
    }

    protected static native int avfilter_graph_parse(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8);

    public static int avfilter_graph_parse_ptr(Pointer<AVFilterGraph> graph, Pointer<Byte> filters, Pointer<Pointer<AVFilterInOut>> inputs, Pointer<Pointer<AVFilterInOut>> outputs, Pointer<?> log_ctx) {
        return avfilter_graph_parse_ptr(Pointer.getPeer(graph), Pointer.getPeer(filters), Pointer.getPeer(inputs), Pointer.getPeer(outputs), Pointer.getPeer(log_ctx));
    }

    protected static native int avfilter_graph_parse_ptr(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8);

    public static int avfilter_graph_parse2(Pointer<AVFilterGraph> graph, Pointer<Byte> filters, Pointer<Pointer<AVFilterInOut>> inputs, Pointer<Pointer<AVFilterInOut>> outputs) {
        return avfilter_graph_parse2(Pointer.getPeer(graph), Pointer.getPeer(filters), Pointer.getPeer(inputs), Pointer.getPeer(outputs));
    }

    protected static native int avfilter_graph_parse2(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avfilter_graph_send_command(Pointer<AVFilterGraph> graph, Pointer<Byte> target, Pointer<Byte> cmd, Pointer<Byte> arg, Pointer<Byte> res, int res_len, int flags) {
        return avfilter_graph_send_command(Pointer.getPeer(graph), Pointer.getPeer(target), Pointer.getPeer(cmd), Pointer.getPeer(arg), Pointer.getPeer(res), res_len, flags);
    }

    protected static native int avfilter_graph_send_command(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, @Ptr long var8, int var10, int var11);

    public static int avfilter_graph_queue_command(Pointer<AVFilterGraph> graph, Pointer<Byte> target, Pointer<Byte> cmd, Pointer<Byte> arg, int flags, double ts) {
        return avfilter_graph_queue_command(Pointer.getPeer(graph), Pointer.getPeer(target), Pointer.getPeer(cmd), Pointer.getPeer(arg), flags, ts);
    }

    protected static native int avfilter_graph_queue_command(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6, int var8, double var9);

    public static Pointer<Byte> avfilter_graph_dump(Pointer<AVFilterGraph> graph, Pointer<Byte> options) {
        return Pointer.pointerToAddress(avfilter_graph_dump(Pointer.getPeer(graph), Pointer.getPeer(options)), Byte.class);
    }

    @Ptr
    protected static native long avfilter_graph_dump(@Ptr long var0, @Ptr long var2);

    public static int avfilter_graph_request_oldest(Pointer<AVFilterGraph> graph) {
        return avfilter_graph_request_oldest(Pointer.getPeer(graph));
    }

    protected static native int avfilter_graph_request_oldest(@Ptr long var0);

    public static int av_buffersink_get_frame_flags(Pointer<AVFilterContext> ctx, Pointer<AVFrame> frame, int flags) {
        return av_buffersink_get_frame_flags(Pointer.getPeer(ctx), Pointer.getPeer(frame), flags);
    }

    protected static native int av_buffersink_get_frame_flags(@Ptr long var0, @Ptr long var2, int var4);

    public static Pointer<AVBufferSinkParams> av__buffersink_params_alloc() {
        return Pointer.pointerToAddress(av_buffersink_params_alloc(), AVBufferSinkParams.class);
    }

    @Ptr
    protected static native long av_buffersink_params_alloc();

    public static Pointer<AVABufferSinkParams> av__abuffersink_params_alloc() {
        return Pointer.pointerToAddress(av_abuffersink_params_alloc(), AVABufferSinkParams.class);
    }

    @Ptr
    protected static native long av_abuffersink_params_alloc();

    public static void av_buffersink_set_frame_size(Pointer<AVFilterContext> ctx, int frame_size) {
        av_buffersink_set_frame_size(Pointer.getPeer(ctx), frame_size);
    }

    protected static native void av_buffersink_set_frame_size(@Ptr long var0, int var2);

    public static IntValuedEnum<AVMediaType> av_buffersink_get_type(Pointer<AVFilterContext> ctx) {
        return FlagSet.fromValue(av_buffersink_get_type(Pointer.getPeer(ctx)), AVMediaType.class);
    }

    protected static native int av_buffersink_get_type(@Ptr long var0);

    public static AVRational av_buffersink_get_time_base(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_time_base(Pointer.getPeer(ctx));
    }

    protected static native AVRational av_buffersink_get_time_base(@Ptr long var0);

    public static int av_buffersink_get_format(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_format(Pointer.getPeer(ctx));
    }

    protected static native int av_buffersink_get_format(@Ptr long var0);

    public static AVRational av_buffersink_get_frame_rate(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_frame_rate(Pointer.getPeer(ctx));
    }

    protected static native AVRational av_buffersink_get_frame_rate(@Ptr long var0);

    public static int av_buffersink_get_w(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_w(Pointer.getPeer(ctx));
    }

    protected static native int av_buffersink_get_w(@Ptr long var0);

    public static int av_buffersink_get_h(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_h(Pointer.getPeer(ctx));
    }

    protected static native int av_buffersink_get_h(@Ptr long var0);

    public static AVRational av_buffersink_get_sample_aspect_ratio(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_sample_aspect_ratio(Pointer.getPeer(ctx));
    }

    protected static native AVRational av_buffersink_get_sample_aspect_ratio(@Ptr long var0);

    public static int av_buffersink_get_channels(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_channels(Pointer.getPeer(ctx));
    }

    protected static native int av_buffersink_get_channels(@Ptr long var0);

    public static long av_buffersink_get_channel_layout(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_channel_layout(Pointer.getPeer(ctx));
    }

    protected static native long av_buffersink_get_channel_layout(@Ptr long var0);

    public static int av_buffersink_get_sample_rate(Pointer<AVFilterContext> ctx) {
        return av_buffersink_get_sample_rate(Pointer.getPeer(ctx));
    }

    protected static native int av_buffersink_get_sample_rate(@Ptr long var0);

    public static Pointer<AVBufferRef> av_buffersink_get_hw_frames_ctx(Pointer<AVFilterContext> ctx) {
        return Pointer.pointerToAddress(av_buffersink_get_hw_frames_ctx(Pointer.getPeer(ctx)), AVBufferRef.class);
    }

    @Ptr
    protected static native long av_buffersink_get_hw_frames_ctx(@Ptr long var0);

    public static int av_buffersink_get_frame(Pointer<AVFilterContext> ctx, Pointer<AVFrame> frame) {
        return av_buffersink_get_frame(Pointer.getPeer(ctx), Pointer.getPeer(frame));
    }

    protected static native int av_buffersink_get_frame(@Ptr long var0, @Ptr long var2);

    public static int av_buffersink_get_samples(Pointer<AVFilterContext> ctx, Pointer<AVFrame> frame, int nb_samples) {
        return av_buffersink_get_samples(Pointer.getPeer(ctx), Pointer.getPeer(frame), nb_samples);
    }

    protected static native int av_buffersink_get_samples(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_buffersrc_get_nb_failed_requests(Pointer<AVFilterContext> buffer_src) {
        return av_buffersrc_get_nb_failed_requests(Pointer.getPeer(buffer_src));
    }

    protected static native int av_buffersrc_get_nb_failed_requests(@Ptr long var0);

    public static Pointer<AVBufferSrcParameters> av_buffersrc__parameters_alloc() {
        return Pointer.pointerToAddress(av_buffersrc_parameters_alloc(), AVBufferSrcParameters.class);
    }

    @Ptr
    protected static native long av_buffersrc_parameters_alloc();

    public static int av_buffersrc_parameters_set(Pointer<AVFilterContext> ctx, Pointer<AVBufferSrcParameters> param) {
        return av_buffersrc_parameters_set(Pointer.getPeer(ctx), Pointer.getPeer(param));
    }

    protected static native int av_buffersrc_parameters_set(@Ptr long var0, @Ptr long var2);

    public static int av_buffersrc_write_frame(Pointer<AVFilterContext> ctx, Pointer<AVFrame> frame) {
        return av_buffersrc_write_frame(Pointer.getPeer(ctx), Pointer.getPeer(frame));
    }

    protected static native int av_buffersrc_write_frame(@Ptr long var0, @Ptr long var2);

    public static int av_buffersrc_add_frame(Pointer<AVFilterContext> ctx, Pointer<AVFrame> frame) {
        return av_buffersrc_add_frame(Pointer.getPeer(ctx), Pointer.getPeer(frame));
    }

    protected static native int av_buffersrc_add_frame(@Ptr long var0, @Ptr long var2);

    public static int av_buffersrc_add_frame_flags(Pointer<AVFilterContext> buffer_src, Pointer<AVFrame> frame, int flags) {
        return av_buffersrc_add_frame_flags(Pointer.getPeer(buffer_src), Pointer.getPeer(frame), flags);
    }

    protected static native int av_buffersrc_add_frame_flags(@Ptr long var0, @Ptr long var2, int var4);

    public static int av_buffersrc_close(Pointer<AVFilterContext> ctx, long pts, int flags) {
        return av_buffersrc_close(Pointer.getPeer(ctx), pts, flags);
    }

    protected static native int av_buffersrc_close(@Ptr long var0, long var2, int var4);

    public int dummy() {
        try {
            return (Integer)BridJ.getNativeLibrary("avfilter").getSymbolPointer("dummy").as(Integer.TYPE).get();
        } catch (Throwable var2) {
            throw new RuntimeException(var2);
        }
    }

    public AvfilterLibrary dummy(int dummy) {
        try {
            BridJ.getNativeLibrary("avfilter").getSymbolPointer("dummy").as(Integer.TYPE).set(dummy);
            return this;
        } catch (Throwable var3) {
            throw new RuntimeException(var3);
        }
    }

    public abstract static class avfilter_action_func extends Callback<AvfilterLibrary.avfilter_action_func> {
        public avfilter_action_func() {
        }

        public int apply(Pointer<AVFilterContext> ctx, Pointer<?> arg, int jobnr, int nb_jobs) {
            return this.apply(Pointer.getPeer(ctx), Pointer.getPeer(arg), jobnr, nb_jobs);
        }

        public int apply(@Ptr long ctx, @Ptr long arg, int jobnr, int nb_jobs) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(arg), jobnr, nb_jobs);
        }
    }

    public abstract static class avfilter_execute_func extends Callback<AvfilterLibrary.avfilter_execute_func> {
        public avfilter_execute_func() {
        }

        public int apply(Pointer<AVFilterContext> ctx, Pointer<AvfilterLibrary.avfilter_action_func> func, Pointer<?> arg, Pointer<Integer> ret, int nb_jobs) {
            return this.apply(Pointer.getPeer(ctx), Pointer.getPeer(func), Pointer.getPeer(arg), Pointer.getPeer(ret), nb_jobs);
        }

        public int apply(@Ptr long ctx, @Ptr long func, @Ptr long arg, @Ptr long ret, int nb_jobs) {
            return this.apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(func, AvfilterLibrary.avfilter_action_func.class), Pointer.pointerToAddress(arg), Pointer.pointerToAddress(ret, Integer.class), nb_jobs);
        }
    }
}
