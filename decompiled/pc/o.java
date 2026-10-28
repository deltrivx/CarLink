package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f10480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10481b;

    @Override // pc.p0
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f10480a, this.f10481b);
        i9.l.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        double[] dArr = this.f10480a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i7);
            i9.l.d(dArrCopyOf, "copyOf(...)");
            this.f10480a = dArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10481b;
    }
}
