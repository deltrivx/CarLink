package d3;

import android.text.SegmentFinder;
import u0.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3756a;

    public a(k kVar) {
        this.f3756a = kVar;
    }

    @Override // android.text.SegmentFinder
    public final int nextEndBoundary(int i7) {
        return this.f3756a.Y(i7);
    }

    @Override // android.text.SegmentFinder
    public final int nextStartBoundary(int i7) {
        return this.f3756a.J(i7);
    }

    @Override // android.text.SegmentFinder
    public final int previousEndBoundary(int i7) {
        return this.f3756a.K(i7);
    }

    @Override // android.text.SegmentFinder
    public final int previousStartBoundary(int i7) {
        return this.f3756a.X(i7);
    }
}
