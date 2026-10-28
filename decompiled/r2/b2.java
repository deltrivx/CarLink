package r2;

import android.graphics.Outline;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f11193a = new b2();

    public final void a(Outline outline, y1.e0 e0Var) {
        if (!(e0Var instanceof y1.h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((y1.h) e0Var).f14895a);
    }
}
