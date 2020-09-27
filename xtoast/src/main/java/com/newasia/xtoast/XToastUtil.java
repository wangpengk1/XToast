package com.newasia.xtoast;

import android.content.Context;
import android.view.Gravity;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

/**
 * xtoast 工具类
 *
 * @author xuexiang
 * @since 2019-06-30 19:04
 */
public final class XToastUtil {

    private static Context s_Context;

    public static void setContext(Context context)
    {
        s_Context = context;
    }

    private XToastUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static {
        XToast.Config.get()
                .setAlpha(200)
                .setGravity(Gravity.CENTER)
                .allowQueue(false);
    }


    @MainThread
    public static void toast(@NonNull CharSequence message) {
        XToast.normal(s_Context, message).show();
    }

    @MainThread
    public static void toast(@StringRes int message) {
        XToast.normal(s_Context, message).show();
    }

    @MainThread
    public static void toast(@NonNull CharSequence message, int duration) {
        XToast.normal(s_Context, message, duration).show();
    }

    @MainThread
    public static void toast(@StringRes int message, int duration) {
        XToast.normal(s_Context, message, duration).show();
    }

    //=============//

    @MainThread
    public static void error(@NonNull CharSequence message) {
        XToast.error(s_Context, message).show();
    }

    @MainThread
    public static void error(@NonNull Exception error) {
        XToast.error(s_Context, error.getMessage()).show();
    }

    @MainThread
    public static void error(@StringRes int message) {
        XToast.error(s_Context, message).show();
    }

    @MainThread
    public static void error(@NonNull CharSequence message, int duration) {
        XToast.error(s_Context, message, duration).show();
    }

    @MainThread
    public static void error(@StringRes int message, int duration) {
        XToast.error(s_Context, message, duration).show();
    }

    //=============//

    @MainThread
    public static void success(@NonNull CharSequence message) {
        XToast.success(s_Context, message).show();
    }

    @MainThread
    public static void success(@StringRes int message) {
        XToast.success(s_Context, message).show();
    }

    @MainThread
    public static void success(@NonNull CharSequence message, int duration) {
        XToast.success(s_Context, message, duration).show();
    }

    @MainThread
    public static void success(@StringRes int message, int duration) {
        XToast.success(s_Context, message, duration).show();
    }

    //=============//

    @MainThread
    public static void info(@NonNull CharSequence message) {
        XToast.info(s_Context, message).show();
    }

    @MainThread
    public static void info(@StringRes int message) {
        XToast.info(s_Context, message).show();
    }

    @MainThread
    public static void info(@NonNull CharSequence message, int duration) {
        XToast.info(s_Context, message, duration).show();
    }

    @MainThread
    public static void info(@StringRes int message, int duration) {
        XToast.info(s_Context, message, duration).show();
    }

    //=============//

    @MainThread
    public static void warning(@NonNull CharSequence message) {
        XToast.warning(s_Context, message).show();
    }

    @MainThread
    public static void warning(@StringRes int message) {
        XToast.warning(s_Context, message).show();
    }

    @MainThread
    public static void warning(@NonNull CharSequence message, int duration) {
        XToast.warning(s_Context, message, duration).show();
    }

    @MainThread
    public static void warning(@StringRes int message, int duration) {
        XToast.warning(s_Context, message, duration).show();
    }

}