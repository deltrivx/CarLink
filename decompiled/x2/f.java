package x2;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import r2.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ ScrollCaptureTarget b(u uVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(uVar, rect, point, scrollCaptureCallback);
    }
}
