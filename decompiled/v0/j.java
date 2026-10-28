package v0;

import o2.w;
import w0.a0;
import w0.d1;
import w0.f0;
import w0.f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements w0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13544a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f13546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13547d;

    public j(g gVar, d1 d1Var, long j5) {
        this.f13545b = gVar;
        this.f13546c = d1Var;
        this.f13547d = j5;
    }

    @Override // w0.n
    public final void a() {
        f0 f0Var = this.f13546c.f13769h;
        if (f0Var != null) {
            f0Var.invoke();
        }
    }

    @Override // w0.n
    public final boolean c(long j5, a0 a0Var) {
        w wVar = (w) this.f13545b.invoke();
        if (wVar == null) {
            return true;
        }
        if (!wVar.isAttached()) {
            return false;
        }
        d1 d1Var = this.f13546c;
        if (!f1.a(d1Var, this.f13547d)) {
            return false;
        }
        if (!d1Var.b(wVar, j5, this.f13544a, a0Var, false)) {
            return true;
        }
        this.f13544a = j5;
        return true;
    }

    @Override // w0.n
    public final boolean d(long j5, a0 a0Var, int i7) {
        w wVar = (w) this.f13545b.invoke();
        if (wVar == null || !wVar.isAttached()) {
            return false;
        }
        d1 d1Var = this.f13546c;
        j3.c cVar = d1Var.f13767f;
        if (cVar != null) {
            cVar.a(Boolean.FALSE, wVar, new x1.b(j5), a0Var);
        }
        this.f13544a = j5;
        return f1.a(d1Var, this.f13547d);
    }
}
