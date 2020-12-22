//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.avutil;

public class AVUtil {
    public static final long AV_NOPTS_VALUE = -9223372036854775808L;

    public AVUtil() {
    }

    public static double av_q2d(AVRational a) {
        return (double)a.num() / (double)a.den();
    }

    public static String av_ts_make_string(long ts) {
        return ts == -9223372036854775808L ? "NOPTS" : Long.toHexString(ts);
    }

    public static String av_ts2str(long ts) {
        return av_ts_make_string(ts);
    }

    public static String av_ts_make_time_string(long ts, AVRational tb) {
        if (ts == -9223372036854775808L) {
            return "NOPTS";
        } else {
            String s = String.format("%.6g", av_q2d(tb) * (double)ts);
            return s;
        }
    }

    public static String av_ts2timestr(long ts, AVRational tb) {
        return av_ts_make_time_string(ts, tb);
    }
}
