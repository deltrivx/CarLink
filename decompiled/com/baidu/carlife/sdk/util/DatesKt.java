package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"TIME_FORMAT_FOR_HMS", "", "threadFormatCache", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", "getThreadFormatCache", "()Ljava/lang/ThreadLocal;", "formatISO8601", "Ljava/util/Date;", "getDateFormat", "time", "", "format", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DatesKt {
    public static final String TIME_FORMAT_FOR_HMS = "yyyy-MM-dd-HH-mm-ss";
    private static final ThreadLocal<SimpleDateFormat> threadFormatCache = new ThreadLocal<>();

    public static final String formatISO8601(Date date) {
        l.e(date, "<this>");
        ThreadLocal<SimpleDateFormat> threadLocal = threadFormatCache;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            threadLocal.set(simpleDateFormat);
        }
        String str = simpleDateFormat.format(date);
        if (str != null) {
            return str;
        }
        String string = date.toString();
        l.d(string, "toString()");
        return string;
    }

    public static final String getDateFormat(Date date, long j5, String str) {
        l.e(date, "<this>");
        return new SimpleDateFormat(str).format(new Date(j5));
    }

    public static final ThreadLocal<SimpleDateFormat> getThreadFormatCache() {
        return threadFormatCache;
    }
}
