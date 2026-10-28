package r2;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc.c f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.m1 f11195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.c2 f11196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i9.x f11197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f11198e;

    public b3(hc.c cVar, f1.m1 m1Var, f1.c2 c2Var, i9.x xVar, View view) {
        this.f11194a = cVar;
        this.f11195b = m1Var;
        this.f11196c = c2Var;
        this.f11197d = xVar;
        this.f11198e = view;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        switch (z2.f11524a[nVar.ordinal()]) {
            case 1:
                cc.b0.s(this.f11194a, null, new a3(this.f11197d, this.f11196c, tVar, this, this.f11198e, null, 0), 1);
                return;
            case 2:
                f1.m1 m1Var = this.f11195b;
                if (m1Var != null) {
                    f1.t0 t0Var = (f1.t0) m1Var.f5049c;
                    synchronized (t0Var.f5149b) {
                        try {
                            if (!t0Var.b()) {
                                ArrayList arrayList = (ArrayList) t0Var.f5150c;
                                t0Var.f5150c = (ArrayList) t0Var.f5151d;
                                t0Var.f5151d = arrayList;
                                t0Var.f5148a = true;
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    ((y8.c) arrayList.get(i7)).resumeWith(t8.z.f12851a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f11196c.N();
                return;
            case 3:
                this.f11196c.F();
                return;
            case 4:
                this.f11196c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new cc.s();
        }
    }
}
