package w1;

import c.k0;
import s.d0;
import s.i0;
import s.p0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2.u f14037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f14038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f14039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14040e;

    public g(j jVar, r2.u uVar) {
        this.f14036a = jVar;
        this.f14037b = uVar;
        i0 i0Var = p0.f12478a;
        this.f14038c = new i0();
        this.f14039d = new i0();
    }

    public final void a() {
        if (this.f14040e) {
            return;
        }
        k0 k0Var = new k0(0, this, g.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 4);
        d0 d0Var = this.f14037b.C0;
        if (d0Var.f(k0Var) < 0) {
            d0Var.a(k0Var);
        }
        this.f14040e = true;
    }
}
