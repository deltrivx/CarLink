package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10441b;

    @Override // pc.p0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f10440a, this.f10441b);
        i9.l.d(jArrCopyOf, "copyOf(...)");
        return new t8.v(jArrCopyOf);
    }

    @Override // pc.p0
    public final void b(int i7) {
        long[] jArr = this.f10440a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f10440a = jArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10441b;
    }
}
