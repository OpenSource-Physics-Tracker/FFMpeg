//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avdevice;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.bridj.util.DefaultParameterizedType;
import org.ffmpeg.avformat.AVFormatContext;
import org.ffmpeg.avformat.AVInputFormat;
import org.ffmpeg.avformat.AVOutputFormat;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVOption;

@Library("avdevice")
@Runtime(CRuntime.class)
public class AvdeviceLibrary {
    public static final int LIBAVDEVICE_VERSION_INT = 3801956;
    public static final int LIBAVDEVICE_VERSION_MICRO = 100;
    public static final int LIBAVDEVICE_BUILD = 3801956;
    public static final int LIBAVDEVICE_VERSION_MINOR = 3;
    public static final int LIBAVDEVICE_VERSION_MAJOR = 58;
    public static final String LIBAVDEVICE_IDENT = "Lavd58.3.100";

    static {
        BridJ.register();
    }

    public AvdeviceLibrary() {
    }

    public static native int avdevice_version();

    public static Pointer<Byte> avdevice__configuration() {
        return Pointer.pointerToAddress(avdevice_configuration(), Byte.class);
    }

    @Ptr
    protected static native long avdevice_configuration();

    public static Pointer<Byte> avdevice__license() {
        return Pointer.pointerToAddress(avdevice_license(), Byte.class);
    }

    @Ptr
    protected static native long avdevice_license();

    public static native void avdevice_register_all();

    public static Pointer<AVInputFormat> av_input_audio_device_next(Pointer<AVInputFormat> d) {
        return Pointer.pointerToAddress(av_input_audio_device_next(Pointer.getPeer(d)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_input_audio_device_next(@Ptr long var0);

    public static Pointer<AVInputFormat> av_input_video_device_next(Pointer<AVInputFormat> d) {
        return Pointer.pointerToAddress(av_input_video_device_next(Pointer.getPeer(d)), AVInputFormat.class);
    }

    @Ptr
    protected static native long av_input_video_device_next(@Ptr long var0);

    public static Pointer<AVOutputFormat> av_output_audio_device_next(Pointer<AVOutputFormat> d) {
        return Pointer.pointerToAddress(av_output_audio_device_next(Pointer.getPeer(d)), AVOutputFormat.class);
    }

    @Ptr
    protected static native long av_output_audio_device_next(@Ptr long var0);

    public static Pointer<AVOutputFormat> av_output_video_device_next(Pointer<AVOutputFormat> d) {
        return Pointer.pointerToAddress(av_output_video_device_next(Pointer.getPeer(d)), AVOutputFormat.class);
    }

    @Ptr
    protected static native long av_output_video_device_next(@Ptr long var0);

    public static int avdevice_app_to_dev_control_message(Pointer<AVFormatContext> s, IntValuedEnum<AvdeviceLibrary.AVAppToDevMessageType> type, Pointer<?> data, @Ptr long data_size) {
        return avdevice_app_to_dev_control_message(Pointer.getPeer(s), (int)type.value(), Pointer.getPeer(data), data_size);
    }

    protected static native int avdevice_app_to_dev_control_message(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static int avdevice_dev_to_app_control_message(Pointer<AVFormatContext> s, IntValuedEnum<AvdeviceLibrary.AVDevToAppMessageType> type, Pointer<?> data, @Ptr long data_size) {
        return avdevice_dev_to_app_control_message(Pointer.getPeer(s), (int)type.value(), Pointer.getPeer(data), data_size);
    }

    protected static native int avdevice_dev_to_app_control_message(@Ptr long var0, int var2, @Ptr long var3, @Ptr long var5);

    public static int avdevice_capabilities_create(Pointer<Pointer<AVDeviceCapabilitiesQuery>> caps, Pointer<AVFormatContext> s, Pointer<Pointer<AVDictionary>> device_options) {
        return avdevice_capabilities_create(Pointer.getPeer(caps), Pointer.getPeer(s), Pointer.getPeer(device_options));
    }

    protected static native int avdevice_capabilities_create(@Ptr long var0, @Ptr long var2, @Ptr long var4);

    public static void avdevice_capabilities_free(Pointer<Pointer<AVDeviceCapabilitiesQuery>> caps, Pointer<AVFormatContext> s) {
        avdevice_capabilities_free(Pointer.getPeer(caps), Pointer.getPeer(s));
    }

    protected static native void avdevice_capabilities_free(@Ptr long var0, @Ptr long var2);

    public static int avdevice_list_devices(Pointer<AVFormatContext> s, Pointer<Pointer<AVDeviceInfoList>> device_list) {
        return avdevice_list_devices(Pointer.getPeer(s), Pointer.getPeer(device_list));
    }

    protected static native int avdevice_list_devices(@Ptr long var0, @Ptr long var2);

    public static void avdevice_free_list_devices(Pointer<Pointer<AVDeviceInfoList>> device_list) {
        avdevice_free_list_devices(Pointer.getPeer(device_list));
    }

    protected static native void avdevice_free_list_devices(@Ptr long var0);

    public static int avdevice_list_input_sources(Pointer<AVInputFormat> device, Pointer<Byte> device_name, Pointer<AVDictionary> device_options, Pointer<Pointer<AVDeviceInfoList>> device_list) {
        return avdevice_list_input_sources(Pointer.getPeer(device), Pointer.getPeer(device_name), Pointer.getPeer(device_options), Pointer.getPeer(device_list));
    }

    protected static native int avdevice_list_input_sources(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public static int avdevice_list_output_sinks(Pointer<AVOutputFormat> device, Pointer<Byte> device_name, Pointer<AVDictionary> device_options, Pointer<Pointer<AVDeviceInfoList>> device_list) {
        return avdevice_list_output_sinks(Pointer.getPeer(device), Pointer.getPeer(device_name), Pointer.getPeer(device_options), Pointer.getPeer(device_list));
    }

    protected static native int avdevice_list_output_sinks(@Ptr long var0, @Ptr long var2, @Ptr long var4, @Ptr long var6);

    public Pointer<AVOption> av_device_capabilities() {
        try {
            return (Pointer)BridJ.getNativeLibrary("avdevice").getSymbolPointer("av_device_capabilities").as(DefaultParameterizedType.paramType(Pointer.class, new Type[]{AVOption.class})).get();
        } catch (Throwable var2) {
            throw new RuntimeException(var2);
        }
    }

    public AvdeviceLibrary av_device_capabilities(Pointer<AVOption> av_device_capabilities) {
        try {
            BridJ.getNativeLibrary("avdevice").getSymbolPointer("av_device_capabilities").as(DefaultParameterizedType.paramType(Pointer.class, new Type[]{AVOption.class})).set(av_device_capabilities);
            return this;
        } catch (Throwable var3) {
            throw new RuntimeException(var3);
        }
    }

    public static enum AVAppToDevMessageType implements IntValuedEnum<AvdeviceLibrary.AVAppToDevMessageType> {
        AV_APP_TO_DEV_NONE(1313820229L),
        AV_APP_TO_DEV_WINDOW_SIZE(1195724621L),
        AV_APP_TO_DEV_WINDOW_REPAINT(1380274241L),
        AV_APP_TO_DEV_PAUSE(1346458912L),
        AV_APP_TO_DEV_PLAY(1347174745L),
        AV_APP_TO_DEV_TOGGLE_PAUSE(1346458964L),
        AV_APP_TO_DEV_SET_VOLUME(1398165324L),
        AV_APP_TO_DEV_MUTE(541939028L),
        AV_APP_TO_DEV_UNMUTE(1431131476L),
        AV_APP_TO_DEV_TOGGLE_MUTE(1414354260L),
        AV_APP_TO_DEV_GET_VOLUME(1196838732L),
        AV_APP_TO_DEV_GET_MUTE(1196250452L);

        public final long value;

        private AVAppToDevMessageType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvdeviceLibrary.AVAppToDevMessageType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvdeviceLibrary.AVAppToDevMessageType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static enum AVDevToAppMessageType implements IntValuedEnum<AvdeviceLibrary.AVDevToAppMessageType> {
        AV_DEV_TO_APP_NONE(1313820229L),
        AV_DEV_TO_APP_CREATE_WINDOW_BUFFER(1111708229L),
        AV_DEV_TO_APP_PREPARE_WINDOW_BUFFER(1112560197L),
        AV_DEV_TO_APP_DISPLAY_WINDOW_BUFFER(1111771475L),
        AV_DEV_TO_APP_DESTROY_WINDOW_BUFFER(1111770451L),
        AV_DEV_TO_APP_BUFFER_OVERFLOW(1112491596L),
        AV_DEV_TO_APP_BUFFER_UNDERFLOW(1112884812L),
        AV_DEV_TO_APP_BUFFER_READABLE(1112687648L),
        AV_DEV_TO_APP_BUFFER_WRITABLE(1113018912L),
        AV_DEV_TO_APP_MUTE_STATE_CHANGED(1129141588L),
        AV_DEV_TO_APP_VOLUME_LEVEL_CHANGED(1129729868L);

        public final long value;

        private AVDevToAppMessageType(long value) {
            this.value = value;
        }

        public long value() {
            return this.value;
        }

        public Iterator<AvdeviceLibrary.AVDevToAppMessageType> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static IntValuedEnum<AvdeviceLibrary.AVDevToAppMessageType> fromValue(int value) {
            return FlagSet.fromValue(value, values());
        }
    }
}
