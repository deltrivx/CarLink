package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f10464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10465b;

    @Override // pc.p0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f10464a, this.f10465b);
        i9.l.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // pc.p0
    public final void b(int i7) {
        char[] cArr = this.f10464a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            i9.l.d(cArrCopyOf, "copyOf(...)");
            this.f10464a = cArrCopyOf;
        }
    }

    @Override // pc.p0
    public final int d() {
        return this.f10465b;
    }
}
