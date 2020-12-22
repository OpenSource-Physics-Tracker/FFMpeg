//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avformat;

import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avformat.AvformatLibrary.AVIODataMarkerType;
import org.ffmpeg.avutil.AVClass;

@Library("avformat")
public class AVIOContext extends StructObject {
    static {
        BridJ.register();
    }

    @Field(0)
    public Pointer<AVClass> av_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public AVIOContext av_class(Pointer<AVClass> av_class) {
        this.io.setPointerField(this, 0, av_class);
        return this;
    }

    @Field(1)
    public Pointer<Byte> buffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public AVIOContext buffer(Pointer<Byte> buffer) {
        this.io.setPointerField(this, 1, buffer);
        return this;
    }

    @Field(2)
    public int buffer_size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public AVIOContext buffer_size(int buffer_size) {
        this.io.setIntField(this, 2, buffer_size);
        return this;
    }

    @Field(3)
    public Pointer<Byte> buf_ptr() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public AVIOContext buf_ptr(Pointer<Byte> buf_ptr) {
        this.io.setPointerField(this, 3, buf_ptr);
        return this;
    }

    @Field(4)
    public Pointer<Byte> buf_end() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public AVIOContext buf_end(Pointer<Byte> buf_end) {
        this.io.setPointerField(this, 4, buf_end);
        return this;
    }

    @Field(5)
    public Pointer<?> opaque() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public AVIOContext opaque(Pointer<?> opaque) {
        this.io.setPointerField(this, 5, opaque);
        return this;
    }

    @Field(6)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.read_packet_callback> read_packet() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public AVIOContext read_packet(Pointer<org.ffmpeg.avformat.AVInputFormat.read_packet_callback> read_packet) {
        this.io.setPointerField(this, 6, read_packet);
        return this;
    }

    @Field(7)
    public Pointer<org.ffmpeg.avformat.AVOutputFormat.write_packet_callback> write_packet() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public AVIOContext write_packet(Pointer<org.ffmpeg.avformat.AVOutputFormat.write_packet_callback> write_packet) {
        this.io.setPointerField(this, 7, write_packet);
        return this;
    }

    @Field(8)
    public Pointer<AVIOContext.seek_callback> seek() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public AVIOContext seek(Pointer<AVIOContext.seek_callback> seek) {
        this.io.setPointerField(this, 8, seek);
        return this;
    }

    @Field(9)
    public long pos() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public AVIOContext pos(long pos) {
        this.io.setLongField(this, 9, pos);
        return this;
    }

    @Field(10)
    public int eof_reached() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    public AVIOContext eof_reached(int eof_reached) {
        this.io.setIntField(this, 10, eof_reached);
        return this;
    }

    @Field(11)
    public int write_flag() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public AVIOContext write_flag(int write_flag) {
        this.io.setIntField(this, 11, write_flag);
        return this;
    }

    @Field(12)
    public int max_packet_size() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public AVIOContext max_packet_size(int max_packet_size) {
        this.io.setIntField(this, 12, max_packet_size);
        return this;
    }

    @CLong
    @Field(13)
    public long checksum() {
        return this.io.getCLongField(this, 13);
    }

    @CLong
    @Field(13)
    public AVIOContext checksum(long checksum) {
        this.io.setCLongField(this, 13, checksum);
        return this;
    }

    @Field(14)
    public Pointer<Byte> checksum_ptr() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public AVIOContext checksum_ptr(Pointer<Byte> checksum_ptr) {
        this.io.setPointerField(this, 14, checksum_ptr);
        return this;
    }

    @Field(15)
    public Pointer<AVIOContext.update_checksum_callback> update_checksum() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public AVIOContext update_checksum(Pointer<AVIOContext.update_checksum_callback> update_checksum) {
        this.io.setPointerField(this, 15, update_checksum);
        return this;
    }

    @Field(16)
    public int error() {
        return this.io.getIntField(this, 16);
    }

    @Field(16)
    public AVIOContext error(int error) {
        this.io.setIntField(this, 16, error);
        return this;
    }

    @Field(17)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.read_pause_callback> read_pause() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public AVIOContext read_pause(Pointer<org.ffmpeg.avformat.AVInputFormat.read_pause_callback> read_pause) {
        this.io.setPointerField(this, 17, read_pause);
        return this;
    }

    @Field(18)
    public Pointer<org.ffmpeg.avformat.AVInputFormat.read_seek_callback> read_seek() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public AVIOContext read_seek(Pointer<org.ffmpeg.avformat.AVInputFormat.read_seek_callback> read_seek) {
        this.io.setPointerField(this, 18, read_seek);
        return this;
    }

    @Field(19)
    public int seekable() {
        return this.io.getIntField(this, 19);
    }

    @Field(19)
    public AVIOContext seekable(int seekable) {
        this.io.setIntField(this, 19, seekable);
        return this;
    }

    @Field(20)
    public long maxsize() {
        return this.io.getLongField(this, 20);
    }

    @Field(20)
    public AVIOContext maxsize(long maxsize) {
        this.io.setLongField(this, 20, maxsize);
        return this;
    }

    @Field(21)
    public int direct() {
        return this.io.getIntField(this, 21);
    }

    @Field(21)
    public AVIOContext direct(int direct) {
        this.io.setIntField(this, 21, direct);
        return this;
    }

    @Field(22)
    public long bytes_read() {
        return this.io.getLongField(this, 22);
    }

    @Field(22)
    public AVIOContext bytes_read(long bytes_read) {
        this.io.setLongField(this, 22, bytes_read);
        return this;
    }

    @Field(23)
    public int seek_count() {
        return this.io.getIntField(this, 23);
    }

    @Field(23)
    public AVIOContext seek_count(int seek_count) {
        this.io.setIntField(this, 23, seek_count);
        return this;
    }

    @Field(24)
    public int writeout_count() {
        return this.io.getIntField(this, 24);
    }

    @Field(24)
    public AVIOContext writeout_count(int writeout_count) {
        this.io.setIntField(this, 24, writeout_count);
        return this;
    }

    @Field(25)
    public int orig_buffer_size() {
        return this.io.getIntField(this, 25);
    }

    @Field(25)
    public AVIOContext orig_buffer_size(int orig_buffer_size) {
        this.io.setIntField(this, 25, orig_buffer_size);
        return this;
    }

    @Field(26)
    public int short_seek_threshold() {
        return this.io.getIntField(this, 26);
    }

    @Field(26)
    public AVIOContext short_seek_threshold(int short_seek_threshold) {
        this.io.setIntField(this, 26, short_seek_threshold);
        return this;
    }

    @Field(27)
    public Pointer<Byte> protocol_whitelist() {
        return this.io.getPointerField(this, 27);
    }

    @Field(27)
    public AVIOContext protocol_whitelist(Pointer<Byte> protocol_whitelist) {
        this.io.setPointerField(this, 27, protocol_whitelist);
        return this;
    }

    @Field(28)
    public Pointer<Byte> protocol_blacklist() {
        return this.io.getPointerField(this, 28);
    }

    @Field(28)
    public AVIOContext protocol_blacklist(Pointer<Byte> protocol_blacklist) {
        this.io.setPointerField(this, 28, protocol_blacklist);
        return this;
    }

    @Field(29)
    public Pointer<AVIOContext.write_data_type_callback> write_data_type() {
        return this.io.getPointerField(this, 29);
    }

    @Field(29)
    public AVIOContext write_data_type(Pointer<AVIOContext.write_data_type_callback> write_data_type) {
        this.io.setPointerField(this, 29, write_data_type);
        return this;
    }

    @Field(30)
    public int ignore_boundary_point() {
        return this.io.getIntField(this, 30);
    }

    @Field(30)
    public AVIOContext ignore_boundary_point(int ignore_boundary_point) {
        this.io.setIntField(this, 30, ignore_boundary_point);
        return this;
    }

    @Field(31)
    public IntValuedEnum<AVIODataMarkerType> current_type() {
        return this.io.getEnumField(this, 31);
    }

    @Field(31)
    public AVIOContext current_type(IntValuedEnum<AVIODataMarkerType> current_type) {
        this.io.setEnumField(this, 31, current_type);
        return this;
    }

    @Field(32)
    public long last_time() {
        return this.io.getLongField(this, 32);
    }

    @Field(32)
    public AVIOContext last_time(long last_time) {
        this.io.setLongField(this, 32, last_time);
        return this;
    }

    @Field(33)
    public Pointer<AVIOContext.short_seek_get_callback> short_seek_get() {
        return this.io.getPointerField(this, 33);
    }

    @Field(33)
    public AVIOContext short_seek_get(Pointer<AVIOContext.short_seek_get_callback> short_seek_get) {
        this.io.setPointerField(this, 33, short_seek_get);
        return this;
    }

    @Field(34)
    public long written() {
        return this.io.getLongField(this, 34);
    }

    @Field(34)
    public AVIOContext written(long written) {
        this.io.setLongField(this, 34, written);
        return this;
    }

    @Field(35)
    public Pointer<Byte> buf_ptr_max() {
        return this.io.getPointerField(this, 35);
    }

    @Field(35)
    public AVIOContext buf_ptr_max(Pointer<Byte> buf_ptr_max) {
        this.io.setPointerField(this, 35, buf_ptr_max);
        return this;
    }

    @Field(36)
    public int min_packet_size() {
        return this.io.getIntField(this, 36);
    }

    @Field(36)
    public AVIOContext min_packet_size(int min_packet_size) {
        this.io.setIntField(this, 36, min_packet_size);
        return this;
    }

    public AVIOContext() {
    }

    public AVIOContext(Pointer pointer) {
        super(pointer, new Object[0]);
    }

    public abstract static class read_packet_callback extends Callback<AVIOContext.read_packet_callback> {
        public read_packet_callback() {
        }

        public int apply(Pointer<?> opaque, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }

    public abstract static class read_pause_callback extends Callback<AVIOContext.read_pause_callback> {
        public read_pause_callback() {
        }

        public int apply(Pointer<?> opaque, int pause) {
            return this.apply(Pointer.getPeer(opaque), pause);
        }

        public int apply(@Ptr long opaque, int pause) {
            return this.apply(Pointer.pointerToAddress(opaque), pause);
        }
    }

    public abstract static class read_seek_callback extends Callback<AVIOContext.read_seek_callback> {
        public read_seek_callback() {
        }

        public long apply(Pointer<?> opaque, int stream_index, long timestamp, int flags) {
            return this.apply(Pointer.getPeer(opaque), stream_index, timestamp, flags);
        }

        public long apply(@Ptr long opaque, int stream_index, long timestamp, int flags) {
            return this.apply(Pointer.pointerToAddress(opaque), stream_index, timestamp, flags);
        }
    }

    public abstract static class seek_callback extends Callback<AVIOContext.seek_callback> {
        public seek_callback() {
        }

        public long apply(Pointer<?> opaque, long offset, int whence) {
            return this.apply(Pointer.getPeer(opaque), offset, whence);
        }

        public long apply(@Ptr long opaque, long offset, int whence) {
            return this.apply(Pointer.pointerToAddress(opaque), offset, whence);
        }
    }

    public abstract static class short_seek_get_callback extends Callback<AVIOContext.short_seek_get_callback> {
        public short_seek_get_callback() {
        }

        public int apply(Pointer<?> opaque) {
            return this.apply(Pointer.getPeer(opaque));
        }

        public int apply(@Ptr long opaque) {
            return this.apply(Pointer.pointerToAddress(opaque));
        }
    }

    public abstract static class update_checksum_callback extends Callback<AVIOContext.update_checksum_callback> {
        public update_checksum_callback() {
        }

        @CLong
        public long apply(@CLong long checksum, Pointer<Byte> buf, int size) {
            return this.apply(checksum, Pointer.getPeer(buf), size);
        }

        @CLong
        public long apply(@CLong long checksum, @Ptr long buf, int size) {
            return this.apply(checksum, Pointer.pointerToAddress(buf, Byte.class), size);
        }
    }

    public abstract static class write_data_type_callback extends Callback<AVIOContext.write_data_type_callback> {
        public write_data_type_callback() {
        }

        public int apply(Pointer<?> opaque, Pointer<Byte> buf, int buf_size, IntValuedEnum<AVIODataMarkerType> type, long time) {
            return this.apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size, (int)type.value(), time);
        }

        public int apply(@Ptr long opaque, @Ptr long buf, int buf_size, int type, long time) {
            return this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size, FlagSet.fromValue(type, AVIODataMarkerType.class), time);
        }
    }

    public abstract static class write_packet_callback extends Callback<AVIOContext.write_packet_callback> {
        public write_packet_callback() {
        }

        public int apply(Pointer<?> opaque, Pointer<Byte> buf, int buf_size) {
            return this.apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
        }

        public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
            return this.apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
        }
    }
}
