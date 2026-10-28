package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f10510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10511b;

    @Override // pc.p0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f10510a, this.f10511b);
        i9.l.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        short[] sArr = this.f10510a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i7);
            i9.l.d(sArrCopyOf, "copyOf(...)");
            this.f10510a = sArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10511b;
    }
}
