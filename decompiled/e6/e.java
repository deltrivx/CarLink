package e6;

import com.tencent.bugly.BuglyStrategy;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends d {
    public abstract void r(StringBuilder sb2, int i7);

    public abstract int s(int i7);

    public final void t(StringBuilder sb2, int i7, int i10) {
        int iX = a2.b.x(i7, i10, (t5.a) ((a2.b) this.f4440b).f12b);
        r(sb2, iX);
        int iS = s(iX);
        int i11 = BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
        for (int i12 = 0; i12 < 5; i12++) {
            if (iS / i11 == 0) {
                sb2.append('0');
            }
            i11 /= 10;
        }
        sb2.append(iS);
    }
}
