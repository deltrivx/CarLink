package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f10432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10433b;

    @Override // pc.p0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f10432a, this.f10433b);
        i9.l.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        boolean[] zArr = this.f10432a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i7);
            i9.l.d(zArrCopyOf, "copyOf(...)");
            this.f10432a = zArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10433b;
    }
}
