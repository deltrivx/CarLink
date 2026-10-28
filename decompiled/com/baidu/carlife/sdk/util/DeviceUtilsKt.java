package com.baidu.carlife.sdk.util;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import t8.h;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0004\"\u001b\u0010\u000b\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroid/content/Context;", "Lt8/j;", "", "screenSize", "(Landroid/content/Context;)Lt8/j;", "screenSizePortrait", "screenSizeHorizontal", "availableProcessors$delegate", "Lt8/h;", "getAvailableProcessors", "()I", "availableProcessors", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DeviceUtilsKt {
    private static final h availableProcessors$delegate = t8.a.d(DeviceUtilsKt$availableProcessors$2.INSTANCE);

    public static final int getAvailableProcessors() {
        return ((Number) availableProcessors$delegate.getValue()).intValue();
    }

    public static final j screenSize(Context context) {
        l.e(context, "<this>");
        Object systemService = context.getSystemService("window");
        l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return new j(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static final j screenSizeHorizontal(Context context) {
        l.e(context, "<this>");
        j jVarScreenSize = screenSize(context);
        int iIntValue = ((Number) jVarScreenSize.f12830a).intValue();
        Object obj = jVarScreenSize.f12831b;
        int iIntValue2 = ((Number) obj).intValue();
        if (iIntValue < iIntValue2) {
            iIntValue = iIntValue2;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        int iIntValue3 = ((Number) jVarScreenSize.f12830a).intValue();
        int iIntValue4 = ((Number) obj).intValue();
        if (iIntValue3 > iIntValue4) {
            iIntValue3 = iIntValue4;
        }
        return new j(numValueOf, Integer.valueOf(iIntValue3));
    }

    public static final j screenSizePortrait(Context context) {
        l.e(context, "<this>");
        j jVarScreenSize = screenSize(context);
        int iIntValue = ((Number) jVarScreenSize.f12830a).intValue();
        Object obj = jVarScreenSize.f12831b;
        int iIntValue2 = ((Number) obj).intValue();
        if (iIntValue > iIntValue2) {
            iIntValue = iIntValue2;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        int iIntValue3 = ((Number) jVarScreenSize.f12830a).intValue();
        int iIntValue4 = ((Number) obj).intValue();
        if (iIntValue3 < iIntValue4) {
            iIntValue3 = iIntValue4;
        }
        return new j(numValueOf, Integer.valueOf(iIntValue3));
    }
}
