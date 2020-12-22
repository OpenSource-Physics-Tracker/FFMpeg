/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_ffmpeg_avfilter_AvfilterLibrary */

#ifndef _Included_org_ffmpeg_avfilter_AvfilterLibrary
#define _Included_org_ffmpeg_avfilter_AvfilterLibrary
#ifdef __cplusplus
extern "C" {
#endif
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_AUTO_CONVERT_ALL
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_AUTO_CONVERT_ALL 0L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_AUTO_CONVERT_NONE
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_AUTO_CONVERT_NONE -1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_NO_CHECK_FORMAT
#define org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_NO_CHECK_FORMAT 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_PUSH
#define org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_PUSH 4L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_KEEP_REF
#define org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSRC_FLAG_KEEP_REF 8L
#undef org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_INT
#define org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_INT 462948L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SLICE_THREADS
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SLICE_THREADS 4L
#undef org_ffmpeg_avfilter_AvfilterLibrary_FF_API_LAVR_OPTS
#define org_ffmpeg_avfilter_AvfilterLibrary_FF_API_LAVR_OPTS 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_CMD_FLAG_FAST
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_CMD_FLAG_FAST 2L
#undef org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MAJOR
#define org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MAJOR 7L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSINK_FLAG_PEEK
#define org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSINK_FLAG_PEEK 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE 196608L
#undef org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_BUILD
#define org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_BUILD 462948L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_DYNAMIC_OUTPUTS
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_DYNAMIC_OUTPUTS 2L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_DYNAMIC_INPUTS
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_DYNAMIC_INPUTS 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MICRO
#define org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MICRO 100L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_CMD_FLAG_ONE
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_CMD_FLAG_ONE 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_THREAD_SLICE
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_THREAD_SLICE 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_FF_API_OLD_FILTER_OPTS_ERROR
#define org_ffmpeg_avfilter_AvfilterLibrary_FF_API_OLD_FILTER_OPTS_ERROR 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE_GENERIC
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE_GENERIC 65536L
#undef org_ffmpeg_avfilter_AvfilterLibrary_FF_API_FILTER_GET_SET
#define org_ffmpeg_avfilter_AvfilterLibrary_FF_API_FILTER_GET_SET 1L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSINK_FLAG_NO_REQUEST
#define org_ffmpeg_avfilter_AvfilterLibrary_AV_BUFFERSINK_FLAG_NO_REQUEST 2L
#undef org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE_INTERNAL
#define org_ffmpeg_avfilter_AvfilterLibrary_AVFILTER_FLAG_SUPPORT_TIMELINE_INTERNAL 131072L
#undef org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MINOR
#define org_ffmpeg_avfilter_AvfilterLibrary_LIBAVFILTER_VERSION_MINOR 16L
/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_version
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1version
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_configuration
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1configuration
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_license
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1license
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_pad_count
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1pad_1count
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_pad_get_name
 * Signature: (JI)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1pad_1get_1name
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_pad_get_type
 * Signature: (JI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1pad_1get_1type
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_link
 * Signature: (JIJI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1link
  (JNIEnv *, jclass, jlong, jint, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_link_free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1link_1free
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_link_get_channels
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1link_1get_1channels
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_link_set_closed
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1link_1set_1closed
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_config_links
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1config_1links
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_process_command
 * Signature: (JJJJII)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1process_1command
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jint, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_filter_iterate
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1filter_1iterate
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_register_all
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1register_1all
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_register
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1register
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_next
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1next
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_get_by_name
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1get_1by_1name
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_init_str
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1init_1str
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_init_dict
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1init_1dict
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1free
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_insert_filter
 * Signature: (JJII)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1insert_1filter
  (JNIEnv *, jclass, jlong, jlong, jint, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_get_class
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1get_1class
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1alloc
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_alloc_filter
 * Signature: (JJJ)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1alloc_1filter
  (JNIEnv *, jclass, jlong, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_get_filter
 * Signature: (JJ)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1get_1filter
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_create_filter
 * Signature: (JJJJJJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1create_1filter
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_set_auto_convert
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1set_1auto_1convert
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_config
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1config
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1free
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_inout_alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1inout_1alloc
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_inout_free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1inout_1free
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_parse
 * Signature: (JJJJJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1parse
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_parse_ptr
 * Signature: (JJJJJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1parse_1ptr
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_parse2
 * Signature: (JJJJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1parse2
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_send_command
 * Signature: (JJJJJII)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1send_1command
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jlong, jint, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_queue_command
 * Signature: (JJJJID)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1queue_1command
  (JNIEnv *, jclass, jlong, jlong, jlong, jlong, jint, jdouble);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_dump
 * Signature: (JJ)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1dump
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    avfilter_graph_request_oldest
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_avfilter_1graph_1request_1oldest
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_frame_flags
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1frame_1flags
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_params_alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1params_1alloc
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_abuffersink_params_alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1abuffersink_1params_1alloc
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_set_frame_size
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1set_1frame_1size
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_type
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1type
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_time_base
 * Signature: (J)Lorg/ffmpeg/avutil/AVRational;
 */
JNIEXPORT jobject JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1time_1base
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_format
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1format
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_frame_rate
 * Signature: (J)Lorg/ffmpeg/avutil/AVRational;
 */
JNIEXPORT jobject JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1frame_1rate
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_w
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1w
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_h
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1h
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_sample_aspect_ratio
 * Signature: (J)Lorg/ffmpeg/avutil/AVRational;
 */
JNIEXPORT jobject JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1sample_1aspect_1ratio
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_channels
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1channels
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_channel_layout
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1channel_1layout
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_sample_rate
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1sample_1rate
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_hw_frames_ctx
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1hw_1frames_1ctx
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_frame
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1frame
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersink_get_samples
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersink_1get_1samples
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_get_nb_failed_requests
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1get_1nb_1failed_1requests
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_parameters_alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1parameters_1alloc
  (JNIEnv *, jclass);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_parameters_set
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1parameters_1set
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_write_frame
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1write_1frame
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_add_frame
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1add_1frame
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_add_frame_flags
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1add_1frame_1flags
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     org_ffmpeg_avfilter_AvfilterLibrary
 * Method:    av_buffersrc_close
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_ffmpeg_avfilter_AvfilterLibrary_av_1buffersrc_1close
  (JNIEnv *, jclass, jlong, jlong, jint);

#ifdef __cplusplus
}
#endif
#endif
