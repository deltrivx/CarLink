package c;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1701d;

    public b(BackEvent backEvent) {
        float fN = a.n(backEvent);
        float fO = a.o(backEvent);
        float fI = a.i(backEvent);
        int iM = a.m(backEvent);
        this.f1698a = fN;
        this.f1699b = fO;
        this.f1700c = fI;
        this.f1701d = iM;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f1698a);
        sb2.append(", touchY=");
        sb2.append(this.f1699b);
        sb2.append(", progress=");
        sb2.append(this.f1700c);
        sb2.append(", swipeEdge=");
        return a2.f.H(sb2, this.f1701d, '}');
    }
}
