package r2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f11515a = new y1();

    public final boolean a(MotionEvent motionEvent, int i7) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i7)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i7)) & Integer.MAX_VALUE) < 2139095040;
    }
}
