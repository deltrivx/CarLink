package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f10454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10455b;

    @Override // pc.p0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f10454a, this.f10455b);
        i9.l.d(sArrCopyOf, "copyOf(...)");
        return new t8.y(sArrCopyOf);
    }

    @Override // pc.p0
    public final void b(int i7) {
        short[] sArr = this.f10454a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i7);
            i9.l.d(sArrCopyOf, "copyOf(...)");
            this.f10454a = sArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10455b;
    }
}
