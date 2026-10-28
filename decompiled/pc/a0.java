package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f10421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10422b;

    @Override // pc.p0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f10421a, this.f10422b);
        i9.l.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        int[] iArr = this.f10421a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f10421a = iArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10422b;
    }
}
