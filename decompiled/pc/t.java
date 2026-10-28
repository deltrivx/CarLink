package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f10506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10507b;

    @Override // pc.p0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f10506a, this.f10507b);
        i9.l.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        float[] fArr = this.f10506a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i7);
            i9.l.d(fArrCopyOf, "copyOf(...)");
            this.f10506a = fArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10507b;
    }
}
