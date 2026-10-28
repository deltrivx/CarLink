package x;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class g1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f14370a;

    public g1(Magnifier magnifier) {
        this.f14370a = magnifier;
    }

    @Override // x.e1
    public void a(long j5, long j10) {
        this.f14370a.show(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    public final void b() {
        this.f14370a.dismiss();
    }

    public final long c() {
        return (((long) this.f14370a.getHeight()) & 4294967295L) | (((long) this.f14370a.getWidth()) << 32);
    }

    public final void d() {
        this.f14370a.update();
    }
}
