//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg;

import org.ffmpeg.avcodec.AvcodecLibrary;
import org.ffmpeg.avdevice.AvdeviceLibrary;
import org.ffmpeg.avfilter.AvfilterLibrary;
import org.ffmpeg.avformat.AvformatLibrary;
import org.ffmpeg.avresample.AvresampleLibrary;
import org.ffmpeg.avutil.AvutilLibrary;
import org.ffmpeg.postproc.PostprocLibrary;
import org.ffmpeg.swresample.SwresampleLibrary;
import org.ffmpeg.swscale.SwscaleLibrary;

public class FFMPeg {
    public FFMPeg() {
    }

    public static void main(String[] args) {
        System.out.println("Java-Bibliothek ffmpeg.jar");
        System.out.println("==========================");
        System.out.println("Die Bibliothek ffmpeg ist nur in den Bruchteilen implementiert, die für\nOpen Source Physics tracker benötigt werden.");
        System.out.println("ffmpeg in Version 4.0.2");
        System.out.println("Bestandteile:");
        System.out.println("avcodec in Version " + AvcodecLibrary.avcodec_version());
        System.out.println("avdevice in Version " + AvdeviceLibrary.avdevice_version());
        System.out.println("avfilter in Version " + AvfilterLibrary.avfilter_version());
        System.out.println("avformat in Version " + AvformatLibrary.avformat_version());
        System.out.println("avresample in Version " + AvresampleLibrary.avresample_version());
        System.out.println("avutil in Version " + AvutilLibrary.avutil_version());
        System.out.println("avpostproc in Version " + PostprocLibrary.postproc_version());
        System.out.println("swresample in Version " + SwresampleLibrary.swresample_version());
        System.out.println("swscale in Version " + SwscaleLibrary.swscale_version());
    }

    public static String getVersion() {
        return "4.0.2";
    }
}
