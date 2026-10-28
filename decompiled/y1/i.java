package y1;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f14902a;

    public i(PathMeasure pathMeasure) {
        this.f14902a = pathMeasure;
    }

    public final void a(float f10, float f11, h hVar) {
        if (!ob.a.A(hVar)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f14902a.getSegment(f10, f11, hVar.f14895a, true);
    }
}
