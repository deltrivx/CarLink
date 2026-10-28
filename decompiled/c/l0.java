package c;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8.k f1754b = new u8.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f1755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1759g;

    public l0(Runnable runnable) {
        this.f1753a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f1756d = i7 >= 34 ? new h0(new e0(this, 0), new e0(this, 1), new f0(this, 0), new f0(this, 1)) : new g0(0, new f0(this, 2));
        }
    }

    public final void a(androidx.lifecycle.t tVar, m0 m0Var) {
        i9.l.e(m0Var, "onBackPressedCallback");
        androidx.lifecycle.v vVarG = tVar.g();
        if (vVarG.f1072c == androidx.lifecycle.o.f1056a) {
            return;
        }
        m0Var.f1763b.add(new i0(this, vVarG, m0Var));
        e();
        m0Var.f1764c = new k0(0, this, l0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object objPrevious;
        if (this.f1755c == null) {
            u8.k kVar = this.f1754b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((m0) objPrevious).f1762a);
        }
        this.f1755c = null;
    }

    public final void c() {
        Object objPrevious;
        m0 m0Var = this.f1755c;
        if (m0Var == null) {
            u8.k kVar = this.f1754b;
            ListIterator listIterator = kVar.listIterator(kVar.c());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((m0) objPrevious).f1762a);
            m0Var = (m0) objPrevious;
        }
        this.f1755c = null;
        if (m0Var == null) {
            this.f1753a.run();
            return;
        }
        switch (m0Var.f1765d) {
            case 0:
                ((r3.a) m0Var.f1766e).invoke(m0Var);
                break;
            default:
                p4.u uVar = (p4.u) m0Var.f1766e;
                uVar.w(true);
                if (!uVar.f10235h.f1762a) {
                    uVar.f10234g.c();
                } else {
                    uVar.K();
                }
                break;
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1757e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1756d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f1758f) {
            a4.a.g(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1758f = true;
        } else {
            if (z10 || !this.f1758f) {
                return;
            }
            a4.a.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1758f = false;
        }
    }

    public final void e() {
        boolean z10 = this.f1759g;
        boolean z11 = false;
        u8.k kVar = this.f1754b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (((m0) it.next()).f1762a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f1759g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }
}
