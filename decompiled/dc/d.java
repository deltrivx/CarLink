package dc;

import android.os.Handler;
import android.os.Looper;
import c8.p;
import cc.a1;
import cc.g0;
import cc.k0;
import cc.l;
import cc.l0;
import cc.l1;
import cc.u;
import cc.v;
import hc.m;
import java.util.concurrent.CancellationException;
import y8.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f3906f;

    public d(Handler handler) {
        this(handler, null, false);
    }

    public d(Handler handler, String str, boolean z10) {
        this.f3903c = handler;
        this.f3904d = str;
        this.f3905e = z10;
        this.f3906f = z10 ? this : new d(handler, str, true);
    }

    @Override // cc.g0
    public final l0 c(long j5, final Runnable runnable, h hVar) {
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.f3903c.postDelayed(runnable, j5)) {
            return new l0() { // from class: dc.c
                @Override // cc.l0
                public final void a() {
                    this.f3901a.f3903c.removeCallbacks(runnable);
                }
            };
        }
        x(hVar, runnable);
        return l1.f2642a;
    }

    @Override // cc.g0
    public final void e(long j5, l lVar) {
        b4.a aVar = new b4.a(6, lVar, this);
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.f3903c.postDelayed(aVar, j5)) {
            lVar.r(new p(5, this, aVar));
        } else {
            x(lVar.f2641e, aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f3903c == this.f3903c && dVar.f3905e == this.f3905e;
    }

    @Override // cc.u
    public final void g(h hVar, Runnable runnable) {
        if (this.f3903c.post(runnable)) {
            return;
        }
        x(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3903c) ^ (this.f3905e ? 1231 : 1237);
    }

    @Override // cc.u
    public final String toString() {
        d dVar;
        String str;
        jc.e eVar = k0.f2635a;
        d dVar2 = m.f6531a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f3906f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3904d;
        if (string == null) {
            string = this.f3903c.toString();
        }
        return this.f3905e ? ob.a.B(string, ".immediate") : string;
    }

    @Override // cc.u
    public final boolean v(h hVar) {
        return (this.f3905e && i9.l.a(Looper.myLooper(), this.f3903c.getLooper())) ? false : true;
    }

    public final void x(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) hVar.l(v.f2678b);
        if (a1Var != null) {
            a1Var.a(cancellationException);
        }
        jc.e eVar = k0.f2635a;
        jc.d.f7117c.g(hVar, runnable);
    }
}
