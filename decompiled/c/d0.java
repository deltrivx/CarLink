package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.o f1708b = t8.a.d(a0.f1697a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.l f1709a;

    public d0(p4.l lVar) {
        this.f1709a = lVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_DESTROY) {
            return;
        }
        Object systemService = this.f1709a.getSystemService("input_method");
        i9.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        z zVar = (z) f1708b.getValue();
        Object objB = zVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = zVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = zVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
