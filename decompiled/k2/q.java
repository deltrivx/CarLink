package k2;

import android.os.Build;
import r2.j1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h {
    @Override // k2.h
    public final void B0(s sVar) {
        t tVar = (t) q2.f.i(this, j1.f11288u);
        if (tVar != null) {
            r2.q qVar = (r2.q) tVar;
            if (sVar == null) {
                s.f7274a.getClass();
                sVar = u.f7275a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                r2.h0.f11248a.a(qVar.f11371b, sVar);
            }
        }
    }

    @Override // k2.h
    public final boolean D0(int i7) {
        return (i7 == 3 || i7 == 4) ? false : true;
    }

    @Override // q2.d2
    public final /* bridge */ /* synthetic */ Object k() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
