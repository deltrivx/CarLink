package w4;

import androidx.lifecycle.o0;
import n4.e;
import s.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class a extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f14135c = new e(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f14136b = new r0(0);

    @Override // androidx.lifecycle.o0
    public final void b() {
        r0 r0Var = this.f14136b;
        int i7 = r0Var.f12491c;
        if (i7 > 0) {
            r0Var.f(0).getClass();
            throw new ClassCastException();
        }
        Object[] objArr = r0Var.f12490b;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        r0Var.f12491c = 0;
    }
}
