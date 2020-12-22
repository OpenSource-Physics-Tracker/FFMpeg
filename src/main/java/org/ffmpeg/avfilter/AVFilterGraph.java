//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avfilter;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avfilter.AvfilterLibrary.avfilter_execute_func;
import org.ffmpeg.avutil.AVClass;

@Library("avfilter")
public class AVFilterGraph extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVFilterGraph av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<Pointer<AVFilterContext>> filters() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVFilterGraph filters(Pointer<Pointer<AVFilterContext>> filters) {
        this.io.setPointerField(this, 1, filters);
        return this;
    }

    @Field(2)
    public int nb_filters() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVFilterGraph nb_filters(int nb_filters) {
        this.io.setIntField(this, 2, nb_filters);
        return this;
    }

    @Field(3)
    public Pointer<Byte> scale_sws_opts() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVFilterGraph scale_sws_opts(Pointer<Byte> scale_sws_opts) {
        this.io.setPointerField(this, 3, scale_sws_opts);
        return this;
    }

    @Field(4)
    public Pointer<Byte> resample_lavr_opts() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVFilterGraph resample_lavr_opts(Pointer<Byte> resample_lavr_opts) {
        this.io.setPointerField(this, 4, resample_lavr_opts);
        return this;
    }

    @Field(5)
    public int thread_type() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public AVFilterGraph thread_type(int thread_type) {
        this.io.setIntField(this, 5, thread_type);
        return this;
    }

    @Field(6)
    public int nb_threads() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public AVFilterGraph nb_threads(int nb_threads) {
        this.io.setIntField(this, 6, nb_threads);
        return this;
    }

    @Field(7)
    public Pointer<AVFilterGraphInternal> internal() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVFilterGraph internal(Pointer<AVFilterGraphInternal> internal) {
        this.io.setPointerField(this, 7, internal);
        return this;
    }

    @Field(8)
    public Pointer<?> opaque() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVFilterGraph opaque(Pointer<?> opaque) {
        this.io.setPointerField(this, 8, opaque);
        return this;
    }

    @Field(9)
    public Pointer<avfilter_execute_func> execute() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public AVFilterGraph execute(Pointer<avfilter_execute_func> execute) {
        this.io.setPointerField(this, 9, execute);
        return this;
    }

    @Field(10)
    public Pointer<Byte> aresample_swr_opts() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public AVFilterGraph aresample_swr_opts(Pointer<Byte> aresample_swr_opts) {
        this.io.setPointerField(this, 10, aresample_swr_opts);
        return this;
    }

    @Field(11)
    public Pointer<Pointer<AVFilterLink>> sink_links() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public AVFilterGraph sink_links(Pointer<Pointer<AVFilterLink>> sink_links) {
        this.io.setPointerField(this, 11, sink_links);
        return this;
    }

    @Field(12)
    public int sink_links_count() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVFilterGraph sink_links_count(int sink_links_count) {
        this.io.setIntField(this, 12, sink_links_count);
        return this;
    }

    @Field(13)
    public int disable_auto_convert() {
        return this.io.getIntField(this, 13);
    }

    @Field(13)
    public AVFilterGraph disable_auto_convert(int disable_auto_convert) {
        this.io.setIntField(this, 13, disable_auto_convert);
        return this;
    }

    public AVFilterGraph() {
    }

    public AVFilterGraph(Pointer pointer) {
        super(pointer, new Object[0]);
    }
}
