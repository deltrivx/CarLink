package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10522b;

    @Override // pc.p0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f10521a, this.f10522b);
        i9.l.d(bArrCopyOf, "copyOf(...)");
        return new t8.r(bArrCopyOf);
    }

    @Override // pc.p0
    public final void b(int i7) {
        byte[] bArr = this.f10521a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
            i9.l.d(bArrCopyOf, "copyOf(...)");
            this.f10521a = bArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10522b;
    }
}
