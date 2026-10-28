package d0;

import a8.c2;
import android.content.Context;
import android.view.View;
import f1.b1;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements f1.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3638c;

    public /* synthetic */ u0(int i7, Object obj, Object obj2) {
        this.f3636a = i7;
        this.f3637b = obj;
        this.f3638c = obj2;
    }

    @Override // f1.h0
    public final void a() {
        int i7 = this.f3636a;
        Object obj = this.f3638c;
        Object obj2 = this.f3637b;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj2;
                View view = (View) obj;
                int i10 = v0Var.f3659s - 1;
                v0Var.f3659s = i10;
                if (i10 == 0) {
                    WeakHashMap weakHashMap = e4.l0.f4369a;
                    e4.e0.i(view, null);
                    e4.l0.l(view, null);
                    view.removeOnAttachStateChangeListener(v0Var.f3660t);
                }
                break;
            case 1:
                ((h0.q0) obj2).f6359c.j(obj);
                break;
            case 2:
                b1 b1Var = (b1) obj2;
                b0.m mVar = (b0.m) b1Var.getValue();
                if (mVar != null) {
                    b0.l lVar = new b0.l(mVar);
                    b0.k kVar = (b0.k) obj;
                    if (kVar != null) {
                        kVar.b(lVar);
                    }
                    b1Var.setValue(null);
                }
                break;
            case 3:
                ((Context) obj2).unregisterReceiver((c2) obj);
                break;
            case 4:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((r2.l0) obj);
                break;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((r2.m0) obj);
                break;
            case 6:
                ((v.s0) obj2).f13456g.remove((v.p0) obj);
                break;
            default:
                ((androidx.lifecycle.v) obj2).f((c.h) obj);
                break;
        }
    }
}
